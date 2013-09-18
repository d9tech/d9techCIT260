/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gallonstoliters;

/**
 *
 * @author christian.weibell
 */
public class GallonsToLiters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double gallons; //holds the number of gallons
        double liters; //holds the number of liters
        
        gallons = 10;
        
        liters = gallons * 3.7854; //convert gallons to liters
        
        System.out.println(gallons + " gallons is " + liters + " liters.");
    }
}
