
import fatec.poo.model.Circulo;
import java.text.DecimalFormat;
import java.util.Scanner;


/**
 *
 * @author Nataly
 */
public class Aplic {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner entrada = new Scanner(System.in);
        double raio;
        int i;
        
        Circulo[] matCirculo = new Circulo[11];
            
        // Instancição dos objetos
       
        
        for (i=0; i < 10; i++){
        
        matCirculo[i] = new Circulo();
            
        System.out.print("\nDigite o raio: ");
        raio = entrada.nextDouble();
        
        matCirculo[i].setRaio(raio);
        
         }
        
        for (i=0; i < 10; i++){

        System.out.println("\nArea do Raio: " + df.format(matCirculo[i].calcArea()));
        System.out.println("Perimetro do Raio: " + df.format(matCirculo[i].calcPerimetro()));
        System.out.println("Diaetro do Raio: " + df.format(matCirculo[i].calcDiametro()));
        System.out.println("Medidad do Raio: " + df.format(matCirculo[i].getRaio()));
        }
    }
    
}
