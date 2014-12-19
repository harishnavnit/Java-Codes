/**
 *
 * @author R. Harish Navnit<harishnavnit@gmail.com>
 */

package stores;

import customer.login.LoginScreen;
import clothes.*;
import java.util.List;
import static java.lang.String.valueOf;
import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Stores extends javax.swing.JFrame {
    
    Connection c = null;
    Statement  s = null;
    ResultSet rs = null;
    ResultSetMetaData meta = null;

    // Instantiating the LoginScreen
    LoginScreen ls = new LoginScreen();

    public Stores() {
        
        // Populate the stores data onto the page on startup
        try {
            populateData();
        }
        catch (Exception e) {
            System.err.println("Customer Not Logged in.");
            e.printStackTrace();
        }
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        storeDetailsPanel = new javax.swing.JPanel();
        storeNameDisplayLabel = new javax.swing.JLabel();
        storeIdLabel = new javax.swing.JLabel();
        storeNameLabel = new javax.swing.JLabel();
        storeAddressLabel = new javax.swing.JLabel();
        storeManagerLabel = new javax.swing.JLabel();
        storeContactNumberLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        enterStoreButton = new javax.swing.JButton();
        viewNextStoreButton = new javax.swing.JButton();
        storeIdInfoLabel = new javax.swing.JLabel();
        storeNameInfoLabel = new javax.swing.JLabel();
        storeAddressInfoLabel = new javax.swing.JLabel();
        storeMangerInfoLabel = new javax.swing.JLabel();
        storeManagerContactNumberInfoLabel = new javax.swing.JLabel();
        storeImageDisplayLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        storeDetailsPanel.setBackground(new java.awt.Color(241, 200, 90));

        storeNameDisplayLabel.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        storeNameDisplayLabel.setText("Store Details");

        storeIdLabel.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        storeIdLabel.setText("Store Id");

        storeNameLabel.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        storeNameLabel.setText("Store Name");

        storeAddressLabel.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        storeAddressLabel.setText("Store Address");

        storeManagerLabel.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        storeManagerLabel.setText("Store Manager");

        storeContactNumberLabel.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        storeContactNumberLabel.setText("Manger Contact Number");

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        enterStoreButton.setText("Enter Store");
        enterStoreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterStoreButtonActionPerformed(evt);
            }
        });

        viewNextStoreButton.setText("Next");
        viewNextStoreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewNextStoreButtonActionPerformed(evt);
            }
        });

        storeIdInfoLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        storeIdInfoLabel.setText("ID");

        storeNameInfoLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        storeNameInfoLabel.setText("Name");

        storeAddressInfoLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        storeAddressInfoLabel.setText("Address");

        storeMangerInfoLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        storeMangerInfoLabel.setText("Manager");

        storeManagerContactNumberInfoLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        storeManagerContactNumberInfoLabel.setText("Contact ");

        storeImageDisplayLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stores/store.jpg"))); // NOI18N

        javax.swing.GroupLayout storeDetailsPanelLayout = new javax.swing.GroupLayout(storeDetailsPanel);
        storeDetailsPanel.setLayout(storeDetailsPanelLayout);
        storeDetailsPanelLayout.setHorizontalGroup(
            storeDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(storeDetailsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(storeNameDisplayLabel)
                .addGap(150, 150, 150))
            .addGroup(storeDetailsPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(storeDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(storeImageDisplayLabel)
                    .addGroup(storeDetailsPanelLayout.createSequentialGroup()
                        .addGroup(storeDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(storeIdInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(storeNameInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(storeAddressInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(storeMangerInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                            .addComponent(storeManagerContactNumberInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(storeDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(storeDetailsPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(storeDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(storeIdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(storeNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(storeAddressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(storeManagerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(storeContactNumberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(storeDetailsPanelLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(enterStoreButton)
                                .addGap(59, 59, 59)
                                .addComponent(viewNextStoreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        storeDetailsPanelLayout.setVerticalGroup(
            storeDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(storeDetailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(storeNameDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(storeImageDisplayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addGap(17, 17, 17)
                .addGroup(storeDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(storeIdLabel)
                    .addComponent(storeIdInfoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(storeDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(storeNameLabel)
                    .addComponent(storeNameInfoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(storeDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(storeAddressLabel)
                    .addComponent(storeAddressInfoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(storeDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(storeManagerLabel)
                    .addComponent(storeMangerInfoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(storeDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(storeContactNumberLabel)
                    .addComponent(storeManagerContactNumberInfoLabel))
                .addGap(18, 18, 18)
                .addGroup(storeDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(enterStoreButton)
                    .addComponent(viewNextStoreButton))
                .addGap(32, 32, 32))
        );

        getContentPane().add(storeDetailsPanel, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        new LoginScreen().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void enterStoreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterStoreButtonActionPerformed
        new clothes().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_enterStoreButtonActionPerformed

    private void viewNextStoreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewNextStoreButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewNextStoreButtonActionPerformed

    public boolean establishConnection() {
        
        /* Attempt connecting to the Data Base */
            try {
                // Register the driver
                Class.forName("org.postgresql.Driver");
                c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydb", "harish", "earlscourt");
            }
            catch (Exception e) {
                e.printStackTrace();
                System.err.print("Unable to connect to server"
                        + "\nPlease contact the administrator");
                System.err.println("Connecting to DataBase Failed");
                return false;
            }
            System.out.println("Connected to DataBase successfully");
            return true;
    }
    
    public void populateData() {

        List<List<String>> rowList = new LinkedList<List<String>> ();
        String sql = "select * from stores";

        if (establishConnection()) {
            
            /* Reference : http://goo.gl/ojw0sU */
            
            try {
                // Create and execute query
                s = c.createStatement();
                rs = s.executeQuery(sql);
                meta = rs.getMetaData();
                final int col_count = meta.getColumnCount();
                
                while (rs.next()) {
                    
                    List<String> columnList = new LinkedList<String> ();
                    // Add columns to the row
                    rowList.add(columnList);
                    
                    // Update the columns with respective data
                    for (int col = 1; col <= col_count; col++) {
                        Object value = rs.getObject(col);
                        
                        if (value != null) {
                            columnList.add(String.valueOf(value));
                        }
                        else {
                            // To keep the columns in sync
                            columnList.add(null);
                        }
                    }
                }
                
                // Close all open connections
                s.close();
                c.close();
                rs.close();
                
                // Load the stores table
                loadStoresTable(rowList);
                
            } catch (Exception e) {
                System.err.println("Failed to populate data");
                e.printStackTrace();
            }
        }
        else {
            System.err.println("\nConnection to Database failed ! ");
        }
    }
    
    public void loadStoresTable(List<List<String>> r_list) {

        for(int i = 0; i < r_list.size(); i++) {
            
            int j = 0;
            List<String> cols = r_list.get(i);
            
            do  {
                
                String ch;
                Scanner in = new Scanner(System.in);
                System.out.print("\nNext ? ");
                ch = in.nextLine();
                
                if (ch.equals("Y") || ch.equals("y"))
                    ++j;
                
                
                String test;
                test = cols.get(i);
                System.out.print("\nElement at " + j + " = " + cols.get(j));
                
                if (j % 5 == 0)     storeIdLabel.setText(test);
                if (j % 5 == 1)     storeNameLabel.setText(test);
                if (j % 5 == 2)     storeAddressLabel.setText(test);
                if (j % 5 == 3)     storeManagerLabel.setText(test);
                if (j % 5 == 4)     storeContactNumberLabel.setText(test);
              
            }   while (j < cols.size());
            
            /** for loop works, prints content on the console
            for (j = 0 ; j < cols.size(); j++) {
                System.out.print("\nElement at " + j + " = " + cols.get(j));
            }*/
        }
    }
    
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
            java.util.logging.Logger.getLogger(Stores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton enterStoreButton;
    private javax.swing.JLabel storeAddressInfoLabel;
    private javax.swing.JLabel storeAddressLabel;
    private javax.swing.JLabel storeContactNumberLabel;
    private javax.swing.JPanel storeDetailsPanel;
    private javax.swing.JLabel storeIdInfoLabel;
    private javax.swing.JLabel storeIdLabel;
    private javax.swing.JLabel storeImageDisplayLabel;
    private javax.swing.JLabel storeManagerContactNumberInfoLabel;
    private javax.swing.JLabel storeManagerLabel;
    private javax.swing.JLabel storeMangerInfoLabel;
    private javax.swing.JLabel storeNameDisplayLabel;
    private javax.swing.JLabel storeNameInfoLabel;
    private javax.swing.JLabel storeNameLabel;
    private javax.swing.JButton viewNextStoreButton;
    // End of variables declaration//GEN-END:variables

}
