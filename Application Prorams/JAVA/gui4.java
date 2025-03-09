import java.awt.*;
import java.awt.event.*;


public class gui4 {
    public static void main(String[] args) {
        JsmFrame jobj = new JsmFrame("Fabulous Infosystems");
    }
}

class JsmFrame {
    public JsmFrame(String title)
    {
        Frame f = new Frame(title);
        f.setSize(400,400);
        f.setVisible(true);
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
