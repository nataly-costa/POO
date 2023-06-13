package fatec.poo.view;

import fatec.poo.control.Conexao;
import fatec.poo.control.DaoProduto;
import fatec.poo.model.Produto;
import javax.swing.JOptionPane;

/* 
@author Carlos,
@author Gustavo,
@author Nataly.
 */
public class GuiProduto extends javax.swing.JFrame {

    public GuiProduto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCodigo = new javax.swing.JLabel();
        lblDescricao = new javax.swing.JLabel();
        lblQtdeDisp = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        txtCodigo = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        txtQtdeDisp = new javax.swing.JTextField();
        lblPrecoUnit = new javax.swing.JLabel();
        txtPrecoUnit = new javax.swing.JTextField();
        lblEstoqueMin = new javax.swing.JLabel();
        txtEstoqueMin = new javax.swing.JTextField();
        lblUnidadeMed = new javax.swing.JLabel();
        txtUnidadeMed = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Produto");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblCodigo.setText("Código");

        lblDescricao.setText("Descrição");

        lblQtdeDisp.setText("Qtde. Disponível");

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/add.png"))); // NOI18N
        btnIncluir.setText("Incluir");
        btnIncluir.setEnabled(false);
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Eraser.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/exit.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        txtDescricao.setEnabled(false);

        txtQtdeDisp.setEnabled(false);

        lblPrecoUnit.setText("Preço Unitário");

        txtPrecoUnit.setEnabled(false);

        lblEstoqueMin.setText("Estoque Mínimo");

        txtEstoqueMin.setEnabled(false);

        lblUnidadeMed.setText("Unidade Med");

