/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.*;
import entities.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utility.Formatacoes;

/**
 *
 * @author Luciano
 */
public class TelaProduto extends javax.swing.JFrame {

    /**
     * Creates new form TelaProduto
     */
    public TelaProduto() {
        initComponents();
        this.
        getTabelaProduto();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpTelaProduto = new javax.swing.JPanel();
        jpSuperior = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpInferior = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lblDireitos = new javax.swing.JLabel();
        jpCentro = new javax.swing.JPanel();
        jspTabelaProdutos = new javax.swing.JScrollPane();
        jtProdutos = new javax.swing.JTable();
        tfBuscar = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();
        btnIncluirProduto = new javax.swing.JButton();
        btnExcluirProduto = new javax.swing.JButton();
        btnAlterarProduto = new javax.swing.JButton();
        sBuscar = new javax.swing.JSeparator();
        btnBuscar = new javax.swing.JButton();
        cbSelecaoBusca = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Produtos");
        setMaximumSize(new java.awt.Dimension(150, 1000));
        setName("Produtos"); // NOI18N

        jpTelaProduto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpSuperior.setPreferredSize(new java.awt.Dimension(1000, 70));

        jPanel4.setBackground(new java.awt.Color(0, 0, 140));
        jPanel4.setMaximumSize(new java.awt.Dimension(1000, 70));
        jPanel4.setPreferredSize(new java.awt.Dimension(1000, 70));

        jLabel1.setBackground(new java.awt.Color(0, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LOGO ERS");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(904, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpSuperiorLayout = new javax.swing.GroupLayout(jpSuperior);
        jpSuperior.setLayout(jpSuperiorLayout);
        jpSuperiorLayout.setHorizontalGroup(
            jpSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSuperiorLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpSuperiorLayout.setVerticalGroup(
            jpSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpSuperiorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpTelaProduto.add(jpSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel5.setBackground(new java.awt.Color(0, 0, 140));
        jPanel5.setMaximumSize(new java.awt.Dimension(1000, 18));
        jPanel5.setName(""); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDireitos.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lblDireitos.setForeground(new java.awt.Color(255, 255, 255));
        lblDireitos.setText("© ECOMMERCE REGISTER SOLUTIONS - TODOS OS DIREITOS RESERVADOS © ");
        jPanel5.add(lblDireitos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, -1, -1));

        javax.swing.GroupLayout jpInferiorLayout = new javax.swing.GroupLayout(jpInferior);
        jpInferior.setLayout(jpInferiorLayout);
        jpInferiorLayout.setHorizontalGroup(
            jpInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(jpInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpInferiorLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jpInferiorLayout.setVerticalGroup(
            jpInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
            .addGroup(jpInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpInferiorLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jpTelaProduto.add(jpInferior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, -1, -1));

        jpCentro.setBackground(new java.awt.Color(255, 255, 255));
        jpCentro.setMaximumSize(new java.awt.Dimension(1500, 1000));
        jpCentro.setPreferredSize(new java.awt.Dimension(100, 600));
        jpCentro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jspTabelaProdutos.setBackground(new java.awt.Color(255, 255, 255));
        jspTabelaProdutos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 140), 2, true));
        jspTabelaProdutos.setName(""); // NOI18N
        jspTabelaProdutos.setOpaque(false);

        jtProdutos.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jtProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Sku", "Descrição", "Preço", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtProdutos.setToolTipText("");
        jtProdutos.setGridColor(new java.awt.Color(255, 255, 255));
        jtProdutos.setMaximumSize(new java.awt.Dimension(300, 100));
        jtProdutos.setOpaque(false);
        jtProdutos.setRowHeight(25);
        jtProdutos.setSelectionBackground(new java.awt.Color(153, 204, 255));
        jtProdutos.setSelectionForeground(new java.awt.Color(255, 255, 254));
        jtProdutos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtProdutos.setShowGrid(false);
        jspTabelaProdutos.setViewportView(jtProdutos);

        jpCentro.add(jspTabelaProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 109, 990, 490));

        tfBuscar.setBackground(new java.awt.Color(250, 250, 250));
        tfBuscar.setBorder(null);
        tfBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBuscarActionPerformed(evt);
            }
        });
        jpCentro.add(tfBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 49, 270, 30));

