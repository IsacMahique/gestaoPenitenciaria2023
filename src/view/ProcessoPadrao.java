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
public class ProcessoPadrao extends javax.swing.JInternalFrame{

    /**
     * Creates new form ProcessoPadrao
     */
    Font f1= new Font("Calibre", Font.BOLD,18);
    ButtonGroup bggenero= new ButtonGroup();
    public ProcessoPadrao(String finalidade) {
        initComponents();
        if(finalidade.equals("listagem")){
            componentesListagem();
        }
        
        jtId.setEnabled(false);
        jbConcluirProcesso.setEnabled(false);
         getContentPane().setBackground(Color.DARK_GRAY);
        for(int i=1; i<=31; i++){
           String a=String.valueOf(i);
           jcDia.addItem(a);
       }
       jcMes.addItem("Janeiro"); jcMes.addItem("Fevereiro"); jcMes.addItem("Março"); 
        jcMes.addItem("Abril"); jcMes.addItem("Maio"); jcMes.addItem("junho"); 
        jcMes.addItem("Julho"); jcMes.addItem("Agosto"); jcMes.addItem("Setembro"); 
        jcMes.addItem("Outubro"); jcMes.addItem("Novembro"); jcMes.addItem("Dezembro"); 
       for(int i=2023; i>=1970; i--){
           String a=String.valueOf(i);
           jcAno.addItem(a);
       }
       
       bggenero.add(jrMasculino);
        bggenero.add(jrFeminino);
        jbConcluirProcesso.setBackground(Color.white);
        jbVoltar.setBackground(Color.white);
        jbEditar.setBackground(Color.white);
        
        jtId.setEnabled(false);
    }
    public void componentesListagem(){
        jtNome.setBackground(Color.darkGray);
            jtNaturalidade.setBackground(Color.darkGray);
            jtNacionalidade.setBackground(Color.darkGray);
            jtLocalDeResidencia.setBackground(Color.darkGray);
            jtId.setBackground(Color.darkGray);
            jtContacto.setBackground(Color.darkGray);
            jtBi.setBackground(Color.darkGray);
            
            jtNome.setForeground(Color.CYAN);
            jtNaturalidade.setForeground(Color.CYAN);
            jtNacionalidade.setForeground(Color.CYAN);
            jtLocalDeResidencia.setForeground(Color.CYAN);
            jtId.setForeground(Color.CYAN);
            jtContacto.setForeground(Color.CYAN);
            jtBi.setForeground(Color.CYAN);
            
            jtNome.setFont(f1);
            jtNaturalidade.setFont(f1);
            jtNacionalidade.setFont(f1);
            jtLocalDeResidencia.setFont(f1);
            jtId.setFont(f1);
            jtContacto.setFont(f1);
            jtBi.setFont(f1);
    }
    private void habilitarBotaoConcluir(){
        if((jtNome.getText().length()>2) && (jtBi.getText().length()>11) && (jtContacto.getText().length()>2) &&
                (jtNaturalidade.getText().length()>2) && (jtNacionalidade.getText().length()>2) && 
                jtLocalDeResidencia.getText().length()>2 && jrMasculino.isSelected() || jrFeminino.isSelected()){
            jbConcluirProcesso.setEnabled(true);
        }
        if((jtNome.getText().length()<3) || (jtBi.getText().length()<12) || (jtContacto.getText().length()<3) ||
                (jtNaturalidade.getText().length()<3) || (jtNacionalidade.getText().length()<3) || jtLocalDeResidencia.getText().length()<3){
            jbConcluirProcesso.setEnabled(false);
        }
    }
    public void desabilitarCampos(){
        jtNome.setEnabled(false);
        jtBi.setEnabled(false);
        jtContacto.setEnabled(false);
        jtNaturalidade.setEnabled(false);
        jtNacionalidade.setEnabled(false);
        jtLocalDeResidencia.setEnabled(false);
        jrMasculino.setEnabled(false);
        jrFeminino.setEnabled(false);
        jcDia.setEnabled(false);
        jcMes.setEnabled(false);
        jcAno.setEnabled(false);
    }
    public void habilitarCampos(){
        jtNome.setEnabled(true);
        jtBi.setEnabled(true);
        jtContacto.setEnabled(true);
        jtNaturalidade.setEnabled(true);
        jtNacionalidade.setEnabled(true);
        jtLocalDeResidencia.setEnabled(true);
        jrMasculino.setEnabled(true);
        jrFeminino.setEnabled(true);
        jcDia.setEnabled(true);
        jcMes.setEnabled(true);
        jcAno.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtNome = new javax.swing.JTextField();
        jlBi = new javax.swing.JLabel();
        jtBi = new javax.swing.JTextField();
        jtNacionalidade = new javax.swing.JTextField();
        jlContacto = new javax.swing.JLabel();
        jtContacto = new javax.swing.JTextField();
        jlGenero = new javax.swing.JLabel();
        jrMasculino = new javax.swing.JRadioButton();
        jrFeminino = new javax.swing.JRadioButton();
        jlData = new javax.swing.JLabel();
        jcDia = new javax.swing.JComboBox<>();
        jcMes = new javax.swing.JComboBox<>();
        jcAno = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jlId = new javax.swing.JLabel();
        jtId = new javax.swing.JTextField();
        jlimag = new javax.swing.JLabel();
        jlNaturalidade = new javax.swing.JLabel();
        jtNaturalidade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jlNacionalidade = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jbConcluirProcesso = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbVoltar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jtLocalDeResidencia = new javax.swing.JTextField();

        setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.borderColor"));
        setTitle("Processo");
        setPreferredSize(new java.awt.Dimension(1205, 590));

        jtNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtNome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtNomeKeyReleased(evt);
            }
        });

        jlBi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlBi.setForeground(new java.awt.Color(255, 255, 255));
        jlBi.setText("Numero de BI");

        jtBi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtBi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jtBi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtBiKeyReleased(evt);
            }
        });

        jtNacionalidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtNacionalidade.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jtNacionalidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtNacionalidadeKeyReleased(evt);
            }
        });

        jlContacto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlContacto.setForeground(new java.awt.Color(255, 255, 255));
        jlContacto.setText("Contacto");

        jtContacto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtContacto.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jtContacto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtContactoKeyReleased(evt);
            }
        });

        jlGenero.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlGenero.setForeground(new java.awt.Color(255, 255, 255));
        jlGenero.setText("Genero");

        jrMasculino.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jrMasculino.setText("Masculino");
        jrMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrMasculinoActionPerformed(evt);
            }
        });
        jrMasculino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jrMasculinoKeyReleased(evt);
            }
        });

        jrFeminino.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jrFeminino.setText("Feminino");
        jrFeminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrFemininoActionPerformed(evt);
            }
        });
        jrFeminino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jrFemininoKeyReleased(evt);
            }
        });

        jlData.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlData.setForeground(new java.awt.Color(255, 255, 255));
        jlData.setText("Data de Nascimento");

        jlId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlId.setText("ID");

        jlimag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/prisoner.png"))); // NOI18N

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
                .addGap(83, 83, 83))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jlimag)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jlNaturalidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlNaturalidade.setForeground(new java.awt.Color(255, 255, 255));
        jlNaturalidade.setText("Naturalidade");

        jtNaturalidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtNaturalidade.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jtNaturalidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtNaturalidadeKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome Completo");

        jlNacionalidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlNacionalidade.setForeground(new java.awt.Color(255, 255, 255));
        jlNacionalidade.setText("Nacionalidade");

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(java.awt.Color.pink);

        jbConcluirProcesso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbConcluirProcesso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1891021_approved_check_checkbox_checkmark_confirm_icon.png"))); // NOI18N
        jbConcluirProcesso.setText("  Concluir");
        jbConcluirProcesso.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jbConcluirProcesso.setName("Processo"); // NOI18N
        jbConcluirProcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConcluirProcessoActionPerformed(evt);
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

        jbVoltar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2303135_arrow_back_left_refresh_renew_icon.png"))); // NOI18N
        jbVoltar.setText("Voltar");
        jbVoltar.setName("Processo"); // NOI18N
        jbVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jbConcluirProcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbConcluirProcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Local de Residencia");

        jtLocalDeResidencia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtLocalDeResidencia.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jtLocalDeResidencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtLocalDeResidenciaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jlNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jcDia, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcMes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(60, 60, 60)
                                    .addComponent(jcAno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jtNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlData, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlNaturalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlBi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtBi, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtNaturalidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlGenero)
                                .addGap(78, 78, 78)
                                .addComponent(jrMasculino, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jrFeminino, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtLocalDeResidencia, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 65, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlBi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtBi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlNaturalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtNaturalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtLocalDeResidencia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(jlNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlData, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcDia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcMes, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcAno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrMasculino)
                    .addComponent(jrFeminino))
                .addGap(64, 64, 64)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbConcluirProcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConcluirProcessoActionPerformed
        // TODO add your handling code here:
        desabilitarCampos();
    }//GEN-LAST:event_jbConcluirProcessoActionPerformed

    private void jtNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNomeKeyReleased
        // TODO add your handling code here:
        habilitarBotaoConcluir();
    }//GEN-LAST:event_jtNomeKeyReleased

    private void jtContactoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtContactoKeyReleased
        // TODO add your handling code here:
        habilitarBotaoConcluir();
    }//GEN-LAST:event_jtContactoKeyReleased

    private void jtNacionalidadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNacionalidadeKeyReleased
        // TODO add your handling code here:
        habilitarBotaoConcluir();
    }//GEN-LAST:event_jtNacionalidadeKeyReleased

    private void jtBiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtBiKeyReleased
        // TODO add your handling code here:
        habilitarBotaoConcluir();
    }//GEN-LAST:event_jtBiKeyReleased

    private void jtNaturalidadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNaturalidadeKeyReleased
        // TODO add your handling code here:
        habilitarBotaoConcluir();
    }//GEN-LAST:event_jtNaturalidadeKeyReleased

    private void jrMasculinoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jrMasculinoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jrMasculinoKeyReleased

    private void jrFemininoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jrFemininoKeyReleased
        // TODO add your handling code here
    }//GEN-LAST:event_jrFemininoKeyReleased

    private void jrMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrMasculinoActionPerformed
        // TODO add your handling code here:
        habilitarBotaoConcluir();
    }//GEN-LAST:event_jrMasculinoActionPerformed

    private void jrFemininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrFemininoActionPerformed
        // TODO add your handling code here:
        habilitarBotaoConcluir();
    }//GEN-LAST:event_jrFemininoActionPerformed

    private void jtLocalDeResidenciaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtLocalDeResidenciaKeyReleased
        // TODO add your handling code here:
        habilitarBotaoConcluir();
    }//GEN-LAST:event_jtLocalDeResidenciaKeyReleased

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        // TODO add your handling code here:
        habilitarCampos();
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVoltarActionPerformed
        // TODO add your handling code here:
        new Menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbVoltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbConcluirProcesso;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbVoltar;
    private javax.swing.JComboBox<String> jcAno;
    private javax.swing.JComboBox<String> jcDia;
    private javax.swing.JComboBox<String> jcMes;
    private javax.swing.JLabel jlBi;
    private javax.swing.JLabel jlContacto;
    private javax.swing.JLabel jlData;
    private javax.swing.JLabel jlGenero;
    private javax.swing.JLabel jlId;
    private javax.swing.JLabel jlNacionalidade;
    private javax.swing.JLabel jlNaturalidade;
    private javax.swing.JLabel jlimag;
    private javax.swing.JRadioButton jrFeminino;
    private javax.swing.JRadioButton jrMasculino;
    private javax.swing.JTextField jtBi;
    private javax.swing.JTextField jtContacto;
    private javax.swing.JTextField jtId;
    private javax.swing.JTextField jtLocalDeResidencia;
    private javax.swing.JTextField jtNacionalidade;
    private javax.swing.JTextField jtNaturalidade;
    private javax.swing.JTextField jtNome;
    // End of variables declaration//GEN-END:variables

}
