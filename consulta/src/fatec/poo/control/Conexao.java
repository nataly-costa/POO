package fatec.poo.control;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class Conexao {

    public static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   private String connectionString;
   private String driver;
   private String usuario;
   private String senha;
   private Connection connection=null;

   public Conexao(String usuario, String senha) {   
        this.usuario = usuario;
        this.senha = senha;   
   }

   public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
   }

   public void setDriver(String driver) {
        this.driver = driver;
   }
   
   public Connection conectar() {
        
	   if (connection == null){
	      try {
                 Class.forName(driver);
            
                 connection = DriverManager.getConnection(connectionString, usuario, senha);               
	         System.out.println("Conexao OK");
              }catch (Exception ex) {
                  System.out.println("Falha na Conexao");
                  System.out.println(ex.toString() + ex.getMessage());
          }
	   }
       
	   return connection;
   }
   
   public void fecharConexao(){
        if (connection != null){
	   try {
                  connection.close();
           } catch (Exception ex) {
                   System.out.println(ex.toString());    
           }
        }   
    }
}
