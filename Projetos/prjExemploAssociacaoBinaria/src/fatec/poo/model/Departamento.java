
package fatec.poo.model;

/**
 *
 * @author Nataly
 */
public class Departamento {
    private String sigla;
    private String nome;
    private Funcionario[] funcionarios;

    private int numFunc;
    
    public Departamento(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
        funcionarios = new Funcionario[10];
        numFunc = 0;
    }

    public String getSigla() {
        return sigla;
    }
    
    public void addFuncionario(Funcionario func){
        funcionarios[numFunc] = func;
        numFunc ++;
    }

    public String getNome() {
        return nome;
    }
    
    public void listaFuncionario(){
        System.out.print("\nSigla: " + sigla);
        System.out.print("\nNome do funconario: " + nome);
        System.out.println("\nQtde Funcionario: " + numFunc);

        System.out.print("\nRegistro// Nome do funcionario// Cargo:");
        for(int i = 0; i < numFunc; i ++)
        {
            System.out.print("\n" + funcionarios[i].getRegistro() + "\t\t" + funcionarios[i].getNome() + "\t\t" + funcionarios[i].getCargo() + "\n");
        }        
        
    }
}
