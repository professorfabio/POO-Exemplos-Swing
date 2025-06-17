import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Eventos1 extends JFrame {
    JLabel lb1;
    JTextField nome;
    JButton b1;
    Eventos1() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout( new GridLayout(0,3,5,5) );
        TrataEvento tratador = new TrataEvento();
        lb1 = new JLabel("Nome :");
        nome = new JTextField (10);
        b1 = new JButton("Botão 1");
        nome.addActionListener(tratador);
        b1.addActionListener(tratador);
        c.add(lb1);
        c.add(nome);
        c.add(b1);
        pack();
        setVisible(true);
    }
    public static void main( String args[] )  {
        Eventos1 janela = new Eventos1();
    }
    private class TrataEvento implements ActionListener {
        public void actionPerformed(ActionEvent evento) {
            if (evento.getSource() == b1)
                JOptionPane.showMessageDialog(null,"Apertou o  botao B1");
            if (evento.getSource() == nome)
                JOptionPane.showMessageDialog(null,"Deu Enter no nome " + nome.getText() );
        }
    }
}