        txtUnidadeMed.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCodigo)
                                .addGap(57, 57, 57)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblQtdeDisp)
                                    .addComponent(lblDescricao))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtQtdeDisp, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblPrecoUnit)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPrecoUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(73, 73, 73)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEstoqueMin)
                                    .addComponent(lblUnidadeMed))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEstoqueMin)
                            .addComponent(txtUnidadeMed))
                        .addGap(1, 1, 1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtCodigo, txtEstoqueMin, txtPrecoUnit, txtQtdeDisp});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterar, btnConsultar, btnExcluir, btnIncluir, btnSair});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescricao)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUnidadeMed)
                    .addComponent(txtUnidadeMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQtdeDisp)
                    .addComponent(txtQtdeDisp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecoUnit)
                    .addComponent(txtPrecoUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstoqueMin)
                    .addComponent(txtEstoqueMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnConsultar)
                    .addComponent(btnIncluir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAlterar, btnConsultar, btnExcluir, btnIncluir, btnSair});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtCodigo, txtDescricao, txtEstoqueMin, txtPrecoUnit, txtQtdeDisp});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        produto = null;
        String codigo = txtCodigo.getText();
        if (!codigo.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "O código deve conter apenas dígitos numéricos.",
                    "Erro de entrada", JOptionPane.ERROR_MESSAGE);
            return;
        }
        produto = daoProduto.consultar(codigo);

        if (produto == null) {
            txtCodigo.setEnabled(false);
            txtDescricao.setEnabled(true);
            txtQtdeDisp.setEnabled(true);
            txtPrecoUnit.setEnabled(true);
            txtEstoqueMin.setEnabled(true);
            txtUnidadeMed.setEnabled(true);

            txtDescricao.requestFocus();

            btnConsultar.setEnabled(false);
            btnIncluir.setEnabled(true);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
        } else {
            txtDescricao.setText(produto.getDescricao());
            txtUnidadeMed.setText(produto.getUnidadeMedida());
            txtQtdeDisp.setText(String.valueOf(produto.getQtdeEstoque()));
            txtPrecoUnit.setText(String.valueOf(produto.getPreco()));
            txtEstoqueMin.setText(String.valueOf(produto.getEstoqueMinimo()));

            txtCodigo.setEnabled(false);
            txtDescricao.setEnabled(true);
            txtQtdeDisp.setEnabled(true);
            txtPrecoUnit.setEnabled(true);
            txtEstoqueMin.setEnabled(true);
            txtUnidadeMed.setEnabled(true);

            txtDescricao.requestFocus();

            btnConsultar.setEnabled(false);
            btnIncluir.setEnabled(false);
            btnAlterar.setEnabled(true);
            btnExcluir.setEnabled(true);
        }

    }//GEN-LAST:event_btnConsultarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conexao = new Conexao("Nataly", "1234");//usuario e senha
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@127.0.0.1:1521:xe");
        daoProduto = new DaoProduto(conexao.conectar());
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        conexao.fecharConexao();
        dispose();
    }//GEN-LAST:event_formWindowClosing

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        produto = new Produto(txtCodigo.getText(), txtDescricao.getText());

        produto.setUnidadeMedida(txtUnidadeMed.getText());
        produto.setQtdeEstoque(Double.parseDouble(txtQtdeDisp.getText()));
        produto.setPreco(Double.parseDouble(txtPrecoUnit.getText()));
        produto.setEstoqueMinimo(Double.parseDouble(txtEstoqueMin.getText()));

        txtCodigo.setText("");
        txtDescricao.setText("");
        txtQtdeDisp.setText("");
        txtPrecoUnit.setText("");
        txtEstoqueMin.setText("");
        txtUnidadeMed.setText("");

        txtCodigo.setEnabled(true);
        txtDescricao.setEnabled(false);
        txtQtdeDisp.setEnabled(false);
        txtPrecoUnit.setEnabled(false);
        txtEstoqueMin.setEnabled(false);
        txtUnidadeMed.setEnabled(false);

        txtCodigo.requestFocus();

        btnConsultar.setEnabled(true);
        btnIncluir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);

        daoProduto.inserir(produto);
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Exclusão?") == 0) {
            daoProduto.excluir(produto);

            txtCodigo.setText("");
            txtDescricao.setText("");
            txtQtdeDisp.setText("");
            txtPrecoUnit.setText("");
            txtEstoqueMin.setText("");
            txtUnidadeMed.setText("");

            txtCodigo.setEnabled(true);
            txtDescricao.setEnabled(false);
            txtQtdeDisp.setEnabled(false);
            txtPrecoUnit.setEnabled(false);
            txtEstoqueMin.setEnabled(false);
            txtUnidadeMed.setEnabled(false);

            txtCodigo.requestFocus();

            btnConsultar.setEnabled(true);
            btnIncluir.setEnabled(false);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Alteração?") == 0) {
            produto.setDescricao(txtDescricao.getText());
            produto.setUnidadeMedida(txtUnidadeMed.getText());
            produto.setQtdeEstoque(Double.parseDouble(txtQtdeDisp.getText()));
            produto.setPreco(Double.parseDouble(txtPrecoUnit.getText()));
            produto.setEstoqueMinimo(Double.parseDouble(txtEstoqueMin.getText()));
            
            daoProduto.alterar(produto);
        }

        txtCodigo.setText("");
        txtDescricao.setText("");
        txtUnidadeMed.setText("");
        txtQtdeDisp.setText("");
        txtPrecoUnit.setText("");
        txtEstoqueMin.setText("");

        txtCodigo.setEnabled(true);
        txtDescricao.setEnabled(false);
        txtQtdeDisp.setEnabled(false);
        txtPrecoUnit.setEnabled(false);
        txtEstoqueMin.setEnabled(false);
        txtUnidadeMed.setEnabled(false);

        txtCodigo.requestFocus();

        btnConsultar.setEnabled(true);
        btnIncluir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
    }//GEN-LAST:event_btnAlterarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblEstoqueMin;
    private javax.swing.JLabel lblPrecoUnit;
    private javax.swing.JLabel lblQtdeDisp;
    private javax.swing.JLabel lblUnidadeMed;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtEstoqueMin;
    private javax.swing.JTextField txtPrecoUnit;
    private javax.swing.JTextField txtQtdeDisp;
    private javax.swing.JTextField txtUnidadeMed;
    // End of variables declaration//GEN-END:variables
    private DaoProduto daoProduto = null;
    private Produto produto = null;
    private Conexao conexao = null;
}