        btnLimpar.setBackground(new java.awt.Color(0, 0, 140));
        btnLimpar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar.setText("Limpar");
        btnLimpar.setToolTipText("Buscar por sku ou nome");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        jpCentro.add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 54, -1, -1));

        btnIncluirProduto.setBackground(new java.awt.Color(0, 0, 140));
        btnIncluirProduto.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnIncluirProduto.setForeground(new java.awt.Color(255, 255, 255));
        btnIncluirProduto.setText("Incluir Produto");
        btnIncluirProduto.setToolTipText("Adicionar um novo produto");
        btnIncluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirProdutoActionPerformed(evt);
            }
        });
        jpCentro.add(btnIncluirProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(859, 11, -1, -1));

        btnExcluirProduto.setBackground(new java.awt.Color(0, 0, 140));
        btnExcluirProduto.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnExcluirProduto.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluirProduto.setText("Excluir Produto");
        btnExcluirProduto.setToolTipText("Para excluir, selecione o produto na lista.");
        btnExcluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirProdutoActionPerformed(evt);
            }
        });
        jpCentro.add(btnExcluirProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 11, -1, -1));

        btnAlterarProduto.setBackground(new java.awt.Color(0, 0, 140));
        btnAlterarProduto.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnAlterarProduto.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterarProduto.setText("Alterar Produto");
        btnAlterarProduto.setToolTipText("Para alterar, selecione o produto na lista.");
        btnAlterarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarProdutoActionPerformed(evt);
            }
        });
        jpCentro.add(btnAlterarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 11, 140, -1));

        sBuscar.setBackground(new java.awt.Color(0, 0, 140));
        sBuscar.setForeground(new java.awt.Color(0, 0, 140));
        sBuscar.setToolTipText("");
        jpCentro.add(sBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 270, 10));

        btnBuscar.setBackground(new java.awt.Color(0, 0, 140));
        btnBuscar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.setToolTipText("Buscar por sku ou nome");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jpCentro.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 54, -1, -1));

        cbSelecaoBusca.setBackground(new java.awt.Color(0, 0, 140));
        cbSelecaoBusca.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        cbSelecaoBusca.setForeground(new java.awt.Color(255, 255, 255));
        cbSelecaoBusca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sku", "Nome" }));
        cbSelecaoBusca.setRequestFocusEnabled(false);
        jpCentro.add(cbSelecaoBusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 30));

        jpTelaProduto.add(jpCentro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1000, 610));

        getContentPane().add(jpTelaProduto, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1020, 740));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBuscarActionPerformed

    private void btnIncluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirProdutoActionPerformed
        DialogIncluirProduto dialogIncluirProduto = new DialogIncluirProduto(new javax.swing.JFrame(), true, this);

        dialogIncluirProduto.setVisible(true);
    }//GEN-LAST:event_btnIncluirProdutoActionPerformed

    private void btnExcluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirProdutoActionPerformed

        int Produtoselecionado = jtProdutos.getSelectedRow();

        if (Produtoselecionado >= 0) {
            Conexao_Produto cp = new Conexao_Produto();
            Produto produtoExclusao = cp.listar().get(Produtoselecionado);
            if (JOptionPane.showConfirmDialog(this, "Deseja realmete excluir este produto?") == JOptionPane.YES_OPTION) {
                cp.excluir(produtoExclusao);
                getTabelaProduto();
                JOptionPane.showMessageDialog(null, "Produto excluido com sucesso!");

            } else {

                JOptionPane.showMessageDialog(null, "Selecione um produto para excluir");

            }

        }


    }//GEN-LAST:event_btnExcluirProdutoActionPerformed

    private void btnAlterarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarProdutoActionPerformed

        int select = jtProdutos.getSelectedRow();

        if (select >= 0) {
            Produto produto = getProduto(select);
            DialogAlterarProduto alterarProduto = new DialogAlterarProduto(new javax.swing.JFrame(), true, produto, this);
            alterarProduto.setVisible(true);

        } else {

            JOptionPane.showMessageDialog(null, "Selecione um produto para alterar");

        }


    }//GEN-LAST:event_btnAlterarProdutoActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed

        tfBuscar.setText("");
        getTabelaProduto();

    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        String busca = tfBuscar.getText();
        listarBuscaProdutos(busca);


    }//GEN-LAST:event_btnBuscarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaProduto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaProduto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaProduto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaProduto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarProduto;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnExcluirProduto;
    private javax.swing.JButton btnIncluirProduto;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JComboBox<String> cbSelecaoBusca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jpCentro;
    private javax.swing.JPanel jpInferior;
    private javax.swing.JPanel jpSuperior;
    private javax.swing.JPanel jpTelaProduto;
    private javax.swing.JScrollPane jspTabelaProdutos;
    private javax.swing.JTable jtProdutos;
    private javax.swing.JLabel lblDireitos;
    private javax.swing.JSeparator sBuscar;
    private javax.swing.JTextField tfBuscar;
    // End of variables declaration//GEN-END:variables

    public void getTabelaProduto() {
        Formatacoes formatacoes = new Formatacoes();
        Conexao_Produto conexao_Produto = new Conexao_Produto();
      
        Vector cabecalho = new Vector();
        Vector linhas = new Vector();

        cabecalho.add("SKU");
        cabecalho.add("Nome");
        cabecalho.add("Preço");
        cabecalho.add("Quantidade");

        for (int i = 0; i < conexao_Produto.listar().size(); i++) {
            Vector colunas = new Vector();
            colunas.add((conexao_Produto.listar().get(i).getId_item()));
            colunas.add(conexao_Produto.listar().get(i).getNome());
            colunas.add((conexao_Produto.listar().get(i).getPreco()));
            colunas.add((conexao_Produto.listar().get(i).getQuantidade()));

            linhas.add(new Vector(colunas));

        }

        jtProdutos.setModel(new DefaultTableModel(linhas, cabecalho));
 
    }

    public Produto getProduto(int indice) {

        Conexao_Produto conexao_Produto = new Conexao_Produto();

        Produto produto = new Produto();
        produto = conexao_Produto.listar().get(indice);

        return produto;
    }

    public void listarBuscaProdutos(String busca) {

        Conexao_Produto conexao_Produto = new Conexao_Produto();
        Vector cabecalho = new Vector();
        Vector linhas = new Vector();

        cabecalho.add("SKU");
        cabecalho.add("Nome");
        cabecalho.add("Preço");
        cabecalho.add("Quantidade");

        for (int i = 0; i < conexao_Produto.listar().size(); i++) {

            if (cbSelecaoBusca.getSelectedItem() == "Nome") {
                if (conexao_Produto.listar().get(i).getNome().toUpperCase().contains(busca.toUpperCase())) {
                    Vector colunas = new Vector();
                    colunas.add((conexao_Produto.listar().get(i).getId_item()));
                    colunas.add(conexao_Produto.listar().get(i).getNome());
                    colunas.add((conexao_Produto.listar().get(i).getPreco()));
                    colunas.add((conexao_Produto.listar().get(i).getQuantidade()));
                    linhas.add(new Vector(colunas));
                }
            } else if (cbSelecaoBusca.getSelectedItem() == "Sku") {
                if (conexao_Produto.listar().get(i).getId_item().equals(Integer.parseInt(busca))) {
                    Vector colunas = new Vector();
                    colunas.add((conexao_Produto.listar().get(i).getId_item()));
                    colunas.add(conexao_Produto.listar().get(i).getNome());
                    colunas.add((conexao_Produto.listar().get(i).getPreco()));
                    colunas.add((conexao_Produto.listar().get(i).getQuantidade()));
                    linhas.add(new Vector(colunas));
                }
            }
        }

        jtProdutos.setModel(new DefaultTableModel(linhas, cabecalho));

    }

}
