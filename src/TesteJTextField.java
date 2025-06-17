import javax.swing.*;
import java.awt.*;
public class TesteJTextField {
    private JTextField jtfTeste;
    private JFrame janelaDemo;

    public TesteJTextField(){
        String t="";
        janelaDemo = new JFrame("Campo Texto");
        janelaDemo.getContentPane().setLayout(new FlowLayout());
        jtfTeste= new JTextField(10);
        janelaDemo.getContentPane().add(jtfTeste);
        janelaDemo.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        janelaDemo.pack();
        janelaDemo.setVisible(true);
    }

    public static void main(String[] args){
        TesteJTextField  t = new TesteJTextField();
    }

}