import java.awt.*;
import javax.swing.*;
public class TesteLabel
{
    public static void main(String[] args)
    {
        JFrame fr = new JFrame();
        JLabel lb = new JLabel("Texto",
                new ImageIcon("res/duke.gif"),
                SwingConstants.CENTER);
        lb.setFont(new Font("Serif",Font.BOLD,20));
        lb.setForeground(Color.black);
        fr.getContentPane().add(lb);
        fr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }
}