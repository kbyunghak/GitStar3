package q4;

import java.util.Scanner;

/**
 * <p> Calculates the volume of a cylinder given its radius and height.</p>
 *
 * @author Byunghak kim, A00825418, SET B 
 * @version 1.0
 */
public class Cylinder {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        // your code will go here!!!
    	
    	//initialize radius, height, and cylinderVolume</p>
    	double radius;
    	double height;
    	double cylinderVolume;

    	//creating a new scanner object 
    	Scanner scan = new Scanner (System.in);
    	
    	System.out.print("Please enter the cylinder's radius:");
    	//saving the input of radius to the variable radius
    	radius = scan.nextDouble();
    	System.out.print("Please enter the cylinder's height:");
    	//saving the input of height to the variable height
    	height = scan.nextDouble();
    	
    	//calculating the cylinder's volume using the Math.PI and Math.pow (volume = pie * radius^2* height)
    	cylinderVolume = Math.PI * Math.pow(radius, 2) * height;
    	
    	// output the cylinder's volume
    	System.out.println("The cylinder's volume is "+ cylinderVolume);
    	
        System.out.println("Question four was called and ran sucessfully.");
        scan.close();
    }

}

