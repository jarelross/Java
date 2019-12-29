//Jarel Ross GEEN 163 Lab 2.A program that can calculate the direction from Greensboro to any point on the globe//

public class Distance {
    public static void main(String[] qibla) {
        java.util.Scanner keyboard = new java.util.Scanner(System.in);
        /* Declare two doubles, degrees and minutes, to hold the input. */
        double minutes;
        double degrees;

        /* Declare, latitude, longitude and direction to hold the destination and result */
        double latitude;
        double longitude;
        double direction;



        /* Declare gboroLat and gboroLong and set them to 0.629482084 and -1.36513836 */
        double gboroLat = .629482084;
        double gboroLong = -1.36513836 ;

        /* Ask the user to enter the degrees and minutes of the destination longitude */
        System.out.println("Enter destination longitude in degrees and minutes") ;/* Read degrees and minutes */

        /* Read degrees and minutes for longitude */
        degrees = keyboard.nextDouble();
        minutes = keyboard.nextDouble();

        longitude = (degrees +(minutes/60))*Math.PI/180 ; // Formula to calculate the longitude//


        System.out.println("Enter destination latitude in degrees and minutes") ;/* Ask the user to enter the degrees and minutes of the destination longitude */
        /* Read degrees and minutes for latitude */
        degrees = keyboard.nextDouble();
        minutes = keyboard.nextDouble();


//Formula to calculate latitude//
        latitude = (degrees + (minutes/60))* Math.PI/180 ;


//Formula to calculate direction//
        direction = Math.atan2( Math.sin(longitude - gboroLong) * Math.cos( latitude ) , Math.cos(gboroLat)
                * Math.sin( latitude ) - Math.sin(gboroLat) * Math.cos( latitude ) * Math.cos( longitude - gboroLong) );

//Formula to calculate degrees//
        degrees = direction*(180/Math.PI);


///* Display the direction in degrees //
        System.out.println("the direction in degrees is " + degrees);

    }
}