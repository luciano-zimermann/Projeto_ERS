package view;

import control.*;
import entities.*;
import java.awt.AlphaComposite;
import java.awt.Frame;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import utility.Formatacoes;


public class DialogIncluirProduto extends javax.swing.JDialog {
    
    public DialogIncluirProduto(java.awt.Frame parent, boolean modal, TelaProduto telaProduto) {
        super(parent, modal);
        initComponents();
        listarEmbalagem();
        this.telaProduto = telaProduto;
        this.setResizable(false);
    }

    TelaProduto telaProduto;
    private File imagem;
    Produto produto;

    private DialogIncluirProduto(JFrame jFrame, boolean b) {
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpSuperior = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jpInferior = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jpCentro = new javax.swing.JPanel();
        jpColocarImagem = new javax.swing.JPanel();
        lblImagem = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfSku = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfEan = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfMarca = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaDescricao = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        tfPreco = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfAltura = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfEstoque = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tfEstoqueMinimo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tfCusto = new javax.swing.JTextField();
        tfComprimento = new javax.swing.JTextField();
        tfLargura = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tfGarantia = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        btnIncluir = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        cbEmbalagem = new javax.swing.JComboBox<>();
        btnAbrirImagem = new javax.swing.JButton();
        tfPeso = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        btnLimpar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpSuperior.setBackground(new java.awt.Color(0, 0, 140));

        jLabel18.setBackground(new java.awt.Color(0, 255, 255));
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Logo-trans-Pequeno.png"))); // NOI18N
        jLabel18.setText("LOGO ERS");

        javax.swing.GroupLayout jpSuperiorLayout = new javax.swing.GroupLayout(jpSuperior);
        jpSuperior.setLayout(jpSuperiorLayout);
        jpSuperiorLayout.setHorizontalGroup(
            jpSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSuperiorLayout.createSequentialGroup()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 719, Short.MAX_VALUE))
        );
        jpSuperiorLayout.setVerticalGroup(
            jpSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jpSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        jpInferior.setBackground(new java.awt.Color(0, 0, 140));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("© ECOMMERCE REGISTER SOLUTIONS - TODOS OS DIREITOS RESERVADOS © ");

        javax.swing.GroupLayout jpInferiorLayout = new javax.swing.GroupLayout(jpInferior);
        jpInferior.setLayout(jpInferiorLayout);
        jpInferiorLayout.setHorizontalGroup(
            jpInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(jpInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpInferiorLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jpInferiorLayout.setVerticalGroup(
            jpInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
            .addGroup(jpInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpInferiorLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jpInferior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 800, 20));

        jpCentro.setBackground(new java.awt.Color(255, 255, 255));
        jpCentro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpColocarImagem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 140)));

        lblImagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jpColocarImagemLayout = new javax.swing.GroupLayout(jpColocarImagem);
        jpColocarImagem.setLayout(jpColocarImagemLayout);
        jpColocarImagemLayout.setHorizontalGroup(
            jpColocarImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImagem, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
        );
        jpColocarImagemLayout.setVerticalGroup(
            jpColocarImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImagem, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
        );

        jpCentro.add(jpColocarImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, -1, -1));
        jpCentro.add(tfNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 65, 480, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 140));
        jLabel3.setText("SKU:");
        jpCentro.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 22, -1, -1));

        tfSku.setEnabled(false);
        jpCentro.add(tfSku, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 110, 22));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 140));
        jLabel4.setText("GARANTIA:");
        jpCentro.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 110, -1, 20));
        jpCentro.add(tfEan, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 110, 110, 22));

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 140));
        jLabel5.setText("EAN:");
        jpCentro.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 113, -1, -1));
        jpCentro.add(tfMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 110, 22));

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 140));
        jLabel6.setText("MARCA:");
        jpCentro.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 110, -1, 20));

        jtaDescricao.setColumns(20);
        jtaDescricao.setRows(5);
        jScrollPane1.setViewportView(jtaDescricao);

        jpCentro.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 510, 130));

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 140));
        jLabel7.setText("Descrição:");
        jpCentro.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));
        jpCentro.add(tfPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 152, 110, 22));

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 140));
        jLabel8.setText("ALTURA:");
        jpCentro.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, -1, 20));

        tfAltura.setEnabled(false);
        jpCentro.add(tfAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, 110, 22));

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 140));
        jLabel9.setText("CUSTO:");
        jpCentro.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 150, -1, 20));
        jpCentro.add(tfEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, 110, 22));

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 140));
        jLabel10.setText("ESTOQUE:");
        jpCentro.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, -1, 20));

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 140));
        jLabel11.setText("ESTOQUE MINÍMO:");
        jpCentro.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, -1, 20));
        jpCentro.add(tfEstoqueMinimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, 110, 22));

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 140));
        jLabel12.setText("PREÇO:");
        jpCentro.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 152, -1, 20));
        jpCentro.add(tfCusto, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 110, 22));

        tfComprimento.setEnabled(false);
        jpCentro.add(tfComprimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 110, 22));

        tfLargura.setEnabled(false);
        jpCentro.add(tfLargura, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 110, 22));

        jLabel13.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 140));
        jLabel13.setText("EMBALAGEM:");
        jpCentro.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 410, -1, 20));

        jLabel14.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 140));
        jLabel14.setText("COMPRIMENTO:");
        jpCentro.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, 20));

        jLabel15.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 140));
        jLabel15.setText("LARGURA:");
        jpCentro.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, -1, 20));
        jpCentro.add(tfGarantia, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 110, 22));

        jLabel16.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 140));
        jLabel16.setText("NOME:");
        jpCentro.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 68, -1, -1));

        btnIncluir.setBackground(new java.awt.Color(0, 0, 140));
        btnIncluir.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnIncluir.setForeground(new java.awt.Color(255, 255, 255));
        btnIncluir.setText("Incluir");
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });
        jpCentro.add(btnIncluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 520, -1, -1));

        btnVoltar.setBackground(new java.awt.Color(0, 0, 140));
        btnVoltar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jpCentro.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 520, -1, -1));

        cbEmbalagem.setBackground(new java.awt.Color(0, 0, 140));
        cbEmbalagem.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        cbEmbalagem.setForeground(new java.awt.Color(255, 255, 255));
        cbEmbalagem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Personalizado", "Caixa 1", "Caixa 2", "Caixa 3" }));
        cbEmbalagem.setRequestFocusEnabled(false);
        cbEmbalagem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbEmbalagemItemStateChanged(evt);
            }
        });
        jpCentro.add(cbEmbalagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 110, 22));

        btnAbrirImagem.setBackground(new java.awt.Color(0, 0, 140));
        btnAbrirImagem.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnAbrirImagem.setForeground(new java.awt.Color(255, 255, 255));
        btnAbrirImagem.setText("Abrir Imagem");
        btnAbrirImagem.setToolTipText("Clique para importar a imagem");
        btnAbrirImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirImagemActionPerformed(evt);
            }
        });
        jpCentro.add(btnAbrirImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 155, -1, -1));
        jpCentro.add(tfPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 110, 22));

        jLabel17.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 140));
        jLabel17.setText("PESO:");
        jpCentro.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, -1, 20));

        btnLimpar1.setBackground(new java.awt.Color(0, 0, 140));
        btnLimpar1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnLimpar1.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar1.setText("Limpar");
        btnLimpar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpar1ActionPerformed(evt);
            }
        });
        jpCentro.add(btnLimpar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 520, -1, -1));

        getContentPane().add(jpCentro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 800, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbrirImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirImagemActionPerformed
        
        imagem = selecionarImagem();
        lblImagem.setText("");
        abrirImagem(imagem);
        

    }//GEN-LAST:event_btnAbrirImagemActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        
        Formatacoes formatacoes = new Formatacoes();
        Conexao_Produto conexao_Produto = new Conexao_Produto();
     
        produto = new Produto();
        produto.setNome(tfNome.getText());
        produto.setEan(tfEan.getText());
        produto.setGarantia(tfGarantia.getText());
        produto.setMarca(tfMarca.getText());
        produto.setPeso(formatacoes.valorFormatadoVirgulaParaPonto(tfPeso.getText()));
        produto.setPreco(formatacoes.valorFormatadoVirgulaParaPonto(tfPreco.getText()));
        produto.setCusto(formatacoes.valorFormatadoVirgulaParaPonto(tfCusto.getText()));
        produto.setQuantidade(Integer.parseInt(tfEstoque.getText()));
        produto.setEstoque_minimo(Integer.parseInt(tfEstoqueMinimo.getText()));
        produto.setDescricao(jtaDescricao.getText());
        produto.setEmbalagem(getEmabalagem((String) cbEmbalagem.getSelectedItem()));
        produto.setImagem(getImagem());
        
        conexao_Produto.inserir(produto);
        telaProduto.getTabelaProduto();
        
        JOptionPane.showMessageDialog(null, "O regsitro foi cadastrado com sucesso");
       

    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        
        dispose();
        
        

    }//GEN-LAST:event_btnVoltarActionPerformed

    private void cbEmbalagemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbEmbalagemItemStateChanged
        
        Conexao_Embalagem conexao_Embalagem = new Conexao_Embalagem();
        
        String itemSelecionado = (String) cbEmbalagem.getSelectedItem();
        Double comprimento = null;
        Double largura = null;
        Double altura = null;
        
        for (int i = 0; i < conexao_Embalagem.listar().size(); i++) {
            
            if (itemSelecionado.equals(conexao_Embalagem.listar().get(i).getDescricao())) {
                
                comprimento = conexao_Embalagem.listar().get(i).getComprimento();
                altura = conexao_Embalagem.listar().get(i).getAltura();
                largura = conexao_Embalagem.listar().get(i).getLargura();
                
            }
            
        }
        
        tfComprimento.setText(Double.toString(comprimento));
        tfAltura.setText(Double.toString(altura));
        tfLargura.setText(Double.toString(largura));

    }//GEN-LAST:event_cbEmbalagemItemStateChanged

    private void btnLimpar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpar1ActionPerformed
        
        tfNome.setText("");
        tfPreco.setText("");
        tfEan.setText("");
        tfMarca.setText("");
        tfGarantia.setText("");
        tfEstoque.setText("");
        tfEstoqueMinimo.setText("");
        jtaDescricao.setText("");
        tfComprimento.setText("");
        tfAltura.setText("");
        tfLargura.setText("");
        tfPeso.setText("");
        tfCusto.setText("");

    }//GEN-LAST:event_btnLimpar1ActionPerformed

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
            java.util.logging.Logger.getLogger(DialogIncluirProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogIncluirProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogIncluirProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogIncluirProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogIncluirProduto dialog = new DialogIncluirProduto(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAbrirImagem;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnLimpar1;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cbEmbalagem;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpCentro;
    private javax.swing.JPanel jpColocarImagem;
    private javax.swing.JPanel jpInferior;
    private javax.swing.JPanel jpSuperior;
    private javax.swing.JTextArea jtaDescricao;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JTextField tfAltura;
    private javax.swing.JTextField tfComprimento;
    private javax.swing.JTextField tfCusto;
    private javax.swing.JTextField tfEan;
    private javax.swing.JTextField tfEstoque;
    private javax.swing.JTextField tfEstoqueMinimo;
    private javax.swing.JTextField tfGarantia;
    private javax.swing.JTextField tfLargura;
    private javax.swing.JTextField tfMarca;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfPeso;
    private javax.swing.JTextField tfPreco;
    private javax.swing.JTextField tfSku;
    // End of variables declaration//GEN-END:variables

    public Embalagem getEmabalagem(String embalagem) {
        
        Conexao_Embalagem conexao_Embalagem = new Conexao_Embalagem();
        Embalagem caixa = null;
        
        for (int i = 0; i < conexao_Embalagem.listar().size(); i++) {
            if (embalagem.equals(conexao_Embalagem.listar().get(i).getDescricao())) {
                
                caixa = conexao_Embalagem.listar().get(i);
                
            }
            
        }
        return caixa;
        
    }
    
    public void listarEmbalagem() {
        Conexao_Embalagem conexao_Embalagem = new Conexao_Embalagem();
        Vector caixas = new Vector();
        
        for (int i = 0; i < conexao_Embalagem.listar().size(); i++) {
            
            caixas.add(conexao_Embalagem.listar().get(i).getDescricao());
            
        }
        
        DefaultComboBoxModel model = new DefaultComboBoxModel(caixas);
        cbEmbalagem.setModel(model);
        
    }
    
    public File selecionarImagem() {
        JFileChooser filechooser = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Somente imagens em JPG e PNG", "jpg", "png");
        filechooser.addChoosableFileFilter(filtro);
        filechooser.setAcceptAllFileFilterUsed(false);
        filechooser.setDialogType(JFileChooser.OPEN_DIALOG);
        filechooser.showOpenDialog(this);
        
        return filechooser.getSelectedFile();
    }
    
    private byte[] getImagem() {
        Boolean isPng = false;
        
        if (imagem != null) {
            
            isPng = imagem.getName().endsWith("png");
            
            try {
                BufferedImage image = ImageIO.read(imagem);
                
                ByteArrayOutputStream out = new ByteArrayOutputStream();
                int type = BufferedImage.TYPE_INT_RGB;
                
                if (isPng) {
                    
                    type = BufferedImage.BITMASK;
                }
                
                BufferedImage newImage = new BufferedImage(lblImagem.getWidth() - 5, lblImagem.getHeight() - 5, type);
                Graphics2D g = newImage.createGraphics();
                g.setComposite(AlphaComposite.Src);
                g.drawImage(image, 0, 0, lblImagem.getWidth() - 5, lblImagem.getHeight() - 5, null);
                
                if (isPng) {
                    ImageIO.write(newImage, "png", out);
                } else {
                    ImageIO.write(newImage, "jpg", out);
                }
                
                out.flush();
                byte[] byteArray = out.toByteArray();
                
                return byteArray;
                
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return null;
    }
    
    public void abrirImagem(Object source) {
        if (source instanceof File) {
            ImageIcon icon = new ImageIcon(imagem.getAbsolutePath());
            icon.setImage(icon.getImage().getScaledInstance(lblImagem.getWidth() - 5, lblImagem.getHeight() - 5, 100));
            lblImagem.setIcon(icon);
        } else if (source instanceof byte[]) {
            ImageIcon icon = new ImageIcon(produto.getImagem());
            icon.setImage(icon.getImage().getScaledInstance(lblImagem.getWidth() - 5, lblImagem.getHeight() - 5, 100));
            lblImagem.setIcon(icon);
            
        };
        
    }
    
}
