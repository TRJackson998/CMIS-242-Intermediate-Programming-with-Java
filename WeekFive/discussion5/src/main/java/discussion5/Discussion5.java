/*
 * Jackson, Terrence
 * CMIS 242 6381
 * 02.12.2023
 * Use the Java hierarchy you posted in Week 3 (corrected based on any feedback you may have received) 
 * add one overriding method and one overloading. 
 * The main method should create an instance of the class and 
 * demonstrate the correct functionality of the overriding and overloading methods. 
 */
package discussion5;

public class Discussion5 {
    public static void main(String[] args) {
        // header
        System.out.println("Jackson, Terrence. CMIS 242 6381. 02.12.2023.\n");

        // init first room, use overloaded constructor
        BedRoom davidsBedroom = new BedRoom(4, 1, 1, 0, "Wood Panel");

        // manipulate first room
        davidsBedroom.setFlooring("Carpet");
        davidsBedroom.setNumBeds(1);
        davidsBedroom.setPerson("David");

        // print first room
        System.out.print(davidsBedroom); // uses override toString

        // init second room, use overloaded constructor
        LivingRoom mainLivingRoom = new LivingRoom(5, 3, 2, 2, "Tile");

        // manipulate and print second room
        System.out.print(mainLivingRoom); // uses override toString
        int mainLivingRoomWalls = mainLivingRoom.getWalls();
        System.out.printf("The main living room has %d walls\n", mainLivingRoomWalls);
        System.out.print("We got rid of one of our couches and updated the flooring\n");
        mainLivingRoom.setNumCouches(1);
        mainLivingRoom.setFlooring("Wood Panel");
        System.out.print(mainLivingRoom); // uses override toString
        mainLivingRoom.cleanRoom(15);
        mainLivingRoom.cleanRoom("windows");

        // init third room with default constructor
        Room basicRoom = new Room();
        System.out.print(basicRoom); // uses override toString
    }
}
