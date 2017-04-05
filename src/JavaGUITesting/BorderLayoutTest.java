package JavaGUITesting;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Hollingsworth on 4/5/2017.
 */
public class BorderLayoutTest extends MainFrame {
    public BorderLayoutTest() {
        super("Border Frame", 300, 200);
        setLayout (new BorderLayout());
        add(BorderLayout.NORTH, new JButton("North"));
        add(BorderLayout.SOUTH, new JButton("South"));
        add(BorderLayout.EAST, new JButton("East"));
        add(BorderLayout.WEST, new JButton("West"));
        add(BorderLayout.CENTER, new JButton("Center"));
    }

}
