
import fatec.poo.model.Circulo;
import java.util.Scanner;


/**
 *
 * @author Nataly
 */
public class Aplic {
    public static void main(String[] args) {
          
        double raio;
        String uniMedCirculo;
        
        // Instancição dos objetos
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a unidade de medida: ");
        uniMedCirculo = entrada.next();
        Circulo objCir = new Circulo(uniMedCirculo);
        
        
        System.out.print("Digite o raio: ");
        raio = entrada.nextDouble();
        
        objCir.setRaio(raio);
        
        System.out.println("\nArea do Raio: " + objCir.calcArea() + " " + objCir.getUnidadeMedida() + "²");
        System.out.println("Perimetro do Raio: " + objCir.calcPerimetro() + " " + objCir.getUnidadeMedida());
        System.out.println("Diaetro do Raio: " + objCir.calcDiametro() + " " + objCir.getUnidadeMedida());
        System.out.println("Medidad do Raio: " + objCir.getRaio() + " " + objCir.getUnidadeMedida());
    }
    
}
