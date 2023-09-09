/*
 * Jackson, Terrence
 * CMIS 242 6381
 * 01.14.2023
 * Model a real-life object as a Java class with at least one attribute and an instance method.
 * Write a main method to create an instance of the class, 
 * assign a value to the attribute, 
 * call your method, 
 * and demonstrate that the value of the attribute changed 
 * and that the method successfully completed what it was supposed to do.
 */

package discussion1;

/**
 * Runtime function to show my WashingMachine Object
 *
 */
public class DiscussionOne {
    public static void main(String[] args) {
        // header
        System.out.println("Jackson, Terrence. CMIS 242 6381. 01.14.2023.\n");

        // init and manipulate machineOne
        WashingMachine machineOne = new WashingMachine();
        machineOne.printSettings();
        machineOne.addTime(50);
        machineOne.setCycle("Heavy");
        machineOne.printSettings();

        // init and manipulate machineTwo
        WashingMachine machineTwo = new WashingMachine(30, "Delicate", "LG");
        machineTwo.turnOn();
        machineTwo.printSettings();
        machineTwo.turnOff();
        machineTwo.printSettings();
    }
}
