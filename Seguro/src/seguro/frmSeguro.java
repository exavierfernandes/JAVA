/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguro;

import java.text.DecimalFormat;
import javax.swing.DefaultListModel;

/**
 *
 * @author soste_000
 */
public class frmSeguro extends javax.swing.JFrame {

    /**
     * Creates new form frmSeguro
     */
    public frmSeguro() {
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

        grupoMotor = new javax.swing.ButtonGroup();
        grupoSexo = new javax.swing.ButtonGroup();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstmarca = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstmodelo = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstano = new javax.swing.JList<>();
        ftxtplaca = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        rbt10 = new javax.swing.JRadioButton();
        rbt14 = new javax.swing.JRadioButton();
        rbt18 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        chkte = new javax.swing.JCheckBox();
        chkbc = new javax.swing.JCheckBox();
        chkmult = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rbtmasc = new javax.swing.JRadioButton();
        rbtfem = new javax.swing.JRadioButton();
        chkgar = new javax.swing.JCheckBox();
        chksaf = new javax.swing.JCheckBox();
        chkm25 = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        txtvseg = new javax.swing.JTextField();
        ButCalc = new javax.swing.JButton();

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Descontos");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Seguro de Automóvel");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Marca");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Modelo");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Ano");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Placa");

        lstmarca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lstmarca.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(lstmarca);

        lstmodelo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lstmodelo.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(lstmodelo);

        lstano.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane3.setViewportView(lstano);

        try {
            ftxtplaca.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("???-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtplaca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Motor");

        grupoMotor.add(rbt10);
        rbt10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbt10.setSelected(true);
        rbt10.setText("1.0");

        grupoMotor.add(rbt14);
        rbt14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbt14.setText("1.4");

        grupoMotor.add(rbt18);
        rbt18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbt18.setText("1.8");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Opcionais");

        chkte.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkte.setText("Trio Elétrico");

        chkbc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkbc.setText("Banco de Couro");

        chkmult.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkmult.setText("Multimídia");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Descontos");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Sexo");

        grupoSexo.add(rbtmasc);
        rbtmasc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtmasc.setSelected(true);
        rbtmasc.setText("Masculino");

        grupoSexo.add(rbtfem);
        rbtfem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtfem.setText("Feminino");

        chkgar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkgar.setText("Garagem");

        chksaf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chksaf.setText("Sistema Anti-furto");

        chkm25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkm25.setText("Maior 25 anos");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Valor do Seguro");

        txtvseg.setEditable(false);
        txtvseg.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtvseg.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        ButCalc.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ButCalc.setText("Calcular");
        ButCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButCalcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel2))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(jLabel4)
                                        .addGap(80, 80, 80)
                                        .addComponent(jLabel5))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbtmasc)
                                .addGap(31, 31, 31)
                                .addComponent(rbtfem)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButCalc)
                            .addComponent(txtvseg, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(18, 18, 18)
                                    .addComponent(chkgar))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(rbt10)
                                    .addGap(18, 18, 18)
                                    .addComponent(rbt14)))
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(23, 23, 23)
                                .addComponent(chkte)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbt18)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkbc)
                                    .addComponent(chksaf))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkm25)
                                    .addComponent(chkmult)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ftxtplaca, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(rbtmasc)
                    .addComponent(rbtfem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ftxtplaca, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbt10)
                        .addComponent(rbt14)
                        .addComponent(rbt18)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(chkte)
                    .addComponent(chkbc)
                    .addComponent(chkmult))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(chkgar)
                    .addComponent(chksaf)
                    .addComponent(chkm25))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtvseg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(ButCalc)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButCalcActionPerformed
        double valseg, totpag;
        int ano;
        String placa;
        placa = ftxtplaca.getText();
        ftxtplaca.setText(placa.toUpperCase());
        if(rbtmasc.isSelected())
        {
            valseg = 1500.00;
            totpag = 1500.00;
        }
        else
        {
            valseg = 1000.00;
            totpag = 1000.00;
        }
        // acréscimos
        ano = Integer.parseInt(lstano.getSelectedValue());
        if(ano <= 2012)
            totpag = totpag + valseg * 10 / 100;
        if(rbt14.isSelected())
            totpag = totpag + valseg * 3 / 100;
        if(rbt18.isSelected())
            totpag = totpag + valseg * 5 / 100;
        if(chkte.isSelected())
            totpag = totpag + valseg * 1 / 100;
        if(chkbc.isSelected())
            totpag = totpag + valseg * 1 / 100;
        if(chkmult.isSelected())
            totpag = totpag + valseg * 1 / 100;
        // descontos
        if(chkgar.isSelected())
            totpag = totpag - valseg * 5 / 100;
        if(chksaf.isSelected())
            totpag = totpag - valseg * 3 / 100;
        if(chkm25.isSelected())
            totpag = totpag - valseg * 2 / 100;
        DecimalFormat df = new DecimalFormat("#,###,##0.00");
        txtvseg.setText(df.format(totpag));
    }//GEN-LAST:event_ButCalcActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        DefaultListModel modmarca = new DefaultListModel();
        lstmarca.setModel(modmarca);
        // adiciona elementos na List Marca
        modmarca.addElement("Fiat");
        modmarca.addElement("Ford");
        modmarca.addElement("GM");
        modmarca.addElement("VW");
        // adiciona elementos na List Modelo
        DefaultListModel modmodelo = new DefaultListModel();
        lstmodelo.setModel(modmodelo);
        modmodelo.addElement("Pálio");
        modmodelo.addElement("Ka");
        modmodelo.addElement("Onix");
        modmodelo.addElement("Gol");
        // adiciona elementos na List Ano
        DefaultListModel modano = new DefaultListModel();
        lstano.setModel(modano);
        modano.addElement("2008");
        modano.addElement("2009");
        modano.addElement("2010");
        modano.addElement("2011");
        modano.addElement("2012");
        modano.addElement("2013");
        modano.addElement("2014");
        modano.addElement("2015");
        modano.addElement("2016");
        modano.addElement("2017");
        modano.addElement("2018");
        // posiciona no 1o elemento da lista
        lstano.setSelectedIndex(0); 
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(frmSeguro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSeguro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSeguro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSeguro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSeguro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButCalc;
    private javax.swing.JCheckBox chkbc;
    private javax.swing.JCheckBox chkgar;
    private javax.swing.JCheckBox chkm25;
    private javax.swing.JCheckBox chkmult;
    private javax.swing.JCheckBox chksaf;
    private javax.swing.JCheckBox chkte;
    private javax.swing.JFormattedTextField ftxtplaca;
    private javax.swing.ButtonGroup grupoMotor;
    private javax.swing.ButtonGroup grupoSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> lstano;
    private javax.swing.JList<String> lstmarca;
    private javax.swing.JList<String> lstmodelo;
    private javax.swing.JRadioButton rbt10;
    private javax.swing.JRadioButton rbt14;
    private javax.swing.JRadioButton rbt18;
    private javax.swing.JRadioButton rbtfem;
    private javax.swing.JRadioButton rbtmasc;
    private javax.swing.JTextField txtvseg;
    // End of variables declaration//GEN-END:variables
}