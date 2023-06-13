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

import fatec.poo.model.Cliente;
import java.sql.DriverManager;
import java.util.ArrayList;
public class DaoCliente{

    private Connection conn;
    
    public DaoCliente(Connection conn) {
         this.conn = conn;
    }

    public DaoCliente() {
             try {
            String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
            String username = "Nataly";
            String password = "1234";
            conn = DriverManager.getConnection(url, username, password);
            
        } catch (SQLException ex) {
            System.out.println("Erro de conexão: " + ex.getMessage());
        }
    
    
    }
    
    public void inserir(Cliente cliente){
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO Cliente"
                                                            + "(CPF,"
                                                            + "Nome,"
                                                            + "Endereco,"
                                                            + "Cidade,"
                                                            + "CEP,"
                                                            + "UF,"
                                                            + "TelefoneDDD,"
                                                            + "TelefoneNumero,"
                                                            + "LimiteCredito,"
                                                            + "LimiteDisp)"
                                                            + "VALUES(?,?,?,?,?,?,?,?,?,?)");

            ps.setString(1, cliente.getCpf());
            ps.setString(2, cliente.getNome());
            ps.setString(3, cliente.getEndereco());
	    ps.setString(4, cliente.getCidade());
	    ps.setString(5, cliente.getCep());
	    ps.setString(6, cliente.getUf());
            ps.setString(7, cliente.getDdd());
            ps.setString(8, cliente.getTelefone());
	    ps.setDouble(9, cliente.getLimiteCred());
	    ps.setDouble(10, cliente.getLimiteDisp());

            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void alterar(Cliente cliente) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE Cliente set Nome = ?, " 
					+ "Endereco = ?, "
					+ "Cidade = ?, "
					+ "CEP = ?, "
					+ "UF = ?, "
					+ "TelefoneDDD = ?, "
					+ "TelefoneNumero = ?, "
					+ "LimiteCredito = ?, "
                                        + "LimiteDisp = ? "
					+ "where CPF = ? ");
                                
                                   
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getEndereco());
	    ps.setString(3, cliente.getCidade());
            ps.setString(4, cliente.getCep());
	    ps.setString(5, cliente.getUf());
            ps.setString(6, cliente.getDdd());
	    ps.setString(7, cliente.getTelefone());
            ps.setDouble(8, cliente.getLimiteCred());
            ps.setDouble(9, cliente.getLimiteDisp());
            ps.setString(10, cliente.getCpf());
           
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
        
     public Cliente consultar (String CPF) {
        Cliente cliente = null;
       
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from Cliente where CPF = ?");
            
            ps.setString(1, CPF);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next() == true) {
                cliente = new Cliente (CPF, rs.getString("Nome"), rs.getDouble("LimiteCredito"));
		cliente.setCep(rs.getString("CEP"));
		cliente.setCidade(rs.getString("Cidade"));
		cliente.setDdd(rs.getString("TelefoneDDD"));
		cliente.setEndereco(rs.getString("Endereco"));
                cliente.setTelefone(rs.getString("TelefoneNumero"));
                cliente.setUf(rs.getString("UF"));
                cliente.setLimiteDisp(rs.getDouble("LimiteDisp")); 
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return (cliente);
    }    
     
     public void excluir(Cliente cliente) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM Cliente where CPF = ?");
            ps.setString(1, cliente.getCpf());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    public ArrayList<Cliente> atualizarLimiteCreditoTodos(double porcentagem) {
    ArrayList<Cliente> clientesAtualizados = new ArrayList<>();

    PreparedStatement ps = null;
    try {
        ps = conn.prepareStatement("SELECT * FROM Cliente");

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Cliente cliente = new Cliente(rs.getString("CPF"), rs.getString("Nome"), rs.getDouble("LimiteCredito"));
            cliente.setCep(rs.getString("CEP"));
            cliente.setCidade(rs.getString("Cidade"));
            cliente.setDdd(rs.getString("TelefoneDDD"));
            cliente.setEndereco(rs.getString("Endereco"));
            cliente.setTelefone(rs.getString("TelefoneNumero"));
            cliente.setUf(rs.getString("UF"));
            cliente.setLimiteDisp(rs.getDouble("LimiteDisp"));

            double limiteAtual = cliente.getLimiteCred();
            double novoLimite = limiteAtual + (limiteAtual * porcentagem / 100);
            cliente.setLimiteCred(novoLimite);

            clientesAtualizados.add(cliente);
        }
    } catch (SQLException ex) {
        System.out.println(ex.toString());
    }

    return clientesAtualizados;
}

    public ArrayList<Cliente> atualizarLimiteCreditoPorTipo(String tipoCliente, double porcentagem) {
        ArrayList<Cliente> clientesAtualizados = new ArrayList<>();

        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM Cliente WHERE Tipo = ?");

            ps.setString(1, tipoCliente);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Cliente cliente = new Cliente(rs.getString("CPF"), rs.getString("Nome"), rs.getDouble("LimiteCredito"));
                cliente.setCep(rs.getString("CEP"));
                cliente.setCidade(rs.getString("Cidade"));
                cliente.setDdd(rs.getString("TelefoneDDD"));
                cliente.setEndereco(rs.getString("Endereco"));
                cliente.setTelefone(rs.getString("TelefoneNumero"));
                cliente.setUf(rs.getString("UF"));
                cliente.setLimiteDisp(rs.getDouble("LimiteDisp"));

                double limiteAtual = cliente.getLimiteCred();
                double novoLimite = limiteAtual + (limiteAtual * porcentagem / 100);
                cliente.setLimiteCred(novoLimite);

                clientesAtualizados.add(cliente);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }

        return clientesAtualizados;
    }

}