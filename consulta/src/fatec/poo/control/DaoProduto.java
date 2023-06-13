/* 
@authors Carlos,
@authors Gustavo,
@authors Nataly;
 */
package fatec.poo.control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

import fatec.poo.model.Produto;

public class DaoProduto {
    private Connection conn;
    
    public DaoProduto(Connection conn) {
         this.conn = conn;
    }
    
    public void inserir(Produto produto){
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO Produto(CodigoProduto, "
                                        + "Descricao, "
                                        + "UnidadeMedida, "
                                        + "QtdeEstoque, "
                                        + "precoUnit, "
                                        + "EstoqueMinimo) VALUES(?,?,?,?,?,?)");
            ps.setString(1, produto.getCodigo());
            ps.setString(2, produto.getDescricao());
            ps.setString(3, produto.getUnidadeMedida());
            ps.setDouble(4, produto.getQtdeEstoque());
	    ps.setDouble(5, produto.getPreco());
	    ps.setDouble(6, produto.getEstoqueMinimo());

            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void alterar(Produto produto) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE Produto set Descricao = ?, " 
					+ "QtdeEstoque = ?, "
					+ "PrecoUnit = ?, "
					+ "EstoqueMinimo = ?, "
                                        + "UnidadeMedida = ? "
					+ "where CodigoProduto  = ?");
           
            ps.setString(1, produto.getDescricao());
	    ps.setDouble(2, produto.getQtdeEstoque());
            ps.setDouble(3, produto.getPreco());
	    ps.setDouble(4, produto.getEstoqueMinimo());
            ps.setString(5, produto.getUnidadeMedida());
            ps.setString(6, produto.getCodigo());
            
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
        
     public Produto consultar (String CodigoProduto) {
        Produto produto = null;
       
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from Produto where CodigoProduto = ?");
            
            ps.setString(1, CodigoProduto);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next() == true) {
                produto = new Produto(CodigoProduto, rs.getString("Descricao"));
                produto.setUnidadeMedida(rs.getString("UnidadeMedida"));
		produto.setQtdeEstoque(rs.getDouble("QtdeEstoque"));
                produto.setPreco(rs.getDouble("PrecoUnit"));
                produto.setEstoqueMinimo(rs.getDouble("EstoqueMinimo"));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return (produto);
    }    
     
     public void excluir(Produto produto) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM Produto where CodigoProduto = ?");
            ps.setString(1, produto.getCodigo());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
}
