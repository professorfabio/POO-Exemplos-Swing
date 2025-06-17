import javax.swing.*;
class TesteJRadioButton extends JFrame{
    private JRadioButton jrbm;
    private JRadioButton jrbf;

    TesteJRadioButton(String titulo){
        setTitle(titulo);
        JPanel painel=new JPanel();
        jrbm=new JRadioButton("Masculino");
        jrbf=new JRadioButton("Feminino");
        ButtonGroup grupo = new ButtonGroup ();
        grupo.add(jrbm);
        grupo.add(jrbf);
        painel.add(jrbm);
        painel.add(jrbf);
        getContentPane().add(painel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
    }

    public static void main(String args[]){
        TesteJRadioButton trb= new TesteJRadioButton("Teste de JRadioButton");
    }
}
