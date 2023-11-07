/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.FuncionarioController;
import controller.ProcessoController;
import dao.FuncionarioDao;
import dao.ProcessoDao;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.FuncionarioModel;
import model.ProcessoModel;

/**
 *
 * @author Kito Mahique
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
       getContentPane().setBackground(Color.DARK_GRAY);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlRegistos = new javax.swing.JLabel();
        jlConsultas = new javax.swing.JLabel();
        jbRegistarProcesso = new javax.swing.JButton();
        jbRegistarFuncionario = new javax.swing.JButton();
        jbListarProcesso = new javax.swing.JButton();
        jbConsultarFuncionario = new javax.swing.JButton();
        jbEstatistica = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiTerminarSessao = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Visitas = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jmiFecharPrograma = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1250, 660));

        jlRegistos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlRegistos.setForeground(java.awt.Color.white);
        jlRegistos.setText("Registos");

        jlConsultas.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlConsultas.setForeground(java.awt.Color.white);
        jlConsultas.setText("Consultas");

        jbRegistarProcesso.setBackground(new java.awt.Color(102, 0, 102));
        jbRegistarProcesso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbRegistarProcesso.setForeground(java.awt.Color.white);
        jbRegistarProcesso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/prancheta.png"))); // NOI18N
        jbRegistarProcesso.setText(" REGISTAR PROCESSO ");
        jbRegistarProcesso.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.white));
        jbRegistarProcesso.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbRegistarProcesso.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jbRegistarProcessoMouseWheelMoved(evt);
            }
        });
        jbRegistarProcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistarProcessoActionPerformed(evt);
            }
        });

        jbRegistarFuncionario.setBackground(new java.awt.Color(102, 0, 102));
        jbRegistarFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbRegistarFuncionario.setForeground(java.awt.Color.white);
        jbRegistarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/registo.png"))); // NOI18N
        jbRegistarFuncionario.setText("REGISTAR FUNCIONARIO");
        jbRegistarFuncionario.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.white));
        jbRegistarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistarFuncionarioActionPerformed(evt);
            }
        });

        jbListarProcesso.setBackground(new java.awt.Color(102, 0, 102));
        jbListarProcesso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbListarProcesso.setForeground(java.awt.Color.white);
        jbListarProcesso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lista-de-desejos.png"))); // NOI18N
        jbListarProcesso.setText("CONSULTAR PROCESSOS");
        jbListarProcesso.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.white));
        jbListarProcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbListarProcessoActionPerformed(evt);
            }
        });

        jbConsultarFuncionario.setBackground(new java.awt.Color(102, 0, 102));
        jbConsultarFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbConsultarFuncionario.setForeground(java.awt.Color.white);
        jbConsultarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/envolvimento-dos-funcionarios.png"))); // NOI18N
        jbConsultarFuncionario.setText("CONSULTAR FUNCIONARIOS");
        jbConsultarFuncionario.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.white));
        jbConsultarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultarFuncionarioActionPerformed(evt);
            }
        });

        jbEstatistica.setBackground(new java.awt.Color(102, 0, 102));
        jbEstatistica.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbEstatistica.setForeground(new java.awt.Color(255, 255, 255));
        jbEstatistica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/estatisticas.png"))); // NOI18N
        jbEstatistica.setText("RELATORIO GERAL");
        jbEstatistica.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jbEstatistica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEstatisticaActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 0, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2992441_ecology_recycle_recyclingwaste_icon.png"))); // NOI18N
        jButton1.setText("       PROCESSOS ELIMINADOS");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 0, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2992441_ecology_recycle_recyclingwaste_icon.png"))); // NOI18N
        jButton2.setText("FUNCIONARIOS ELIMINADOS");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jMenuBar1.setPreferredSize(new java.awt.Dimension(70, 40));

        jMenu1.setText("OPCOES");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jmiTerminarSessao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/off.png"))); // NOI18N
        jmiTerminarSessao.setText("TERMINAR SESSAO");
        jmiTerminarSessao.setPreferredSize(new java.awt.Dimension(149, 30));
        jmiTerminarSessao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiTerminarSessaoActionPerformed(evt);
            }
        });
        jMenu1.add(jmiTerminarSessao);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("EXPLORAR");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        Visitas.setText("VISITAS");
        Visitas.setPreferredSize(new java.awt.Dimension(100, 30));
        Visitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisitasActionPerformed(evt);
            }
        });
        jMenu2.add(Visitas);

        jMenuItem1.setText("OCORRENCIAS");
        jMenuItem1.setPreferredSize(new java.awt.Dimension(181, 30));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jmiFecharPrograma.setText("FECHAR");
        jmiFecharPrograma.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cancel.png"))); // NOI18N
        jMenuItem2.setText("FECHAR PROGRAMA");
        jMenuItem2.setPreferredSize(new java.awt.Dimension(161, 30));
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jmiFecharPrograma.add(jMenuItem2);

        jMenuBar1.add(jmiFecharPrograma);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jlRegistos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlConsultas)
                .addGap(202, 202, 202))
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbEstatistica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbRegistarFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(jbRegistarProcesso, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 380, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbConsultarFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(jbListarProcesso, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(90, 90, 90))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlRegistos)
                    .addComponent(jlConsultas))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbRegistarProcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbListarProcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbRegistarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbConsultarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbEstatistica, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
         int a= JOptionPane.showConfirmDialog(null, "DESEJA FECHAR PROGRAMA?", "FECHAR", JOptionPane.YES_NO_OPTION);
          if(a==JOptionPane.YES_OPTION){
              System.exit(0);
          }
    
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jmiTerminarSessaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiTerminarSessaoActionPerformed
        // TODO add your handling code here:
         int a= JOptionPane.showConfirmDialog(null, "DESEJA TERMINAR SESSAO?", "SESSAO", JOptionPane.YES_NO_OPTION);
          if(a==JOptionPane.YES_OPTION){
              new TelaLogin();
              this.dispose();
          }
    
    }//GEN-LAST:event_jmiTerminarSessaoActionPerformed

    private void jbRegistarProcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistarProcessoActionPerformed
        new RegistarProcesso().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbRegistarProcessoActionPerformed

    private void jbRegistarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistarFuncionarioActionPerformed
        // TODO add your handling code here:
        new Funcionario().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbRegistarFuncionarioActionPerformed

    private void jbConsultarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultarFuncionarioActionPerformed
         FuncionarioController f = new FuncionarioController("listar", 1);
         this.dispose();
    }//GEN-LAST:event_jbConsultarFuncionarioActionPerformed

    private void jbListarProcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbListarProcessoActionPerformed
        ListagemProcesso pL = new ListagemProcesso();
        pL.setNivel(1);
        this.dispose();
    }//GEN-LAST:event_jbListarProcessoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new ProcessosEliminados().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new FuncionariosEliminados().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jbRegistarProcessoMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jbRegistarProcessoMouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jbRegistarProcessoMouseWheelMoved

    private void jbEstatisticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEstatisticaActionPerformed
        // TODO add your handling code here:
        ProcessoController p = new ProcessoController();
        p.relatorio(1);
        this.dispose();
    }//GEN-LAST:event_jbEstatisticaActionPerformed

    private void VisitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisitasActionPerformed
        Visitas v = new Visitas();
        v.setVisible(true);
        v.setNivel(1);
        
    }//GEN-LAST:event_VisitasActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        RegistoComportamental r = new RegistoComportamental();
        r.setVisible(true);
        r.setNivel(1);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Visitas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JButton jbConsultarFuncionario;
    private javax.swing.JButton jbEstatistica;
    private javax.swing.JButton jbListarProcesso;
    private javax.swing.JButton jbRegistarFuncionario;
    private javax.swing.JButton jbRegistarProcesso;
    private javax.swing.JLabel jlConsultas;
    private javax.swing.JLabel jlRegistos;
    private javax.swing.JMenu jmiFecharPrograma;
    private javax.swing.JMenuItem jmiTerminarSessao;
    // End of variables declaration//GEN-END:variables
}
