package JavaGUITesting; /**
 * Created by Hollingsworth on 4/5/2017.
 */

import javax.swing.*;
public class MainFrame extends JFrame {

    static final int WIDTH =400, HEIGHT = 500;

    public MainFrame(){
        super("Master Blaster");
    }

    public MainFrame(String title){
        super(title);
        setFrame(WIDTH,HEIGHT);

    }

    public MainFrame(String title, int width, int height){
        super(title);
        setFrame(width, height);
    }

    public void display(){
        setVisible(true);
    }

    private void setFrame(int width, int height) {
        setSize(width, height);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
