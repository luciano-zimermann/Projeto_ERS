/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.Conexao_Entrada;
import control.Conexao_Produto;
import control.Conexao_Saida;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luciano
 */
public class DialogRelatorios extends javax.swing.JDialog {

    /**
     * Creates new form DialogRelatorios
     */
    public DialogRelatorios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setResizable(false);
        getTabelaEntrada();
        getTabelaSaida();
    }

    List<Integer> identificadorEntrada = new ArrayList<>();
    List<Integer> identificadorSaida = new ArrayList<>();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jpRelatorios = new javax.swing.JPanel();
        jpCentro = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRelatoriosEntradas = new javax.swing.JTable();
        tfdBuscarRelatoriosEntrada = new javax.swing.JTextField();
        btnBuscarRelatorioEntrada = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        dcDataInicialEntrada = new com.toedter.calendar.JDateChooser();
        dcDataFinalEntrada = new com.toedter.calendar.JDateChooser();
        cbBuscaEntrada = new javax.swing.JComboBox<>();
        rbFiltrarPeriodoEntrada = new javax.swing.JRadioButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblRelatoriosSaidas = new javax.swing.JTable();
        tfdBuscarRelatoriosSaida = new javax.swing.JTextField();
        btnBuscarRelatoriosSaidas = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        dcDataInicialSaida = new com.toedter.calendar.JDateChooser();
        dcDataFinalSaida = new com.toedter.calendar.JDateChooser();
        cbBuscaSaida = new javax.swing.JComboBox<>();
        rbFiltrarPeriodoSaida = new javax.swing.JRadioButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnGerarRelatoriosEstoqueMinimo = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblRelatoriosEstoqueMinimo = new javax.swing.JTable();
        jpSuperior = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jpInferior = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jpRelatorios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpCentro.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblRelatoriosEntradas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "SKU", "Descrição", "Produto", "Quantidade", "Data de Entrada"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRelatoriosEntradas);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 547, 380));
        jPanel6.add(tfdBuscarRelatoriosEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 53, 262, -1));

        btnBuscarRelatorioEntrada.setBackground(new java.awt.Color(0, 0, 140));
        btnBuscarRelatorioEntrada.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnBuscarRelatorioEntrada.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarRelatorioEntrada.setText("Buscar");
        btnBuscarRelatorioEntrada.setToolTipText("Adiciona produto na lista de Saída");
        btnBuscarRelatorioEntrada.setBorder(null);
        jPanel6.add(btnBuscarRelatorioEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 52, 104, 20));

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 140));
        jLabel5.setText("BUSCAR RELATÓRIOS DE ENTRADAS POR PRODUTO");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 23, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 140));
        jLabel8.setText("FILTRAR POR PERÍODO:");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, 20));

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 140));
        jLabel9.setText("ATÉ: ");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, -1, 20));

        dcDataInicialEntrada.setEnabled(false);
        jPanel6.add(dcDataInicialEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 160, -1));

        dcDataFinalEntrada.setEnabled(false);
        jPanel6.add(dcDataFinalEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 160, -1));

        cbBuscaEntrada.setBackground(new java.awt.Color(0, 0, 140));
        cbBuscaEntrada.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        cbBuscaEntrada.setForeground(new java.awt.Color(255, 255, 255));
        cbBuscaEntrada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sku", "Nome" }));
        cbBuscaEntrada.setRequestFocusEnabled(false);
        jPanel6.add(cbBuscaEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        rbFiltrarPeriodoEntrada.setBackground(new java.awt.Color(255, 255, 255));
        rbFiltrarPeriodoEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFiltrarPeriodoEntradaActionPerformed(evt);
            }
        });
        jPanel6.add(rbFiltrarPeriodoEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        jTabbedPane1.addTab("Relatórios de Entradas", jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        tblRelatoriosSaidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "SKU", "Descrição", "Produto", "Quantidade", "Data de Saída"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblRelatoriosSaidas);

        btnBuscarRelatoriosSaidas.setBackground(new java.awt.Color(0, 0, 140));
        btnBuscarRelatoriosSaidas.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnBuscarRelatoriosSaidas.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarRelatoriosSaidas.setText("Buscar");
        btnBuscarRelatoriosSaidas.setToolTipText("Adiciona produto na lista de Saída");
        btnBuscarRelatoriosSaidas.setBorder(null);

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 140));
        jLabel6.setText("BUSCAR RELATÓRIOS DE SAÍDAS POR PRODUTO");

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 140));
        jLabel11.setText("FILTRAR POR PERÍODO:");

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 140));
        jLabel12.setText("ATÉ: ");

        dcDataInicialSaida.setEnabled(false);

        dcDataFinalSaida.setEnabled(false);

        cbBuscaSaida.setBackground(new java.awt.Color(0, 0, 140));
        cbBuscaSaida.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        cbBuscaSaida.setForeground(new java.awt.Color(255, 255, 255));
        cbBuscaSaida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sku", "Nome" }));
        cbBuscaSaida.setRequestFocusEnabled(false);

        rbFiltrarPeriodoSaida.setBackground(new java.awt.Color(255, 255, 255));
        rbFiltrarPeriodoSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFiltrarPeriodoSaidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel11Layout.createSequentialGroup()
                            .addGap(104, 104, 104)
                            .addComponent(cbBuscaSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfdBuscarRelatoriosSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnBuscarRelatoriosSaidas, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel11Layout.createSequentialGroup()
                            .addGap(187, 187, 187)
                            .addComponent(jLabel6))
                        .addGroup(jPanel11Layout.createSequentialGroup()
                            .addGap(68, 68, 68)
                            .addComponent(rbFiltrarPeriodoSaida)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(dcDataInicialSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel12)
                            .addGap(3, 3, 3)
                            .addComponent(dcDataFinalSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(201, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdBuscarRelatoriosSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarRelatoriosSaidas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbBuscaSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dcDataInicialSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dcDataFinalSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(rbFiltrarPeriodoSaida))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Relatórios de Saídas", jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 140));
        jLabel7.setText("RELATÓRIO DE PRODUTOS COM O ESTOQUE MÍNIMO OU ABAIXO");

        btnGerarRelatoriosEstoqueMinimo.setBackground(new java.awt.Color(0, 0, 140));
        btnGerarRelatoriosEstoqueMinimo.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnGerarRelatoriosEstoqueMinimo.setForeground(new java.awt.Color(255, 255, 255));
        btnGerarRelatoriosEstoqueMinimo.setText("Gerar");
        btnGerarRelatoriosEstoqueMinimo.setToolTipText("Adiciona produto na lista de Saída");
        btnGerarRelatoriosEstoqueMinimo.setBorder(null);
        btnGerarRelatoriosEstoqueMinimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarRelatoriosEstoqueMinimoActionPerformed(evt);
            }
        });

        tblRelatoriosEstoqueMinimo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "SKU", "Nome do Produto", "Custo", "Preço", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tblRelatoriosEstoqueMinimo);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel7))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(btnGerarRelatoriosEstoqueMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(191, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(btnGerarRelatoriosEstoqueMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Relatórios de Estoque Mínimo", jPanel8);

        javax.swing.GroupLayout jpCentroLayout = new javax.swing.GroupLayout(jpCentro);
        jpCentro.setLayout(jpCentroLayout);
        jpCentroLayout.setHorizontalGroup(
            jpCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jpCentroLayout.setVerticalGroup(
            jpCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCentroLayout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jpRelatorios.add(jpCentro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 83, -1, -1));

        jPanel5.setBackground(new java.awt.Color(0, 0, 140));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Logo-trans-Pequeno.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(889, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpSuperiorLayout = new javax.swing.GroupLayout(jpSuperior);
        jpSuperior.setLayout(jpSuperiorLayout);
        jpSuperiorLayout.setHorizontalGroup(
            jpSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpSuperiorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpSuperiorLayout.setVerticalGroup(
            jpSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpRelatorios.add(jpSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 0, 140));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("© ECOMMERCE REGISTER SOLUTIONS - TODOS OS DIREITOS RESERVADOS © ");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, -1, -1));

        javax.swing.GroupLayout jpInferiorLayout = new javax.swing.GroupLayout(jpInferior);
        jpInferior.setLayout(jpInferiorLayout);
        jpInferiorLayout.setHorizontalGroup(
            jpInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 985, Short.MAX_VALUE)
        );
        jpInferiorLayout.setVerticalGroup(
            jpInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInferiorLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jpRelatorios.add(jpInferior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 645, -1, -1));

        getContentPane().add(jpRelatorios, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGerarRelatoriosEstoqueMinimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarRelatoriosEstoqueMinimoActionPerformed

        Conexao_Produto conexao_Produto = new Conexao_Produto();

        Vector cabeçalho = new Vector();
        Vector linhas = new Vector();

        cabeçalho.add("SKU");
        cabeçalho.add("Nome do Produto");
        cabeçalho.add("Custo");
        cabeçalho.add("Preço");
        cabeçalho.add("Quantidade");

        for (int i = 0; i < conexao_Produto.listar().size(); i++) {
            if (conexao_Produto.listar().get(i).getEstoque_minimo() >= conexao_Produto.listar().get(i).getQuantidade()) {
                Vector colunas = new Vector();
                colunas.add(conexao_Produto.listar().get(i).getId_item());
                colunas.add(conexao_Produto.listar().get(i).getNome());
                colunas.add(conexao_Produto.listar().get(i).getCusto());
                colunas.add(conexao_Produto.listar().get(i).getPreco());
                colunas.add(conexao_Produto.listar().get(i).getQuantidade());
                linhas.add(new Vector(colunas));

            }

        }

        tblRelatoriosEstoqueMinimo.setModel(new DefaultTableModel(linhas, cabeçalho));
        if (linhas.isEmpty()) {

            JOptionPane.showMessageDialog(null, "Nenhum produto está com estoque mínimo ou abaixo!");

        }

    }//GEN-LAST:event_btnGerarRelatoriosEstoqueMinimoActionPerformed

    private void rbFiltrarPeriodoEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFiltrarPeriodoEntradaActionPerformed
       
        dcDataFinalEntrada.setEnabled(true);
        dcDataInicialEntrada.setEnabled(true);
        
        
    }//GEN-LAST:event_rbFiltrarPeriodoEntradaActionPerformed

    private void rbFiltrarPeriodoSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFiltrarPeriodoSaidaActionPerformed
      
        dcDataFinalSaida.setEnabled(true);
        dcDataInicialSaida.setEnabled(true);
        
        
    }//GEN-LAST:event_rbFiltrarPeriodoSaidaActionPerformed

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
            java.util.logging.Logger.getLogger(DialogRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogRelatorios dialog = new DialogRelatorios(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnBuscarRelatorioEntrada;
    private javax.swing.JButton btnBuscarRelatoriosSaidas;
    private javax.swing.JButton btnGerarRelatoriosEstoqueMinimo;
    private javax.swing.JComboBox<String> cbBuscaEntrada;
    private javax.swing.JComboBox<String> cbBuscaSaida;
    private com.toedter.calendar.JDateChooser dcDataFinalEntrada;
    private com.toedter.calendar.JDateChooser dcDataFinalSaida;
    private com.toedter.calendar.JDateChooser dcDataInicialEntrada;
    private com.toedter.calendar.JDateChooser dcDataInicialSaida;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel jpCentro;
    private javax.swing.JPanel jpInferior;
    private javax.swing.JPanel jpRelatorios;
    private javax.swing.JPanel jpSuperior;
    private javax.swing.JRadioButton rbFiltrarPeriodoEntrada;
    private javax.swing.JRadioButton rbFiltrarPeriodoSaida;
    private javax.swing.JTable tblRelatoriosEntradas;
    private javax.swing.JTable tblRelatoriosEstoqueMinimo;
    private javax.swing.JTable tblRelatoriosSaidas;
    private javax.swing.JTextField tfdBuscarRelatoriosEntrada;
    private javax.swing.JTextField tfdBuscarRelatoriosSaida;
    // End of variables declaration//GEN-END:variables

    public void getTabelaEntrada() {

        Conexao_Entrada conexao_Entrada = new Conexao_Entrada();

        Vector cabeçalho = new Vector();
        Vector linhas = new Vector();

        cabeçalho.add("Descrição");
        cabeçalho.add("SKU");
        cabeçalho.add("Nome do Produto");
        cabeçalho.add("Quantidade");
        cabeçalho.add("Data da Entrada");

        for (int i = 0; i < conexao_Entrada.listar().size(); i++) {

            Vector colunas = new Vector();
            colunas.add(conexao_Entrada.listar().get(i).getDescricao());
            colunas.add(conexao_Entrada.listar().get(i).getProduto().getId_item());
            colunas.add(conexao_Entrada.listar().get(i).getProduto().getNome());
            colunas.add(conexao_Entrada.listar().get(i).getUnidades());
            colunas.add(conexao_Entrada.listar().get(i).getData_entrada());
            linhas.add(new Vector(colunas));

        }

        tblRelatoriosEntradas.setModel(new DefaultTableModel(linhas, cabeçalho));

    }

      public void getTabelaSaida() {

        Conexao_Saida conexao_Saida  = new Conexao_Saida();

        Vector cabeçalho = new Vector();
        Vector linhas = new Vector();

        cabeçalho.add("Descrição");
        cabeçalho.add("SKU");
        cabeçalho.add("Nome do Produto");
        cabeçalho.add("Quantidade");
        cabeçalho.add("Data da Saida");

        for (int i = 0; i < conexao_Saida.listar().size(); i++) {

            Vector colunas = new Vector();
            colunas.add(conexao_Saida.listar().get(i).getDescricao());
            colunas.add(conexao_Saida.listar().get(i).getProduto().getId_item());
            colunas.add(conexao_Saida.listar().get(i).getProduto().getNome());
            colunas.add(conexao_Saida.listar().get(i).getUnidades());
            colunas.add(conexao_Saida.listar().get(i).getData_saida());
            linhas.add(new Vector(colunas));

        }

        tblRelatoriosEntradas.setModel(new DefaultTableModel(linhas, cabeçalho));

    }
    
    
    
    
    
}
