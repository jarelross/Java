//GUi that calculates an individual's net pay based on their hourly rate abd the number of hours worked///
//Jarel Ross//

public class NetPayCalculator extends javax.swing.JFrame
        implements java.awt.event.ActionListener {


    //GUI object Declarations//
    javax.swing.JLabel enterHours = new javax.swing.JLabel("Enter hours worked") ;
    javax.swing.JTextField inHours = new javax.swing.JTextField();
    javax.swing.JLabel payRate = new javax.swing.JLabel("Enter pay rate as $/hour");
    javax.swing.JTextField inpayRate = new javax.swing.JTextField();
    javax.swing.JButton button = new javax.swing.JButton("Calculate");
    javax.swing.JLabel showNetPay = new javax.swing.JLabel("net pay ");

    //Method to initialize the GUI.//

    public NetPayCalculator() {
        setSize(250,250);// Size of the GUI Frame//
        java.awt.Container pane = getContentPane();
        javax.swing.BoxLayout where = new javax.swing.BoxLayout(pane,
                javax.swing.BoxLayout.Y_AXIS);
        setLayout( where );
        //Adding Objects To GUI//
        pane.add(enterHours);
        pane.add(inHours);
        pane.add(payRate);
        pane.add(inpayRate);
        pane.add(button);
        pane.add(showNetPay);
// Add the other GUI objects in the same manner as above.
        button.addActionListener( this );
        setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        setVisible( true );
    }

    public void actionPerformed(java.awt.event.ActionEvent thing) {
        //Hours times Pay rate raw pay
//variables for Hours and Pay rate and gross pay
        double hours = Double.parseDouble( inHours.getText().trim() );
        double payRatePerHour = Double.parseDouble( inpayRate.getText().trim() );
        double RawPay = hours*payRatePerHour ;// Formula to calculate Net Pay//
//if else statements to determine NetPay//
        if(RawPay < 325){
            showNetPay.setText("net pay is $ "+RawPay);
        }else if(RawPay >= 325.00 && RawPay<1000.00){
            showNetPay.setText("net pay is $ "+ (RawPay -(RawPay*.05)));//.05 is the tax in this equation
        }else if(RawPay >=1000.00 && RawPay <=4500.00){
            showNetPay.setText("net pay is $ "+(RawPay-(RawPay*.12)));//.12 is the tax in this equation
        }else if(RawPay>4500.00){
            showNetPay.setText("net pay is $ "+(RawPay-(RawPay*.20)));//.20 is the tax in this equation
        }
    }
    public static void main(String[] OOOOOO) {
        NetPayCalculator ant = new NetPayCalculator();
    }
}