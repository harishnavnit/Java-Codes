/**
 *
 * @author R. Harish Navnit <harishnavnit@gmail.com>
 */

package clothes;

import java.awt.Color;
import java.sql.*;
import javax.swing.JFrame;
import stores.Stores;

public class clothes extends javax.swing.JFrame {

    // SQL variables
    Connection c = null;
    Statement  s = null;
    ResultSet rs = null;
    
    public clothes() {
        initComponents();
        this.setBackground(Color.yellow);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        storePanel = new javax.swing.JPanel();
        clothIdInfoLabel = new javax.swing.JLabel();
        clothIdLabel = new javax.swing.JLabel();
        clothTypeInfoLabel = new javax.swing.JLabel();
        clothTypeLabel = new javax.swing.JLabel();
        clothColorInfoLabel = new javax.swing.JLabel();
        clothColorLabel = new javax.swing.JLabel();
        clothSizeInfoLabel = new javax.swing.JLabel();
        clothSizeLabel = new javax.swing.JLabel();
        clothPriceInfoLabel = new javax.swing.JLabel();
        clothPriceLabel = new javax.swing.JLabel();
        clothBackButton = new javax.swing.JButton();
        purchaseButton = new javax.swing.JButton();
        clothNextButton = new javax.swing.JButton();
        clothDisplayLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        storePanel.setBackground(new java.awt.Color(210, 231, 175));

        clothIdInfoLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        clothIdInfoLabel.setText("Shipment");

        clothIdLabel.setText("Id");

        clothTypeInfoLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        clothTypeInfoLabel.setText("Type");

        clothTypeLabel.setText("Type");

        clothColorInfoLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        clothColorInfoLabel.setText("Color");

        clothColorLabel.setText("Color");

        clothSizeInfoLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        clothSizeInfoLabel.setText("Size");

        clothSizeLabel.setText("Size");

        clothPriceInfoLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        clothPriceInfoLabel.setText("Price");

        clothPriceLabel.setText("Price");

        clothBackButton.setText("Back");
        clothBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clothBackButtonActionPerformed(evt);
            }
        });

        purchaseButton.setText("Purchase");
        purchaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseButtonActionPerformed(evt);
            }
        });

        clothNextButton.setText("View Next");

        clothDisplayLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stores/stack-o-shirts.jpg"))); // NOI18N

        javax.swing.GroupLayout storePanelLayout = new javax.swing.GroupLayout(storePanel);
        storePanel.setLayout(storePanelLayout);
        storePanelLayout.setHorizontalGroup(
            storePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(storePanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(storePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(storePanelLayout.createSequentialGroup()
                        .addGroup(storePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(clothIdInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(clothTypeInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clothColorInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clothSizeInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(storePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(clothPriceInfoLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, storePanelLayout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addComponent(clothBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(storePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(storePanelLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(purchaseButton)
                                .addGap(36, 36, 36)
                                .addComponent(clothNextButton))
                            .addGroup(storePanelLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(storePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(clothIdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(clothSizeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(clothColorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                    .addComponent(clothTypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(clothPriceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(clothDisplayLabel))
                .addGap(0, 50, Short.MAX_VALUE))
        );
        storePanelLayout.setVerticalGroup(
            storePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(storePanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(clothDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(storePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clothIdInfoLabel)
                    .addComponent(clothIdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(storePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clothTypeInfoLabel)
                    .addComponent(clothTypeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(storePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clothColorInfoLabel)
                    .addComponent(clothColorLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(storePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clothSizeLabel)
                    .addComponent(clothSizeInfoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(storePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clothPriceInfoLabel)
                    .addComponent(clothPriceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(storePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clothBackButton)
                    .addComponent(purchaseButton)
                    .addComponent(clothNextButton))
                .addGap(33, 33, 33))
        );

        getContentPane().add(storePanel, "card3");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void purchaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseButtonActionPerformed
        new purchaseHistory().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_purchaseButtonActionPerformed

    private void clothBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clothBackButtonActionPerformed
        new Stores().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_clothBackButtonActionPerformed

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
            java.util.logging.Logger.getLogger(clothes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(clothes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(clothes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(clothes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new clothes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clothBackButton;
    private javax.swing.JLabel clothColorInfoLabel;
    private javax.swing.JLabel clothColorLabel;
    private javax.swing.JLabel clothDisplayLabel;
    private javax.swing.JLabel clothIdInfoLabel;
    private javax.swing.JLabel clothIdLabel;
    private javax.swing.JButton clothNextButton;
    private javax.swing.JLabel clothPriceInfoLabel;
    private javax.swing.JLabel clothPriceLabel;
    private javax.swing.JLabel clothSizeInfoLabel;
    private javax.swing.JLabel clothSizeLabel;
    private javax.swing.JLabel clothTypeInfoLabel;
    private javax.swing.JLabel clothTypeLabel;
    private javax.swing.JButton purchaseButton;
    private javax.swing.JPanel storePanel;
    // End of variables declaration//GEN-END:variables

}
