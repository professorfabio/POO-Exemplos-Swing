import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class EventosCheckBox extends JFrame {
    JCheckBox bitalico,bnegrito;
    JTextField nome;
    public EventosCheckBox(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout( new GridLayout(0,3,5,5) );
        TrataEvento tratador = new TrataEvento();
        nome = new JTextField (10);
        nome.setFont(new Font("Arial",Font.PLAIN,14));
        bitalico = new JCheckBox ("Italico");
        bnegrito = new JCheckBox("Negrito");
        bnegrito.addItemListener(tratador);
        bitalico.addItemListener(tratador);
        c.add(nome); c.add(bnegrito); c.add(bitalico);
        pack();
        setVisible(true);
    }
    public static void main( String args[] ) {
        EventosCheckBox janela = new EventosCheckBox();
    }
    private class TrataEvento implements ItemListener {
        private int valNeg = Font.PLAIN, valIta = Font.PLAIN;
        public void itemStateChanged(ItemEvent evento) {
            if (evento.getSource() == bnegrito)
                if (evento.getStateChange()== ItemEvent.SELECTED)
                    valNeg = Font.BOLD;
                else
                    valNeg = Font.PLAIN;
            if (evento.getSource() == bitalico)
                if (evento.getStateChange()== ItemEvent.SELECTED)
                    valIta = Font.ITALIC;
                else
                    valIta = Font.PLAIN;
            nome.setFont(new Font("Arial", (valNeg + valIta) , 14));
        }
    }
}