/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Luciano
 */
public class TelaGeral extends javax.swing.JFrame {

    /**
     * Creates new form TelaGeral
     */
    public TelaGeral() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnCentro = new javax.swing.JPanel();
        jpnInferior = new javax.swing.JPanel();
        jpnEsquerda = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        btnProdutosView = new javax.swing.JButton();
        btnEntradaView = new javax.swing.JButton();
        btnSaidaView = new javax.swing.JButton();
        btnRelatoriosView = new javax.swing.JButton();
        btnPaginaInicialView = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnCentro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jpnCentroLayout = new javax.swing.GroupLayout(jpnCentro);
        jpnCentro.setLayout(jpnCentroLayout);
        jpnCentroLayout.setHorizontalGroup(
            jpnCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 671, Short.MAX_VALUE)
        );
        jpnCentroLayout.setVerticalGroup(
            jpnCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );

        getContentPane().add(jpnCentro, java.awt.BorderLayout.CENTER);

        jpnInferior.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jpnInferiorLayout = new javax.swing.GroupLayout(jpnInferior);
        jpnInferior.setLayout(jpnInferiorLayout);
        jpnInferiorLayout.setHorizontalGroup(
            jpnInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 782, Short.MAX_VALUE)
        );
        jpnInferiorLayout.setVerticalGroup(
            jpnInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        getContentPane().add(jpnInferior, java.awt.BorderLayout.PAGE_END);

        lblLogo.setText("Logo");

        btnProdutosView.setText("Produtos");
        btnProdutosView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProdutosViewMouseClicked(evt);
            }
        });

        btnEntradaView.setText("Entrada");

        btnSaidaView.setText("Saída");

        btnRelatoriosView.setText("Relatórios");

        btnPaginaInicialView.setText("PaginaInicial");
        btnPaginaInicialView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnPaginaInicialViewMouseReleased(evt);
            }
        });
        btnPaginaInicialView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaginaInicialViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnEsquerdaLayout = new javax.swing.GroupLayout(jpnEsquerda);
        jpnEsquerda.setLayout(jpnEsquerdaLayout);
        jpnEsquerdaLayout.setHorizontalGroup(
            jpnEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnEsquerdaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProdutosView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEntradaView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSaidaView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRelatoriosView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPaginaInicialView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jpnEsquerdaLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblLogo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnEsquerdaLayout.setVerticalGroup(
            jpnEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnEsquerdaLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblLogo)
                .addGap(28, 28, 28)
                .addComponent(btnPaginaInicialView, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProdutosView, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEntradaView, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSaidaView, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRelatoriosView, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        getContentPane().add(jpnEsquerda, java.awt.BorderLayout.LINE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPaginaInicialViewMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPaginaInicialViewMouseReleased
        btnPaginaInicialView.setToolTipText( "Página Inicial" );
    }//GEN-LAST:event_btnPaginaInicialViewMouseReleased

    private void btnPaginaInicialViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaginaInicialViewActionPerformed
        JFrame teste = new JFrame();
        teste.setVisible( true );
        teste.setBackground( Color.black );
    }//GEN-LAST:event_btnPaginaInicialViewActionPerformed

    private void btnProdutosViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProdutosViewMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProdutosViewMouseClicked

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGeral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntradaView;
    private javax.swing.JButton btnPaginaInicialView;
    private javax.swing.JButton btnProdutosView;
    private javax.swing.JButton btnRelatoriosView;
    private javax.swing.JButton btnSaidaView;
    private javax.swing.JPanel jpnCentro;
    private javax.swing.JPanel jpnEsquerda;
    private javax.swing.JPanel jpnInferior;
    private javax.swing.JLabel lblLogo;
    // End of variables declaration//GEN-END:variables
}
