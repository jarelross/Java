// (GUI) that calculates the user’s Body Mass Index (BMI)//

public class BMI extends javax.swing.JFrame
        implements java.awt.event.ActionListener {


    //All GUI object Declarations//
    javax.swing.JLabel enterHeight = new javax.swing.JLabel("Enter height in inches") ;
    javax.swing.JTextField inHeight = new javax.swing.JTextField();
    javax.swing.JLabel howHeavy = new javax.swing.JLabel("Enter weight in pounds");
    javax.swing.JTextField inHeavy = new javax.swing.JTextField();
    javax.swing.JButton button = new javax.swing.JButton("Calculate");
    javax.swing.JLabel showDist = new javax.swing.JLabel("BMI is ");

    //Method to initialize the GUI.//

    public BMI() {
        setSize(300,300);// Size of the GUI Frame//
        java.awt.Container pane = getContentPane();
        javax.swing.BoxLayout where = new javax.swing.BoxLayout(pane,
                javax.swing.BoxLayout.Y_AXIS);
        setLayout( where );
        //Adding Objects To GUI//
        pane.add(enterHeight);
        pane.add(inHeight);
        pane.add(howHeavy);
        pane.add(inHeavy);
        pane.add(button);
        pane.add(showDist );
// Add the other GUI objects in the same manner as above.
        button.addActionListener( this );
        setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        setVisible( true );
    }


    // This method is called when the user enters data or presses the button.
    // @param thing The GUI object causing the action//




    public void actionPerformed(java.awt.event.ActionEvent thing) {

//variables for weight and height
        double height = Double.parseDouble( inHeight.getText().trim() );
        double weight = Double.parseDouble( inHeavy.getText().trim() );
        double BMI = 703*(weight/(height*height)) ;// Formula to calculate the Body Mass Index//
//if else statements to determine the wellness of yourself//
        if(BMI < 18.5){
            showDist.setText(BMI+" You are underweight. ");
        }else if(BMI >= 18.5 && BMI <= 25){
            showDist.setText(BMI+" You BMI is normal. ");
        }else if(BMI >25){
            showDist.setText(BMI+"  You are overweight. ");
        }
    }
    public static void main(String[] aardvark) {
        BMI ant = new BMI();
    }
}