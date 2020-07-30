/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;

/**
 *
 * @author ryansmac
 */
public class ConfirmPayEmployeeFrame extends javax.swing.JFrame {
    private Connection connection;
    private User user;
    
    /**
     * Creates new form ConfirmRemoveFrame
     */
    public ConfirmPayEmployeeFrame(User user, Connection connection) {
        this.connection = connection;
        this.user = user;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify
     * this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        confirmPaymentLabel = new javax.swing.JLabel();
        confirmPaymentYesButton = new javax.swing.JButton();
        confirmPaymentNoButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        confirmPaymentLabel.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        confirmPaymentLabel.setForeground(new java.awt.Color(255, 255, 255));
        confirmPaymentLabel.setText("Confirm payment?");

        confirmPaymentYesButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        confirmPaymentYesButton.setText("Yes");
        confirmPaymentYesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmPaymentYesButtonMouseClicked(evt);
            }
        });

        confirmPaymentNoButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        confirmPaymentNoButton.setText("No");
        confirmPaymentNoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmPaymentNoButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(confirmPaymentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(330, 330, 330))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(confirmPaymentYesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(confirmPaymentNoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 254, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(confirmPaymentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmPaymentYesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmPaymentNoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(381, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmPaymentYesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmPaymentYesButtonMouseClicked
        // will "distribute funds" to employee by means of subtracting from companyFunds whatever is
        // owed to employee if the admin determines the hours are valid
        // will add to finance log a record of transaction and amount date etc
        this.remove(this);
        this.setVisible(false);
        ViewAndPayoutEmployeeTimeCardsFrame viewAndPayoutEmployeeTimeCardsPage = new ViewAndPayoutEmployeeTimeCardsFrame(user, connection);
        viewAndPayoutEmployeeTimeCardsPage.setVisible(true);
    }//GEN-LAST:event_confirmPaymentYesButtonMouseClicked

    private void confirmPaymentNoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmPaymentNoButtonMouseClicked
        this.remove(this);
        this.setVisible(false);
        ViewAndPayoutEmployeeTimeCardsFrame viewAndPayoutEmployeeTimeCardsPage = new ViewAndPayoutEmployeeTimeCardsFrame(user, connection);
        viewAndPayoutEmployeeTimeCardsPage.setVisible(true);
    }//GEN-LAST:event_confirmPaymentNoButtonMouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ConfirmRemoveFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ConfirmRemoveFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ConfirmRemoveFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ConfirmRemoveFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ConfirmRemoveFrame().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel confirmPaymentLabel;
    private javax.swing.JButton confirmPaymentNoButton;
    private javax.swing.JButton confirmPaymentYesButton;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
