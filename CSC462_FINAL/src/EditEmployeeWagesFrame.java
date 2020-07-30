/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.*;

/**
 *
 * @author ryansmac
 */
public class EditEmployeeWagesFrame extends javax.swing.JFrame implements WindowListener {
    private Connection connection;
    private User user;
    
    /**
     * Creates new form EditEmployeeWagesFrame
     */
    public EditEmployeeWagesFrame(User user, Connection connection) {
        this.connection = connection;
        this.user = user;
        initComponents();
    }
    
    private void fillTable() {
        try {
            String psQuery = 
                    "SELECT employeeid, firstname, lastname, wage FROM employees";
            
            PreparedStatement ps = connection.prepareStatement(psQuery);
            
            ResultSet employeeInfo = ps.executeQuery();
            
            for (int i = 0; employeeInfo.next(); i++) {
                String name = new String(employeeInfo.getString("lastname") + ", " + employeeInfo.getString("firstname"));
                editEmployeeWagesTable.setValueAt(name, i, 0);
                editEmployeeWagesTable.setValueAt(employeeInfo.getInt("employeeid"), i, 1);
                editEmployeeWagesTable.setValueAt(new String("$" + employeeInfo.getFloat("wage")), i, 2);
            }
        }
        catch (Exception e) {
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify
     * this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        addWindowListener(this);
        
        jPanel1 = new javax.swing.JPanel();
        editEmployeeWagesBackButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        editEmployeeWagesTable = new javax.swing.JTable();
        editEmployeeWagesSelectEmployeeLabel = new javax.swing.JLabel();
        editEmployeeWagesEnterNewWageLabel = new javax.swing.JLabel();
        editEmployeeWagesConfirmButton = new javax.swing.JButton();
        editEmployeeWagesSelectEmployeeMenu = new javax.swing.JComboBox<>();
        editEmployeeWagesNewWageField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        editEmployeeWagesBackButton.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        editEmployeeWagesBackButton.setText("Back");
        editEmployeeWagesBackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editEmployeeWagesBackButtonMouseClicked(evt);
            }
        });

        editEmployeeWagesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Employee Name", "Employee ID", "Wage (Hourly)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        
        jScrollPane2.setViewportView(editEmployeeWagesTable);

        editEmployeeWagesSelectEmployeeLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        editEmployeeWagesSelectEmployeeLabel.setForeground(new java.awt.Color(255, 255, 255));
        editEmployeeWagesSelectEmployeeLabel.setText("Select Employee ID To Change Wage:");

        editEmployeeWagesEnterNewWageLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        editEmployeeWagesEnterNewWageLabel.setForeground(new java.awt.Color(255, 255, 255));
        editEmployeeWagesEnterNewWageLabel.setText("Enter New Wage (Hourly):");

        editEmployeeWagesConfirmButton.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        editEmployeeWagesConfirmButton.setText("Confirm");
        editEmployeeWagesConfirmButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editEmployeeWagesConfirmButtonMouseClicked(evt);
            }
        });

        editEmployeeWagesSelectEmployeeMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Employee..." }));

        try {
            String psQuery = 
                    "SELECT employeeid, firstname, lastname FROM employees";

            PreparedStatement ps = connection.prepareStatement(psQuery);

            ResultSet employeeInfo = ps.executeQuery();

            for (int i = 0; employeeInfo.next(); i++) {
                String name = new String(employeeInfo.getString("lastname") + ", " + employeeInfo.getString("firstname"));
                String employee = new String(employeeInfo.getInt("employeeid") + 
                        ": " + name);
                
                System.out.println(employee);
                
                editEmployeeWagesSelectEmployeeMenu.addItem(employee);
            }
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
            
        }
        
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 829, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editEmployeeWagesBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(editEmployeeWagesSelectEmployeeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editEmployeeWagesSelectEmployeeMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(editEmployeeWagesEnterNewWageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editEmployeeWagesNewWageField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(326, 326, 326)
                .addComponent(editEmployeeWagesConfirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(editEmployeeWagesBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editEmployeeWagesSelectEmployeeLabel)
                    .addComponent(editEmployeeWagesSelectEmployeeMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editEmployeeWagesEnterNewWageLabel)
                    .addComponent(editEmployeeWagesNewWageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(editEmployeeWagesConfirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
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

    private void editEmployeeWagesBackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editEmployeeWagesBackButtonMouseClicked
        this.remove(this);
        this.setVisible(false);
        AdminDashBoardFrame adminDashBoardpage = new AdminDashBoardFrame(user, connection);
        adminDashBoardpage.setVisible(true);
    }//GEN-LAST:event_editEmployeeWagesBackButtonMouseClicked

    private void editEmployeeWagesConfirmButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editEmployeeWagesConfirmButtonMouseClicked
        // this will need to update table on this page showing new wage loaded in from DB that gets updated
        // associated with the employee in question. All table info will need to be populated from DB
        // along with the employee drop down menu
        // CONFIRM value entered is a number with two decimal places at most
        
        try {
            String psUpdateQuery = 
                    "UPDATE employees SET " +
                    "wage = ? " +
                    "WHERE employeeid = ?";
            
            System.out.println("UPDATING...");
            System.out.println("wage: " + Float.parseFloat(editEmployeeWagesNewWageField.getText()));
            System.out.println("employeeid: " + editEmployeeWagesSelectEmployeeMenu.getSelectedItem().toString());
            
            String employee = editEmployeeWagesSelectEmployeeMenu.getSelectedItem().toString();
            System.out.println(employee);
            String[] employeeData = employee.split(":");
            
            int employeeID = Integer.parseInt(employeeData[0]);
            
            PreparedStatement ps = connection.prepareStatement(psUpdateQuery);
            
            ps.setFloat(1, Float.parseFloat(editEmployeeWagesNewWageField.getText()));
            ps.setInt(2, employeeID);
            
            ps.executeUpdate();
        }
        catch (Exception e) {
            
        }
        
        fillTable();
        // WILL NOT CHANGE PAGES EVER WITH THIS BUTTON as the changes show visually up in the table, no
        // need for a confirm dialog, as we can see changes materialize in front of us
    }//GEN-LAST:event_editEmployeeWagesConfirmButtonMouseClicked

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
//            java.util.logging.Logger.getLogger(EditEmployeeWagesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(EditEmployeeWagesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(EditEmployeeWagesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(EditEmployeeWagesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new EditEmployeeWagesFrame().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editEmployeeWagesBackButton;
    private javax.swing.JButton editEmployeeWagesConfirmButton;
    private javax.swing.JLabel editEmployeeWagesEnterNewWageLabel;
    private javax.swing.JTextField editEmployeeWagesNewWageField;
    private javax.swing.JLabel editEmployeeWagesSelectEmployeeLabel;
    private javax.swing.JComboBox<String> editEmployeeWagesSelectEmployeeMenu;
    private javax.swing.JTable editEmployeeWagesTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void windowOpened(WindowEvent e) {
        
    }

    @Override
    public void windowClosing(WindowEvent e) {
        
    }

    @Override
    public void windowClosed(WindowEvent e) {
        
    }

    @Override
    public void windowIconified(WindowEvent e) {
        
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        
    }

    @Override
    public void windowActivated(WindowEvent e) {
        fillTable();
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        
    }
}
