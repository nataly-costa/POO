package fatec.poo.view;

import fatec.poo.control.Conexao;
import fatec.poo.control.DaoVendedor;
import fatec.poo.model.Vendedor;
import javax.swing.JOptionPane;

/*
@author Carlos,
@author Gustavo,
@author Nataly.
 */
public class GuiVendedor extends javax.swing.JFrame {

    public GuiVendedor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCPF = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        lblCEP = new javax.swing.JLabel();
        lblSalBase = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtCEP = new javax.swing.JTextField();
        txtSalBase = new javax.swing.JTextField();
        lblUF = new javax.swing.JLabel();
        cbxUF = new javax.swing.JComboBox<>();
        lblTelefone = new javax.swing.JLabel();
        lblTaxaComissao = new javax.swing.JLabel();
        txtTelDDD = new javax.swing.JTextField();
        txtTaxaComissao = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtCPF = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Vendedor");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblCPF.setText("CPF");

        lblNome.setText("Nome");

        lblEndereco.setText("Endereço");

        lblCidade.setText("Cidade");

        lblCEP.setText("CEP");

        lblSalBase.setText("Salário Base");

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

        txtNome.setEnabled(false);

        txtEndereco.setEnabled(false);

        txtCidade.setEnabled(false);

        txtCEP.setEnabled(false);

        txtSalBase.setEnabled(false);

        lblUF.setText("UF");

        cbxUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "RO", "AC", "AM", "RR", "PA", "AP", "TO", "MA", "PI", "CE", "RN", "PB", "PE", "AL", "SE", "BA", "MG", "ES", "RJ", "SP", "PR", "SC", "RS", "MS", "MT", "GO", "DF" }));
        cbxUF.setEnabled(false);

        lblTelefone.setText("Telefone");

        lblTaxaComissao.setText("Taxa de Comissão");

        txtTelDDD.setEnabled(false);

        txtTaxaComissao.setEnabled(false);

        txtTelefone.setEnabled(false);

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEndereco)
                            .addComponent(lblNome))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome)
                            .addComponent(txtEndereco)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCPF)
                        .addGap(54, 54, 54)
                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSalBase)
                            .addComponent(lblCEP)
                            .addComponent(lblCidade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCidade)
                                .addGap(24, 24, 24)
                                .addComponent(lblUF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCEP)
                                    .addComponent(txtSalBase))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblTelefone)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTelDDD, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblTaxaComissao, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTaxaComissao, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                    .addComponent(txtTelefone))))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtCEP, txtCPF, txtSalBase});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterar, btnConsultar, btnExcluir, btnIncluir, btnSair});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCPF)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCidade)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUF)
                    .addComponent(cbxUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCEP)
                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefone)
                    .addComponent(txtTelDDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSalBase)
                    .addComponent(txtSalBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTaxaComissao)
                    .addComponent(txtTaxaComissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnIncluir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAlterar, btnConsultar, btnExcluir, btnIncluir, btnSair});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        String cpf = txtCPF.getText();
        if (Vendedor.validarCPF(cpf)) {
            vendedor = null;

            vendedor = daoVendedor.consultar(cpf);

            if (vendedor == null) {
                txtCPF.setEnabled(false);
                txtNome.setEnabled(true);
                txtEndereco.setEnabled(true);
                txtCidade.setEnabled(true);
                txtCEP.setEnabled(true);
                txtSalBase.setEnabled(true);
                txtTelDDD.setEnabled(true);
                txtTelefone.setEnabled(true);
                txtTaxaComissao.setEnabled(true);
                cbxUF.setEnabled(true);
                txtNome.requestFocus();

                btnConsultar.setEnabled(false);
                btnIncluir.setEnabled(true);
                btnAlterar.setEnabled(false);
                btnExcluir.setEnabled(false);
            } else {
                txtNome.setText(vendedor.getNome());
                txtEndereco.setText(vendedor.getEndereco());
                txtCidade.setText(vendedor.getCidade());
                txtCEP.setText(vendedor.getCep());
                txtTelDDD.setText(vendedor.getDdd());
                txtTelefone.setText(vendedor.getTelefone());
                txtSalBase.setText(String.valueOf(vendedor.getSalarioBase()));
                txtTaxaComissao.setText(String.valueOf(vendedor.getTaxaComissao()));
                cbxUF.setSelectedItem(vendedor.getUf());

                txtCPF.setEnabled(false);
                txtNome.setEnabled(true);
                txtEndereco.setEnabled(true);
                txtCidade.setEnabled(true);
                txtCEP.setEnabled(true);
                txtSalBase.setEnabled(true);
                txtTelDDD.setEnabled(true);
                txtTelefone.setEnabled(true);
                txtTaxaComissao.setEnabled(true);
                cbxUF.setEnabled(true);
                txtNome.requestFocus();

                btnConsultar.setEnabled(false);
                btnIncluir.setEnabled(false);
                btnAlterar.setEnabled(true);
                btnExcluir.setEnabled(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "CPF inválido");
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conexao = new Conexao("Carlos", "1234");//usuario e senha
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@127.0.0.1:1521:xe"); // Lembrar de troca a conexão para mexer na faculdade
        daoVendedor = new DaoVendedor(conexao.conectar());
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        conexao.fecharConexao();
        dispose();
    }//GEN-LAST:event_formWindowClosing

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        vendedor = new Vendedor(txtCPF.getText(), txtNome.getText(), Double.parseDouble(txtSalBase.getText()));
        vendedor.setCep(txtCEP.getText());
        vendedor.setCidade(txtCidade.getText());
        vendedor.setTaxaComissao(Double.parseDouble(txtTaxaComissao.getText()));
        vendedor.setDdd(txtTelDDD.getText());
        vendedor.setEndereco(txtEndereco.getText());
        vendedor.setSalarioBase(Double.parseDouble(txtSalBase.getText()));
        vendedor.setTelefone(txtTelefone.getText());
        vendedor.setUf(cbxUF.getItemAt(cbxUF.getSelectedIndex()));
        daoVendedor.inserir(vendedor);

        txtCPF.setText("");
        txtNome.setText("");
        txtEndereco.setText("");
        txtCidade.setText("");
        txtCEP.setText("");
        txtSalBase.setText("");
        txtTelDDD.setText("");
        txtTelefone.setText("");
        txtTaxaComissao.setText("");

        txtCPF.setEnabled(true);
        txtNome.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtCidade.setEnabled(false);
        txtCEP.setEnabled(false);
        txtSalBase.setEnabled(false);
        txtTelDDD.setEnabled(false);
        cbxUF.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtTaxaComissao.setEnabled(false);

        txtCPF.requestFocus();

        btnConsultar.setEnabled(true);
        btnIncluir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Exclusão?") == 0) {
            daoVendedor.excluir(vendedor);

            txtCPF.setText("");
            txtNome.setText("");
            txtEndereco.setText("");
            txtCidade.setText("");
            txtCEP.setText("");
            txtSalBase.setText("");
            txtTelDDD.setText("");
            txtTelefone.setText("");
            txtTaxaComissao.setText("");

            txtCPF.setEnabled(true);
            txtNome.setEnabled(false);
            txtEndereco.setEnabled(false);
            txtCidade.setEnabled(false);
            txtCEP.setEnabled(false);
            txtSalBase.setEnabled(false);
            txtTelDDD.setEnabled(false);
            cbxUF.setEnabled(false);
            txtTelefone.setEnabled(false);
            txtTaxaComissao.setEnabled(false);

            txtCPF.requestFocus();

            btnConsultar.setEnabled(true);
            btnIncluir.setEnabled(false);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Alteração?") == 0) {
            vendedor.setNome(txtNome.getText());
            vendedor.setEndereco(txtEndereco.getText());
            vendedor.setCidade(txtCidade.getText());
            vendedor.setCep(txtCEP.getText());
            vendedor.setSalarioBase(Double.parseDouble(txtSalBase.getText()));
            vendedor.setUf(cbxUF.getItemAt(cbxUF.getSelectedIndex()));
            vendedor.setDdd(txtTelDDD.getText());
            vendedor.setTelefone(txtTelefone.getText());
            vendedor.setTaxaComissao(Double.parseDouble(txtTaxaComissao.getText()));
            
            daoVendedor.alterar(vendedor);
        }

        txtCPF.setText("");
        txtNome.setText("");
        txtEndereco.setText("");
        txtCidade.setText("");
        txtCEP.setText("");
        txtSalBase.setText("");
        txtTelDDD.setText("");
        txtTelefone.setText("");
        txtTaxaComissao.setText("");

        txtCPF.setEnabled(true);
        txtNome.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtCidade.setEnabled(false);
        txtCEP.setEnabled(false);
        txtSalBase.setEnabled(false);
        txtTelDDD.setEnabled(false);
        cbxUF.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtTaxaComissao.setEnabled(false);

        txtCPF.requestFocus();

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
    private javax.swing.JComboBox<String> cbxUF;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSalBase;
    private javax.swing.JLabel lblTaxaComissao;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblUF;
    private javax.swing.JTextField txtCEP;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSalBase;
    private javax.swing.JTextField txtTaxaComissao;
    private javax.swing.JTextField txtTelDDD;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
    private DaoVendedor daoVendedor = null;
    private Vendedor vendedor = null;
    private Conexao conexao = null;
}
