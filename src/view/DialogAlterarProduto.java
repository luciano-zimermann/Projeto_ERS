/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.*;
import entities.*;
import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Vector;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import utility.Formatacoes;

/**
 *
 * @author Vanderson
 */
public class DialogAlterarProduto extends javax.swing.JDialog {

    public DialogAlterarProduto(java.awt.Frame parent, boolean modal, Produto produto,TelaProduto telaProduto) {
        super(parent, modal);
        initComponents();
        this.produto = produto;
        this.telaProduto = telaProduto;
        getProduto();
        listarEmbalagem();
        
    }

    TelaProduto telaProduto;    
    Produto produto;
    File imagem;

    private DialogAlterarProduto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpSuperior = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpInferior = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tpAlterarProduto = new javax.swing.JTabbedPane();
        jpProduto = new javax.swing.JPanel();
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
        btnSalvar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        cbEmbalagem = new javax.swing.JComboBox<>();
        btnAbrirImagem = new javax.swing.JButton();
        tfPeso = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jpListaPrecos = new javax.swing.JPanel();
        btnExcluirPrecoLista = new javax.swing.JButton();
        sDescricao = new javax.swing.JSeparator();
        tfListaDescricao = new javax.swing.JTextField();
        sDescricao1 = new javax.swing.JSeparator();
        tfListaPreco = new javax.swing.JTextField();
        spTabelaLista = new javax.swing.JScrollPane();
        jtTabelaListaPrecos = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnIncluirPrecoLista = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpSuperior.setBackground(new java.awt.Color(0, 0, 140));

