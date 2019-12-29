// This program will calculate how far a ball will travel. //


public class Ballistics {
    public static void main( String[] unused ) {

        double gravity = 32.174 ;/* Define a variable gravity and initialize it to 9.8 */

        /* Create an object of the Scanner class for keyboard input */
        java.util.Scanner keyboard = new java.util.Scanner(System.in);


        /* Define variables to hold the speed, angle, distance and time. */
        double speed;
        double angle;
        double distance;
        double time;

        /* Prompt the user and read the speed the ball is thrown. */
        System.out.println("Enter the speed of the ball that is thrown");

        speed = keyboard.nextDouble();


        /* Prompt the user and read the angle the ball should travel. */

        System.out.println("Enter the angle the ball should travel");
        angle = keyboard.nextDouble();
        angle = (angle*Math.PI)/(180);


        /* Calculate the distance */
        distance = (Math.pow(speed,2))*(Math.sin(2*angle))/gravity;

        /* Calculate the time */
        time = distance/(speed*(Math.cos(angle)));


        /* Display the distance */
        System.out.println("The distance the ball is thrown is "  +distance + " feet");

        /* Display the time */
        System.out.println("The time it takes to land on the ground  is "  +time +" seconds");
    }

}