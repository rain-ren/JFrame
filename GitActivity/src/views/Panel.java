package views;

import javax.swing.*;

// Main UI views.Panel
public class Panel extends JPanel {

    private BoxLayout layout;

    private MainArea mainArea;

    public Panel(JFrame mainFrame) {
        layout = new BoxLayout(this, BoxLayout.Y_AXIS);

        mainArea = new MainArea();

        this.add(mainArea);

        initializeButtons();

        mainFrame.getContentPane().add(this);
    }


    void initializeButtons()
    {
        var button = new JButton("First Button");
        this.add(button);
    }
}
