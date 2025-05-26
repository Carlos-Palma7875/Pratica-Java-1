
package practica;
import javax.swing.JOptionPane;

/**
 *
 * @author valen
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        //inicio del Main
        
        String nom, resp; // Creacion de variables
        int edad;
        double salario;
          
                
        
        
        resp = JOptionPane.showInputDialog("Hola, igrese su nombre: ");
        
        nom = resp;
        
        resp = JOptionPane.showInputDialog("Ingrese su edad: ");
        
        edad  = Integer.parseInt(resp); // Pasar la string del input a entero con parse
        
        resp = JOptionPane.showInputDialog("Ingrese su salario: ");
        
        salario = Double.parseDouble(resp);
        
        JOptionPane.showMessageDialog(null, "su nombre es " +nom+ "\n" + "su edad es: " +edad+ '\n' + "su salario es: " +salario);
        
        //Fin del Main
        
        
        
    }
    
}
