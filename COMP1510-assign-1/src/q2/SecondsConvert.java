package q2;

/**
 * <p>This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.</p>
 *
 * @author Byunghak kim, A00825418, SET B  
 * @version 1.0
 */
import java.util.Scanner;

public class SecondsConvert {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        // your code will go here!!!
    	
    	//initialize hours, minutes, seconds, TotalSeconds
    	final int HoursSeconds = 3600;
    	final int MinutesSeconds = 60;
    	int hours;
    	int minutes;
    	int seconds;
    	int TotalSeconds;
    	
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter hours:");
        hours = scan.nextInt();
        System.out.print("Enter minutes:");
        minutes = scan.nextInt();
        System.out.print("Enter seconds:");
        seconds = scan.nextInt();
        
        //Calculate total seconds 
        TotalSeconds = hours * HoursSeconds + minutes * MinutesSeconds + seconds;
        
        System.out.println(hours + " hour(s)" + minutes + " minutes" + seconds + 
        		" seconds would be " + TotalSeconds + " seconds");
        
        System.out.println("Question two was called and ran sucessfully.");
        scan.close();
    }

}
