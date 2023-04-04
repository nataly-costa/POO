package fatec.poo.model;

/**
 *
 * @author Nataly
 */
public class FuncionarioComissionado extends Funcionario{
    private double salBase;
    private double taxaComissao;
    private double totalVendas;

    public FuncionarioComissionado(int registro, String nome, String dtAdmisao, double taxaComissao) {
        super(registro, nome, dtAdmisao);
        this.taxaComissao = taxaComissao;
    }

    public void setSalBase(double salBase) {
        this.salBase = salBase;
    }

    public double getSalBase() {
        return salBase;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public double getTotalVendas() {
        return totalVendas;
    }
    
    public void addVendas (double vendas){
        totalVendas = totalVendas + vendas;
    }
    
    
    public double calcSalBruto(){
        return(salBase + (taxaComissao/100) * totalVendas);
    }
    
    public double calcSalLiquido(){
        return(calcSalBruto() - super.calcDesconto() + calcGratificacao());
    }
    
    public double calcGratificacao(){
        if (totalVendas <= 5.000)
            return 0;
        else 
            if (totalVendas > 5.000 && totalVendas <= 10.000)
                return (calcSalBruto() * 0.03);
            else
                    return(calcSalBruto() * 0.05);      
     }
}
