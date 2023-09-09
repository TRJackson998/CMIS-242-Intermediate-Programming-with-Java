/*
 * Design and implement Manager class which:
 *      stores a list of Media medias
 *      has functionality to load Media medias from files
 *      creates/updates Media files
 *      has functionality to add new Media media to its Media list
 *      has functionality to find all media medias for a specific title and returns that list
 *      has functionality to rent Media based on id 
 *          updates rental status on media, 
 *          updates file, 
 *          returns rental fee
 */

package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    public ArrayList<Media> mediaList; // store list of media medias
    private String directory; // store directory for reading/writing files

    /*
     * Default constructor, init empty mediaList
     */
    public Manager() {
        mediaList = new ArrayList<Media>();
        directory = ".\\"; // default dir to current directory
    }

    /*
     * Overloaded constructor
     * Loads media from files in given directory
     */
    public Manager(String directory) {
        this.directory = directory; // save file dir for later use

        // init empy mediaList
        mediaList = new ArrayList<Media>();

        // load in media from files in directory
        try {
            loadMediaFromDirectory();
            System.out.println("Media Loaded!");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

    /*
     * Finds media media based on id
     * Throws exception if it can't find it or if there's multiple under the same ID
     */
    private Media findMedia(int id) throws MediaNotFoundException, MultipleMediaFoundException {
        // init variables
        boolean found = false; // keep track of whether it's been found yet
        Media foundMedia = null; // store object of media that was found

        for (Media media : mediaList) {
            if (id == media.getId() && !found) { // matching id, not found yet
                // set found variables
                found = true;
                foundMedia = media;
            } else if (id == media.getId() && found) { // matching id, already found
                // throw exception, multiple of the same ID were found
                throw new MultipleMediaFoundException(id);
            }
        }

        if (!found) {
            // throw
            throw new MediaNotFoundException(id);
        } else {
            return foundMedia;
        }

    }

    /*
     * Checks if proposed Media ID is valid, throws exception if not
     */
    private void checkID(int id) throws InvalidIDException {
        try {
            // try to find proposed id
            findMedia(id);

            // if it gets this far, it was found in the list so isn't a valid ID to add
            throw new InvalidIDException(id);
        } catch (MediaNotFoundException e) {
            // media not found for this id
            // valid id that can be added
            return;
        }
    }

    /*
     * Checks if ID is valid
     * if valid, adds media media to mediaList
     */
    private void addMedia(Media mediaToAdd) {
        try {
            // check if this id is valid
            checkID(mediaToAdd.getId());

            // add to mediaList
            mediaList.add(mediaToAdd);

        } catch (InvalidIDException e) {
            // not valid, don't add to list
            System.out.println(e);
        }
    }

    /*
     * Given directory, load in media medias from files
     */
    private void loadMediaFromDirectory() throws FileNotFoundException {
        // init variables
        File directoryPath; // File media of the directory
        File filesList[]; // store list of files in the directory
        Media media; // store each instance of media read from file
        Scanner fileScanner; // reads files
        String fileLine; // store current line read from file

        // get files from dir
        directoryPath = new File(this.directory);
        filesList = directoryPath.listFiles();

        // if no files, throw exception
        if ((filesList == null) || filesList.length < 1) {
            throw new FileNotFoundException("No files found in given directory.");
        }

        // there are files, so read them
        for (File file : filesList) {
            // parse file names, only read the relevant ones
            if (file.getName().contains("EBook") || file.getName().contains("MusicCD")
                    || file.getName().contains("MovieDVD")) {

                // loop through the lines of the file
                fileScanner = new Scanner(file);
                while (fileScanner.hasNextLine()) {
                    fileLine = fileScanner.nextLine();

                    // create media from line
                    if (file.getName().contains("EBook")) {
                        media = new EBook(fileLine);
                    } else if (file.getName().contains("MusicCD")) {
                        media = new MusicCD(fileLine);
                    } else { // file.getName().contains("MovieDVD")
                        media = new MovieDVD(fileLine);
                    }

                    // add media to mediaList
                    addMedia(media);
                }
            }
        }
    }

    /*
     * Updates mediaList member with newMedia object
     */
    private void updateMediaList(Media newMedia) {
        // init vars
        int newID; // store ID of newMedia
        int oldID; // store ID of oldMedia
        Media oldMedia; // previous media object, to be updated with newMedia

        // get id of newMedia
        newID = newMedia.getId();

        // loop through mediaList
        for (int i = 0; i < mediaList.size(); i++) {
            // get the media at this index
            oldMedia = mediaList.get(i);

            // find the ID of the media at this index
            oldID = oldMedia.getId();

            // if the IDs match
            if (oldID == newID) {
                // use .set() w/current index to update it to newMedia
                mediaList.set(i, newMedia);
            }
        }
    }

    /*
     * Overwrites media files with current mediaList
     * Creates media files if they didn't already exist
     * Doesn't throw an IO exception, will create files if none are there
     */
    private void updateMediaFile() {
        // init vars
        PrintWriter eBookFileWriter = null;
        PrintWriter musicCDFileWriter = null;
        PrintWriter movieDVDFileWriter = null;
        File eBookFile = null;
        File musicCDFile = null;
        File movieDVDFile = null;
        File directoryPath;
        File existingFiles[];
        String lineToAdd; // store string of line to add to file

        // loop through directory to find any pre-existing files
        directoryPath = new File(this.directory);
        existingFiles = directoryPath.listFiles();

        // parse whether any files exist, create the ones that don't
        if (existingFiles == null || existingFiles.length < 1) { // no existing files, create all
            eBookFile = new File(directoryPath, "EBooks.txt");
            musicCDFile = new File(directoryPath, "MusicCDs.txt");
            movieDVDFile = new File(directoryPath, "MovieDVDs.txt");
        } else {
            // loop through existing files
            for (File file : existingFiles) {
                // if any of the files already exist, set them
                if (file.getName().contains("EBook")) {
                    eBookFile = file;
                } else if (file.getName().contains("MusicCD")) {
                    musicCDFile = file;
                } else if (file.getName().contains("MovieDVD")) {
                    movieDVDFile = file;
                }
            }

            // if any of the files are still null, create them
            if (eBookFile == null) {
                eBookFile = new File(directoryPath, "EBooks.txt");
            }
            if (musicCDFile == null) {
                musicCDFile = new File(directoryPath, "MusicCDs.txt");
            }
            if (movieDVDFile == null) {
                movieDVDFile = new File(directoryPath, "movieDVDs.txt");
            }

        }

        // create output stream for each media type
        try {
            eBookFileWriter = new PrintWriter(eBookFile);
        } catch (IOException e) {
            System.out.println("Error opening EBook file!");
            System.out.println(e);
        }

        try {
            musicCDFileWriter = new PrintWriter(musicCDFile);
        } catch (IOException e) {
            System.out.println("Error opening MusicCD file!");
            System.out.println(e);
        }

        try {
            movieDVDFileWriter = new PrintWriter(movieDVDFile);
        } catch (IOException e) {
            System.out.println("Error opening MovieDVD file!");
            System.out.println(e);
        }

        // loop through media list, adding lines to appropriate file
        for (Media media : mediaList) {
            lineToAdd = media.getId() + "," + media.getTitle() + "," + media.getYearPublished() + ","
                    + media.isAvailable() + ",";
            if (media.getClass().getSimpleName().equals("EBook")) {
                lineToAdd += media.getNumChapters();
                eBookFileWriter.write(lineToAdd);
                eBookFileWriter.write("\n");
            } else if (media.getClass().getSimpleName().equals("MusicCD")) {
                lineToAdd += media.getMinuteLength();
                musicCDFileWriter.write(lineToAdd);
                musicCDFileWriter.write("\n");
            } else if (media.getClass().getSimpleName().equals("MovieDVD")) {
                lineToAdd += media.getMegabytes();
                movieDVDFileWriter.write(lineToAdd);
                movieDVDFileWriter.write("\n");

            } else {
                System.out.println("Not a valid media class");
                // throw new IllegalArgumentException();
            }

        }

        eBookFileWriter.flush();
        musicCDFileWriter.flush();
        movieDVDFileWriter.flush();

        eBookFileWriter.close();
        musicCDFileWriter.close();
        movieDVDFileWriter.close();

    }

    /*
     * Finds media medias based on title, returns ArrayList of all found
     * Public: to be used outside of class
     */
    public ArrayList<Media> findMedia(String title) throws MediaNotFoundException {
        // init variable
        ArrayList<Media> foundMediaList = new ArrayList<Media>(); // init empty list to store found media

        if (this.mediaList.size() < 1) {
            // no media in media list to search through
            throw new MediaNotFoundException(title);
        } else {
            // loop through list looking for media
            for (Media media : mediaList) {
                if (title.toLowerCase().strip().equals(media.getTitle().toLowerCase().strip())) { // if title matches
                    // add it to the found list
                    foundMediaList.add(media);
                }
            }

            // if no media found, throw exception
            if (foundMediaList.size() < 1) {
                throw new MediaNotFoundException(title);
            }

            // return found media
            return foundMediaList;
        }
    }

    /*
     * Rent media based on id
     * updates rental status on media,
     * updates file,
     * returns rental fee
     */
    public double rentMedia(int id) {
        // init variables
        double rentalFee;
        Media chosenMedia;

        // find media based on id
        chosenMedia = findMedia(id);

        // rent media, update object
        try {
            chosenMedia.rentMedia();

            // update rental status in Manager's mediaList
            updateMediaList(chosenMedia);

            // update rental status in file
            updateMediaFile();

            // get and return rental fee
            rentalFee = chosenMedia.calculateRentalFee();
        } catch (MediaNotAvailableException e) {
            // media isn't available to rent
            System.out.println(e);
            rentalFee = 0;
        }

        return rentalFee;
    }
}
