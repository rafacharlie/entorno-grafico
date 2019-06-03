/**3. Pide un DNI y comprueba que es correcto, será correcto si tiene 9 caracteres y la letra es correcta.
 * 
 * @author Rafael Infante*/
 
package entornoGrafico;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CompruebaDni extends JFrame {

  private JPanel contentPane;
  private JTextField cT1;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          CompruebaDni frame = new CompruebaDni();
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
  public CompruebaDni() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 331, 147);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    
    JLabel label1 = new JLabel("Introduzca un DNI: ");
    label1.setBounds(28, 27, 100, 14);
    contentPane.add(label1);
    
    cT1 = new JTextField();
    cT1.setBounds(130, 27, 140, 16);
    contentPane.add(cT1);
    cT1.setColumns(10);
    
    JButton btnValidar = new JButton("Validar");
    btnValidar.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {

        // creo un array para guardar las letras del dni
        String array[] = { "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H",
            "L", "C", "K", "E" };
        String dni;
        int i;
        String dniNumero = "";
        int dniNum = 0;
        String letra;
        int resultado;
        String letraDni;

     
        dni = cT1.getText();
        if (dni.length() != 9) {
          JOptionPane.showMessageDialog(null, "Error de longitud.");
        } else {

          // extraigo solo el numero sin la letra
          dniNumero = dni.substring(0, 8);

          // extraigo la letra
          letra = dni.substring(8, 9);

          try {

            dniNum = Integer.parseInt(dniNumero);
          } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "No es un numero");
          }

          resultado = dniNum % 23;
          letraDni = array[resultado];

          if (letraDni.equalsIgnoreCase(letra)) {
            JOptionPane.showMessageDialog(null, "El dni es correcto.");
          } else {
            JOptionPane.showMessageDialog(null, "Dni incorrecto. Pruebe otra vez.");
          }
        }
      }
    });
    btnValidar.setBounds(152, 62, 89, 23);
    contentPane.add(btnValidar);
  }
}
