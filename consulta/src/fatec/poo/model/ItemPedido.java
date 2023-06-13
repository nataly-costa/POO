package fatec.poo.model;

/* 
@authors Carlos,
@authors Gustavo,
@authors Nataly;
*/

public class ItemPedido {
    private int sequencia;
    private double qtdeVendida;
    private Pedido pedido;
    private Produto produto;
    
    public ItemPedido(int sequencia, double qtdeVendida, Produto produto) {
        this.sequencia = sequencia;
        this.qtdeVendida = qtdeVendida;
        this.produto = produto;
        
        produto.setQtdeEstoque(produto.getQtdeEstoque() - qtdeVendida);
    }
    
    public void setQtdeVendida(double qtdeVendida) {
        this.qtdeVendida = qtdeVendida;
        produto.setQtdeEstoque(produto.getQtdeEstoque() - this.getQtdeVendida());
    }

    public int getSequencia() {
        return sequencia;
    }

    public double getQtdeVendida() {
        return qtdeVendida;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
