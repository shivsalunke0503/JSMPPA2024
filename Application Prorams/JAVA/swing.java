// import java.awt.*;
import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;


public class swing {
    public static void main(String[] args) {
        JsmFrame jobj = new JsmFrame("Fabulous Infosystems");
    }
}

class JsmFrame {
    public JsmFrame(String title)
    {
        JFrame f = new JFrame(title);
        f.setSize(400,400);
        // f.setLayout(new GridLayout(2,8,20,40));
        f.setVisible(true);
        

        //Addd button
        JButton b1 = new JButton("Submit");
        b1.setBackground(Color.PINK);
        b1.setBounds(50,50,50,50);
        f.add(b1);
        f.addWindowListener(new JsmFrameListener());
    }
}

class JsmFrameListener extends WindowAdapter
{
    @Override
    public void windowClosing(WindowEvent e) {
        // TODO Auto-generated method stub
        System.exit(0);
    }
}
