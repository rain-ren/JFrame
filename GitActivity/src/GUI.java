import javax.swing.*;
import java.awt.*;

public class GUI {
    JTextField FirstName, LastName;
    JPanel TextFieldPanel;
    public GUI() {
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        TextFieldPanel = new JPanel();
        TextFieldPanel.setLayout(new FlowLayout());
        FirstName = new JTextField(10);
        LastName = new JTextField(10);
        TextFieldPanel.add(FirstName);
        TextFieldPanel.add(LastName);
        frame.add(TextFieldPanel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
