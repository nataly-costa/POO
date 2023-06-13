package fatec.poo.model;
import java.util.ArrayList;

/* 
@authors Carlos,
@authors Gustavo,
@authors Nataly;
 */

public class Pedido {
    private String numero;
    private String dataEmissao;
    private String dataPagto;
    private boolean formaPagto;
    private boolean situacao;
    private Cliente cliente;
    private Vendedor vendedor;
    private ArrayList<ItemPedido> itemPedidos;
    
    public Pedido(String numero, String dataEmissao) {
        this.numero = numero;
        this.dataEmissao = dataEmissao;
        itemPedidos = new ArrayList<ItemPedido>();
    }

    public void setDataPagto(String dataPagto) {
        this.dataPagto = dataPagto;
    }

    public void setFormaPagto(boolean formaPagto) {
        this.formaPagto = formaPagto;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public String getNumero() {
        return numero;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public String getDataPagto() {
        return dataPagto;
    }

    public boolean getFormaPagto() {
        return formaPagto;
    }

    public boolean getSituacao() {
        return situacao;
    }

    public void addItem(ItemPedido ip){
        double difProduto;
        difProduto = cliente.getLimiteDisp() - (ip.getQtdeVendida() * ip.getProduto().getPreco());
        ip.setPedido(this);
        itemPedidos.add(ip);
        cliente.setLimiteDisp(difProduto);
    }
    
    public ArrayList<ItemPedido> getItemPedidos() {
        return itemPedidos;
    }

    public void setItemPedidos(ArrayList<ItemPedido> itemPedidos) {
        this.itemPedidos = itemPedidos;
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
}
