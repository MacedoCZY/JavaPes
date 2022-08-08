/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplicaçãopes;

import com.mysql.cj.xdevapi.Statement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.DriverManager;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author gusta
 */
public class viewProd extends javax.swing.JFrame {
    public static listagemProduto listagemproduto;
    public static ctrlViewProd ctrlviewprod;
    
    public viewProd(listagemProduto listagemproduto) {
        initComponents();
        ctrlviewprod = new ctrlViewProd(listagemproduto, listagemproduto.viewprod);
        ctrlviewprod.show();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonClose = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        LabelID = new javax.swing.JLabel();
        LabelDescri = new javax.swing.JLabel();
        LabelNCM = new javax.swing.JLabel();
        LabelICMS = new javax.swing.JLabel();
        LabelPreco = new javax.swing.JLabel();
        LabelEmpacota = new javax.swing.JLabel();
        LabelCodBarr = new javax.swing.JLabel();
        FieldID = new javax.swing.JTextField();
        FieldDesc = new javax.swing.JTextField();
        FieldNCM = new javax.swing.JTextField();
        FieldPreco = new javax.swing.JTextField();
        FieldCodBarr = new javax.swing.JTextField();
        Ativo = new javax.swing.JCheckBox();
        combBoxICMS = new javax.swing.JComboBox<>();
        combBoxEMPAC = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(350, 135));
        setMinimumSize(new java.awt.Dimension(800, 450));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 450));

        buttonClose.setText("CLOSE");
        buttonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCloseActionPerformed(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setMaximumSize(new java.awt.Dimension(580, 340));
        jPanel1.setMinimumSize(new java.awt.Dimension(580, 340));
        jPanel1.setPreferredSize(new java.awt.Dimension(580, 340));

        LabelID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LabelID.setText("ID :");

        LabelDescri.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LabelDescri.setText("Descrição :");

        LabelNCM.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LabelNCM.setText("NCM :");

        LabelICMS.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LabelICMS.setText("ICMS :");

        LabelPreco.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LabelPreco.setText("Preço :");

        LabelEmpacota.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LabelEmpacota.setText("Empacotamento :");

        LabelCodBarr.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LabelCodBarr.setText("Código de Barras :");

        FieldID.setEditable(false);
        FieldID.setMinimumSize(new java.awt.Dimension(350, 25));
        FieldID.setPreferredSize(new java.awt.Dimension(350, 25));
        FieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldIDActionPerformed(evt);
            }
        });

        FieldDesc.setEditable(false);
        FieldDesc.setMinimumSize(new java.awt.Dimension(350, 25));
        FieldDesc.setPreferredSize(new java.awt.Dimension(350, 25));
        FieldDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldDescActionPerformed(evt);
            }
        });

        FieldNCM.setEditable(false);
        FieldNCM.setMinimumSize(new java.awt.Dimension(350, 25));
        FieldNCM.setPreferredSize(new java.awt.Dimension(350, 25));

        FieldPreco.setEditable(false);
        FieldPreco.setMinimumSize(new java.awt.Dimension(350, 25));
        FieldPreco.setPreferredSize(new java.awt.Dimension(350, 25));

        FieldCodBarr.setEditable(false);
        FieldCodBarr.setMinimumSize(new java.awt.Dimension(350, 25));
        FieldCodBarr.setPreferredSize(new java.awt.Dimension(350, 25));

        Ativo.setText("Ativo");

        combBoxICMS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o ICMS", "100 -Tributada pelo Simples Nacional com permissão de crédito", "500 - ICMS cobrado anteriormente por substituição tributária (substituído) ou por antecipação " }));
        combBoxICMS.setMaximumSize(new java.awt.Dimension(350, 25));
        combBoxICMS.setMinimumSize(new java.awt.Dimension(350, 25));
        combBoxICMS.setPreferredSize(new java.awt.Dimension(350, 25));
        combBoxICMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combBoxICMSActionPerformed(evt);
            }
        });

        combBoxEMPAC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o tipo de empacotamento", "KG", "UN", "MT", "MT²", "MT³", "PÇ", "PCT" }));
        combBoxEMPAC.setMaximumSize(new java.awt.Dimension(350, 25));
        combBoxEMPAC.setMinimumSize(new java.awt.Dimension(350, 25));
        combBoxEMPAC.setPreferredSize(new java.awt.Dimension(350, 25));
        combBoxEMPAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combBoxEMPACActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ativo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(LabelDescri)
                                .addComponent(LabelEmpacota)
                                .addComponent(LabelID)
                                .addComponent(LabelPreco)
                                .addComponent(LabelICMS)
                                .addComponent(LabelNCM))
                            .addComponent(LabelCodBarr))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(FieldDesc, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
                                    .addComponent(FieldPreco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(FieldNCM, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(combBoxICMS, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(FieldCodBarr, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(FieldID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combBoxEMPAC, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelID)
                    .addComponent(FieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelDescri)
                    .addComponent(FieldDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelEmpacota)
                    .addComponent(combBoxEMPAC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPreco)
                    .addComponent(FieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNCM)
                    .addComponent(FieldNCM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelICMS)
                    .addComponent(combBoxICMS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCodBarr)
                    .addComponent(FieldCodBarr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(Ativo))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(buttonClose)
                .addGap(25, 701, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonClose)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCloseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCloseActionPerformed

    private void FieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldIDActionPerformed

    private void combBoxICMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combBoxICMSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combBoxICMSActionPerformed

    private void combBoxEMPACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combBoxEMPACActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combBoxEMPACActionPerformed

    private void FieldDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldDescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldDescActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JCheckBox Ativo;
    public javax.swing.JTextField FieldCodBarr;
    public javax.swing.JTextField FieldDesc;
    public javax.swing.JTextField FieldID;
    public javax.swing.JTextField FieldNCM;
    public javax.swing.JTextField FieldPreco;
    private javax.swing.JLabel LabelCodBarr;
    private javax.swing.JLabel LabelDescri;
    private javax.swing.JLabel LabelEmpacota;
    private javax.swing.JLabel LabelICMS;
    private javax.swing.JLabel LabelID;
    private javax.swing.JLabel LabelNCM;
    private javax.swing.JLabel LabelPreco;
    private javax.swing.JButton buttonClose;
    public javax.swing.JComboBox<String> combBoxEMPAC;
    public javax.swing.JComboBox<String> combBoxICMS;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
