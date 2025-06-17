import javax.swing.*;
import java.awt.*;
public class TesteGridLayout extends JFrame {

    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    private JButton b5;
    public TesteGridLayout (){

        super("Teste do GridLayout");
        b1=new JButton("Botão 1");
        b2=new JButton("Botão 2");
        b3=new JButton("Botão 3");
        b4=new JButton("Botão 4");
        b5=new JButton("Botão 5");
        getContentPane().setLayout(new GridLayout(3,5,5,5));
        getContentPane().add(b1);
        getContentPane().add(b2);
        getContentPane().add(b3);
        getContentPane().add(b4);
        getContentPane().add(b5);
        pack();
        setVisible(true);
    }
    public static void main(String[] args){
        TesteGridLayout t = new TesteGridLayout ();
    }
}