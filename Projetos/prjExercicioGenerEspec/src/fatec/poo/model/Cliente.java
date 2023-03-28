package fatec.poo.model;

/**
 *
 * @author Nataly
 */
public class Cliente extends Pessoa{
    private String cpf;
    private double peso, altura;

    public Cliente(String cpf, String nome, String telefone) {
        super(nome, telefone);
        this.cpf = cpf;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getCpf() {
        return cpf;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }
    
    
    public double calcIMC(){
        return (peso / (altura * altura));
    }
    
}
