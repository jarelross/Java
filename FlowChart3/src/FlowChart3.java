//program to compute the numerical integration of the equation ax2+bx+c//
//Jarel Ross//
public class FlowChart3 {
    public static void main (String [] blah){
        java.util.Scanner keyboard = new java.util.Scanner(System.in);
        //Declared variables//
        double x, a = 4, b = 6, c =8;
        double start;
        double answer;
        double div;
        double delta;
        double end;
        double fx;
        double sum;
        System.out.println("Enter the start value");//Displays Start value
        start = keyboard.nextDouble();
        System.out.println("Enter the end value");//Displays end value
        end = keyboard.nextDouble();
        System.out.println("Enter the div value");//Displays div value
        div = keyboard.nextDouble();
        delta = (end- start)/div;
        x = start;
        sum = 0.0;
        while(x<end){
            fx = a*x*x+b*x+c;//formula to use
            sum = sum + fx;
            x= x + delta;
        }
        System.out.println(delta*sum);// displays final answer
    }
}   