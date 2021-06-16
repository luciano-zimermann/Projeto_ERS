/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.Conexao_Entrada;
import control.Conexao_Produto;
import control.Conexao_Saida;
import entities.Entrada;
import entities.Produto;
import entities.Saida;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utility.Formatacoes;

/**
 *
 * @author Luciano
 */
public class DialogSaida extends javax.swing.JDialog {

    /**
     * Creates new form DialogSaida
     */
    public DialogSaida(java.awt.Frame parent, boolean modal) {
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

        jpSaida = new javax.swing.JPanel();
        jpCentro = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaSaida = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtProdutos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        tfdQuantidadeSaida = new javax.swing.JTextField();
        btnEfetuarSaida = new javax.swing.JButton();
        btnTirarProdutoSaida = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tfdDescricaoSaida = new javax.swing.JTextField();
        btnAdicionarSaida = new javax.swing.JButton();
        jpSuperior = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpInferior = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jpSaida.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpCentro.setBackground(new java.awt.Color(255, 255, 255));
        jpCentro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 140));
        jLabel3.setText("QUANTIDADE");
        jpCentro.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, -1, 20));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 140));
        jLabel4.setText("LISTA DE SAIDA");
        jpCentro.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, -1, -1));

        tblListaSaida.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        tblListaSaida.setForeground(new java.awt.Color(0, 0, 140));
        tblListaSaida.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblListaSaida);

        jpCentro.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 330, 320));

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

        jpCentro.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 330, 320));

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 140));
        jLabel5.setText("LISTA DE PRODUTOS");
        jpCentro.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        tfdQuantidadeSaida.setToolTipText("Informe uma quantidade de produtos");
        tfdQuantidadeSaida.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 140), 2, true));
        jpCentro.add(tfdQuantidadeSaida, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 100, -1));

        btnEfetuarSaida.setBackground(new java.awt.Color(0, 0, 140));
        btnEfetuarSaida.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnEfetuarSaida.setForeground(new java.awt.Color(255, 255, 255));
        btnEfetuarSaida.setText("Efetuar Saida");
        btnEfetuarSaida.setToolTipText("Efetua a saída do estoque");
        btnEfetuarSaida.setBorder(null);
        btnEfetuarSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEfetuarSaidaActionPerformed(evt);
            }
        });
        jpCentro.add(btnEfetuarSaida, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 390, 130, 30));

        btnTirarProdutoSaida.setBackground(new java.awt.Color(0, 0, 140));
        btnTirarProdutoSaida.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnTirarProdutoSaida.setForeground(new java.awt.Color(255, 255, 255));
        btnTirarProdutoSaida.setText("Remover Produto");
        btnTirarProdutoSaida.setToolTipText("Adiciona produto na lista de Saída");
        btnTirarProdutoSaida.setBorder(null);
        btnTirarProdutoSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTirarProdutoSaidaActionPerformed(evt);
            }
        });
        jpCentro.add(btnTirarProdutoSaida, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 150, 30));

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 140));
        jLabel6.setText("DESCRIÇÃO DA SAIDA:");
        jpCentro.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, -1, -1));

        tfdDescricaoSaida.setToolTipText("Informe uma quantidade de produtos");
        tfdDescricaoSaida.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 140), 2, true));
        jpCentro.add(tfdDescricaoSaida, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, 170, -1));

        btnAdicionarSaida.setBackground(new java.awt.Color(0, 0, 140));
        btnAdicionarSaida.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnAdicionarSaida.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionarSaida.setText("Adicionar Saida");
        btnAdicionarSaida.setToolTipText("Adiciona produto na lista de Saída");
        btnAdicionarSaida.setBorder(null);
        btnAdicionarSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarSaidaActionPerformed(evt);
            }
        });
        jpCentro.add(btnAdicionarSaida, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 150, 30));

        jpSaida.add(jpCentro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 65, 910, 455));

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

        jpSaida.add(jpSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

        jpSaida.add(jpInferior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, -1, -1));

        getContentPane().add(jpSaida, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEfetuarSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEfetuarSaidaActionPerformed

        if (linhas.isEmpty()) {

            JOptionPane.showMessageDialog(null, "Selecione o(s) produto(s) desejado(s) para efetuar a saida!");

        } else {
            if (tfdDescricaoSaida.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Digite uma descrição para dar saida!");

            } else {
                if (JOptionPane.showConfirmDialog(null, "Deseja realmente efetuar a saida do(s) produto(s) listado(s)?") == JOptionPane.YES_OPTION) {

                    for (int i = 0; i < linhas.size(); i++) {
                        Conexao_Saida conexao_Saida = new Conexao_Saida();
                        Saida saida = new Saida();
                        saida.setDescricao(tfdDescricaoSaida.getText());
                        saida.setUnidades(quantidade.get(i));
                        saida.setProduto(getProduto(identificador.get(i)));
                        conexao_Saida.inserir(saida);
                    }

                    for (int i = 0; i < linhas.size(); i++) {
                        Conexao_Produto conexao_Produto = new Conexao_Produto();
                        Produto produto = getProduto(identificador.get(i));
                        produto.setQuantidade(produto.getQuantidade() - quantidade.get(i));
                        conexao_Produto.alterar(produto);

                    }

                    quantidade.clear();
                    identificador.clear();
                    linhas.clear();
                    getNovaTabelaSaida();

                    JOptionPane.showMessageDialog(null, "Efetuado a saida com sucesso!");

                }
            }
        }
        
        
        
    }//GEN-LAST:event_btnEfetuarSaidaActionPerformed

    private void btnTirarProdutoSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTirarProdutoSaidaActionPerformed
        int selecaoProduto = tblListaSaida.getSelectedRow();

        if (selecaoProduto >= 0) {
            linhas.remove(selecaoProduto);
            quantidade.remove(selecaoProduto);
            identificador.remove(selecaoProduto);
            getNovaTabelaSaida();

        } else {

            JOptionPane.showMessageDialog(null, "Selecione um produto na tabela!");

        }


    }//GEN-LAST:event_btnTirarProdutoSaidaActionPerformed

    private void btnAdicionarSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarSaidaActionPerformed

        int selecaoProduto = jtProdutos.getSelectedRow();

        if (selecaoProduto >= 0) {
            if (tfdQuantidadeSaida.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Coloque a quantidade para saida do produto!");

            } else {
                Conexao_Produto conexao_Produto = new Conexao_Produto();
                Produto produto = new Produto();
                produto = conexao_Produto.listar().get(selecaoProduto);
                getTabelaSaida(produto);

            }

        } else {

            JOptionPane.showMessageDialog(null, "Selecione um produto na tabela!");

        }


    }//GEN-LAST:event_btnAdicionarSaidaActionPerformed

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
            java.util.logging.Logger.getLogger(DialogSaida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogSaida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogSaida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogSaida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogSaida dialog = new DialogSaida(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAdicionarSaida;
    private javax.swing.JButton btnEfetuarSaida;
    private javax.swing.JButton btnTirarProdutoSaida;
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
    private javax.swing.JPanel jpSaida;
    private javax.swing.JPanel jpSuperior;
    private javax.swing.JTable jtProdutos;
    private javax.swing.JTable tblListaSaida;
    private javax.swing.JTextField tfdDescricaoSaida;
    private javax.swing.JTextField tfdQuantidadeSaida;
    // End of variables declaration//GEN-END:variables

    public void getTabelaProduto() {

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

    public void getTabelaSaida(Produto produto) {

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
        colunas.add(tfdQuantidadeSaida.getText());

        identificador.add(produto.getId_item());
        quantidade.add(Integer.parseInt(tfdQuantidadeSaida.getText()));
        linhas.add(new Vector(colunas));
        tblListaSaida.setModel(new DefaultTableModel(linhas, cabecalho));

    }

    public void getNovaTabelaSaida() {

        Vector cabecalho = new Vector();

        cabecalho.add("SKU");
        cabecalho.add("Nome");
        cabecalho.add("Preço");
        cabecalho.add("Quantidade");

        tblListaSaida.setModel(new DefaultTableModel(linhas, cabecalho));

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
