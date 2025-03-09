
import java.awt.*;
public class gui2 {

    public static void main(String[] args) {
     fabFrmae obj = new fabFrmae("fabullous");
    } 
 }
 
class fabFrmae
{
    public fabFrmae(String title)
    {
        Frame f = new Frame(title);
        f.setSize(400, 400);
        f.setVisible(true);
    }
}
