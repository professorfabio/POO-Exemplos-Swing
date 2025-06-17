import javax.swing.*;
import java.awt.*;
public class TesteBotao {
    private JButton bsim;
    private JButton bnao;
    private JFrame janelaDemo;

    TesteBotao(){
        janelaDemo = new JFrame("Botões");
        janelaDemo.getContentPane().setLayout(new FlowLayout());
        bsim= new JButton("Sim");
        bnao= new JButton("Não");
        bsim.setToolTipText("Pressione Sim para sair");
        janelaDemo.getContentPane().add(bsim);
        janelaDemo.getContentPane().add(bnao);

        janelaDemo.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        janelaDemo.pack();
        janelaDemo.setVisible(true);
    }

    public static void main(String[] args){
        TesteBotao  t = new TesteBotao();
    }
}