/**4. Cajero de cambio: devuelve y desglosa el cambio en billetes y monedas de forma "ideal"; es decir, con el menor número de billetes y monedas posibles.

Componentes gráficos: 

Etiquetas.
Caja de texto para introducir dinero a cambiar.
Cajas de texto para billetes y monedas.
Botón para calcular.
Opcional: sustituir la etiqueta de cada billete y moneda por su imagen. 

@author Rafael Infante
*/
package entornoGrafico;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CajeroCambio extends JFrame {

  private JPanel contentPane;
  private JTextField recogeCifraJTF;
  private JTextField b500JTF;
  private JTextField b200JTF;
  private JTextField b100JTF;
  private JTextField b50JTF;
  private JTextField b20JTF;
  private JTextField b10JTF;
  private JTextField b5JTF;
  private JTextField m2JTF;
  private JTextField m1JTF;
  private JTextField m50cJTF;
  private JTextField m20cJTF;
  private JTextField m10cJTF;
  private JTextField m5cJTF;
  private JTextField m2cJTF;
  private JTextField m1cJTF;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          CajeroCambio frame = new CajeroCambio();
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
  public CajeroCambio() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 510, 299);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    
    JLabel recogeCifraJL = new JLabel("Introduzca una cifra: ");
    recogeCifraJL.setBounds(35, 29, 106, 14);
    contentPane.add(recogeCifraJL);
    
    recogeCifraJTF = new JTextField();
    recogeCifraJTF.setBounds(151, 26, 106, 17);
    contentPane.add(recogeCifraJTF);
    recogeCifraJTF.setColumns(10);
    
    JLabel DesgloseEnBilletesJL = new JLabel("Desglose en billetes y monedas");
    DesgloseEnBilletesJL.setBounds(131, 54, 158, 14);
    contentPane.add(DesgloseEnBilletesJL);
    
    JLabel billetesJL = new JLabel("Billetes");
    billetesJL.setBounds(211, 79, 40, 14);
    contentPane.add(billetesJL);
    
    JLabel b500JL = new JLabel("500");
    b500JL.setBounds(10, 102, 28, 14);
    contentPane.add(b500JL);
    
    JLabel B200JL = new JLabel("200");
    B200JL.setBounds(63, 102, 28, 14);
    contentPane.add(B200JL);
    
    JLabel b100JL = new JLabel("100");
    b100JL.setBounds(122, 102, 28, 14);
    contentPane.add(b100JL);
    
    JLabel b50JL = new JLabel("50");
    b50JL.setBounds(182, 102, 23, 14);
    contentPane.add(b50JL);
    
    JLabel b20JL = new JLabel("20");
    b20JL.setBounds(242, 102, 23, 14);
    contentPane.add(b20JL);
    
    JLabel b10JL = new JLabel("10");
    b10JL.setBounds(315, 102, 28, 14);
    contentPane.add(b10JL);
    
    JLabel b5JL = new JLabel("5");
    b5JL.setBounds(389, 102, 23, 14);
    contentPane.add(b5JL);
    
    b500JTF = new JTextField();
    b500JTF.setBounds(5, 136, 40, 20);
    contentPane.add(b500JTF);
    b500JTF.setColumns(10);
    
    b200JTF = new JTextField();
    b200JTF.setBounds(55, 136, 40, 20);
    contentPane.add(b200JTF);
    b200JTF.setColumns(10);
    
    b100JTF = new JTextField();
    b100JTF.setBounds(112, 136, 40, 20);
    contentPane.add(b100JTF);
    b100JTF.setColumns(10);
    
    b50JTF = new JTextField();
    b50JTF.setBounds(171, 136, 40, 20);
    contentPane.add(b50JTF);
    b50JTF.setColumns(10);
    
    b20JTF = new JTextField();
    b20JTF.setBounds(231, 136, 45, 20);
    contentPane.add(b20JTF);
    b20JTF.setColumns(10);
    
    b10JTF = new JTextField();
    b10JTF.setBounds(303, 136, 45, 20);
    contentPane.add(b10JTF);
    b10JTF.setColumns(10);
    
    b5JTF = new JTextField();
    b5JTF.setBounds(371, 136, 45, 20);
    contentPane.add(b5JTF);
    b5JTF.setColumns(10);
    
    JLabel lblNewLabel = new JLabel("Monedas");
    lblNewLabel.setBounds(211, 167, 46, 14);
    contentPane.add(lblNewLabel);
    
    JLabel m2JL = new JLabel("2");
    m2JL.setBounds(22, 189, 16, 14);
    contentPane.add(m2JL);
    
    JLabel m1JL = new JLabel("1");
    m1JL.setBounds(68, 189, 23, 14);
    contentPane.add(m1JL);
    
    JLabel m50JL = new JLabel("50c");
    m50JL.setBounds(122, 189, 46, 14);
    contentPane.add(m50JL);
    
    JLabel m20cJL = new JLabel("20c");
    m20cJL.setBounds(182, 189, 46, 14);
    contentPane.add(m20cJL);
    
    JLabel m10cJL = new JLabel("10c");
    m10cJL.setBounds(242, 189, 46, 14);
    contentPane.add(m10cJL);
    
    JLabel m5cJL = new JLabel("5c");
    m5cJL.setBounds(315, 189, 46, 14);
    contentPane.add(m5cJL);
    
    JLabel m2cJL = new JLabel("2c");
    m2cJL.setBounds(389, 189, 46, 14);
    contentPane.add(m2cJL);
    
    JLabel lblNewLabel_1 = new JLabel("1c");
    lblNewLabel_1.setBounds(445, 189, 46, 14);
    contentPane.add(lblNewLabel_1);
    
    m2JTF = new JTextField();
    m2JTF.setBounds(5, 229, 35, 20);
    contentPane.add(m2JTF);
    m2JTF.setColumns(10);
    
    m1JTF = new JTextField();
    m1JTF.setBounds(55, 229, 36, 20);
    contentPane.add(m1JTF);
    m1JTF.setColumns(10);
    
    m50cJTF = new JTextField();
    m50cJTF.setBounds(112, 229, 38, 20);
    contentPane.add(m50cJTF);
    m50cJTF.setColumns(10);
    
    m20cJTF = new JTextField();
    m20cJTF.setBounds(171, 229, 40, 20);
    contentPane.add(m20cJTF);
    m20cJTF.setColumns(10);
    
    m10cJTF = new JTextField();
    m10cJTF.setBounds(231, 229, 45, 20);
    contentPane.add(m10cJTF);
    m10cJTF.setColumns(10);
    
    m5cJTF = new JTextField();
    m5cJTF.setBounds(303, 229, 45, 20);
    contentPane.add(m5cJTF);
    m5cJTF.setColumns(10);
    
    m2cJTF = new JTextField();
    m2cJTF.setBounds(371, 229, 45, 20);
    contentPane.add(m2cJTF);
    m2cJTF.setColumns(10);
    
    m1cJTF = new JTextField();
    m1cJTF.setBounds(445, 229, 40, 20);
    contentPane.add(m1cJTF);
    m1cJTF.setColumns(10);
    
    JButton btnNewButton = new JButton("Calcular");
    btnNewButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        
        // Variables
        double dinero = 0; // dinero double
        String dineroCadena; // dinero en cadena
        int i;
        int aux = 0; // variable auxiliar
        String dineroCadenaE = null; // parte entera en cadena
        double dineroE = 0; // parte entera en entero
        double dineroD = 0; // parte decimal en entero
        int euros = 0; // parte entera en entero
        int cent = 0; // parte decimal en entero
        
        // contadores de billetes
        int cont500 = 0;
        int cont200 = 0;
        int cont100 = 0;
        int cont50 = 0;
        int cont20 = 0;
        int cont10 = 0;
        int cont5 = 0;

        // contadores de monedas
        int cont2 = 0;
        int cont1 = 0;
        int cont50c = 0;
        int cont20c = 0;
        int cont10c = 0;
        int cont5c = 0;
        int cont2c = 0;
        int cont1c = 0;

        // pido la cantidad
        dinero = Double.parseDouble(recogeCifraJTF.getText());

        // lo convierto a cadena
        dineroCadena = String.valueOf(dinero);

        // saco la parte entera como numero entero(double)
        for (i = 0; i < dineroCadena.length(); i++) {
          // al mostrarlo como String es con punto y no con coma por eso lo comparo asi
          if (dineroCadena.substring(i, i + 1).equals(".")) {
            aux = i;
            i = 0;
            dineroCadenaE = dineroCadena.substring(i, aux);

            dineroE = Double.parseDouble(dineroCadenaE);
            break;
          }
        }

        // saco la parte decimal como numero entero(double)
        dineroD = dinero - dineroE;
        dineroD = Math.round(dineroD * 100) / 100d;
        dineroD = dineroD * 100;

        // paso la parte entera y decimal de double a entera
        euros = (int) dineroE;
        cent = (int) dineroD;

        // calcular los billetes

        cont500 = euros / 500;
        euros = (euros - cont500 * 500);
        b500JTF.setText(String.valueOf(cont500));

        cont200 = euros / 200;
        euros = (euros - cont200 * 200);
        b200JTF.setText(String.valueOf(cont200));

        cont100 = euros / 100;
        euros = (euros - cont100 * 100);
        b100JTF.setText(String.valueOf(cont100));

        cont50 = euros / 50;
        euros = (euros - cont50 * 50);
        b50JTF.setText(String.valueOf(cont50));

        cont20 = euros / 20;
        euros = (euros - cont20 * 20);
        b20JTF.setText(String.valueOf(cont20));

        cont10 = euros / 10;
        euros = (euros - cont10 * 10);
        b10JTF.setText(String.valueOf(cont10));

        cont5 = euros / 5;
        euros = (euros - cont5 * 5);
        b5JTF.setText(String.valueOf(cont5));

        // calcular las monedas y centimos
        
        cont2 = euros / 2;
        euros = (euros - cont2 * 2);
        m2JTF.setText(String.valueOf(cont2));
        

        cont1 = euros / 1;
        euros = (euros - cont1 * 1);
        m1JTF.setText(String.valueOf(cont1));

        cont50c = cent / 50;
        cent = cent - cont50c * 50;
        m50cJTF.setText(String.valueOf(cont50c));
        

        cont20c = cent / 20;
        cent = cent - cont20c * 20;
        m20cJTF.setText(String.valueOf(cont20c));
       
        cont10c = cent / 10;
        cent = cent - cont10c * 10;
        m10cJTF.setText(String.valueOf(cont10c));

        cont5c = cent / 5;
        cent = cent - cont5c * 5;
        m5cJTF.setText(String.valueOf(cont5c));

        cont2c = cent / 2;
        cent = cent - cont2c * 2;
        m2cJTF.setText(String.valueOf(cont2c));

        cont1c = cent / 1;
        cent = cent - cont1c * 1;
        m1cJTF.setText(String.valueOf(cont1c));
        
      }
    });
    btnNewButton.setBounds(346, 25, 89, 23);
    contentPane.add(btnNewButton);
  }
}