        jLabel1.setBackground(new java.awt.Color(0, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LOGO ERS");

        javax.swing.GroupLayout jpSuperiorLayout = new javax.swing.GroupLayout(jpSuperior);
        jpSuperior.setLayout(jpSuperiorLayout);
        jpSuperiorLayout.setHorizontalGroup(
            jpSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSuperiorLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(704, Short.MAX_VALUE))
        );
        jpSuperiorLayout.setVerticalGroup(
            jpSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
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

        getContentPane().add(jpInferior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 800, 20));

        tpAlterarProduto.setBackground(new java.awt.Color(0, 0, 140));
        tpAlterarProduto.setForeground(new java.awt.Color(255, 255, 255));
        tpAlterarProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tpAlterarProduto.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        jpProduto.setBackground(new java.awt.Color(255, 255, 255));
        jpProduto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jpProduto.add(jpColocarImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, -1, -1));
        jpProduto.add(tfNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 65, 480, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 140));
        jLabel3.setText("SKU:");
        jpProduto.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 22, -1, -1));

        tfSku.setEnabled(false);
        jpProduto.add(tfSku, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 110, 22));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 140));
        jLabel4.setText("GARANTIA:");
        jpProduto.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, 20));
        jpProduto.add(tfEan, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 110, 110, 22));

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 140));
        jLabel5.setText("EAN:");
        jpProduto.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 113, -1, -1));
        jpProduto.add(tfMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 110, 22));

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 140));
        jLabel6.setText("MARCA:");
        jpProduto.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, 20));

        jtaDescricao.setColumns(20);
        jtaDescricao.setRows(5);
        jScrollPane1.setViewportView(jtaDescricao);

        jpProduto.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 510, 130));

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 140));
        jLabel7.setText("DESCRIÇÃO:");
        jpProduto.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));
        jpProduto.add(tfPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 152, 110, 22));

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 140));
        jLabel8.setText("ALTURA:");
        jpProduto.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, -1, 20));

        tfAltura.setEnabled(false);
        jpProduto.add(tfAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, 110, 22));

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 140));
        jLabel9.setText("CUSTO:");
        jpProduto.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, 20));
        jpProduto.add(tfEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, 110, 22));

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 140));
        jLabel10.setText("ESTOQUE:");
        jpProduto.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 220, -1, 20));

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 140));
        jLabel11.setText("ESTOQUE MINÍMO:");
        jpProduto.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, -1, 20));
        jpProduto.add(tfEstoqueMinimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, 110, 22));

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 140));
        jLabel12.setText("PREÇO:");
        jpProduto.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 153, -1, 20));
        jpProduto.add(tfCusto, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 110, 22));

        tfComprimento.setEnabled(false);
        jpProduto.add(tfComprimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 110, 22));

        tfLargura.setEnabled(false);
        jpProduto.add(tfLargura, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 110, 22));

        jLabel13.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 140));
        jLabel13.setText("EMBALAGEM:");
        jpProduto.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 410, -1, 20));

        jLabel14.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 140));
        jLabel14.setText("COMPRIMENTO:");
        jpProduto.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, 20));

        jLabel15.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 140));
        jLabel15.setText("LARGURA:");
        jpProduto.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, -1, 20));
        jpProduto.add(tfGarantia, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 110, 22));

        jLabel16.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 140));
        jLabel16.setText("NOME:");
        jpProduto.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 68, -1, -1));

        btnSalvar.setBackground(new java.awt.Color(0, 0, 140));
        btnSalvar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jpProduto.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 510, -1, -1));

        btnVoltar.setBackground(new java.awt.Color(0, 0, 140));
        btnVoltar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jpProduto.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 510, -1, -1));

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
        jpProduto.add(cbEmbalagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 110, 22));

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
        jpProduto.add(btnAbrirImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(623, 155, -1, -1));
        jpProduto.add(tfPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 110, 22));

        jLabel17.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 140));
        jLabel17.setText("PESO:");
        jpProduto.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, -1, 20));

        tpAlterarProduto.addTab("  Produto", jpProduto);

        jpListaPrecos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExcluirPrecoLista.setBackground(new java.awt.Color(0, 0, 140));
        btnExcluirPrecoLista.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        btnExcluirPrecoLista.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluirPrecoLista.setText("Excluir Preço");
        btnExcluirPrecoLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirPrecoListaActionPerformed(evt);
            }
        });
        jpListaPrecos.add(btnExcluirPrecoLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, -1, -1));

        sDescricao.setBackground(new java.awt.Color(0, 0, 140));
        jpListaPrecos.add(sDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 60, 160, -1));

        tfListaDescricao.setBorder(null);
        tfListaDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfListaDescricaoActionPerformed(evt);
            }
        });
        jpListaPrecos.add(tfListaDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 40, 160, 20));

        sDescricao1.setBackground(new java.awt.Color(0, 0, 140));
        jpListaPrecos.add(sDescricao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 160, -1));

        tfListaPreco.setBorder(null);
        tfListaPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfListaPrecoActionPerformed(evt);
            }
        });
        jpListaPrecos.add(tfListaPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 160, 20));

        spTabelaLista.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 140), 2));

        jtTabelaListaPrecos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Descrição", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtTabelaListaPrecos.setSelectionBackground(new java.awt.Color(153, 204, 255));
        jtTabelaListaPrecos.setSelectionForeground(new java.awt.Color(255, 255, 254));
        spTabelaLista.setViewportView(jtTabelaListaPrecos);

        jpListaPrecos.add(spTabelaLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 780, 460));

        jLabel19.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 140));
        jLabel19.setText("PREÇO:");
        jpListaPrecos.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 45, -1, -1));

        jLabel20.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 140));
        jLabel20.setText("DESCRIÇÃO:");
        jpListaPrecos.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 45, -1, -1));

        btnIncluirPrecoLista.setBackground(new java.awt.Color(0, 0, 140));
        btnIncluirPrecoLista.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        btnIncluirPrecoLista.setForeground(new java.awt.Color(255, 255, 255));
        btnIncluirPrecoLista.setText("Incluir Preço");
        btnIncluirPrecoLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirPrecoListaActionPerformed(evt);
            }
        });
        jpListaPrecos.add(btnIncluirPrecoLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, -1, -1));

        tpAlterarProduto.addTab("Lista de preços", jpListaPrecos);

        getContentPane().add(tpAlterarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 800, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnAbrirImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirImagemActionPerformed

        imagem = selecionarImagem();
        lblImagem.setText("");
        abrirImagem(imagem);

    }//GEN-LAST:event_btnAbrirImagemActionPerformed

    private void btnExcluirPrecoListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirPrecoListaActionPerformed

        
    }//GEN-LAST:event_btnExcluirPrecoListaActionPerformed

    private void tfListaDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfListaDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfListaDescricaoActionPerformed

    private void tfListaPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfListaPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfListaPrecoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        Formatacoes formatacoes = new Formatacoes();
        Conexao_Produto conexao_Produto = new Conexao_Produto();
     
        produto = new Produto();
        produto.setId_item(Integer.parseInt(tfSku.getText()));
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
        
        conexao_Produto.alterar(produto);
        telaProduto.getTabelaProduto();
        
        JOptionPane.showMessageDialog(null, "O regsitro foi alterado com sucesso");
        
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnIncluirPrecoListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirPrecoListaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIncluirPrecoListaActionPerformed

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
            java.util.logging.Logger.getLogger(DialogAlterarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogAlterarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogAlterarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogAlterarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogAlterarProduto dialog = new DialogAlterarProduto(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnExcluirPrecoLista;
    private javax.swing.JButton btnIncluirPrecoLista;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cbEmbalagem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpColocarImagem;
    private javax.swing.JPanel jpInferior;
    private javax.swing.JPanel jpListaPrecos;
    private javax.swing.JPanel jpProduto;
    private javax.swing.JPanel jpSuperior;
    private javax.swing.JTable jtTabelaListaPrecos;
    private javax.swing.JTextArea jtaDescricao;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JSeparator sDescricao;
    private javax.swing.JSeparator sDescricao1;
    private javax.swing.JScrollPane spTabelaLista;
    private javax.swing.JTextField tfAltura;
    private javax.swing.JTextField tfComprimento;
    private javax.swing.JTextField tfCusto;
    private javax.swing.JTextField tfEan;
    private javax.swing.JTextField tfEstoque;
    private javax.swing.JTextField tfEstoqueMinimo;
    private javax.swing.JTextField tfGarantia;
    private javax.swing.JTextField tfLargura;
    private javax.swing.JTextField tfListaDescricao;
    private javax.swing.JTextField tfListaPreco;
    private javax.swing.JTextField tfMarca;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfPeso;
    private javax.swing.JTextField tfPreco;
    private javax.swing.JTextField tfSku;
    private javax.swing.JTabbedPane tpAlterarProduto;
    // End of variables declaration//GEN-END:variables



    public void getProduto() {

        tfSku.setText(Integer.toString(produto.getId_item()));
        tfNome.setText(produto.getNome());
        tfEan.setText(produto.getEan());
        tfGarantia.setText(produto.getGarantia());
        tfMarca.setText(produto.getMarca());
        tfPeso.setText(Double.toString(produto.getPeso()));
        tfPreco.setText(Double.toString(produto.getPreco()));
        tfCusto.setText(Double.toString(produto.getCusto()));
        tfEstoque.setText(Integer.toString(produto.getQuantidade()));
        tfEstoqueMinimo.setText(Integer.toString(produto.getEstoque_minimo()));
        jtaDescricao.setText(produto.getDescricao());
        abrirImagem(produto.getImagem());
        cbEmbalagem.setSelectedItem(produto.getEmbalagem().getDescricao());
        tfComprimento.setText(Double.toString(produto.getEmbalagem().getComprimento()));
        tfAltura.setText(Double.toString(produto.getEmbalagem().getAltura()));
        tfLargura.setText(Double.toString(produto.getEmbalagem().getLargura()));

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

        }

    }

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
     
}
