package clothes;

/**
 *
 * @author R. Harish Navnit<harishnavnit@gmail.com>
 */
public class purchaseHistory extends javax.swing.JFrame {

    public purchaseHistory() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        purchaseHistoryPanel = new javax.swing.JPanel();
        partingImageDisplayLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        shopAgainButton = new javax.swing.JButton();
        leaveStoreButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        purchaseHistoryPanel.setBackground(new java.awt.Color(175, 184, 186));

        partingImageDisplayLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clothes/thanks.png"))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        shopAgainButton.setText("Shop Again");
        shopAgainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shopAgainButtonActionPerformed(evt);
            }
        });

        leaveStoreButton.setText("Leave Store");
        leaveStoreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaveStoreButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout purchaseHistoryPanelLayout = new javax.swing.GroupLayout(purchaseHistoryPanel);
        purchaseHistoryPanel.setLayout(purchaseHistoryPanelLayout);
        purchaseHistoryPanelLayout.setHorizontalGroup(
            purchaseHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(purchaseHistoryPanelLayout.createSequentialGroup()
                .addGroup(purchaseHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, purchaseHistoryPanelLayout.createSequentialGroup()
                        .addContainerGap(13, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(purchaseHistoryPanelLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(partingImageDisplayLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(purchaseHistoryPanelLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(shopAgainButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(leaveStoreButton)
                        .addGap(85, 85, 85)))
                .addContainerGap())
        );
        purchaseHistoryPanelLayout.setVerticalGroup(
            purchaseHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(purchaseHistoryPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(partingImageDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addGroup(purchaseHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shopAgainButton)
                    .addComponent(leaveStoreButton))
                .addContainerGap(119, Short.MAX_VALUE))
        );

        getContentPane().add(purchaseHistoryPanel, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void leaveStoreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leaveStoreButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_leaveStoreButtonActionPerformed

    private void shopAgainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shopAgainButtonActionPerformed
        new stores.Stores().setVisible(true);
        this.setVisible(false);        
    }//GEN-LAST:event_shopAgainButtonActionPerformed

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
            java.util.logging.Logger.getLogger(purchaseHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(purchaseHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(purchaseHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(purchaseHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new purchaseHistory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton leaveStoreButton;
    private javax.swing.JLabel partingImageDisplayLabel;
    private javax.swing.JPanel purchaseHistoryPanel;
    private javax.swing.JButton shopAgainButton;
    // End of variables declaration//GEN-END:variables

}
