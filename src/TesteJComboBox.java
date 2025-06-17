import java.awt.*;
import javax.swing.*;
public class TesteJComboBox extends JFrame{
    private JComboBox lista;

    TesteJComboBox (){
        String[] data = {"um", "dois", "três", "quatro"};
        setTitle("Lista");
        lista=new JComboBox(data);
        JScrollPane sp=new JScrollPane(lista);
        getContentPane().add(sp);
        getContentPane().add(lista);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void main(String[] args){
        TesteJComboBox t = new TesteJComboBox();
    }
}