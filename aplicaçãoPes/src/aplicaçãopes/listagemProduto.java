/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplicaçãopes;

/**
 *
 * @author gusta
 */
public class listagemProduto extends javax.swing.JFrame {
    public static cadastroProduto cadastroproduto;
    public static viewProd viewprod;
    /**
     * Creates new form cadastroProdutoJF
     */
    public listagemProduto() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonHome = new javax.swing.JButton();
        buttonCadProd = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListListagem = new javax.swing.JList<>();
        buttonEditProd = new javax.swing.JButton();
        buttonViewProd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(228, 32));
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));

        buttonHome.setText("HOME");
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });

        buttonCadProd.setText("Cadastrar Produto");
        buttonCadProd.setBorderPainted(false);
        buttonCadProd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonCadProd.setRequestFocusEnabled(false);
        buttonCadProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadProdActionPerformed(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jScrollPane1.setViewportView(jListListagem);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                .addContainerGap())
        );

        buttonEditProd.setText("Editar Produto");
        buttonEditProd.setBorderPainted(false);
        buttonEditProd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonEditProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditProdActionPerformed(evt);
            }
        });

        buttonViewProd.setText("Visualizar Produto");
        buttonViewProd.setBorderPainted(false);
        buttonViewProd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonViewProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonViewProdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonHome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonCadProd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonEditProd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonViewProd)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonHome)
                    .addComponent(buttonCadProd)
                    .addComponent(buttonEditProd)
                    .addComponent(buttonViewProd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
        // TODO add your handling code here:
        AplicaçãoPes.Menu.setVisible(true);
        AplicaçãoPes.Menu.listagemproduto.dispose();
    }//GEN-LAST:event_buttonHomeActionPerformed

    private void buttonCadProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadProdActionPerformed
        // TODO add your handling code here:
        cadastroproduto = new cadastroProduto();
        cadastroproduto.setVisible(true);
    }//GEN-LAST:event_buttonCadProdActionPerformed

    private void buttonEditProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonEditProdActionPerformed

    private void buttonViewProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonViewProdActionPerformed
        // TODO add your handling code here:
        viewprod = new viewProd();
        ctrlViewProd ctrlviewprod = new ctrlViewProd(AplicaçãoPes.Menu.listagemproduto, AplicaçãoPes.Menu.listagemproduto.viewprod);
        ctrlviewprod.show();
        viewprod.setVisible(true);
    }//GEN-LAST:event_buttonViewProdActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCadProd;
    private javax.swing.JButton buttonEditProd;
    private javax.swing.JButton buttonHome;
    public javax.swing.JButton buttonViewProd;
    public javax.swing.JList<String> jListListagem;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
