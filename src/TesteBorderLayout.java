import javax.swing.*;
import java.awt.*;
public class TesteBorderLayout extends JFrame {

    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    private JButton b5;
    public TesteBorderLayout(){

        super("Teste do BorderLayout");
        b1=new JButton("Botão 1");
        b2=new JButton("Botão 2");
        b3=new JButton("Botão 3");
        b4=new JButton("Botão 4");
        b5=new JButton("Botão 5");
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add("North",b1);
        getContentPane().add("South",b2);
        getContentPane().add("West",b3);
        getContentPane().add("East",b4);
        getContentPane().add("Center",b5);
        pack();
        setVisible(true);
    }
    public static void main(String[] args){
        TesteBorderLayout t = new TesteBorderLayout();
    }
}