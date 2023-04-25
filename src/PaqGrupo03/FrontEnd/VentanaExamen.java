package PaqGrupo03.FrontEnd;

import javax.swing.*;


public class VentanaExamen extends JFrame {
    private JTextArea Mostrarexamen;
    private JPanel panelfondo;

    public VentanaExamen(String s){
        setTitle("Mostrar datos para examen");
        setSize(800,600);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
        setContentPane(Mostrarexamen);
        panelfondo.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        Mostrarexamen.setText(s);
    }


}
