package q3;

import java.util.Scanner;

/**
 * <p>Enter Fahrenheit temperature to be converted in degrees Celsius (°C)</p>
 *
 * @author Byunghak kim, A00825418, SET B 
 * @version 1.0
 */
public class TempConvert {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        // your code will go here!!!

        double fahrenheitTemp;
        double celsiusTemp;
        final int freezingFahrenheit = 32;
        final float fahrenheitToCelsius = 0.55555556F;
        
        //creating a new scanner object //creating a new scanner object 
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Fahrenheit temperature:");
        fahrenheitTemp = scan.nextDouble();
        
        celsiusTemp = (fahrenheitTemp - freezingFahrenheit) * fahrenheitToCelsius;

        System.out.println (fahrenheitTemp + " Fahrenheit temperature is same as " +
        					celsiusTemp + " Celsius temperature");
    	
        System.out.println("Question three was called and ran sucessfully.");
        scan.close();
    }

}
