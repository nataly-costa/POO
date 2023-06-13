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

import fatec.poo.model.Vendedor;
public class DaoVendedor {

    private Connection conn;
    
    public DaoVendedor(Connection conn) {
         this.conn = conn;
    }
    
    public void inserir(Vendedor vendedor){
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO Vendedor(CPF,"
                                        + "Nome,"
                                        + "Endereco,"
                                        + "Cidade,"
                                        + "CEP,"
                                        + "UF,"
                                        + "TelefoneDDD,"
                                        + "TelefoneNumero,"
                                        + "SalarioBase,"
                                        + "Comissao) VALUES(?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, vendedor.getCpf());
            ps.setString(2, vendedor.getNome());
            ps.setString(3, vendedor.getEndereco());
	    ps.setString(4, vendedor.getCidade());
	    ps.setString(5, vendedor.getCep());
	    ps.setString(6, vendedor.getUf());
            ps.setString(7, vendedor.getDdd());
            ps.setString(8, vendedor.getTelefone());
	    ps.setDouble(9, vendedor.getSalarioBase());
	    ps.setDouble(10, vendedor.getTaxaComissao());

            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void alterar(Vendedor vendedor) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE Vendedor set Nome = ?, " 
					+ "Endereco = ?, "
					+ "Cidade = ?, "
					+ "CEP = ?, "
					+ "UF = ?, "
					+ "TelefoneDDD = ?, "
					+ "TelefoneNumero = ?, "
					+ "SalarioBase = ?, "
                                        + "Comissao = ? "
					+ "where CPF = ?");
            
            ps.setString(1, vendedor.getNome());
            ps.setString(2, vendedor.getEndereco());
	    ps.setString(3, vendedor.getCidade());
            
            ps.setString(4, vendedor.getCep());
	    ps.setString(5, vendedor.getUf());
            ps.setString(6, vendedor.getDdd());
            
	    ps.setString(7, vendedor.getTelefone());
            ps.setDouble(8, vendedor.getSalarioBase());
	    ps.setDouble(9, vendedor.getTaxaComissao());
            
            ps.setString(10, vendedor.getCpf());
           
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
        
     public Vendedor consultar (String CPF) {
        Vendedor vendedor = null;
       
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from Vendedor where CPF = ?");
            
            ps.setString(1, CPF);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next() == true) {
                vendedor = new Vendedor (CPF, rs.getString("Nome"), rs.getDouble("SalarioBase"));
		vendedor.setCep(rs.getString("CEP"));
		vendedor.setCidade(rs.getString("Cidade"));
		vendedor.setTaxaComissao(rs.getDouble("Comissao"));
		vendedor.setDdd(rs.getString("TelefoneDDD"));
		vendedor.setEndereco(rs.getString("Endereco"));
                vendedor.setTelefone(rs.getString("TelefoneNumero"));
                vendedor.setUf(rs.getString("UF"));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return (vendedor);
    }    
     
     public void excluir(Vendedor vendedor) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM Vendedor where CPF = ?");
            ps.setString(1, vendedor.getCpf());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}
