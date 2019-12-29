// Simple program that converts pounds to kilograms.
// Jarel Ross
// One pound is equal to  .453592 kilogram. //
public class PoundConversionToKilograms {

    public static void main(String[] wombat) {
        /* Create a Scanner object to read data from the keyboard */


        java.util.Scanner keyboard = new java.util.Scanner(System.in);


        System.out.println("Enter a number in pounds"); // display prompt
        double pounds = keyboard.nextDouble(); // get a number from the keyboard

        double kilograms = pounds * .453592;// Formula to find the amount of pounds are convertedf

        System.out.println("The number is "+kilograms +" Kilograms"); // display prompt

    }
}