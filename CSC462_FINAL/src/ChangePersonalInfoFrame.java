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
public class ChangePersonalInfoFrame extends javax.swing.JFrame {
    private PasswordManager pwdmg;
    private Connection connection;
    private User user;
    
    /**
     * Creates new form ChangePersonalInfoFrame
     */
    public ChangePersonalInfoFrame(User user, Connection connection) {
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
        changePersonalInfoBackButton = new javax.swing.JButton();
        changePersonalInfoStreetAddressLabel = new javax.swing.JLabel();
        changePersonalInfoStreetAddressField = new javax.swing.JTextField();
        changePersonalInfoTownLabel = new javax.swing.JLabel();
        changePersonalInfoTownField = new javax.swing.JTextField();
        changePersonalInfoStateLabel = new javax.swing.JLabel();
        changePersonalInfoStateMenu = new javax.swing.JComboBox<>();
        changePersonalInfoEmailAddressLabel = new javax.swing.JLabel();
        changePersonalInfoEmailAddressField = new javax.swing.JTextField();
        changePersonalInfoPasswordLabel = new javax.swing.JLabel();
        changePersonalInfoPasswordField = new javax.swing.JPasswordField();
        changePersonalInfoConfirmPasswordLabel = new javax.swing.JLabel();
        changePersonalInfoConfirmPasswordField = new javax.swing.JPasswordField();
        changePersonalInfoSecurityQuestionLabel = new javax.swing.JLabel();
        changePersonalInfoSecurityQuestionMenu = new javax.swing.JComboBox<>();
        changePersonalInfoSecurityQuestionAnswerLabel = new javax.swing.JLabel();
        changePersonalInfoTitleLabel = new javax.swing.JLabel();
        changePersonalInfoChangeSecurityQuestionRadioButton = new javax.swing.JRadioButton();
        changePersonalInfoSecurityQuestionAnswerField = new javax.swing.JTextField();
        changePersonalInfoChangePasswordRadioButton = new javax.swing.JRadioButton();
        changePersonalInfoSubmitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        changePersonalInfoBackButton.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        changePersonalInfoBackButton.setText("Back");
        changePersonalInfoBackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changePersonalInfoBackButtonMouseClicked(evt);
            }
        });

        changePersonalInfoStreetAddressLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        changePersonalInfoStreetAddressLabel.setForeground(new java.awt.Color(255, 255, 255));
        changePersonalInfoStreetAddressLabel.setText("Street Address:");

        changePersonalInfoTownLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        changePersonalInfoTownLabel.setForeground(new java.awt.Color(255, 255, 255));
        changePersonalInfoTownLabel.setText("Town:");

        changePersonalInfoStateLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        changePersonalInfoStateLabel.setForeground(new java.awt.Color(255, 255, 255));
        changePersonalInfoStateLabel.setText("State:");

        changePersonalInfoStateMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select State...", "Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "District of Columbia", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming" }));

        changePersonalInfoEmailAddressLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        changePersonalInfoEmailAddressLabel.setForeground(new java.awt.Color(255, 255, 255));
        changePersonalInfoEmailAddressLabel.setText("Email Address:");

        changePersonalInfoPasswordLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        changePersonalInfoPasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        changePersonalInfoPasswordLabel.setText("New Password (must be between 8 to 50 characters):");

        changePersonalInfoConfirmPasswordLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        changePersonalInfoConfirmPasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        changePersonalInfoConfirmPasswordLabel.setText("Confirm New Password:");

        changePersonalInfoSecurityQuestionLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        changePersonalInfoSecurityQuestionLabel.setForeground(new java.awt.Color(255, 255, 255));
        changePersonalInfoSecurityQuestionLabel.setText("New Security Question:");

        changePersonalInfoSecurityQuestionMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Security Question...", "What is the name of the road you grew up on?", "What is your mother’s maiden name?", "What was the name of your first pet?" }));

        changePersonalInfoSecurityQuestionAnswerLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        changePersonalInfoSecurityQuestionAnswerLabel.setForeground(new java.awt.Color(255, 255, 255));
        changePersonalInfoSecurityQuestionAnswerLabel.setText("New Security Question Answer:");

        changePersonalInfoTitleLabel.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        changePersonalInfoTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        changePersonalInfoTitleLabel.setText("Update Personal/Account Info");

        changePersonalInfoChangeSecurityQuestionRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        changePersonalInfoChangeSecurityQuestionRadioButton.setText("I am changing my security question");

        changePersonalInfoChangePasswordRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        changePersonalInfoChangePasswordRadioButton.setText("I am changing my password");

        changePersonalInfoSubmitButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        changePersonalInfoSubmitButton.setText("Submit");
        changePersonalInfoSubmitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changePersonalInfoSubmitButtonMouseClicked(evt);
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
            
            changePersonalInfoStreetAddressField.setText(personalInfo.getString(1));
            changePersonalInfoTownField.setText(personalInfo.getString(2));
            changePersonalInfoEmailAddressField.setText(personalInfo.getString(3));
            
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
                        .addComponent(changePersonalInfoTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(changePersonalInfoBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(changePersonalInfoConfirmPasswordLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(changePersonalInfoConfirmPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                                .addGap(226, 226, 226))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(changePersonalInfoPasswordLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(changePersonalInfoPasswordField))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(changePersonalInfoSecurityQuestionLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(changePersonalInfoSecurityQuestionMenu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(changePersonalInfoStreetAddressLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(changePersonalInfoStreetAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(changePersonalInfoTownLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(changePersonalInfoStateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(27, 27, 27)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(changePersonalInfoTownField, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(changePersonalInfoStateMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(changePersonalInfoEmailAddressLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(changePersonalInfoEmailAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(changePersonalInfoChangePasswordRadioButton)
                                    .addComponent(changePersonalInfoChangeSecurityQuestionRadioButton)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(changePersonalInfoSecurityQuestionAnswerLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(changePersonalInfoSubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(changePersonalInfoSecurityQuestionAnswerField, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(changePersonalInfoBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changePersonalInfoTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changePersonalInfoStreetAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changePersonalInfoStreetAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changePersonalInfoTownLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changePersonalInfoTownField, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changePersonalInfoStateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changePersonalInfoStateMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changePersonalInfoEmailAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changePersonalInfoEmailAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(140, 140, 140)
                .addComponent(changePersonalInfoChangePasswordRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changePersonalInfoPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changePersonalInfoPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changePersonalInfoConfirmPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changePersonalInfoConfirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(changePersonalInfoChangeSecurityQuestionRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(changePersonalInfoSecurityQuestionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changePersonalInfoSecurityQuestionMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changePersonalInfoSecurityQuestionAnswerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changePersonalInfoSecurityQuestionAnswerField, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(64, 64, 64)
                .addComponent(changePersonalInfoSubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void changePersonalInfoBackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changePersonalInfoBackButtonMouseClicked
        this.remove(this);
        this.setVisible(false);
        UserDashBoardFrame userDashBoardpage = new UserDashBoardFrame(user, connection);
        userDashBoardpage.setVisible(true);
    }//GEN-LAST:event_changePersonalInfoBackButtonMouseClicked

    private void changePersonalInfoSubmitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changePersonalInfoSubmitButtonMouseClicked
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
            
            ps.setString(1, changePersonalInfoStreetAddressField.getText());
            ps.setString(2, changePersonalInfoTownField.getText());
            ps.setString(3, changePersonalInfoStateMenu.getSelectedItem().toString());
            ps.setString(4, changePersonalInfoEmailAddressField.getText());
            ps.setInt(5, user.getUserID());
            
            ps.executeUpdate();
            
            String pwd = new String(changePersonalInfoPasswordField.getPassword());
            String c_pwd = new String(changePersonalInfoConfirmPasswordField.getPassword());
            
            if (changePersonalInfoChangePasswordRadioButton.isSelected()) {
                if (pwd.equals(c_pwd)) {
                    pwdmg.updatePassword(user.getUserID(), pwd);
                }
            }
            if (changePersonalInfoChangeSecurityQuestionRadioButton.isSelected()) {
                if (
                        changePersonalInfoSecurityQuestionMenu.getSelectedIndex() > 0 && 
                        !changePersonalInfoSecurityQuestionAnswerField.getText().isEmpty()
                    ) {
                    psUpdateQuery = 
                            "UPDATE users SET " +
                            "question = ?, " +
                            "answer = ? " +
                            "WHERE userid = ?";
                    
                    ps = connection.prepareStatement(psUpdateQuery);
                    
                    ps.setString(1, changePersonalInfoSecurityQuestionMenu.getSelectedItem().toString());
                    ps.setString(2, changePersonalInfoSecurityQuestionAnswerField.getText());
                    ps.setInt(3, user.getUserID());
                    
                    ps.executeUpdate();
                }
            }
        }
        catch (Exception e) {
            
        }
        
        this.remove(this);
        this.setVisible(false);
        UserDashBoardFrame userDashBoardpage = new UserDashBoardFrame(user, connection);
        userDashBoardpage.setVisible(true);
    }//GEN-LAST:event_changePersonalInfoSubmitButtonMouseClicked

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
    private javax.swing.JButton changePersonalInfoBackButton;
    private javax.swing.JRadioButton changePersonalInfoChangePasswordRadioButton;
    private javax.swing.JRadioButton changePersonalInfoChangeSecurityQuestionRadioButton;
    private javax.swing.JPasswordField changePersonalInfoConfirmPasswordField;
    private javax.swing.JLabel changePersonalInfoConfirmPasswordLabel;
    private javax.swing.JTextField changePersonalInfoEmailAddressField;
    private javax.swing.JLabel changePersonalInfoEmailAddressLabel;
    private javax.swing.JPasswordField changePersonalInfoPasswordField;
    private javax.swing.JLabel changePersonalInfoPasswordLabel;
    private javax.swing.JTextField changePersonalInfoSecurityQuestionAnswerField;
    private javax.swing.JLabel changePersonalInfoSecurityQuestionAnswerLabel;
    private javax.swing.JLabel changePersonalInfoSecurityQuestionLabel;
    private javax.swing.JComboBox<String> changePersonalInfoSecurityQuestionMenu;
    private javax.swing.JLabel changePersonalInfoStateLabel;
    private javax.swing.JComboBox<String> changePersonalInfoStateMenu;
    private javax.swing.JTextField changePersonalInfoStreetAddressField;
    private javax.swing.JLabel changePersonalInfoStreetAddressLabel;
    private javax.swing.JButton changePersonalInfoSubmitButton;
    private javax.swing.JLabel changePersonalInfoTitleLabel;
    private javax.swing.JTextField changePersonalInfoTownField;
    private javax.swing.JLabel changePersonalInfoTownLabel;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
