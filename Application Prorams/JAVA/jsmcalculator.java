import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

class jsmCalculator {
    public static void main(String[] args) {
        Calc calc = new Calc(400,400,"Faulous Calculator");
    }
}

class Calc extends WindowAdapter implements ActionListener {
    
    public JFrame mainframe;
    public JButton b1,b2,b3,b4;
    public JTextField t1,t2,t3;
    public JLabel label;
    Integer No1, No2;
    public Calc(int width, int height, String title){
        mainframe = new JFrame(title);
        mainframe.setSize(width,height);
        mainframe.addWindowListener(this);

        b1 = new JButton("Add +");
        b2 = new JButton("Sub -");
        b3 = new JButton("Mul *");
        b4 = new JButton("Div /");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        t1 = new JTextField("Enter No1");
        t2 = new JTextField("Enter No2");

        b1.setBounds(10,280,80,40);
        b2.setBounds(100,280,80,40);
        b3.setBounds(190,280,80,40);
        b4.setBounds(290,280,80,40);

        t1.setBounds(70,100,100,40);
        t2.setBounds(220,100,100,40);

        t3 = new JTextField();
        t3.setBounds(150, 25, 200, 50);
        mainframe.add(t3);

        mainframe.add(b1);
        mainframe.add(b2);
        mainframe.add(b3);
        mainframe.add(b4);

        mainframe.add(t1);
        mainframe.add(t2);

        mainframe.setLayout(null);
        mainframe.setVisible(true);
    }
    
    public void windowClosing(WindowEvent obj)
    {
        System.exit(0);
    }

    public void actionPerformed(ActionEvent event)
    {
        try 
            {
        No1 = Integer.parseInt(t1.getText());
        No2 = Integer.parseInt(t2.getText());

        if(event.getSource() == b1)
        {
            t3.setText("Addition is :"+(No1+No2));
        } else if(event.getSource() == b2){
            t3.setText("Substraction is :"+ (No1-No2));
        }else if(event.getSource() == b3){
            t3.setText("Multiplication is :"+(No1*No2));
        }else if(event.getSource() == b4){
            t3.setText("Division is :"+(No1/No2));
        } else {
            t3.setText("Result goes here");
        }
    } catch(Exception obj){}
}
}


