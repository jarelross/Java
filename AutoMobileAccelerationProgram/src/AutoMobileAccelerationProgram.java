// Java program that calculates the acceleration (G force) on the driver and passengers of a car that
//accelerates from zero to a given speed in a specified number of seconds.//
//Jarel Ross//

public class AutoMobileAccelerationProgram {
    public static void main(String[] Panthers) {
// Create a Scanner object to read data from the keyboard//
        java.util.Scanner Carolina = new java.util.Scanner(System.in);
        System.out.println("Enter the speed achieved starting from zero"); // display prompt


        double speed = Carolina.nextDouble();// variable for speed
        System.out.println("Enter the seconds it takes to get to that speed");
        double seconds = Carolina.nextDouble();//variable for seconds

        double force = (((speed*.44704)/seconds)/9.8); // variable for force and formula to calculate the acceleration//


        System.out.println("The force on the passengers is "+ force+ " G's");// displays prompt//


    }
}

