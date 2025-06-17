import javax.swing.*;
class TesteJCheckBox extends JFrame{
    private JCheckBox  jcb;

    TesteJCheckBox(String titulo){
        setTitle(titulo);
        String estado="";
        jcb=new JCheckBox("Estado");
        jcb.setSelected(true);
        if(jcb.isSelected())	   estado="ligado";
		else 	   estado="desligado";
        getContentPane().add(jcb);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
    }

    public static void main(String args[]){
        TesteJCheckBox tcb= new TesteJCheckBox("Teste de JCheckBox");
    }
}