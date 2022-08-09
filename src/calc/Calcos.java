/*============================================================================
 *
 * Copyright (c) 2000-2017 Smart Trade Technologies. All Rights Reserved.
 *
 * This software is the proprietary information of Smart Trade Technologies
 * Use is subject to license terms.
 *
 *============================================================================*/

package calc;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calcos {

    static int lastCalculatedValue = 0;
    static String valueInProgress = "";
    static String lastOperator = "";

    private static void createAndShowGUI() {
        System.out.println("createAndShowGUI started...");
        //Create and set up the window.
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().setLayout(new GridLayout(2, 1));

        // Initialize the panel displaying the result

        JPanel resultPanel = new JPanel(new BorderLayout());

        JLabel resultLabel = new JLabel("Result: ");
        resultPanel.add(resultLabel);

        frame.getContentPane().add(resultPanel);

        // Initialise the panel holding the buttons 

        JPanel buttonsPanel = new JPanel(new BorderLayout());

        buttonsPanel.setLayout(new GridLayout(5, 3));

        ActionListener actionListener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent paramActionEvent) {
                String value = ((JButton)paramActionEvent.getSource()).getText();

                if (value.equals("+") || (value.equals("=") && lastOperator.equals("+"))) {
                    int valueToAdd = Integer.parseInt(valueInProgress);
                    lastCalculatedValue = lastCalculatedValue + valueToAdd;
                    valueInProgress  = "";
                    resultLabel.setText(resultLabel.getText()+" "+value);
                    lastOperator = value;
                } else if (!value.equals("=")) {

                    if (lastCalculatedValue == 0) {
                        resultLabel.setText("Result: ");
                    }

                    valueInProgress = valueInProgress + value;
                    resultLabel.setText(resultLabel.getText()+" "+valueInProgress);
                }

                if (value.equals("=")) {
                    resultLabel.setText("Result: " + lastCalculatedValue);
                    lastOperator = "";
                    valueInProgress = "";
                    lastCalculatedValue = 0;
                }

            }
        };

        addButton(buttonsPanel, "+", actionListener);
        addButton(buttonsPanel, "0", actionListener);
        addButton(buttonsPanel, "=", actionListener);
        addButton(buttonsPanel, "1", actionListener);
        addButton(buttonsPanel, "2", actionListener);
        addButton(buttonsPanel, "3", actionListener);
        addButton(buttonsPanel, "4", actionListener);
        addButton(buttonsPanel, "5", actionListener);
        addButton(buttonsPanel, "6", actionListener);
        addButton(buttonsPanel, "7", actionListener);
        addButton(buttonsPanel, "8", actionListener);
        addButton(buttonsPanel, "9", actionListener);

        frame.getContentPane().add(buttonsPanel);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    private static void addButton(JPanel panel, String label, ActionListener actionListener) {
        JButton button = new JButton(label);
        button.addActionListener(actionListener);
        panel.add(button);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

}