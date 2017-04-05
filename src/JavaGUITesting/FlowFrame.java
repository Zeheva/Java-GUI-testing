package JavaGUITesting;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Hollingsworth on 4/5/2017.
 */
public class FlowFrame extends MainFrame {

    public FlowFrame(){
        super("Flow Frame", 300, 300);
        setLayout(new FlowLayout());
        for (int i =0; i<20; i++){
            add (new JButton("button " + i));
        }
    }
}
