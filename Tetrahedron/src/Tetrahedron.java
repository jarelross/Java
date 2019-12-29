/*Java program that reads the length of an edge of a tetrahedron
*/
public class Tetrahedron {
    public static void main(String[] wombat) {
        /* Create a Scanner object to read data from the keyboard */
        java.util.Scanner keyboard = new java.util.Scanner(System.in);
        double tetrahedron; // declare input variable
        double area;// variable for area
        double edge ; // variable declared as edge for tetrahedron

        System.out.println("Enter a number"); // display prompt

        edge = keyboard.nextDouble(); // get a number from the keyboard
        area = Math.sqrt(3)/4*Math.pow(edge, 2);//formula to figure out area

        System.out.println("The number is "+ area); // display the prompt




    }
}