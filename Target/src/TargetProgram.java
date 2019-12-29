//	(GUI)
// that calculates if a	ball thrown	at
// a given speed and angle	will hit a target 50	feet away.//
//Jarel Ross//
public class TargetProgram extends javax.swing.JFrame
        implements java.awt.event.ActionListener {

    private static final double G = 32.174; // the gravitational constant//

    //All GUI object Declarations//
    javax.swing.JLabel enterAngle = new javax.swing.JLabel("Enter Angle");
    javax.swing.JTextField inAngle = new javax.swing.JTextField();
    javax.swing.JLabel howFast = new javax.swing.JLabel("Enter The Speed");
    javax.swing.JTextField inSpeed = new javax.swing.JTextField();
    javax.swing.JButton button = new javax.swing.JButton("Throw!");
    javax.swing.JLabel showDist = new javax.swing.JLabel("Show Distance ");

    //Method to initialize the GUI.//

    public TargetProgram() {
        setSize(600, 100);// Size of the GUI Frame//
        java.awt.Container pane = getContentPane();
        javax.swing.BoxLayout where = new javax.swing.BoxLayout(pane,
                javax.swing.BoxLayout.X_AXIS);
        setLayout(where);
        //Adding Objects To GUI//
        pane.add(enterAngle);
        pane.add(inAngle);
        pane.add(howFast);
        pane.add(inSpeed);
        pane.add(button);
        pane.add(showDist);
// Add the other GUI objects in the same manner as above.
        button.addActionListener(this);
        setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    /**
     * This method is called when the user enters data or presses the button.
     *
     * @param thing The GUI object causing the action
     */
    double degrees;

    public void actionPerformed(java.awt.event.ActionEvent thing) {

        double degrees = Double.parseDouble(inAngle.getText().trim());
        String target;
        double radians = degrees * (Math.PI / 180);// Formula to calculate Radians//

// Write equation in Java
        double Speed = Double.parseDouble(inSpeed.getText().trim());
        double distance = ((Speed * Speed) * Math.sin(2 * degrees) / G);// Formula to calculate the Distance//
// Write equation in Java

        if (Math.abs(distance - 50.0) < 0.5) { // if within half a foot
            target = "hit";// set the text of label to “hit”
        } else {
            target = "miss";
// set the text of label to “miss”
        }
        showDist.setText("The ball will hit a " + distance);
    }

    public static void main(String[] aardvark) {
        TargetProgram ant = new TargetProgram();
    }
}