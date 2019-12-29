//Simple Java program that reads names, hours worked,
//and pay rate using flowcharts as a guide//
//Jarel Ross//
public class FlowChart1 {
    public static void main(String[]nothing) {
        java.util.Scanner keyboard = new java.util.Scanner(System.in);


        System.out.println("Enter your first nJame");// Displays name//
        String name = keyboard.next();

        while(! name.equals("End")){// will continue if name doesnt equal end
            System.out.println("Enter the amount of work hours");// displays hours
            double hours = keyboard.nextDouble();
            System.out.println("Enter your payrate");// displays payrate
            double payrate = keyboard.nextDouble();
            double tax;
            double pay = hours*payrate;

             if(pay>1000){
                tax =.05;
                return ;
            }
            else if (pay<=1000){
                tax =0.03;

                double finalPay = pay-(pay*tax);

                System.out.println(name +" " + finalPay);// displays final answer
                 return;
            }

        }
    }
}


