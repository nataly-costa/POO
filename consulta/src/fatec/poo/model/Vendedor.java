package fatec.poo.model;
import java.util.ArrayList;

/* 
@authors Carlos,
@authors Gustavo,
@authors Nataly;
 */

public class Vendedor extends Pessoa{
    private double salarioBase;
    private double taxaComissao;
    private ArrayList<Pedido> pedidos;
    
    public Vendedor(String cpf, String nome, double salarioBase) {
        super(cpf, nome);
        this.salarioBase = salarioBase;
        this.pedidos = new ArrayList<Pedido>();
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao / 100;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getTaxaComissao() {
        return taxaComissao * 100;
    }
    
    public void addPedido(Pedido p){
        pedidos.add(p);
        p.setVendedor(this);
    }
}
