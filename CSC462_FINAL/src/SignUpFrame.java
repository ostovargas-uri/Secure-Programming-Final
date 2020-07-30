/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author ryansmac
 */
public class SignUpFrame extends javax.swing.JFrame {
    private static PasswordManager pwdmg;
    private Connection connection;
    
    /**
     * Creates new form SignUpFrame
     */
    public SignUpFrame() {
        connection = pwdmg.connection;
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
        signUpFirstNameLabel = new javax.swing.JLabel();
        signUpLastNameLabel = new javax.swing.JLabel();
        signUpStreetAddressLabel = new javax.swing.JLabel();
        signUpTownLabel = new javax.swing.JLabel();
        signUpStateLabel = new javax.swing.JLabel();
        signUpDateOfBirthLabel = new javax.swing.JLabel();
        signUpEmailAddressLabel = new javax.swing.JLabel();
        signUpPasswordLabel = new javax.swing.JLabel();
        signUpConfirmPasswordLabel = new javax.swing.JLabel();
        signUpSecurityQuestionLabel = new javax.swing.JLabel();
        signUpSecurityQuestionAnswerLabel = new javax.swing.JLabel();
        signUpCreateAccountButton = new javax.swing.JButton();
        signUpStateMenu = new javax.swing.JComboBox<>();
        signUpMonthMenu = new javax.swing.JComboBox<>();
        signUpDayMenu = new javax.swing.JComboBox<>();
        signUpYearMenu = new javax.swing.JComboBox<>();
        signUpLastNameField = new javax.swing.JTextField();
        signUpStreetAddressField = new javax.swing.JTextField();
        signUpTownField = new javax.swing.JTextField();
        signUpFirstNameField = new javax.swing.JTextField();
        signUpEmailAddressField = new javax.swing.JTextField();
        signUpVerificationCodeLabel = new javax.swing.JLabel();
        signUpVerificationCodeField = new javax.swing.JTextField();
        signUpSecurityQuestionMenu = new javax.swing.JComboBox<>();
        signUpPasswordField = new javax.swing.JPasswordField();
        signUpConfirmPasswordField = new javax.swing.JPasswordField();
        signUpSecurityQuestionAnswerField = new javax.swing.JTextField();
        signUpBackButton = new javax.swing.JButton();
        signUpChooseUsernameField = new javax.swing.JTextField();
        signUpChooseUsernameLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        signUpFirstNameLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        signUpFirstNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        signUpFirstNameLabel.setText("First Name:");

        signUpLastNameLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        signUpLastNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        signUpLastNameLabel.setText("Last Name:");

        signUpStreetAddressLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        signUpStreetAddressLabel.setForeground(new java.awt.Color(255, 255, 255));
        signUpStreetAddressLabel.setText("Street Address:");

        signUpTownLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        signUpTownLabel.setForeground(new java.awt.Color(255, 255, 255));
        signUpTownLabel.setText("Town:");

        signUpStateLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        signUpStateLabel.setForeground(new java.awt.Color(255, 255, 255));
        signUpStateLabel.setText("State:");

        signUpDateOfBirthLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        signUpDateOfBirthLabel.setForeground(new java.awt.Color(255, 255, 255));
        signUpDateOfBirthLabel.setText("Date of Birth:");

        signUpEmailAddressLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        signUpEmailAddressLabel.setForeground(new java.awt.Color(255, 255, 255));
        signUpEmailAddressLabel.setText("Email Address:");

        signUpPasswordLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        signUpPasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        signUpPasswordLabel.setText("Password (must be between 8 to 50 characters):");

        signUpConfirmPasswordLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        signUpConfirmPasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        signUpConfirmPasswordLabel.setText("Confirm Password:");

        signUpSecurityQuestionLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        signUpSecurityQuestionLabel.setForeground(new java.awt.Color(255, 255, 255));
        signUpSecurityQuestionLabel.setText("Security Question:");

        signUpSecurityQuestionAnswerLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        signUpSecurityQuestionAnswerLabel.setForeground(new java.awt.Color(255, 255, 255));
        signUpSecurityQuestionAnswerLabel.setText("Security Question Answer:");

        signUpCreateAccountButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        signUpCreateAccountButton.setText("Create Account");
        signUpCreateAccountButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpCreateAccountButtonMouseClicked(evt);
            }
        });

        signUpStateMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select State...", "Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "District of Columbia", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming" }));

        signUpMonthMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Month...", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        signUpDayMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Day...", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        signUpYearMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Year...", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940 ", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000" }));
        
        signUpVerificationCodeLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        signUpVerificationCodeLabel.setForeground(new java.awt.Color(255, 255, 255));
        signUpVerificationCodeLabel.setText("Verification Code:");

        signUpSecurityQuestionMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Security Question...", "What is the name of the road you grew up on?", "What is your mother’s maiden name?", "What was the name of your first pet?" }));

        signUpBackButton.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        signUpBackButton.setText("Back");
        signUpBackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpBackButtonMouseClicked(evt);
            }
        });

        signUpChooseUsernameLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        signUpChooseUsernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        signUpChooseUsernameLabel.setText("Choose Username:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(signUpSecurityQuestionLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(signUpSecurityQuestionMenu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(signUpConfirmPasswordLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(signUpConfirmPasswordField))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(signUpSecurityQuestionAnswerLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(signUpSecurityQuestionAnswerField, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(signUpEmailAddressLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(signUpEmailAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(signUpStateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(signUpStateMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(signUpDateOfBirthLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(signUpMonthMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(signUpDayMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(signUpYearMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(signUpStreetAddressLabel)
                                                    .addComponent(signUpTownLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(signUpLastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(signUpFirstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(signUpChooseUsernameLabel))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(signUpLastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(signUpTownField, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(signUpStreetAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(signUpFirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(signUpChooseUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(signUpVerificationCodeLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(signUpVerificationCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 77, Short.MAX_VALUE)))
                                .addGap(226, 226, 226))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(signUpPasswordLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(signUpPasswordField))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(signUpCreateAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(signUpBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(signUpBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(signUpChooseUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(signUpChooseUsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signUpFirstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signUpFirstNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signUpLastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signUpLastNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signUpStreetAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signUpStreetAddressField, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signUpTownLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signUpTownField, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signUpStateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signUpStateMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signUpDateOfBirthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signUpMonthMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signUpDayMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signUpYearMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signUpEmailAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signUpEmailAddressField, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signUpPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signUpPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signUpConfirmPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signUpConfirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signUpSecurityQuestionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signUpSecurityQuestionMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signUpSecurityQuestionAnswerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signUpSecurityQuestionAnswerField, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signUpVerificationCodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signUpVerificationCodeField, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addGap(113, 113, 113)
                .addComponent(signUpCreateAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void signUpBackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpBackButtonMouseClicked
        this.remove(this);
        this.setVisible(false);
        LoginFrame loginPage = new LoginFrame();
        loginPage.setVisible(true);
    }//GEN-LAST:event_signUpBackButtonMouseClicked
    
    private void signUpCreateAccountButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpCreateAccountButtonMouseClicked
        // save all info to DB, maybe make unique employee ID number? or make unique ID out of first
        // initial last name as a DB unique identifier?
        // hash passwords SHA 256 probably? and store hashes into DB
        // validation code given "orally" at interview will be generated from admin account and should
        // be stored on the DB under active validation codes. to be removed once "used" here if it
        // matches what validation code is inside an admin user's validation code field in the DB
        
        String username = signUpChooseUsernameField.getText();
        String firstName = signUpFirstNameField.getText();
        String lastName = signUpLastNameField.getText();
        String address = signUpStreetAddressField.getText();
        String city = signUpTownField.getText();
        
        String state = signUpStateMenu.getSelectedItem().toString();
        int state_idx = signUpStateMenu.getSelectedIndex();
        
        String s_month = signUpMonthMenu.getSelectedItem().toString();
        int month_idx = signUpMonthMenu.getSelectedIndex();
        
        int day = Integer.parseInt(signUpDayMenu.getSelectedItem().toString());
        int day_idx = signUpDayMenu.getSelectedIndex();
        
        int year = Integer.parseInt(signUpYearMenu.getSelectedItem().toString());
        int year_idx = signUpYearMenu.getSelectedIndex();
        
        String email = signUpEmailAddressField.getText();
        String password = new String(signUpPasswordField.getPassword());
        String c_password = new String(signUpConfirmPasswordField.getPassword());
        
        String question = signUpSecurityQuestionMenu.getSelectedItem().toString();
        int question_idx = signUpSecurityQuestionMenu.getSelectedIndex();
        
        String answer = signUpSecurityQuestionAnswerField.getText();
        String v_code = signUpVerificationCodeField.getText();
        
//        int userID = -1;
//        if (password.equals(c_password) && password.length() >= 8) {
//            try {
//                System.out.println("Question: " + question);
//                System.out.println("Answer: " + answer);
//                userID = pwdmg.add(username, password, 0, question, answer);
//                System.out.println("UserID: " + userID);
//            }
//            catch (Exception e) {
//                
//            }
//        }
//        else {
//            
//        }
        int userID = -1;
        if (password.equals(c_password) && password.length() >= 8) {
            try {

                System.out.println("Question: " + question);
                System.out.println("Answer: " + answer);
                userID = pwdmg.add(username, password, 0, question, answer);
                System.out.println("UserID: " + userID);

                String psQuery = 
                        "SELECT vcode FROM codes WHERE vcode = ?";

                PreparedStatement ps = connection.prepareStatement(psQuery);
                ps.setInt(1, Integer.parseInt(signUpVerificationCodeField.getText()));

                ResultSet codes = ps.executeQuery();

                if (codes.next()) {
                    int code = codes.getInt("vcode");

                    String psUpdateQuery = 
                            "DELETE FROM codes WHERE vcode = ?";

                    ps = connection.prepareStatement(psUpdateQuery);
                    ps.setInt(1, code);

                    ps.executeUpdate();

                    String psInsertQuery = 
                        "INSERT INTO employees (userid, firstname, lastname, address, city, state, dob, email)" +
                        "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

                    ps = connection.prepareStatement(psInsertQuery);

                    if (connection == null) {
                        System.out.println("WAIT CONNECTION IS NULL?!");
                    }

                    int month = 0;
                    if (s_month.equals("January")) month = 0;
                    else if (s_month.equals("February")) month = 1;
                    else if (s_month.equals("March")) month = 2;
                    else if (s_month.equals("April")) month = 3;
                    else if (s_month.equals("May")) month = 4;
                    else if (s_month.equals("June")) month = 5;
                    else if (s_month.equals("July")) month = 6;
                    else if (s_month.equals("August")) month = 7;
                    else if (s_month.equals("September")) month = 8;
                    else if (s_month.equals("October")) month = 9;
                    else if (s_month.equals("November")) month = 10;
                    else if (s_month.equals("December")) month = 11;

                    SimpleDateFormat sdf = new SimpleDateFormat(
                        "yyyy-MM-dd");
                    Calendar cal = Calendar.getInstance();
                    cal.set(Calendar.YEAR, year);
                    cal.set(Calendar.MONTH, month); // <-- months start
                                                    // at 0.
                    cal.set(Calendar.DAY_OF_MONTH, day);

                    java.sql.Date date = new java.sql.Date(cal.getTimeInMillis());

                    ps.setInt(1, userID);
                    ps.setString(2, firstName);
                    ps.setString(3, lastName);
                    ps.setString(4, address);
                    ps.setString(5, city);
                    ps.setString(6, state);
                    ps.setString(7, date.toString());
                    ps.setString(8, email);

                    ps.executeUpdate();
                }
            }
            catch (Exception e) {

            }
        
            // redirects back to login page and user should be able to login then
            this.remove(this);
            this.setVisible(false);
            LoginFrame loginPage = new LoginFrame();
            loginPage.setVisible(true);
        }
    }//GEN-LAST:event_signUpCreateAccountButtonMouseClicked

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
//            java.util.logging.Logger.getLogger(SignUpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(SignUpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(SignUpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(SignUpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new SignUpFrame().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton signUpBackButton;
    private javax.swing.JTextField signUpChooseUsernameField;
    private javax.swing.JLabel signUpChooseUsernameLabel;
    private javax.swing.JPasswordField signUpConfirmPasswordField;
    private javax.swing.JLabel signUpConfirmPasswordLabel;
    private javax.swing.JButton signUpCreateAccountButton;
    private javax.swing.JLabel signUpDateOfBirthLabel;
    private javax.swing.JComboBox<String> signUpDayMenu;
    private javax.swing.JTextField signUpEmailAddressField;
    private javax.swing.JLabel signUpEmailAddressLabel;
    private javax.swing.JTextField signUpFirstNameField;
    private javax.swing.JLabel signUpFirstNameLabel;
    private javax.swing.JTextField signUpLastNameField;
    private javax.swing.JLabel signUpLastNameLabel;
    private javax.swing.JComboBox<String> signUpMonthMenu;
    private javax.swing.JPasswordField signUpPasswordField;
    private javax.swing.JLabel signUpPasswordLabel;
    private javax.swing.JTextField signUpSecurityQuestionAnswerField;
    private javax.swing.JLabel signUpSecurityQuestionAnswerLabel;
    private javax.swing.JLabel signUpSecurityQuestionLabel;
    private javax.swing.JComboBox<String> signUpSecurityQuestionMenu;
    private javax.swing.JLabel signUpStateLabel;
    private javax.swing.JComboBox<String> signUpStateMenu;
    private javax.swing.JTextField signUpStreetAddressField;
    private javax.swing.JLabel signUpStreetAddressLabel;
    private javax.swing.JTextField signUpTownField;
    private javax.swing.JLabel signUpTownLabel;
    private javax.swing.JTextField signUpVerificationCodeField;
    private javax.swing.JLabel signUpVerificationCodeLabel;
    private javax.swing.JComboBox<String> signUpYearMenu;
    // End of variables declaration//GEN-END:variables
}
