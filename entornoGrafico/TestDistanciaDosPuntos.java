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

import javax.swing.JFrame;

public class TestDistanciaDosPuntos {

  public static void main(String[] args) {
    DistanciaDosPuntos ventana=new DistanciaDosPuntos();
    
    //al cerrar la ventana grafica corta la ejecucion del programa
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

}
