/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplicaçãopes;

/**
 *
 * @author gusta
 */
public class menu extends javax.swing.JFrame {
    public static visualizarProduto visualizarproduto;
    /**
     * Creates new form menu
     */
    public menu() {
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

        jPanel1 = new javax.swing.JPanel();
        buttonViwProd = new javax.swing.JButton();
        buttonViwClient = new javax.swing.JButton();
        buttonViwRequests = new javax.swing.JButton();
        buttonViwEnterprise = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setLocation(new java.awt.Point(228, 32));
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setSize(new java.awt.Dimension(800, 600));

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setMaximumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 400));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));

        buttonViwProd.setText("Produtos");
        buttonViwProd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonViwProd.setMaximumSize(new java.awt.Dimension(250, 50));
        buttonViwProd.setMinimumSize(new java.awt.Dimension(250, 50));
        buttonViwProd.setPreferredSize(new java.awt.Dimension(250, 50));
        buttonViwProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonViwProdActionPerformed(evt);
            }
        });

        buttonViwClient.setText("Clientes");
        buttonViwClient.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonViwClient.setMaximumSize(new java.awt.Dimension(250, 50));
        buttonViwClient.setMinimumSize(new java.awt.Dimension(250, 50));
        buttonViwClient.setPreferredSize(new java.awt.Dimension(250, 50));
        buttonViwClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonViwClientActionPerformed(evt);
            }
        });

        buttonViwRequests.setText("Pedidos");
        buttonViwRequests.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonViwRequests.setMaximumSize(new java.awt.Dimension(250, 50));
        buttonViwRequests.setMinimumSize(new java.awt.Dimension(250, 50));
        buttonViwRequests.setPreferredSize(new java.awt.Dimension(250, 50));
        buttonViwRequests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonViwRequestsActionPerformed(evt);
            }
        });

        buttonViwEnterprise.setText("Empresas");
        buttonViwEnterprise.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonViwEnterprise.setMaximumSize(new java.awt.Dimension(250, 50));
        buttonViwEnterprise.setMinimumSize(new java.awt.Dimension(250, 50));
        buttonViwEnterprise.setPreferredSize(new java.awt.Dimension(250, 50));
        buttonViwEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonViwEnterpriseActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("DNote <ver 1.22474487139>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(168, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonViwProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonViwClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonViwRequests, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonViwEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(176, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonViwProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(buttonViwClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(buttonViwRequests, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(buttonViwEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonViwProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonViwProdActionPerformed
        // TODO add your handling code here:
        visualizarproduto = new visualizarProduto();
        visualizarproduto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonViwProdActionPerformed

    private void buttonViwClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonViwClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonViwClientActionPerformed

    private void buttonViwRequestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonViwRequestsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonViwRequestsActionPerformed

    private void buttonViwEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonViwEnterpriseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonViwEnterpriseActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonViwClient;
    private javax.swing.JButton buttonViwEnterprise;
    private javax.swing.JButton buttonViwProd;
    private javax.swing.JButton buttonViwRequests;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
