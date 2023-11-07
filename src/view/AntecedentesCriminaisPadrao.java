/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ButtonGroup;

/**
 *
 * @author Kito Mahique
 * lembrar que esta tela faze parte das telas nao usadas no sistema.
 * Telas nao usadas neste sistema:
 * - ProcessoPadrao
 * - MedicoPadrao
 * - AntecedentesCriminaisPadrao
 */
public class AntecedentesCriminaisPadrao extends javax.swing.JInternalFrame {

    public void pegarProcesso(Object... valorP){
        
    }
    
    
    Font f1= new Font("Calibre", Font.BOLD,18);
    public AntecedentesCriminaisPadrao(String finalidade) {
        initComponents();
        if(finalidade.equals("listagem")){
            jtaCrimes.setBackground(Color.darkGray);
            jtaCrimes.setForeground(Color.CYAN);
            jtaCrimes.setFont(f1);
        }
        
        jbConcluirRegisto.setEnabled(false);
        getContentPane().setBackground(Color.DARK_GRAY);
        ButtonGroup bgCrime= new ButtonGroup();
        bgCrime.add(jrSimCrime);
        bgCrime.add(jrNaoCrime);
        jtaCrimes.setVisible(false);
        jbConcluirRegisto.setBackground(Color.white);
        jbVoltarCrime.setBackground(Color.white);
        jbEditar.setBackground(Color.white);
        jtId.setEnabled(false);
    }
    private void habilitarBotaoConcluir(){
        if(jrSimCrime.isSelected() && jtaCrimes.getText().length()>4){
            jbConcluirRegisto.setEnabled(true);
        }else{
            jbConcluirRegisto.setEnabled(false);
        }
    }
    public void desabilitarCampos(){
        jrSimCrime.setEnabled(false);
        jrNaoCrime.setEnabled(false);
        jtaCrimes.setEnabled(false);
    }
    public void habilitarCampos(){
        jrSimCrime.setEnabled(true);
        jrNaoCrime.setEnabled(true);
        jtaCrimes.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlId = new javax.swing.JLabel();
        jtId = new javax.swing.JTextField();
        jlimag = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jlPergunta = new javax.swing.JLabel();
        jrSimCrime = new javax.swing.JRadioButton();
        jrNaoCrime = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaCrimes = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jbConcluirRegisto = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbVoltarCrime = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setTitle("Antecedentes Criminais");
        setPreferredSize(new java.awt.Dimension(1205, 590));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlId.setText("ID");

        jlimag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/4288577_auction_gavel_judge_law_verdict_icon.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2290855_check_document_done_list_paper_icon.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlimag))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jlId, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(jlimag)))
                .addGap(17, 17, 17))
        );

        jlPergunta.setBackground(java.awt.Color.darkGray);
        jlPergunta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlPergunta.setForeground(new java.awt.Color(255, 255, 255));
        jlPergunta.setText("Possui Algum Registo Criminal");

        jrSimCrime.setBackground(java.awt.Color.darkGray);
        jrSimCrime.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jrSimCrime.setForeground(new java.awt.Color(255, 255, 255));
        jrSimCrime.setText("Sim");
        jrSimCrime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrSimCrimeActionPerformed(evt);
            }
        });

        jrNaoCrime.setBackground(java.awt.Color.darkGray);
        jrNaoCrime.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jrNaoCrime.setForeground(new java.awt.Color(255, 255, 255));
        jrNaoCrime.setText("Nao");
        jrNaoCrime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrNaoCrimeActionPerformed(evt);
            }
        });

        jLabel2.setBackground(java.awt.Color.darkGray);
        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Datas de Condenacao  -  crimes  -  sentenca");

        jtaCrimes.setColumns(20);
        jtaCrimes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtaCrimes.setRows(5);
        jtaCrimes.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jtaCrimes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtaCrimesKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtaCrimes);

        jPanel5.setBackground(new java.awt.Color(0, 153, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setForeground(java.awt.Color.pink);

        jbConcluirRegisto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbConcluirRegisto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/8396408_floppydisk_diskette_disk_save_file_icon.png"))); // NOI18N
        jbConcluirRegisto.setText("Concluir Registo");
        jbConcluirRegisto.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jbConcluirRegisto.setName("Processo"); // NOI18N
        jbConcluirRegisto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConcluirRegistoActionPerformed(evt);
            }
        });

        jbEditar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/314251_edit_document_icon_1.png"))); // NOI18N
        jbEditar.setText("Editar");
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jbVoltarCrime.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbVoltarCrime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2303135_arrow_back_left_refresh_renew_icon.png"))); // NOI18N
        jbVoltarCrime.setText("Voltar");
        jbVoltarCrime.setName("Processo"); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbVoltarCrime, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jbConcluirRegisto, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbConcluirRegisto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbVoltarCrime, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("exemplo:   20/10/2023 - furto(subtracao) - quatro(4) anos + multa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                        .addComponent(jrSimCrime, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(195, 195, 195)
                        .addComponent(jrNaoCrime, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrSimCrime, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrNaoCrime, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrSimCrimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrSimCrimeActionPerformed
        // TODO add your handling code here:
        jtaCrimes.setVisible(true);
        if(jtaCrimes.getText().length()<5){
            jbConcluirRegisto.setEnabled(false);
        }
    }//GEN-LAST:event_jrSimCrimeActionPerformed

    private void jrNaoCrimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrNaoCrimeActionPerformed
        // TODO add your handling code here:
        jtaCrimes.setText("");
        jtaCrimes.setVisible(false);
        jbConcluirRegisto.setEnabled(true);
    }//GEN-LAST:event_jrNaoCrimeActionPerformed

    private void jbConcluirRegistoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConcluirRegistoActionPerformed
        // TODO add your handling code here:
        desabilitarCampos();
    }//GEN-LAST:event_jbConcluirRegistoActionPerformed

    private void jtaCrimesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtaCrimesKeyReleased
        // TODO add your handling code here:
        habilitarBotaoConcluir();
    }//GEN-LAST:event_jtaCrimesKeyReleased

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        // TODO add your handling code here:
         habilitarCampos();
    }//GEN-LAST:event_jbEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbConcluirRegisto;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbVoltarCrime;
    private javax.swing.JLabel jlId;
    private javax.swing.JLabel jlPergunta;
    private javax.swing.JLabel jlimag;
    private javax.swing.JRadioButton jrNaoCrime;
    private javax.swing.JRadioButton jrSimCrime;
    private javax.swing.JTextField jtId;
    private javax.swing.JTextArea jtaCrimes;
    // End of variables declaration//GEN-END:variables
}
