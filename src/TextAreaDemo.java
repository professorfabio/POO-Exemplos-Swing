import java.awt.*;
import javax.swing.*;
public class TextAreaDemo {
    public TextAreaDemo(){
        JLabel lNome = new JLabel("Observação:");
        JTextArea tArea = new JTextArea("",5,30);
        JScrollPane sp = new JScrollPane(tArea,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        JPanel painel = new JPanel();
        JFrame janela = new JFrame("Teste do JTextArea");
        painel.add(lNome );
        painel.add(sp );
        janela.getContentPane().add(painel);
        janela.pack();
        janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
    public static void main(String[] args){
        TextAreaDemo t = new TextAreaDemo();
    }
}