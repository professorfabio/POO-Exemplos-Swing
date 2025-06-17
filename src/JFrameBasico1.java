import javax.swing.*;

class JFrameBasico1{

    public static void main(String args[]){
        JPanel jpanel = new JPanel( );
        JButton b = new JButton("Botão");
        jpanel.add(b);
        JFrame f = new JFrame();
        f.getContentPane().add(jpanel);
        f.pack();
        f.setVisible(true);
    }
}
