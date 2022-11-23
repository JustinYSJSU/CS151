import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;

/**
 author: Justin Yamamoto
 date: 11/16/2022
 
 This is the Calculator class for hw7 of cs151 with professor newton


 Used the follow link as reference for action listening and computing
 https://www.tutorialspoint.com/Create-a-simple-calculator-using-Java-Swing
*/

public class Calculator extends JFrame implements ActionListener
{
  private JTextField input;

  /**
   Calculator constructor 

  */
  public Calculator(){}

  /**
   Creates the window for the Calculator

  */
  public void createWindow()
  {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //for when app is closed
    this.setTitle("Calculator"); //title
    this.setSize(300,250); //size
    //this.setLocation(10,200); //location
    this.createUI();
    this.setResizable(false);
    this.setVisible(true);
  }

  /**
   Creates the UI for the Calculator

  */
  public void createUI()
  {
    //JPanel content = new JPanel(); //main content panel
    //content.setLayout(new FlowLayout()); //flow layout
    this.setLayout(new FlowLayout());
    input = new JTextField("0",20); //where numbers display, cannot edit
    input.setEditable(false);
    this.add(input);

    //creating buttons
    JButton zero = new JButton("0");
    zero.addActionListener(this);
    JButton one = new JButton("1");
    one.addActionListener(this);
    JButton two = new JButton("2");
    two.addActionListener(this);
    JButton three = new JButton("3");
    three.addActionListener(this);
    JButton four = new JButton("4");
    four.addActionListener(this);
    JButton five = new JButton("5");
    five.addActionListener(this);
    JButton six = new JButton("6");
    six.addActionListener(this);
    JButton seven = new JButton("7");
    seven.addActionListener(this);
    JButton eight = new JButton("8");
    eight.addActionListener(this);
    JButton nine = new JButton("9");
    nine.addActionListener(this);

    JButton addition = new JButton("+");
    addition.addActionListener(this);
    JButton subtraction = new JButton("-");
    subtraction.addActionListener(this);
    JButton division = new JButton("/");
    division.addActionListener(this);
    JButton multiplication = new JButton("*");
    multiplication.addActionListener(this);

    JButton equals = new JButton("=");
    equals.addActionListener(this);
    JButton ac = new JButton("AC");
    ac.addActionListener(this);
    JButton decimal = new JButton(".");
    decimal.addActionListener(this);

    JPanel digits = new JPanel();
    digits.setLayout(new GridLayout(4,3));
    digits.add(zero);
    digits.add(one);
    digits.add(two);
    digits.add(three);
    digits.add(four);
    digits.add(five);
    digits.add(six);
    digits.add(seven);
    digits.add(eight);
    digits.add(nine);
    digits.add(decimal);
    digits.add(ac);


    //digits.setBounds(0,200,300,300);
    this.add(digits);

    JPanel operations = new JPanel();
    operations.setLayout(new GridLayout(5,1));
    operations.add(addition);
    operations.add(subtraction);
    operations.add(division);
    operations.add(multiplication);
    operations.add(equals);
    //operations.setBounds(300, 40, 200, 300);
   
    this.add(operations);
  }

  /**
   Processing action done to the Calculator

  */
  public void actionPerformed(ActionEvent e)
  {
     String action = e.getActionCommand();
     if(action.equals("AC")) //clear the calculator
     {
       input.setText("0"); //set back to 0
     }
     else if(action.charAt(0) == '=') //do operation
     {
       input.setText(this.evaluate(input.getText())); //evaluate expression
     }
     else
     {
       input.setText(input.getText() + action); //taking input
     }
  }

  /**
   Evaluates the expression that was inputted

   @param expression the inputted expression
   @return the solution to the expression
  */
  public String evaluate(String expression)
  {
    char[] expressionArray = expression.toCharArray();
    double result = 0;
    String number1 = "";
    String number2 = "";
    String operation = "";
    for(int i = 0; i < expressionArray.length; i++)
    {
      //finds a number
      if(expressionArray[i] >= '0' && expressionArray[i] <= '9' || expressionArray[i] == '.')
      {
        if(operation.isEmpty()) //first number since operation hasn't been found yet
        { 
          number1 += expressionArray[i];
        }
        else
        {
           number2 += expressionArray[i];
        }
      }

      //found operation instead
      if(expressionArray[i] == '+' || expressionArray[i] == '-' || expressionArray[i] == '*' || expressionArray[i] == '/')
      {
         operation += expressionArray[i];
      }
    }

    //Doing calculation
    if(operation.equals("+"))
    {
      result = (Double.parseDouble(number1) + Double.parseDouble(number2));
    }
    else if(operation.equals("-"))
    {
      result = (Double.parseDouble(number1) - Double.parseDouble(number2));
    }
    else if(operation.equals("*"))
    {
      result = (Double.parseDouble(number1) * Double.parseDouble(number2));
    }
    else if(operation.equals("/"))
    {
      result = (Double.parseDouble(number1) / Double.parseDouble(number2)); 
    }

    return Double.toString(result);
  }
  public static void main(String[] args)
  {
    Calculator myApp = new Calculator();
    myApp.createWindow();
  }

}

