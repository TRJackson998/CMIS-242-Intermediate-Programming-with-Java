/**
 * Jackson, Terrence
 * CMIS 242 6381
 * 01.21.2023
 *
 * This is an airfryer style cooking device. We are setting the cooking method
 * to Pizza Rolls
 *
 */

package discussion2;

public class Pizzarolls {
    public static void main(String[] args) {
        // header
        System.out.println("Jackson, Terrence. CMIS 242 6381. 01.20.2023.\n");

        // init and manipulate first airfryer
        Airfryer cookPizzaRolls = new Airfryer();
        cookPizzaRolls.setHeat("Airfry");
        cookPizzaRolls.setLevel("Medium");
        cookPizzaRolls.setTime(12.0);

        // display first airfryer
        System.out.println("Pizza Roll cooking method selected!");
        System.out.println(cookPizzaRolls.toString());

        // cook food in first airfryer
        cookPizzaRolls.turnOn();
        System.out.println("Pizza Rolls are cooking! Enjoy...");
        cookPizzaRolls.turnOff();

        // init second airfryer
        Airfryer airfryer2 = new Airfryer("Broil", "Low", 2.5);

        // get data from second airfryer
        String heat2 = airfryer2.getHeat();
        System.out.printf("The second airfryer is set to %s heat\n", heat2);
        String level2 = airfryer2.getLevel();
        System.out.printf("The second airfryer is set to %s level\n", level2);
        double time2 = airfryer2.getTime();
        System.out.printf("The second airfryer is set to %.2f time\n", time2);

        // check if second air fryer is off
        boolean airfryer2On = airfryer2.isOn();
        if (!airfryer2On) {
            System.out.print("Checked airfryer 2 is off!");
        }
    }
}
