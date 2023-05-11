import javax.swing.*;

public class MainForm extends JFrame {

    /// The main UI panel.
    private Panel uiPanel;

    public MainForm() {
        // add the main UI
        uiPanel = new Panel(this);

        this.pack();

        this.setSize(500,250);

        this.setLocationRelativeTo(null);

        this.setVisible(true);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
