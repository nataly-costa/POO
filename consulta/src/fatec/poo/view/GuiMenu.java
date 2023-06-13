package fatec.poo.view;

/*
@author Carlos,
@author Gustavo,
@author Nataly
 */

public class GuiMenu extends javax.swing.JFrame {

    
    public GuiMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBarMenu = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        menuItemCliente = new javax.swing.JMenuItem();
        menuItemVendedores = new javax.swing.JMenuItem();
        menuItemProdutos = new javax.swing.JMenuItem();
        separador = new javax.swing.JPopupMenu.Separator();
        menuItemSair = new javax.swing.JMenuItem();
        menuPedido = new javax.swing.JMenu();
        menuItemEmitirPedido = new javax.swing.JMenuItem();
        menuAtualizarLimite = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle De Vendas");

        menuCadastro.setText("Cadastro");

        menuItemCliente.setText("Clientes");
        menuItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemClienteActionPerformed(evt);
            }
        });
        menuCadastro.add(menuItemCliente);

        menuItemVendedores.setText("Vendedores");
        menuItemVendedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVendedoresActionPerformed(evt);
            }
        });
        menuCadastro.add(menuItemVendedores);

        menuItemProdutos.setText("Produtos");
        menuItemProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemProdutosActionPerformed(evt);
            }
        });
        menuCadastro.add(menuItemProdutos);
        menuCadastro.add(separador);

        menuItemSair.setText("Sair");
        menuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSairActionPerformed(evt);
            }
        });
        menuCadastro.add(menuItemSair);

        menuBarMenu.add(menuCadastro);

        menuPedido.setText("Pedido");

        menuItemEmitirPedido.setText("Emitir Pedido");
        menuItemEmitirPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEmitirPedidoActionPerformed(evt);
            }
        });
        menuPedido.add(menuItemEmitirPedido);

        menuAtualizarLimite.setText("Atualizar Limite de Crédito");
        menuAtualizarLimite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAtualizarLimiteActionPerformed(evt);
            }
        });
        menuPedido.add(menuAtualizarLimite);

        menuBarMenu.add(menuPedido);

        setJMenuBar(menuBarMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 558, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 267, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemClienteActionPerformed
        new GuiCliente().setVisible(true);
    }//GEN-LAST:event_menuItemClienteActionPerformed

    private void menuItemVendedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVendedoresActionPerformed
        new GuiVendedor().setVisible(true);
    }//GEN-LAST:event_menuItemVendedoresActionPerformed

    private void menuItemProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemProdutosActionPerformed
        new GuiProduto().setVisible(true);
    }//GEN-LAST:event_menuItemProdutosActionPerformed

    private void menuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSairActionPerformed
        dispose();
    }//GEN-LAST:event_menuItemSairActionPerformed

    private void menuItemEmitirPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEmitirPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemEmitirPedidoActionPerformed

    private void menuAtualizarLimiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAtualizarLimiteActionPerformed
        new AtualizarLimiteDeCredito().setVisible(true);
    }//GEN-LAST:event_menuAtualizarLimiteActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem menuAtualizarLimite;
    private javax.swing.JMenuBar menuBarMenu;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenuItem menuItemCliente;
    private javax.swing.JMenuItem menuItemEmitirPedido;
    private javax.swing.JMenuItem menuItemProdutos;
    private javax.swing.JMenuItem menuItemSair;
    private javax.swing.JMenuItem menuItemVendedores;
    private javax.swing.JMenu menuPedido;
    private javax.swing.JPopupMenu.Separator separador;
    // End of variables declaration//GEN-END:variables

}
