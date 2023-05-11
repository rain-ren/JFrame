import views.MainForm;

public class Main {
    public void start() {
        var mainForm = new MainForm();
        mainForm.show();
    }
    public static void main(String[] args) {
        new Main().start();
    }
}