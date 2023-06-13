package fatec.poo.view;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import fatec.poo.model.Cliente;
import java.util.ArrayList;
import fatec.poo.control.DaoCliente;

import javax.swing.JOptionPane;

public class AtualizarLimiteDeCredito extends javax.swing.JFrame {

    private final DaoCliente daoCliente;
    
    public AtualizarLimiteDeCredito() {
        initComponents();
        Connection conn = criarConexao();
        daoCliente = new DaoCliente();
        
    }
    
    private Connection criarConexao() {
    Connection conn = null;
    try {
        String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
        String username = "Nataly";
        String password = "1234";

        Class.forName(driver);

        conn = DriverManager.getConnection(url, username, password);
    } catch (ClassNotFoundException e) {
        System.out.println("Driver JDBC não encontrado");
    } catch (SQLException e) {
        System.out.println("Erro de conexão: " + e.getMessage());
    }
    return conn;
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTipo = new javax.swing.JLabel();
        cbxTipo = new javax.swing.JComboBox<>();
        lblPorcentagem = new javax.swing.JLabel();
        txtPorcentagem = new javax.swing.JTextField();
        lblQtdeClienteAtualizado = new javax.swing.JLabel();
        btnAtualizar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        lblQtdeCliente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Atualizar Limite Crédito Cliente");

        lblTipo.setText("Tipo");

        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comum", "Especial" }));

        lblPorcentagem.setText("Porcentagem(%)");

        lblQtdeClienteAtualizado.setText("Qtde. de Clientes Atualizados");

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        lblQtdeCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblPorcentagem)
                            .addGap(18, 18, 18)
                            .addComponent(txtPorcentagem))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblTipo)
                            .addGap(18, 18, 18)
                            .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblQtdeClienteAtualizado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblQtdeCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipo)
                    .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPorcentagem)
                    .addComponent(txtPorcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblQtdeClienteAtualizado)
                    .addComponent(lblQtdeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtualizar)
                    .addComponent(btnSair))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
    String tipoCliente = cbxTipo.getSelectedItem().toString();
    String porcentagemStr = txtPorcentagem.getText();

    double porcentagem;
    try {
        porcentagem = Double.parseDouble(porcentagemStr);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Valor inválido", "Erro", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (porcentagem > 100) {
        JOptionPane.showMessageDialog(this, "Valor máximo permitido é de 100", "Erro", JOptionPane.ERROR_MESSAGE);
        return;
    }

    ArrayList<Cliente> clientesAtualizados;
    if (tipoCliente.equals("Comum")) {
        clientesAtualizados = daoCliente.atualizarLimiteCreditoPorTipo("Comum", porcentagem);
    } else if (tipoCliente.equals("Especial")) {
        clientesAtualizados = daoCliente.atualizarLimiteCreditoPorTipo("Especial", porcentagem);
    } else {
        clientesAtualizados = daoCliente.atualizarLimiteCreditoTodos(porcentagem);
    }

    int quantidadeAtualizada = clientesAtualizados.size();
    lblQtdeCliente.setText(Integer.toString(quantidadeAtualizada));

    
    }//GEN-LAST:event_btnAtualizarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JLabel lblPorcentagem;
    private javax.swing.JLabel lblQtdeCliente;
    private javax.swing.JLabel lblQtdeClienteAtualizado;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JTextField txtPorcentagem;
    // End of variables declaration//GEN-END:variables



  
}
