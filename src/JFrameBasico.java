import javax.swing.*;
public class JFrameBasico extends JFrame {

    JFrameBasico (String titulo) {
        setTitle(titulo);
        setSize(250, 200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        JFrameBasico jfb = new JFrameBasico ("Tela Simples");
    }

}