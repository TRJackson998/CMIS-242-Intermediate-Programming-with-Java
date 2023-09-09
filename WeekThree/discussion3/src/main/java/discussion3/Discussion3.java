/*
 * Jackson, Terrence
 * CMIS 242 6381
 * 01.21.2023
 * Create a Java class with two subclasses (children). 
 * Each class should have at least one attribute and a method. 
 * Parent class should have the attribute/method that is common to both children and 
 * children should have the attribute/method that is unique to what they represent. 
 * Write the main method to demonstrate the correct functionality of the code and 
 * to demonstrate that the children inherit from the parent class. 
 */
package discussion3;

public class Discussion3 {
    public static void main(String[] args) {
        // header
        System.out.println("Jackson, Terrence. CMIS 242 6381. 01.21.2023.\n");

        // init first room
        BedRoom davidsBedroom = new BedRoom(4, 1, 1, 0, "Wood Panel");

        // manipulate first room
        davidsBedroom.setFlooring("Carpet");
        davidsBedroom.setNumBeds(1);
        davidsBedroom.setPerson("David");

        // print first room
        System.out.print(davidsBedroom);

        // init second room
        LivingRoom mainLivingRoom = new LivingRoom(5, 3, 2, 2, "Tile");

        // manipulate and print second room
        System.out.print(mainLivingRoom);
        int mainLivingRoomWalls = mainLivingRoom.getWalls();
        System.out.printf("The main living room has %d walls\n", mainLivingRoomWalls);
        System.out.print("We got rid of one of our couches and updated the flooring\n");
        mainLivingRoom.setNumCouches(1);
        mainLivingRoom.setFlooring("Wood Panel");
        System.out.print(mainLivingRoom);
    }
}
