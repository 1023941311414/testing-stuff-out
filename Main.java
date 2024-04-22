import javax.swing.*;

public class Main {
    
    public static void main() {
        SwingUtilities.invokeLater(
            () -> {
                JFrame frame = new JFrame("[Title]");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(320, 200);
                JLabel label = new JLabel("Hello, Swing!");
                frame.add(label);

                // Display the frame
                frame.setVisible(true);
            }
        );
    }

}
