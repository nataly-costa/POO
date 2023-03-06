
import fatec.poo.model.Retangulo;
import java.util.Scanner;

/**
 *
 * @author Nataly
 */
public class Aplic {
    public static void main(String[] args) {
       double medAlt, medBase;
       
       //Instanciaçao dos objetos
       Scanner entrada = new Scanner(System.in);
       Retangulo objRet = new Retangulo();
       
       System.out.print("Digite a medida da altura: ");
       medAlt = entrada.nextDouble();
       System.out.print("Digite a medida da bese: ");
       medBase = entrada.nextDouble();
       
       // Passagem de mensagem para o objeto da classe Retangulo
       objRet.setAltura(medAlt);
       objRet.setBase(medBase);
       
       System.out.println("Medida da Altura: " + objRet.getAltura());
       System.out.println("Medida da Base: " + objRet.getBase());
       System.out.println("Medida do Perimetro: " + objRet.calcPerimetro());
       System.out.println("Medida da Area:" + objRet.calcArea());  
    }
    
}
