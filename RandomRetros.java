import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class RandomRetros extends JPanel
{
    // Instances Variables
    private static final String WINDOW_TITLE = "Random Retro Project!";

    public static void main(String[] args) {

        JPanel panel = new RandomRetros();
        JFrame frame = new JFrame(WINDOW_TITLE);
        
    }

    public int randomIndex(String [] ar){
        return (int) (Math.random() * ar.length);
    }


}
