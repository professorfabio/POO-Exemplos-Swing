import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class Mouse extends JFrame {
    private JLabel status;
    public Mouse() {
        super("Mouse Demo");
        status = new JLabel();
        getContentPane().add(status, BorderLayout.SOUTH);
        Posicao ml = new Posicao();
        this.addMouseListener(ml);
        setSize(300,100);
        setVisible(true);
    }//construtor
    //classe interna
    private class Posicao implements MouseListener {
        public void mouseClicked(MouseEvent e)  {
            status.setText("clicou em "+ e.getX()+ "; "+ e.getY());
        }
        public void mousePressed(MouseEvent e)  {
            status.setText("pressionou em "+ e.getX()+ "; "+ e.getY());
        }
        public void mouseReleased(MouseEvent e) {
            status.setText("soltou em "+ e.getX()+ "; "+ e.getY());
        }
        public void mouseEntered(MouseEvent e)  {
            JOptionPane.showMessageDialog(null,"Mouse na janela");
        }
        public void mouseExited(MouseEvent e)  {
            status.setText("Mouse fora da janela");
        }
    }//interna
    public static void main(String[] args) {
        Mouse m = new Mouse();
    }
}