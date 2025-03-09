import java.awt.*;
import java.awt.event.*;


public class gui5 {
    public static void main(String[] args) {
        JsmFrame jobj = new JsmFrame("Fabulous Infosystems");
    }
}

class JsmFrame {
    public JsmFrame(String title)
    {
        Frame f = new Frame(title);
        f.setSize(400,400);
        f.setLayout(new GridLayout(2,8,20,40));
        f.setVisible(true);
        

        //Addd button
        Button b1 = new Button("Submit");
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
