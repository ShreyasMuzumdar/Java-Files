import javax.swing.*;
import java.awt.Font;
//import javax.awt.*;
//import javax.awt.event.*;
public class GUICalculator //implements ActionListener
{
    JFrame frame;
    JTextField textField;
    JButton[] numberButtons= new JButton[10];
    JButton[] functionButtons=new JButton[8];
    JButton addButton,subButton,mulButton,divButton;
    JButton decButton, equButton, delButton, clrButton;
    JPanel panel;

    Font myFont=new Font("Serif",Font.BOLD,30);

    double num1=0,num2,result=0;
    char operator;
    GUICalculator()
    {
        frame= new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,550);
        frame.setLayout(null);
        textField=new JTextField();
        textField.setBounds(50,25,300,50);
        textField.setFont(myFont);
        textField.setEditable(true);
 
        
        addButton= new JButton("+");
        subButton= new JButton("-");
        mulButton= new JButton("*");
        divButton= new JButton("/");
        decButton= new JButton(".");
        equButton= new JButton("=");
        delButton= new JButton("Delete");
        clrButton= new JButton("Clear");

        functionButtons[0]= addButton;
        functionButtons[1]= subButton;
        functionButtons[2]= mulButton;
        functionButtons[3]= divButton;
        functionButtons[4]= decButton;
        functionButtons[5]= equButton;
        functionButtons[6]= delButton;
        functionButtons[7]= clrButton;
        for(int i=0; i<8;i++)
        {
            //functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(false);
        }
        for(int i=0; i<10;i++)
        {
            numberButtons[i]=new JButton(String.valueOf(i));
            //numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);

        }
        delButton.setBounds(50,430,145,50);
        clrButton.setBounds(205,430,145,50);

        frame.add(delButton);
        frame.add(clrButton);
        frame.add(textField);
        frame.setVisible(true);
    }
    public static void main(String[] args)
    {
       // GUICalculator calc=new GUICalculator();
    }

   /* public void actionPerformed(ActionEvent e)
    {


    }*/
}