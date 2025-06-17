import java.awt.*;
import javax.swing.*;
public class TestePasswd extends JFrame{
    private JPasswordField p1;

    public TestePasswd(){
        setTitle("Senha");
        p1=new JPasswordField();
        getContentPane().add(p1);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void main(String[] args){
        TestePasswd t = new TestePasswd();
    }
}