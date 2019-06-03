/**6. Realiza un programa que diga cuántas ocurrencias de una palabra hay en un fichero. 

Componentes gráficos: 

Etiquetas.
Fichero a comprobar.
Caja de texto con resultado.
Botón calcular.

@author Rafael Infante
*/
package entornoGrafico;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class FicherosEj6 extends JFrame {

  private JPanel contentPane;
  private JTextField palabraJTF;
  File fichero = null; //variable del programa

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          FicherosEj6 frame = new FicherosEj6();
          frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the frame.
   */
  public FicherosEj6() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 449, 177);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    setTitle("Buscador de ocurrencias");
    
    JLabel ficheroJL = new JLabel("Fichero: ");
    ficheroJL.setBounds(25, 27, 46, 14);
    contentPane.add(ficheroJL);
    
    JButton btnAbrir = new JButton("Abrir");
    btnAbrir.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        //este codigo lo tuve que buscar por internet
        JFileChooser fileChooser = new JFileChooser();
        int seleccion = fileChooser.showOpenDialog(contentPane);
        
        if(seleccion == JFileChooser.APPROVE_OPTION){
          
          fichero = fileChooser.getSelectedFile();
        }
        
        //hasta aqui
      }
    });
    btnAbrir.setBounds(78, 23, 89, 23);
    contentPane.add(btnAbrir);
    
    JLabel palabraJL = new JLabel("Palabra: ");
    palabraJL.setBounds(255, 27, 46, 14);
    contentPane.add(palabraJL);
    
    palabraJTF = new JTextField();
    palabraJTF.setBounds(311, 24, 86, 20);
    contentPane.add(palabraJTF);
    palabraJTF.setColumns(10);
    
    JButton btnCalcular = new JButton("Calcular");
    btnCalcular.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        
        //programa
        int contador = 0; // contador de ocurrencias
        
        String palabra = null;

        try {
        
        palabra = palabraJTF.getText();

        BufferedReader br = new BufferedReader(new FileReader(fichero));

        String linea = "";
        String contenidoLinea = "";

        while (linea != null) {
          contenidoLinea = linea;
          linea = br.readLine();
          if (contenidoLinea.equals(palabra)) {
            contador++;
          }
        }

        br.close();
        
        }catch(FileNotFoundException e) {
          JOptionPane.showMessageDialog(null, "El fichero no se ha podido encontrar");
          
        }catch (IOException e) {
          JOptionPane.showMessageDialog(null, "Error en la lectura del fichero");
         
        }
        JOptionPane.showMessageDialog(null, "La palabra " + palabra + " se ha encontrado " + contador + " veces.");
        
      }
    });
    btnCalcular.setBounds(157, 85, 89, 23);
    contentPane.add(btnCalcular);
  }
}
