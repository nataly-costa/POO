import fatec.poo.model.Aluno;
import java.util.Scanner;

/**
 *
 * @author Nataly
 */
public class Aplic {
    public static void main(String[] args) {
        int ra, escolha;
        double ntPrv1, ntPrv2, ntTrab1, ntTrab2;
        
        Scanner entrada = new Scanner(System.in);
        Aluno objAluno = new Aluno();
        
        System.out.print("Digite o RA: ");
        ra = entrada.nextInt();
        
        System.out.print("Digite a nota da primeira prova: ");
        ntPrv1 = entrada.nextDouble();
        
        System.out.print("Digite a nota da segunda prova: ");
        ntPrv2 = entrada.nextDouble();
        
        System.out.print("Digite a nota do primeiro trabalho: ");
        ntTrab1 = entrada.nextDouble();
        
        System.out.print("Digite a nota do segundo trabalho: ");
        ntTrab2 = entrada.nextDouble();
        
        
        objAluno.setRa(ra);
        objAluno.setNtPrv1(ntPrv1);
        objAluno.setNtPrv2(ntPrv2);
        objAluno.setNtTrab1(ntTrab1);
        objAluno.setNtTrab2(ntTrab2);
        
        do{
            
            System.out.print("1- Exibir Nota das Provas/Trabalhos");
            System.out.print("2- Exibir Média dos Trabalhos");
            System.out.print("3- Exibir Média Final");
            System.out.print("4- Sair");
            System.out.print("      Digite a opcão:");
            
            System.out.print("      Digite a opção: ");
            escolha = entrada.nextInt();
            
           switch(escolha){
               case 1:
                 System.out.println("Prova 1: " + ntPrv1);
                 System.out.println("Prova 2: " + ntPrv2); 
                 System.out.println("1 Trabalho: " + ntTrab1); 
                 System.out.println("2 Trabalho: " + ntTrab2);
                 break;
                 
               case 2:
                 System.out.print(objAluno.calcMediaTrab());
                 break;
               
               case 3:
                 System.out.print(objAluno.calcMediaFinal());
                 break;
                    
           }
                   
         }while(escolha != 4);    
    }
}
