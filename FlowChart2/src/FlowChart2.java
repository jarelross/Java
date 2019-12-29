//Jarel Ross//
//FlowChart 2 program to display the “hailstone” values for an integer//


public class FlowChart2{
    public static void main (String [] jarel) {
        java.util.Scanner keyboard = new java.util.Scanner(System.in);

        int n;//Variable for n//
        System.out.println("Enter a value");//displays prompt
        n = keyboard.nextInt();
        while(n !=1){
            if(n % 2 == 0)
                n = n/2;
            else
                n = 3 * n + 1;
            System.out.println(n);// displays final answer//
        }
    }
}