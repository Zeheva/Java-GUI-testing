package JavaGUITesting;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Hollingsworth on 4/5/2017.
 */
public class SimpleCalculatorPanel extends JPanel {
    private JLabel leftOprLbl = new JLabel("Left Operand", JLabel.CENTER);
    private JLabel rightOprLbl = new JLabel("Right Operand", JLabel.CENTER);
    private JLabel resultsLbl = new JLabel("Results", JLabel.CENTER);
    private JTextField leftOprTxt = new JTextField("");
    private JTextField rightOprTxt = new JTextField("");
    private JTextField resultsTxt = new JTextField("");

    private JButton addBtn = new JButton("Add");
    private JButton subtractBtn = new JButton("Subtraction");

    public SimpleCalculatorPanel(){
        setLayout(new BorderLayout());
        setBackground(Color.pink);

        JPanel inputOutputPanel = new JPanel();
        inputOutputPanel.setLayout(new GridLayout(2,3,10,5));

        resultsTxt.setBackground(Color.lightGray);
        resultsTxt.setEditable(false);

        inputOutputPanel.add(leftOprLbl);
        inputOutputPanel.add(rightOprLbl);
        inputOutputPanel.add(resultsLbl);
        inputOutputPanel.add(leftOprTxt);
        inputOutputPanel.add(rightOprTxt);
        inputOutputPanel.add(resultsTxt);


        add(inputOutputPanel, BorderLayout.CENTER);

        JPanel buttonsPanel = new JPanel();

        buttonsPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        addBtn.setToolTipText("Add the two operands.");
        subtractBtn.setToolTipText("Subtract the two operands");
        leftOprTxt.setToolTipText("input number");
        leftOprTxt.setBackground(Color.blue);

        buttonsPanel.add(addBtn);
        buttonsPanel.add(subtractBtn);

        add(buttonsPanel, BorderLayout.SOUTH);


    }
}
