import fatec.poo.model.Livro;
import java.util.Scanner;

public class Aplic {
    public static void main(String[] args) {
        int op, digDiasAtraso;
        
        Scanner entrada = new Scanner(System.in);
        Livro objLiv = new Livro();
        
        // otimizar esses dois futuramente...
        objLiv.setIdentificacao(0); // Setar situação do livro
        objLiv.setValMultaDiaria(30); // Inserir Valor da Multa
        
        do{
            System.out.println("1 - Consultar livro");
            System.out.println("2 - emprestar livro");
            System.out.println("3 - Devolver livro");
            System.out.println("4 - Consultar total multa");
            System.out.println("5 - Sair");
            System.out.print("\n\tDigite a opção: ");
            op = entrada.nextInt();
            
            switch(op){
                case 1:
                    if(objLiv.getSituacao())
                        System.out.println("\nO livro está emprestado\n");
                    else
                        System.out.println("\nO livro está disponível\n");
                    break
                ;
                case 2:
                    if(objLiv.getSituacao())
                        System.out.println("\nO livro está emprestado\n");
                    else{
                        System.out.println("\nLivto emprestado com sucesso\n");
                        objLiv.emprestar();
                    }
                    break
                ;
                case 3:
                    if(objLiv.getSituacao()){
                        System.out.print("Digite a quantidade de dias que voce atrasou na entrega: ");
                        digDiasAtraso = entrada.nextInt();
                        
                        if(objLiv.getSituacao() && digDiasAtraso > 0){
                            System.out.println("\nO valor da sua multa eh: " + objLiv.devolver(digDiasAtraso));
                            System.out.println("O livro foi devolvido\n");
                        }
                        else{
                                System.out.println("\nO livro foi devolvido\n");                              
                            }
                    } else{
                        System.out.println("\nO livro não foi emprestado\n");
                    }
                    break
                ;
                case 4:
                    System.out.println("\nTotal multas pagas: " + objLiv.getTotalMulta());
                    ;
            }
        
        }while(op < 5);
    }
    
}
