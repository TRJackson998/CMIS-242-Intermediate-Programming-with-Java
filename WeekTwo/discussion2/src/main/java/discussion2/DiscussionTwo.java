/*
 * Jackson, Terrence
 * CMIS 242 6381
 * 01.20.2023
 * Use the Java class you posted last week and add encapsulation to it 
 * to include making all attributes private, adding constructor, and adding get and set methods. 
 * The main method should create an instance of the class and demonstrate the correct functionality of all the methods. 
 */

package discussion2;

/**
 * Runtime function to show my WashingMachine Object
 *
 */
public class DiscussionTwo {
    public static void main(String[] args) {
        // header
        System.out.println("Jackson, Terrence. CMIS 242 6381. 01.20.2023.\n");

        // init storage variables
        double time;
        String cycle;
        String brand;

        // init and manipulate machineOne
        WashingMachine machineOne = new WashingMachine();
        time = machineOne.getTime();
        cycle = machineOne.getCycle();
        brand = machineOne.getBrand();

        System.out.printf("Time is %1.1f, cycle is %s, brand is %s\n", time, cycle, brand);

        machineOne.setTime(50);
        machineOne.setCycle("Heavy");
        machineOne.printSettings();

        // init and manipulate machineTwo
        WashingMachine machineTwo = new WashingMachine(30, "Delicate", "LG");
        machineTwo.turnOn();
        machineTwo.addTime(10);
        machineTwo.checkIfOn();
        machineTwo.turnOff();
        machineTwo.printSettings();
    }
}
