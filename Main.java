import javax.swing.*;

public class Main {

    private static Main instance = new Main();

    public static Main getInstance() {
        return instance;
    }
    
    public static void initialize() {
        SwingUtilities.invokeLater(
            () -> {
                JFrame frame = new JFrame("[Title]");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(320, 200);
                frame.setVisible(true);
            }
        );
    }

    public static void frontend() {
        
    }

}
