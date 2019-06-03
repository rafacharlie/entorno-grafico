/**Realiza los siguientes programas y pon el enlace a tu repositorio en GitHub:

1. Calcular el perí­metro y área de un rectángulo dada su base y su altura.

Componentes gráficos:

    Etiquetas.
    Cajas de texto para base y altura.
    Botón para calcular.
    Caja de texto resultado.

No utilizar asistente.
*/
package entornoGrafico;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class AreaRectangulo extends JFrame {
  //campos de texto
  TextField tf1; 
  TextField tf2;
  TextField tf3;
  //panel
  JPanel panel;

  public AreaRectangulo() {
    // creamos un panel
    panel = new JPanel();
    // Importante: desactivar el diseño por defecto.
    panel.setLayout(null);
    // ajustamos un tamaño
    setSize(400, 300);
    // agregamos el panel a la ventana
    this.getContentPane().add(panel);
    //por defecto viene como false
    setVisible(true);
    setTitle("Calcular el Area del Rectagulo v1.0");

    // creamos etiqueta de texto, la posicionamos y la añadimos con add
    JLabel etiq1 = new JLabel();
    etiq1.setText("Introduzca la base: ");
    etiq1.setBounds(10, 10, 110, 30);
    panel.add(etiq1);

    // creamos el cuadro de texto, posicionamos etc...
    tf1 = new TextField();
    tf1.setBounds(160, 15, 50, 20);
    panel.add(tf1);

    // etiqueta
    JLabel etiq2 = new JLabel();
    etiq2.setText("Introduzca la altura: ");
    etiq2.setBounds(10, 50, 150, 30);
    panel.add(etiq2);

    // cuadro de texto
    tf2 = new TextField();
    tf2.setBounds(160, 55, 50, 20);
    panel.add(tf2);

    JButton boton = new JButton("Calcular");
    boton.setBounds(140, 100, 100, 20);
    panel.add(boton);
    boton.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        calcularArea();
      }
      
    });
    // cuadro de texto
    tf3 = new TextField();
    tf3.setBounds(160, 150, 50, 20);
    panel.add(tf3);

  }

  /**
   * metodo para calcular el area de un rectangulo
   * 
   */
  public void calcularArea() {
    try {
      double base = Double.parseDouble(tf1.getText());
      double altura = Double.parseDouble(tf2.getText());
      double area = base * altura;
      tf3.setText(Double.toString(area));
    } catch (Exception e2) {
      JOptionPane.showMessageDialog(panel, "No puedes introducir letras o no has rellenado todos los campos", "Error",
          JOptionPane.ERROR_MESSAGE);
    }
  }

}
