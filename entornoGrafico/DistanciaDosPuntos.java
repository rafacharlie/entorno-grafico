/**2. Pide al usuario dos pares de números x1,y2 y x2,y2, que representen dos puntos en el plano.
 *  Calcula y muestra la distancia entre ellos.

Componentes gráficos:

    Etiquetas.
    Cajas de texto para base y altura.
    Botón para calcular.
    Caja de texto resultado.

No utilizar asistente.

@author Rafael Infante*/

package entornoGrafico;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class DistanciaDosPuntos extends JFrame{
  TextField tfx1; 
  TextField tfy1;
  TextField tfx2;
  TextField tfy2;
  TextField resultado;
  JPanel panel;
  
  public DistanciaDosPuntos() {
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
    setTitle("Calcular la distancia entre dos puntos");
    
    // creamos etiqueta de texto que pide el valor de x1
    JLabel etiq1 = new JLabel();
    etiq1.setText("Introduzca el valor de x1: ");
    etiq1.setBounds(10, 10, 150, 30);
    panel.add(etiq1);
    
    // creamos el cuadro de texto para insertar el valor x1
    tfx1 = new TextField();
    tfx1.setBounds(160, 15, 50, 20);
    panel.add(tfx1);
    
    // creamos etiqueta de texto que pide el valor de x2
    JLabel etiq2 = new JLabel();
    etiq2.setText("Introduzca el valor de x2: ");
    etiq2.setBounds(10, 50, 150, 30);
    panel.add(etiq2);

    // creamos el cuadro de texto para insertar el valor x2
    tfx2 = new TextField();
    tfx2.setBounds(160, 55, 50, 20);
    panel.add(tfx2);
    
    // creamos etiqueta de texto que pide el valor de y1
    JLabel etiq3 = new JLabel();
    etiq3.setText("Introduzca el valor de y1: ");
    etiq3.setBounds(10, 90, 150, 30);
    panel.add(etiq3);

    // creamos el cuadro de texto para insertar el valor y1
    tfy1 = new TextField();
    tfy1.setBounds(160, 95, 50, 20);
    panel.add(tfy1);
    
 // creamos etiqueta de texto que pide el valor de y2
    JLabel etiq4 = new JLabel();
    etiq4.setText("Introduzca el valor de y2: ");
    etiq4.setBounds(10, 130, 150, 30);
    panel.add(etiq4);

    // creamos el cuadro de texto para insertar el valor y2
    tfy2 = new TextField();
    tfy2.setBounds(160, 135, 50, 20);
    panel.add(tfy2);
    
    JButton boton = new JButton("Calcular");
    boton.setBounds(140, 160, 100, 20);
    panel.add(boton);
    boton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        calcularArea();
      }
    });
    
    // cuadro de texto
    resultado = new TextField();
    resultado.setBounds(160, 200, 50, 20);
    panel.add(resultado);
  }
  
  /**
   * metodo para calcular el area de un rectangulo
   * 
   */
  public void calcularArea() {
    try {
      int x1 = Integer.parseInt(tfx1.getText());
      int x2 = Integer.parseInt(tfx2.getText());
      int y1 = Integer.parseInt(tfy1.getText());
      int y2 = Integer.parseInt(tfy2.getText());
      
      int distancia = distancia = (int)Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
      
      resultado.setText(Integer.toString(distancia));
    } catch (Exception e2) {
      JOptionPane.showMessageDialog(panel, "No puedes introducir letras o no has rellenado todos los campos", "Error",
          JOptionPane.ERROR_MESSAGE);
    }
  }
}
