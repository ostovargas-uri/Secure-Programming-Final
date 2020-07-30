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
public class AdminChangePersonalInfoFrame extends javax.swing.JFrame {
    private PasswordManager pwdmg;
    private Connection connection;
    private User user;
    
    /**
     * Creates new form ChangePersonalInfoFrame
     */
    public AdminChangePersonalInfoFrame(User user, Connection connection) {
        this.user = user;
        this.connection = connection;
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
        adminChangePersonalInfoBackButton = new javax.swing.JButton();
        adminChangePersonalInfoStreetAddressLabel = new javax.swing.JLabel();
        adminChangePersonalInfoStreetAddressField = new javax.swing.JTextField();
        adminChangePersonalInfoTownLabel = new javax.swing.JLabel();
        adminChangePersonalInfoTownField = new javax.swing.JTextField();
        adminChangePersonalInfoStateLabel = new javax.swing.JLabel();
        adminChangePersonalInfoStateMenu = new javax.swing.JComboBox<>();
        adminChangePersonalInfoEmailAddressLabel = new javax.swing.JLabel();
        adminChangePersonalInfoEmailAddressField = new javax.swing.JTextField();
        adminChangePersonalInfoPasswordLabel = new javax.swing.JLabel();
        adminChangePersonalInfoPasswordField = new javax.swing.JPasswordField();
        adminChangePersonalInfoConfirmPasswordLabel = new javax.swing.JLabel();
        adminChangePersonalInfoConfirmPasswordField = new javax.swing.JPasswordField();
        adminChangePersonalInfoSecurityQuestionLabel = new javax.swing.JLabel();
        adminChangePersonalInfoSecurityQuestionMenu = new javax.swing.JComboBox<>();
        adminChangePersonalInfoSecurityQuestionAnswerLabel = new javax.swing.JLabel();
        adminChangePersonalInfoTitleLabel = new javax.swing.JLabel();
        adminChangePersonalInfoChangeSecurityQuestionRadioButton = new javax.swing.JRadioButton();
        adminChangePersonalInfoSecurityQuestionAnswerField = new javax.swing.JTextField();
        adminChangePersonalInfoChangePasswordRadioButton = new javax.swing.JRadioButton();
        adminChangePersonalInfoSubmitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        adminChangePersonalInfoBackButton.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        adminChangePersonalInfoBackButton.setText("Back");
        adminChangePersonalInfoBackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminChangePersonalInfoBackButtonMouseClicked(evt);
            }
        });

        adminChangePersonalInfoStreetAddressLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        adminChangePersonalInfoStreetAddressLabel.setForeground(new java.awt.Color(255, 255, 255));
        adminChangePersonalInfoStreetAddressLabel.setText("Street Address:");

        adminChangePersonalInfoTownLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        adminChangePersonalInfoTownLabel.setForeground(new java.awt.Color(255, 255, 255));
        adminChangePersonalInfoTownLabel.setText("Town:");

        adminChangePersonalInfoStateLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        adminChangePersonalInfoStateLabel.setForeground(new java.awt.Color(255, 255, 255));
        adminChangePersonalInfoStateLabel.setText("State:");

        adminChangePersonalInfoStateMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select State...", "Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "District of Columbia", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming" }));

        adminChangePersonalInfoEmailAddressLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        adminChangePersonalInfoEmailAddressLabel.setForeground(new java.awt.Color(255, 255, 255));
        adminChangePersonalInfoEmailAddressLabel.setText("Email Address:");

        adminChangePersonalInfoPasswordLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        adminChangePersonalInfoPasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        adminChangePersonalInfoPasswordLabel.setText("New Password (must be between 8 to 50 characters):");

        adminChangePersonalInfoConfirmPasswordLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        adminChangePersonalInfoConfirmPasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        adminChangePersonalInfoConfirmPasswordLabel.setText("Confirm New Password:");

        adminChangePersonalInfoSecurityQuestionLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        adminChangePersonalInfoSecurityQuestionLabel.setForeground(new java.awt.Color(255, 255, 255));
        adminChangePersonalInfoSecurityQuestionLabel.setText("New Security Question:");

        adminChangePersonalInfoSecurityQuestionMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Security Question...", "What is the name of the road you grew up on?", "What is your mother’s maiden name?", "What was the name of your first pet?" }));

        adminChangePersonalInfoSecurityQuestionAnswerLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        adminChangePersonalInfoSecurityQuestionAnswerLabel.setForeground(new java.awt.Color(255, 255, 255));
        adminChangePersonalInfoSecurityQuestionAnswerLabel.setText("New Security Question Answer:");

        adminChangePersonalInfoTitleLabel.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        adminChangePersonalInfoTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        adminChangePersonalInfoTitleLabel.setText("Update Personal/Account Info");

        adminChangePersonalInfoChangeSecurityQuestionRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        adminChangePersonalInfoChangeSecurityQuestionRadioButton.setText("I am changing my security question");

        adminChangePersonalInfoChangePasswordRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        adminChangePersonalInfoChangePasswordRadioButton.setText("I am changing my password");

        adminChangePersonalInfoSubmitButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        adminChangePersonalInfoSubmitButton.setText("Submit");
        adminChangePersonalInfoSubmitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminChangePersonalInfoSubmitButtonMouseClicked(evt);
            }
        });
        
        /*  DB STUFF */
        try {
            String psQuery = 
                    "SELECT address, city, email FROM employees WHERE userid = ?";
            
            PreparedStatement ps = connection.prepareStatement(psQuery);
            
            ps.setInt(1, user.getUserID());
            
            ResultSet personalInfo = ps.executeQuery();
            personalInfo.next();
            
            adminChangePersonalInfoStreetAddressField.setText(personalInfo.getString(1));
            adminChangePersonalInfoTownField.setText(personalInfo.getString(2));
            adminChangePersonalInfoEmailAddressField.setText(personalInfo.getString(3));
            
        }
        catch (Exception e) {
            
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(adminChangePersonalInfoTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adminChangePersonalInfoBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(adminChangePersonalInfoConfirmPasswordLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(adminChangePersonalInfoConfirmPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                                .addGap(226, 226, 226))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(adminChangePersonalInfoPasswordLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(adminChangePersonalInfoPasswordField))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(adminChangePersonalInfoSecurityQuestionLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(adminChangePersonalInfoSecurityQuestionMenu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(adminChangePersonalInfoStreetAddressLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(adminChangePersonalInfoStreetAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(adminChangePersonalInfoTownLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(adminChangePersonalInfoStateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(27, 27, 27)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(adminChangePersonalInfoTownField, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(adminChangePersonalInfoStateMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(adminChangePersonalInfoEmailAddressLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(adminChangePersonalInfoEmailAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(adminChangePersonalInfoChangePasswordRadioButton)
                                    .addComponent(adminChangePersonalInfoChangeSecurityQuestionRadioButton)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(adminChangePersonalInfoSecurityQuestionAnswerLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(adminChangePersonalInfoSubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(adminChangePersonalInfoSecurityQuestionAnswerField, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adminChangePersonalInfoBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminChangePersonalInfoTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminChangePersonalInfoStreetAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminChangePersonalInfoStreetAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminChangePersonalInfoTownLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminChangePersonalInfoTownField, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminChangePersonalInfoStateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminChangePersonalInfoStateMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminChangePersonalInfoEmailAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminChangePersonalInfoEmailAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(140, 140, 140)
                .addComponent(adminChangePersonalInfoChangePasswordRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminChangePersonalInfoPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminChangePersonalInfoPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminChangePersonalInfoConfirmPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminChangePersonalInfoConfirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminChangePersonalInfoChangeSecurityQuestionRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adminChangePersonalInfoSecurityQuestionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminChangePersonalInfoSecurityQuestionMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminChangePersonalInfoSecurityQuestionAnswerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminChangePersonalInfoSecurityQuestionAnswerField, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(64, 64, 64)
                .addComponent(adminChangePersonalInfoSubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
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

    private void adminChangePersonalInfoBackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminChangePersonalInfoBackButtonMouseClicked
        this.remove(this);
        this.setVisible(false);
        AdminDashBoardFrame adminDashBoardpage = new AdminDashBoardFrame(user, connection);
        adminDashBoardpage.setVisible(true);
    }//GEN-LAST:event_adminChangePersonalInfoBackButtonMouseClicked

    private void adminChangePersonalInfoSubmitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminChangePersonalInfoSubmitButtonMouseClicked
        // updates fields in DB if need be,
        // also checks if radial buttons been selected or not and updates those fields
        // in the DB if need be as well. Then goes back to user dashboard
        try {
            String psUpdateQuery = 
                    "UPDATE employees SET " +
                    "address = ?, " +
                    "city = ?, " +
                    "state = ?, " +
                    "email = ? " +
                    "WHERE userid = ?";
            
            PreparedStatement ps = connection.prepareStatement(psUpdateQuery);
            
            ps.setString(1, adminChangePersonalInfoStreetAddressField.getText());
            ps.setString(2, adminChangePersonalInfoTownField.getText());
            ps.setString(3, adminChangePersonalInfoStateMenu.getSelectedItem().toString());
            ps.setString(4, adminChangePersonalInfoEmailAddressField.getText());
            ps.setInt(5, user.getUserID());
            
            ps.executeUpdate();
            
            String pwd = new String(adminChangePersonalInfoPasswordField.getPassword());
            String c_pwd = new String(adminChangePersonalInfoConfirmPasswordField.getPassword());
            
            if (adminChangePersonalInfoChangePasswordRadioButton.isSelected()) {
                if (pwd.equals(c_pwd)) {
                    pwdmg.updatePassword(user.getUserID(), pwd);
                }
            }
            if (adminChangePersonalInfoChangeSecurityQuestionRadioButton.isSelected()) {
                if (
                        adminChangePersonalInfoSecurityQuestionMenu.getSelectedIndex() > 0 && 
                        !adminChangePersonalInfoSecurityQuestionAnswerField.getText().isEmpty()
                    ) {
                    psUpdateQuery = 
                            "UPDATE users SET " +
                            "question = ?, " +
                            "answer = ? " +
                            "WHERE userid = ?";
                    
                    ps = connection.prepareStatement(psUpdateQuery);
                    
                    ps.setString(1, adminChangePersonalInfoSecurityQuestionMenu.getSelectedItem().toString());
                    ps.setString(2, adminChangePersonalInfoSecurityQuestionAnswerField.getText());
                    ps.setInt(3, user.getUserID());
                    
                    ps.executeUpdate();
                }
            }
        }
        catch (Exception e) {
            
        }
        
        this.remove(this);
        this.setVisible(false);
        AdminDashBoardFrame adminDashBoardpage = new AdminDashBoardFrame(user, connection);
        adminDashBoardpage.setVisible(true);
    }//GEN-LAST:event_adminChangePersonalInfoSubmitButtonMouseClicked

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
//            java.util.logging.Logger.getLogger(ChangePersonalInfoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ChangePersonalInfoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ChangePersonalInfoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ChangePersonalInfoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ChangePersonalInfoFrame().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminChangePersonalInfoBackButton;
    private javax.swing.JRadioButton adminChangePersonalInfoChangePasswordRadioButton;
    private javax.swing.JRadioButton adminChangePersonalInfoChangeSecurityQuestionRadioButton;
    private javax.swing.JPasswordField adminChangePersonalInfoConfirmPasswordField;
    private javax.swing.JLabel adminChangePersonalInfoConfirmPasswordLabel;
    private javax.swing.JTextField adminChangePersonalInfoEmailAddressField;
    private javax.swing.JLabel adminChangePersonalInfoEmailAddressLabel;
    private javax.swing.JPasswordField adminChangePersonalInfoPasswordField;
    private javax.swing.JLabel adminChangePersonalInfoPasswordLabel;
    private javax.swing.JTextField adminChangePersonalInfoSecurityQuestionAnswerField;
    private javax.swing.JLabel adminChangePersonalInfoSecurityQuestionAnswerLabel;
    private javax.swing.JLabel adminChangePersonalInfoSecurityQuestionLabel;
    private javax.swing.JComboBox<String> adminChangePersonalInfoSecurityQuestionMenu;
    private javax.swing.JLabel adminChangePersonalInfoStateLabel;
    private javax.swing.JComboBox<String> adminChangePersonalInfoStateMenu;
    private javax.swing.JTextField adminChangePersonalInfoStreetAddressField;
    private javax.swing.JLabel adminChangePersonalInfoStreetAddressLabel;
    private javax.swing.JButton adminChangePersonalInfoSubmitButton;
    private javax.swing.JLabel adminChangePersonalInfoTitleLabel;
    private javax.swing.JTextField adminChangePersonalInfoTownField;
    private javax.swing.JLabel adminChangePersonalInfoTownLabel;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
