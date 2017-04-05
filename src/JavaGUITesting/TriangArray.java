package JavaGUITesting;



import javax.swing.*;
import java.awt.*;

/**
 * Created by Hollingsworth on 4/5/2017.
 */
public class TriangArray extends JPanel {
    private JTextArea text = new JTextArea();

    public TriangArray(){
        setBackground(Color.gray);
        text.setEditable(false);
        text.setBackground(Color.gray);
        text.setForeground(Color.red);
        text.setFont(new Font("Times New Roman", Font.BOLD, 20));

        for (String s : Array.getTriangArray(6))
            text.append(s + "\n");
        add(text);
    }

}
