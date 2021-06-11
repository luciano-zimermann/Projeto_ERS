/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.*;
import entities.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utility.Formatacoes;

/**
 *
 * @author Luciano
 */
public class DialogEntrada extends javax.swing.JDialog {

    /**
     * Creates new form DialogEntrada
     */
    public DialogEntrada(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setResizable(false);
        getTabelaProduto();
    }

    Vector linhas = new Vector();
    List<Integer> quantidade = new ArrayList<>();
    List<Integer> identificador = new ArrayList<>();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpCentro = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaEntrada = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtProdutos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        tfdQuantidadeEntrada = new javax.swing.JTextField();
        btnEfetuarEntrada = new javax.swing.JButton();
        btnTirarProdutoEntrada = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tfdDescricaoEntrada = new javax.swing.JTextField();
        btnAdicionarEntrada1 = new javax.swing.JButton();
        jpSuperior = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpInferior = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpCentro.setBackground(new java.awt.Color(255, 255, 255));
        jpCentro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 140));
        jLabel3.setText("QUANTIDADE");
        jpCentro.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, -1, 20));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 140));
        jLabel4.setText("LISTA DE ENTRADA");
        jpCentro.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, -1, -1));

        tblListaEntrada.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        tblListaEntrada.setForeground(new java.awt.Color(0, 0, 140));
        tblListaEntrada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "SKU", "Nome", "Preço", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblListaEntrada);

        jpCentro.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 330, 320));

        jtProdutos.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jtProdutos.setForeground(new java.awt.Color(0, 0, 140));
        jtProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "SKU", "Nome", "Preço", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtProdutos);

        jpCentro.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 320));

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 140));
        jLabel5.setText("LISTA DE PRODUTOS");
        jpCentro.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        tfdQuantidadeEntrada.setToolTipText("Informe uma quantidade de produtos");
        tfdQuantidadeEntrada.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 140), 2, true));
        jpCentro.add(tfdQuantidadeEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 100, -1));

        btnEfetuarEntrada.setBackground(new java.awt.Color(0, 0, 140));
        btnEfetuarEntrada.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnEfetuarEntrada.setForeground(new java.awt.Color(255, 255, 255));
        btnEfetuarEntrada.setText("Efetuar Entrada");
        btnEfetuarEntrada.setToolTipText("Efetua a saída do estoque");
        btnEfetuarEntrada.setBorder(null);
        btnEfetuarEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEfetuarEntradaActionPerformed(evt);
            }
        });
        jpCentro.add(btnEfetuarEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 410, 130, 30));

        btnTirarProdutoEntrada.setBackground(new java.awt.Color(0, 0, 140));
        btnTirarProdutoEntrada.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnTirarProdutoEntrada.setForeground(new java.awt.Color(255, 255, 255));
        btnTirarProdutoEntrada.setText("Remover Produto");
        btnTirarProdutoEntrada.setToolTipText("Adiciona produto na lista de Saída");
        btnTirarProdutoEntrada.setBorder(null);
        btnTirarProdutoEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTirarProdutoEntradaActionPerformed(evt);
            }
        });
        jpCentro.add(btnTirarProdutoEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 150, 30));

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 140));
        jLabel6.setText("DESCRIÇÃO DA ENTRADA:");
        jpCentro.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, -1, -1));

        tfdDescricaoEntrada.setToolTipText("Informe uma quantidade de produtos");
        tfdDescricaoEntrada.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 140), 2, true));
        jpCentro.add(tfdDescricaoEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, 170, -1));

        btnAdicionarEntrada1.setBackground(new java.awt.Color(0, 0, 140));
        btnAdicionarEntrada1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnAdicionarEntrada1.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionarEntrada1.setText("Adicionar Entrada");
        btnAdicionarEntrada1.setToolTipText("Adiciona produto na lista de Saída");
        btnAdicionarEntrada1.setBorder(null);
        btnAdicionarEntrada1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarEntrada1ActionPerformed(evt);
            }
        });
        jpCentro.add(btnAdicionarEntrada1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 150, 30));

        getContentPane().add(jpCentro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 910, 500));

        jPanel5.setBackground(new java.awt.Color(0, 0, 140));
        jPanel5.setPreferredSize(new java.awt.Dimension(909, 542));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Logo-trans-Pequeno.png"))); // NOI18N
        jLabel1.setText("LOGO ERS");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 4, 86, 54));

        javax.swing.GroupLayout jpSuperiorLayout = new javax.swing.GroupLayout(jpSuperior);
        jpSuperior.setLayout(jpSuperiorLayout);
        jpSuperiorLayout.setHorizontalGroup(
            jpSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSuperiorLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpSuperiorLayout.setVerticalGroup(
            jpSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(jpSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 70));

        jPanel6.setBackground(new java.awt.Color(0, 0, 140));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("© ECOMMERCE REGISTER SOLUTIONS - TODOS OS DIREITOS RESERVADOS © ");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, -1, -1));

        javax.swing.GroupLayout jpInferiorLayout = new javax.swing.GroupLayout(jpInferior);
        jpInferior.setLayout(jpInferiorLayout);
        jpInferiorLayout.setHorizontalGroup(
            jpInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 909, Short.MAX_VALUE)
            .addGroup(jpInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpInferiorLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 909, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jpInferiorLayout.setVerticalGroup(
            jpInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
            .addGroup(jpInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpInferiorLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jpInferior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 564, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEfetuarEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEfetuarEntradaActionPerformed

        if (linhas.isEmpty()) {

            JOptionPane.showMessageDialog(null, "Selecione o(s) produto(s) desejado(s) para efetuar a entrada!");

        } else {
            if (tfdDescricaoEntrada.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Digite uma descrição para a entrada!");

            } else {
                if (JOptionPane.showConfirmDialog(null, "Deseja realmente efetuar a entrada do(s) produto(s) listado(s)?") == JOptionPane.YES_OPTION) {

                    for (int i = 0; i < linhas.size(); i++) {
                        Conexao_Entrada conexao_Entrada = new Conexao_Entrada();
                        Entrada entrada = new Entrada();
                        entrada.setDescricao(tfdDescricaoEntrada.getText());
                        entrada.setUnidades(quantidade.get(i));
                        entrada.setProduto(getProduto(identificador.get(i)));
                        conexao_Entrada.inserir(entrada);
                    }

                    for (int i = 0; i < linhas.size(); i++) {
                        Conexao_Produto conexao_Produto = new Conexao_Produto();
                        Produto produto = getProduto(identificador.get(i));
                        produto.setQuantidade(produto.getQuantidade() + quantidade.get(i));
                        conexao_Produto.alterar(produto);

                    }

                    quantidade.clear();
                    identificador.clear();
                    linhas.clear();
                    getNovaTabelaEntrada();

                    JOptionPane.showMessageDialog(null, "Efetuado a entrada com sucesso!");

                }
            }
        }

    }//GEN-LAST:event_btnEfetuarEntradaActionPerformed

    private void btnTirarProdutoEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTirarProdutoEntradaActionPerformed

        int selecaoProduto = tblListaEntrada.getSelectedRow();

        if (selecaoProduto >= 0) {
            linhas.remove(selecaoProduto);
            quantidade.remove(selecaoProduto);
            identificador.remove(selecaoProduto);
            getNovaTabelaEntrada();

        } else {

            JOptionPane.showMessageDialog(null, "Selecione um produto na tabela!");

        }
    }//GEN-LAST:event_btnTirarProdutoEntradaActionPerformed

    private void btnAdicionarEntrada1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarEntrada1ActionPerformed

        int selecaoProduto = jtProdutos.getSelectedRow();

        if (selecaoProduto >= 0) {
            if (tfdQuantidadeEntrada.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Coloque a quantidade para entrada do produto!");

            } else {
                Conexao_Produto conexao_Produto = new Conexao_Produto();
                Produto produto = new Produto();
                produto = conexao_Produto.listar().get(selecaoProduto);
                getTabelaEntrada(produto);

            }

        } else {

            JOptionPane.showMessageDialog(null, "Selecione um produto na tabela!");

        }
    }//GEN-LAST:event_btnAdicionarEntrada1ActionPerformed

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
            java.util.logging.Logger.getLogger(DialogEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogEntrada dialog = new DialogEntrada(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarEntrada1;
    private javax.swing.JButton btnEfetuarEntrada;
    private javax.swing.JButton btnTirarProdutoEntrada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpCentro;
    private javax.swing.JPanel jpInferior;
    private javax.swing.JPanel jpSuperior;
    private javax.swing.JTable jtProdutos;
    private javax.swing.JTable tblListaEntrada;
    private javax.swing.JTextField tfdDescricaoEntrada;
    private javax.swing.JTextField tfdQuantidadeEntrada;
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

    public void getTabelaEntrada(Produto produto) {

        Conexao_Produto conexao_Produto = new Conexao_Produto();

        Vector cabecalho = new Vector();

        cabecalho.add("SKU");
        cabecalho.add("Nome");
        cabecalho.add("Preço");
        cabecalho.add("Quantidade");

        Vector colunas = new Vector();
        colunas.add(produto.getId_item());
        colunas.add(produto.getNome());
        colunas.add(produto.getPreco());
        colunas.add(tfdQuantidadeEntrada.getText());

        identificador.add(produto.getId_item());
        quantidade.add(Integer.parseInt(tfdQuantidadeEntrada.getText()));
        linhas.add(new Vector(colunas));
        tblListaEntrada.setModel(new DefaultTableModel(linhas, cabecalho));

    }

    public void getNovaTabelaEntrada() {

        Vector cabecalho = new Vector();

        cabecalho.add("SKU");
        cabecalho.add("Nome");
        cabecalho.add("Preço");
        cabecalho.add("Quantidade");

        tblListaEntrada.setModel(new DefaultTableModel(linhas, cabecalho));

    }

    public Produto getProduto(int id_Item) {

        Conexao_Produto conexao_Produto = new Conexao_Produto();
        Produto p = null;

        for (int i = 0; i < conexao_Produto.listar().size(); i++) {
            if (conexao_Produto.listar().get(i).getId_item().equals(id_Item)) {

                p = conexao_Produto.listar().get(i);

            }

        }
        return p;

    }

}
