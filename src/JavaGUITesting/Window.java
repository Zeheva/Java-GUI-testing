package JavaGUITesting;

import java.awt.*;

/**
 * Created by Hollingsworth on 4/5/2017.
 */
public class Window extends MainFrame {

    Window(){
        super("Master Blaster GUI", 300, 500);
    }

    public void paint(Graphics g){
        g.drawString("Master Blaster String", 100, 100);
    }


    static public void main(String[] args){
//        Window test = new Window();
//        test.display();

//        ArrayApplication app = new ArrayApplication();
//        app.display();

//        FlowFrame frame = new FlowFrame();
//        frame.display();

//        GridFrame gFrame = new GridFrame();
//        gFrame.display();

//        BorderLayoutTest bFrame = new BorderLayoutTest();
//        bFrame.display();

        SimpleCalculatorApplication calculator = new SimpleCalculatorApplication();
        calculator.display();
    }
}
