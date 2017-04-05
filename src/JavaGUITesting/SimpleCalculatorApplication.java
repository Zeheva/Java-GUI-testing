package JavaGUITesting;

/**
 * Created by Hollingsworth on 4/5/2017.
 */
public class SimpleCalculatorApplication extends MainFrame {
    public SimpleCalculatorApplication(){
        super("Simple Calculator", 320, 120);
        add(new SimpleCalculatorPanel());
    }

}
