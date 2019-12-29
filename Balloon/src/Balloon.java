//This program will calculate how far a ball will travel. Jarel Ross GEEN163 Assignmnet 2//

public class Balloon {
    public static void main( String[] unused ) {


        java.util.Scanner keyboard = new java.util.Scanner(System.in); /* Create an object of the Scanner class for keyboard input */

        /* Define variables to hold the radius, volume and lift. */

        double radius;
        double volume;
        double lift;

        /* Prompt the user and read the radius of the balloon. */

        System.out.println("Enter the diameter of the balloon");
        double diameter = keyboard.nextDouble();
        radius = (diameter/ (2));//Formula to find the radius//


        /* Calculate the volume of the balloon */
        volume = (4.0/3.0) * (Math.PI) * (Math.pow(radius,3));




        /* Calculate the lift of the balloon */
        lift = volume*.062425;

        /* Display the lifting power */
        System.out.println( "The lift of the balloon is  " + lift +" meters.24");
    }

}