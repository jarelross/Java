
import java.awt.event.ActionEvent;

//Creating a simple GUI to calculate how far a ball can travel.//
// Jarel Ross GEEN163//
public class GUIBallisitics extends javax.swing.JFrame
        implements java.awt.event.ActionListener {

    private static final double G = 32.174; // the gravitational constant//

    //All GUI object Declarations//
    javax.swing.JLabel enterHeight = new javax.swing.JLabel("Enter height in inches") ;
    javax.swing.JTextField inHeight = new javax.swing.JTextField();
    javax.swing.JLabel howMuch = new javax.swing.JLabel("Enter weight in pounds");
    javax.swing.JTextField inWeight = new javax.swing.JTextField();
    javax.swing.JButton button = new javax.swing.JButton("Calculate");
    javax.swing.JLabel showDist = new javax.swing.JLabel("Show BMI ");

    //Method to initialize the GUI.//

    public GUIBallisitics() {
        setSize(600, 100);// Size of the GUI Frame//
        java.awt.Container pane = getContentPane();
        javax.swing.BoxLayout where = new javax.swing.BoxLayout(pane,
                javax.swing.BoxLayout.X_AXIS);
        setLayout( where );
        //Adding Objects To GUI//
        pane.add(enterHeight);
        pane.add(inHeight);
        pane.add(howMuch);
        pane.add(inWeight);
        pane.add(button);
        pane.add(showDist );
// Add the other GUI objects in the same manner as above.
        button.addActionListener( this );
        setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        setVisible( true );
    }

    /**
     * This method is called when the user enters data or presses the button.
     * @param thing The GUI object causing the action
     */
    double degrees;

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}