/**
 * Calculator java code by Prem Patel.
 * @androi_d_ev
 */


import javax.swing.*;

import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;

public class Calculator extends JFrame implements ActionListener {

    // Variables for logic.
    String oldValue = "0";
    String newValue = "0";
    boolean doOperation = false;
    String whichOperation = "";

    // Buttons for input.
    JButton zeroButton = new JButton("0");
    JButton oneButton = new JButton("1");
    JButton twoButton = new JButton("2");
    JButton threeButton = new JButton("3");
    JButton fourButton = new JButton("4");
    JButton fiveButton = new JButton("5");
    JButton sixButton = new JButton("6");
    JButton sevenButton = new JButton("7");
    JButton eightButton = new JButton("8");
    JButton nineButton = new JButton("9");

    // Buttons for operations.
    JButton plusBtn = new JButton("+");
    JButton minusBtn = new JButton("-");
    JButton divBtn = new JButton("/");
    JButton mulBtn = new JButton("*");
    JButton modBtn = new JButton("%");
    JButton equalBtn = new JButton("=");
    JButton clearBtn = new JButton("Clear");

    // Output Components.
    JLabel resultLabel = new JLabel();

    Calculator() {
        setLayout(new GridBagLayout());
        addActionListeners();
        makeView();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    private void addActionListeners() {
        zeroButton.addActionListener(this);
        oneButton.addActionListener(this);
        twoButton.addActionListener(this);
        threeButton.addActionListener(this);
        fourButton.addActionListener(this);
        fiveButton.addActionListener(this);
        sixButton.addActionListener(this);
        sevenButton.addActionListener(this);
        eightButton.addActionListener(this);
        nineButton.addActionListener(this);
        plusBtn.addActionListener(this);
        minusBtn.addActionListener(this);
        divBtn.addActionListener(this);
        mulBtn.addActionListener(this);
        modBtn.addActionListener(this);
        equalBtn.addActionListener(this);
        clearBtn.addActionListener(this);
    }

    private void makeView() {
        GridBagConstraints c;

        /**
         * Input & Output.
         */
        c = getGBC();
        c.gridwidth = 2;
        c.gridx = 0;
        c.gridy = 0;
        add(resultLabel, c);

        /**
         * Numeric buttons.
         */
        c = getGBC();
        c.gridx = 0;
        c.gridy = 1;
        add(sevenButton, c);

        c = getGBC(); 
        c.gridx = 1;
        c.gridy = 1;
        add(eightButton, c);

        c = getGBC();
        c.gridx = 2;
        c.gridy = 1;
        add(nineButton, c);

        c = getGBC();
        c.gridx = 0;
        c.gridy = 2;
        add(fourButton, c);

        c = getGBC();
        c.gridx = 1;
        c.gridy = 2;
        add(fiveButton, c);

        c = getGBC();
        c.gridx = 2;
        c.gridy = 2;
        add(sixButton, c);

        c = getGBC(); 
        c.gridx = 0;
        c.gridy = 3;
        add(oneButton, c);

        c = getGBC(); 
        c.gridx = 1;
        c.gridy = 3;
        add(twoButton, c);

        c = getGBC();
        c.gridx = 2;
        c.gridy = 3;
        add(threeButton, c);

        c = getGBC();  
        c.gridwidth = 2;
        c.gridx = 0;
        c.gridy = 4;
        add(zeroButton, c);

        /**
         * Operations buttons.
         */
        c = getGBC();
        c.gridx = 3;
        c.gridy = 0;
        add(equalBtn, c);

        c = getGBC();
        c.gridx = 3;
        c.gridy = 1;
        add(divBtn, c);

        c = getGBC();
        c.gridx = 3;
        c.gridy = 2;
        add(mulBtn, c);

        c = getGBC();
        c.gridx = 3;
        c.gridy = 3;
        add(minusBtn, c);

        c = getGBC();
        c.gridx = 3;
        c.gridy = 4;
        add(plusBtn, c);

        c = getGBC();
        c.gridx = 2;
        c.gridy = 4;
        add(modBtn, c);

        c = getGBC();
        c.gridx = 2;
        c.gridy = 0;
        add(clearBtn, c);
    }

    /**
     * Returning object with general configurations.
     * Programers are lazy, Hahahah.
     */
    private GridBagConstraints getGBC() {
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 40;
        c.ipadx = 40;
        return c;
    }

    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "0":
                if (doOperation)
                    if (newValue.length() == 1 && newValue.charAt(0) == '0')
                        break;
                else 
                    if (oldValue.length() == 1 && oldValue.charAt(0) == '0')
                        break;
                    
                if (doOperation) {
                    newValue += "0";
                }
                else {
                    oldValue += "0";
                }
                break;

            case "1":
                if (doOperation) {
                    newValue += "1";
                } else {
                    oldValue += "1";
                }
                break;
                
            case "2":
                if (doOperation) {
                    newValue += "2";
                } else {
                    oldValue += "2";
                }
                break;
            
            case "3":
                if (doOperation) {
                    newValue += "3";
                } else {
                    oldValue += "3";
                }
                break;

            case "4":
                if (doOperation) {
                    newValue += "4";
                } else {
                    oldValue += "4";
                }
                break;

            case "5":              
                if (doOperation) {
                    newValue += "5";
                } else {
                    oldValue += "5";           
                }
                break;

            
            case "6":
                if (doOperation) {
                    newValue += "6";
                } else {
                    oldValue += "6";
                }
                break;

            case "7":
                if (doOperation) {
                    newValue += "7";
                } else {
                    oldValue += "7";
                }
                break;

            case "8":
                if (doOperation) {
                    newValue += "8";
                } else {
                    oldValue += "8";
                }
                break;

            case "9":
                if (doOperation) {
                    newValue += "9";
                } else {
                    oldValue += "9";
                }
                break;

            case "=":
                performOperation();
                whichOperation = "";
                doOperation = false;
                newValue = "0";
                break;

            case "/":
                doOperation = true;
                performOperation();
                whichOperation = "/";
                newValue = "0";
                break;

            case "*":
                doOperation = true;
                performOperation();
                whichOperation = "*";
                newValue = "0";
                break;

            case "-":
                doOperation = true;
                performOperation();
                whichOperation = "-";
                newValue = "0";
                break;

            case "+":
                doOperation = true;
                performOperation();
                whichOperation = "+";
                newValue = "0";
                break;

            case "%":
                doOperation = true;
                performOperation();
                whichOperation = "%";
                newValue = "0";
                break;

            case "Clear":
                whichOperation = "";
                doOperation = false;
                oldValue = "0";
                newValue = "0";
                break;
        }

        // Show Result
        if (doOperation)
            resultLabel.setText(newValue);
        else
            resultLabel.setText(oldValue);
    }

    private void performOperation() {
        switch(whichOperation) {
            case "/":
                if (newValue.charAt(0) == '0') resultLabel.setText("Can't divide by zero");
                oldValue = (new BigInteger(oldValue)).divide(new BigInteger(newValue)).toString();
                break;

            case "*":
                oldValue = (new BigInteger(oldValue)).multiply(new BigInteger(newValue)).toString();
                break;

            case "-":
                oldValue = (new BigInteger(oldValue)).subtract(new BigInteger(newValue)).toString();
                break;

            case "+":
                oldValue = (new BigInteger(oldValue)).add(new BigInteger(newValue)).toString();
                break;

            case "%":
                oldValue = (new BigInteger(oldValue)).mod(new BigInteger(newValue)).toString();
                break;
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}