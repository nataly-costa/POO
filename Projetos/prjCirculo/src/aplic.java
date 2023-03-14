
import fatec.poo.model.Circulo;
import java.util.Scanner;

public class aplic {

    public static void main(String[] args) {
        double raio;
        
        // Instancição dos objetos
        Scanner entrada = new Scanner(System.in);
        Circulo objCir = new Circulo();
        
        System.out.print("Digite o raio: ");
        raio = entrada.nextDouble();
        
        objCir.setRaio(raio);
        
        System.out.println("\nArea do Raio: " + objCir.calcArea());
        System.out.println("Perimetro do Raio: " + objCir.calcPerimetro());
        System.out.println("Diaetro do Raio: " + objCir.calcDiametro());
        System.out.println("Medidad do Raio: " + objCir.getRaio());
    }
    
}
