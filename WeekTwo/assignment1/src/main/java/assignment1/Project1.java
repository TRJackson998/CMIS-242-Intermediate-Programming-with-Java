/*
 * Jackson, Terrence
 * CMIS 242 6381
 * 01.22.2023
 * 
 * This assignment consists of two classes that will be implemented. 
 * A Weight.java class that has 
 *      three private variables, 
 *      two private methods and 
 *      four public methods and 
 * a Project.java class that has 
 *      three private methods. 
 * The goal of this assignment is to perform calculations using
 * Weight objects (instances of Weight class).
 */
package assignment1;

/**
 * 1. A private class method named findMinimum with a return type of Weight.
 * This method should accept three Weight objects as parameters and compare each
 * Weight object’s weight values to find the minimum.
 * The Weight object with the minimum weight value should be returned and then
 * printed using toString in the following format:
 * The minimum weight is x pounds and y ounces
 * where x is the number of pounds and y the number of ounces.
 * Ounces should be displayed with two decimal places.
 * 
 * 2. A private class method named findMaximum with a return type of Weight.
 * This method should accept three Weight objects as parameters and compare each
 * Weight object’s weight values to find the maximum.
 * The Weight object with the maximum weight value should be returned and then
 * printed using toString in the following format:
 * The maximum weight is x pounds and y ounces where x is the number of pounds
 * and y the number of ounces.
 * Ounces should be displayed with two decimal places.
 * 
 * 3. A private class method named findAverage with a return type of Weight.
 * This method should accept three Weight objects as parameters and calculate
 * the average weight value.
 * A new Weight object with the average weight values should be returned and
 * then printed using toString in the following format:
 * The average weight is x pounds and y ounces where x is the number of pounds
 * and y the number of ounces.
 * Ounces should be displayed with two decimal places.
 *
 * 
 */
public class Project1 {

    /*
     * This method compares each Weight object’s weight values to find the minimum.
     * The Weight object with the minimum weight value is returned
     */
    private static Weight findMinimum(Weight weight1, Weight weight2, Weight weight3) {
        Weight minwWeight = weight1;
        if (weight2.lessThan(minwWeight)) {
            minwWeight = weight2;
        }
        if (weight3.lessThan(minwWeight)) {
            minwWeight = weight3;
        }
        return minwWeight;
    }

    /*
     * This method accepts three Weight objects as parameters and compares each
     * Weight object’s weight values to find the maximum.
     * The Weight object with the maximum weight value is returned
     */
    private static Weight findMaximum(Weight weight1, Weight weight2, Weight weight3) {
        Weight maxwWeight = weight1;
        if (maxwWeight.lessThan(weight2)) {
            maxwWeight = weight2;
        }
        if (maxwWeight.lessThan(weight3)) {
            maxwWeight = weight3;
        }
        return maxwWeight;
    }

    /*
     * This method calculates the average weight value.
     * A new Weight object with the average weight values is returned
     */
    private static Weight findAverage(Weight weight1, Weight weight2, Weight weight3) {
        Weight sumWeight = new Weight(0, 0);

        sumWeight.addTo(weight1);
        sumWeight.addTo(weight2);
        sumWeight.addTo(weight3);

        double sumOunces = sumWeight.toOunces();
        double avgOunces = sumOunces / 3;

        Weight avgWeight = new Weight(0, avgOunces);

        return avgWeight;

    }

    public static void main(String[] args) {
        // header
        System.out.println("Jackson, Terrence. CMIS 242 6381. 01.22.2023.\n");

        Weight minWeight;
        Weight maxWeight;
        Weight avgWeight;

        Weight weight1 = new Weight(11, 3);
        Weight weight2 = new Weight(7, 20);
        Weight weight3 = new Weight(14, 6);

        minWeight = findMinimum(weight1, weight2, weight3);
        System.out.print("The minimum weight is " + minWeight + '\n');

        maxWeight = findMaximum(weight1, weight2, weight3);
        System.out.print("The maximum weight is " + maxWeight + '\n');

        avgWeight = findAverage(weight1, weight2, weight3);
        System.out.print("The average weight is " + avgWeight + '\n');
    }
}
