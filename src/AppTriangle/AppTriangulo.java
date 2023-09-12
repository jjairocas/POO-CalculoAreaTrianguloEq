package AppTriangle;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppTriangulo extends JFrame{
    private JTextField txtLado;
    private JTextField txtAltura;
    private JTextField txtArea;
    private JButton btncalcular;
    private JTextField txtPerimetro;
    private JButton btnborrar;
    private JButton btnsalir;
    private JPanel MainPanel;

    public AppTriangulo() {
        setContentPane(MainPanel);
        setTitle("Calculo Medidas de un Triangulo");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        btncalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double lado,altura,area,perimetro;
                txtLado.getText();
                lado=Double.parseDouble(txtLado.getText());

                MedidasTriangulo Triangulo=new MedidasTriangulo(lado);

                txtAltura.setText(String.valueOf(Triangulo.CalcularAltura()));
                txtArea.setText(String.valueOf(Triangulo.CalcularArea()));
                txtPerimetro.setText(String.valueOf(Triangulo.CalcularPerimetro()));

                /*Calculo de las operaciones sin utilizar la Clase
                Medidas de un Triangulo
                altura=(lado*Math.sqrt(3))/2;
                area=((Math.pow(lado,2))*(Math.sqrt(3))/4);
                perimetro=lado*3;*/


            }
        });
        btnborrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtLado.setText("");
                txtAltura.setText("");
                txtArea.setText("");
                txtPerimetro.setText("");
            }
        });
        btnsalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }
        });
    }
}
