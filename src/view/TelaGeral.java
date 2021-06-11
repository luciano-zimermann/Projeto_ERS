package view;

import javax.swing.JFrame;

/**
 *
 * @author Luciano
 */
public class TelaGeral extends javax.swing.JFrame {

    public TelaGeral() {
        initComponents();
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpGeral = new javax.swing.JPanel();
        jpCentro = new javax.swing.JPanel();
        lblProdutos = new javax.swing.JLabel();
        lblIconeProduto = new javax.swing.JLabel();
        lblRelatorios = new javax.swing.JLabel();
        lblIconeEntrada = new javax.swing.JLabel();
        lblEmbalagens = new javax.swing.JLabel();
        lblIconeEmbalagens = new javax.swing.JLabel();
        lblEntrada = new javax.swing.JLabel();
        lblSaida = new javax.swing.JLabel();
        lblIconeSaida = new javax.swing.JLabel();
        lblIconeRelatorios = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jpSuperior = new javax.swing.JPanel();
        jpInferior = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpCentro.setBackground(new java.awt.Color(255, 255, 255));
        jpCentro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblProdutos.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblProdutos.setForeground(new java.awt.Color(0, 102, 204));
        lblProdutos.setText("PRODUTOS");
        jpCentro.add(lblProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        lblIconeProduto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblIconeProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/product.png"))); // NOI18N
        lblIconeProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIconeProdutoMouseClicked(evt);
            }
        });
        jpCentro.add(lblIconeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, 92));

        lblRelatorios.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblRelatorios.setForeground(new java.awt.Color(0, 102, 204));
        lblRelatorios.setText("RELATÓRIOS");
        jpCentro.add(lblRelatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        lblIconeEntrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/arrow_circle_right_icon_155798.png"))); // NOI18N
        lblIconeEntrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIconeEntradaMouseClicked(evt);
            }
        });
        jpCentro.add(lblIconeEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, -1));

        lblEmbalagens.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblEmbalagens.setForeground(new java.awt.Color(0, 102, 204));
        lblEmbalagens.setText("EMBALAGENS");
        jpCentro.add(lblEmbalagens, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        lblIconeEmbalagens.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/box_icon_155728 (1).png"))); // NOI18N
        lblIconeEmbalagens.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIconeEmbalagensMouseClicked(evt);
            }
        });
        jpCentro.add(lblIconeEmbalagens, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        lblEntrada.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblEntrada.setForeground(new java.awt.Color(0, 102, 204));
        lblEntrada.setText("ENTRADA");
        jpCentro.add(lblEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, -1, -1));

        lblSaida.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblSaida.setForeground(new java.awt.Color(0, 102, 204));
        lblSaida.setText("SAÍDA");
        jpCentro.add(lblSaida, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, -1, -1));

        lblIconeSaida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/arrow_circle_left_icon_155799.png"))); // NOI18N
        lblIconeSaida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIconeSaidaMouseClicked(evt);
            }
        });
        jpCentro.add(lblIconeSaida, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, -1, -1));

        lblIconeRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/log_icon_155172.png"))); // NOI18N
        lblIconeRelatorios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIconeRelatoriosMouseClicked(evt);
            }
        });
        jpCentro.add(lblIconeRelatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Logo-trans.png"))); // NOI18N
        jLabel3.setText("Imagem");
        jpCentro.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 590, 500));

        jpSuperior.setBackground(new java.awt.Color(0, 0, 140));

        javax.swing.GroupLayout jpSuperiorLayout = new javax.swing.GroupLayout(jpSuperior);
        jpSuperior.setLayout(jpSuperiorLayout);
        jpSuperiorLayout.setHorizontalGroup(
            jpSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jpSuperiorLayout.setVerticalGroup(
            jpSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jpInferior.setBackground(new java.awt.Color(0, 0, 140));
        jpInferior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("© ECOMMERCE REGISTER SOLUTIONS - TODOS OS DIREITOS RESERVADOS © ");
        jpInferior.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, -1, -1));

        javax.swing.GroupLayout jpGeralLayout = new javax.swing.GroupLayout(jpGeral);
        jpGeral.setLayout(jpGeralLayout);
        jpGeralLayout.setHorizontalGroup(
            jpGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(jpGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpGeralLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jpGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jpSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jpCentro, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jpInferior, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jpGeralLayout.setVerticalGroup(
            jpGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(jpGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpGeralLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jpSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jpCentro, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jpInferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jpGeral, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblIconeProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconeProdutoMouseClicked
        TelaProduto telaProduto = new TelaProduto();

        telaProduto.setVisible(true);

    }//GEN-LAST:event_lblIconeProdutoMouseClicked

    private void lblIconeEntradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconeEntradaMouseClicked
        DialogEntrada dialogEntrada = new DialogEntrada(new javax.swing.JFrame(), true);

        dialogEntrada.setVisible(true);

    }//GEN-LAST:event_lblIconeEntradaMouseClicked

    private void lblIconeSaidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconeSaidaMouseClicked
        DialogSaida dialogSaida = new DialogSaida(new javax.swing.JFrame(), true);

        dialogSaida.setVisible(true);

    }//GEN-LAST:event_lblIconeSaidaMouseClicked

    private void lblIconeRelatoriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconeRelatoriosMouseClicked
        DialogRelatorios dialogRelatorios = new DialogRelatorios(new javax.swing.JFrame(), true);

        dialogRelatorios.setVisible(true);
    }//GEN-LAST:event_lblIconeRelatoriosMouseClicked

    private void lblIconeEmbalagensMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconeEmbalagensMouseClicked
        DialogEmbalagem dialogEmbalagem = new DialogEmbalagem(new javax.swing.JFrame(), true);

        dialogEmbalagem.setVisible(true);

    }//GEN-LAST:event_lblIconeEmbalagensMouseClicked

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
            java.util.logging.Logger.getLogger(TelaGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGeral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jpCentro;
    private javax.swing.JPanel jpGeral;
    private javax.swing.JPanel jpInferior;
    private javax.swing.JPanel jpSuperior;
    private javax.swing.JLabel lblEmbalagens;
    private javax.swing.JLabel lblEntrada;
    private javax.swing.JLabel lblIconeEmbalagens;
    private javax.swing.JLabel lblIconeEntrada;
    private javax.swing.JLabel lblIconeProduto;
    private javax.swing.JLabel lblIconeRelatorios;
    private javax.swing.JLabel lblIconeSaida;
    private javax.swing.JLabel lblProdutos;
    private javax.swing.JLabel lblRelatorios;
    private javax.swing.JLabel lblSaida;
    // End of variables declaration//GEN-END:variables
}
