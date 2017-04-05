package JavaGUITesting;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Hollingsworth on 4/5/2017.
 */
public class GridFrame extends MainFrame {

    public GridFrame(){
        super("Grid Frame", 300, 300);
        setLayout(new GridLayout(5,5));

        for (int i = 0; i< 25; i++){
            add (new JButton("button" + i));
        }
    }
}
