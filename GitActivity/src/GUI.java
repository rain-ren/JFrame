import javax.swing.*;

public class GUI {
    public GUI() {
        JFrame frame = new JFrame();
        frame.setSize(500,500);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
