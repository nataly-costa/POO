
package fatec.poo.model;

/**
 *
 * @author Nataly Rocha, Carlos Eduardo, Gustavo Rocha
 */
public class Vendedor extends Pessoa{
    private double salarioBase;
    private double taxaComissao;

    public Vendedor(String cpf, String nome, double salarioBase) {
        super(cpf, nome);
        this.salarioBase = salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    
    
}
