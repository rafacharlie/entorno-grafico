/**5. Escribe un programa que guarde en un fichero el contenido de otros dos ficheros, de tal forma que en el fichero resultante aparezcan las líneas de los 
 * primeros dos ficheros mezcladas, es decir, la primera línea será del primer fichero, la segunda será del segundo fichero, la tercera será la siguiente del
 *  primer fichero, etc.
 *  
 *  Componentes gráficos: 

Etiquetas.
Fichero origen y destino.
Botón para ejecutar la acción.
Caja de texto con el contenido del fichero destino no editable.

 *  @author Rafael Infante
 */


package entornoGrafico;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class FicheroEj5 {

  private JFrame frame;
  private JTextField textFieldFichero1;
  private JTextField textFieldFichero2;
  private JTextField textFieldFicheroDest;
  protected File fichero;
  protected File fichero2;
  protected File ficheroDestino;
  private JScrollPane scrollPane;
  private JTextArea textArea;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          FicheroEj5 window = new FicheroEj5();
          window.frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the application.
   */
  public FicheroEj5() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frame = new JFrame();
    frame.setBounds(100, 100, 465, 360);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setLayout(null);
    
    JButton btnFichero1 = new JButton("fichero 1");
    btnFichero1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        /*mano*/
        JFileChooser fileChooser = new JFileChooser();
        int seleccion = fileChooser.showOpenDialog(frame);

        if (seleccion == JFileChooser.APPROVE_OPTION) {

          fichero = fileChooser.getSelectedFile();
          // ponemos la ruta en el textfield origen
          textFieldFichero1.setText(fichero.getAbsolutePath());
        }
      }
    });
    btnFichero1.setBounds(10, 11, 89, 23);
    frame.getContentPane().add(btnFichero1);
    
    JButton btnFichero2 = new JButton(" fichero 2");
    btnFichero2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        /*mano*/
        JFileChooser fileChooser = new JFileChooser();
        int seleccion = fileChooser.showOpenDialog(frame);

        if (seleccion == JFileChooser.APPROVE_OPTION) {

          fichero2 = fileChooser.getSelectedFile();
          // ponemos la ruta en el textfield origen
          textFieldFichero2.setText(fichero2.getAbsolutePath());
        }
      }
    });
    btnFichero2.setBounds(109, 11, 89, 23);
    frame.getContentPane().add(btnFichero2);
    
    JButton btnFicheroDestino = new JButton("fichero destino");
    btnFicheroDestino.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        /*mano*/
        JFileChooser fileChooser = new JFileChooser();
        int seleccion = fileChooser.showOpenDialog(frame);

        if (seleccion == JFileChooser.APPROVE_OPTION) {

          ficheroDestino = fileChooser.getSelectedFile();
          // ponemos la ruta en el textfield origen
          textFieldFicheroDest.setText(ficheroDestino.getAbsolutePath());
        }
      }
    });
    btnFicheroDestino.setBounds(208, 11, 112, 23);
    frame.getContentPane().add(btnFicheroDestino);
    
    JButton btnCombinar = new JButton("Combinar");
    btnCombinar.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        /*codigo*/
        try {
          FileReader leer = new FileReader("C:/Users/Rafael Infante/Desktop/ficherospgnpracticas/ejemplo.txt");
          FileReader leer2 = new FileReader("C:/Users/Rafael Infante/Desktop/ficherospgnpracticas/ejemplo2.txt");
          FileReader leer3 = new FileReader("C:/Users/Rafael Infante/Desktop/ficherospgnpracticas/destino.txt");
          FileWriter escribir = new FileWriter("C:/Users/Rafael Infante/Desktop/ficherospgnpracticas/destino.txt");

          BufferedReader br1 = new BufferedReader(leer);
          BufferedReader br2 = new BufferedReader(leer2);
          BufferedReader br3 = new BufferedReader(leer3);
          BufferedWriter bw = new BufferedWriter(escribir);

          String linea1 = "";
          String linea2 = "";

          while ((linea1 != null) || (linea2 != null) ){
            linea1 = br1.readLine();
            linea2 = br2.readLine();

            if (linea1 != null) {
              bw.write(linea1 +"\n"); // escribe en el fichero de destino
            }
            
            if (linea2 != null) {
              bw.write(linea2 +"\n"); // escribe en el fichero de destino
            }
            
          }
          
          bw.close();
          br1.close();
          br2.close();
          
          String contenidoFichero3 = "";
          linea1 = "";
          
          while (linea1 != null) {
            linea1 = br3.readLine();
            if (linea1 != null) {
              contenidoFichero3 += linea1;
            }
          }
          textArea.append(contenidoFichero3);
          br3.close();
          
          
          

          JOptionPane.showMessageDialog(null, "Programa finalizado con exito");

        } catch (IOException ie) {
          JOptionPane.showMessageDialog(null, "No se encontro el archivo");
          
        }
      }
    });
    btnCombinar.setBounds(330, 11, 89, 23);
    frame.getContentPane().add(btnCombinar);
    
    textFieldFichero1 = new JTextField();
    textFieldFichero1.setBounds(10, 45, 429, 20);
    frame.getContentPane().add(textFieldFichero1);
    textFieldFichero1.setColumns(10);
    
    textFieldFichero2 = new JTextField();
    textFieldFichero2.setBounds(10, 76, 429, 20);
    frame.getContentPane().add(textFieldFichero2);
    textFieldFichero2.setColumns(10);
    
    textFieldFicheroDest = new JTextField();
    textFieldFicheroDest.setBounds(10, 107, 429, 20);
    frame.getContentPane().add(textFieldFicheroDest);
    textFieldFicheroDest.setColumns(10);
    
    scrollPane = new JScrollPane();
    scrollPane.setBounds(10, 138, 429, 172);
    frame.getContentPane().add(scrollPane);
    
    textArea = new JTextArea();
    scrollPane.setViewportView(textArea);
  }
}
