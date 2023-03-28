import fatec.poo.model.Cliente;
import fatec.poo.model.Instrutor;
import java.text.DecimalFormat;

/**
 *
 * @author Nataly
 */
public class Aplic {
    public static void main(String[] args){
            
    DecimalFormat df = new DecimalFormat("#,##.00");
    
    Cliente objClin = new Cliente("472.027.618-07", "Carlão", "988050574");
    objClin.setAltura(1.27);
    objClin.setPeso(120);
    
    System.out.println("\nNome: " + objClin.getNome());
    System.out.println("\nCpf: " + objClin.getCpf());
    System.out.println("\nTelefone: " + objClin.getTelefone());
    System.out.println("\nAltura: " + objClin.getAltura());
    System.out.println("\nPeso: " + objClin.getPeso());
    System.out.println("\n\nIMC: " + objClin.calcIMC());
    
    Instrutor objInstru = new Instrutor(123, "Matso", "988050576");
    
    objInstru.setAreaAtuacao("Atendente do Habbibs");
    
    System.out.println("\nNome: " + objInstru.getNome());
    System.out.println("\nTelefone: " + objInstru.getTelefone());
    System.out.println("\nAréa de Atuação: " + objInstru.getAreaAtuacao());
    System.out.println("\nIdentificação: " + objInstru.getIdentificacao());
    
    }
    
}
