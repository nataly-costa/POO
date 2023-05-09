
package fatec.poo.model;

/**
 *
 * @author Nataly Rocha, Carlos Eduardo, Gustavo Rocha
 */
public class Produto {
    private String codigo;
    private String descricao;
    private double qtdeEstoque;
    private String unidadeMedia;
    private double preco;
    private double estoqueMinimo;

    public Produto(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setQtdeEstoque(double qtdeEstoque) {
        this.qtdeEstoque = qtdeEstoque;
    }

    public void setUnidadeMedia(String unidadeMedia) {
        this.unidadeMedia = unidadeMedia;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setEstoqueMinimo(double estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getQtdeEstoque() {
        return qtdeEstoque;
    }

    public String getUnidadeMedia() {
        return unidadeMedia;
    }

    public double getPreco() {
        return preco;
    }

    public double getEstoqueMinimo() {
        return estoqueMinimo;
    }
    
    
}
