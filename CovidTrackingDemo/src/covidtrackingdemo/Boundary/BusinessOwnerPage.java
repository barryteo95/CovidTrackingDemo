/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Boundary;

import covidtrackingdemo.Controller.BusinessOwner.AckAlertCtrler;
import covidtrackingdemo.Controller.BusinessOwner.ShowVisitorCtrler;
import covidtrackingdemo.Controller.BusinessOwner.ShowAlertCtrler;
import covidtrackingdemo.Entity.Alert;
import covidtrackingdemo.Entity.Visit;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author barry
 */
public class BusinessOwnerPage extends javax.swing.JFrame {
            
    private String currentUser;
    
    public BusinessOwnerPage() throws IOException {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH); 
    }    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        headerLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        expAlertList = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        visitorTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        ackExpAlertBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        dateLabel = new javax.swing.JLabel();
        dateField = new com.toedter.calendar.JDateChooser();
        showVisitorBtn = new javax.swing.JButton();
        visitorCountLabel = new javax.swing.JLabel();
        welcomeLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMinimumSize(new java.awt.Dimension(127, 400));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(120, 120));

        headerLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        headerLabel.setForeground(new java.awt.Color(255, 255, 255));
        headerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLabel.setText("BUSINESS OWNER");
        headerLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        headerLabel.setPreferredSize(new java.awt.Dimension(127, 48));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        getContentPane().add(jPanel1, gridBagConstraints);

        jPanel2.setPreferredSize(new java.awt.Dimension(312, 200));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        expAlertList.setPreferredSize(new java.awt.Dimension(252, 80));
        jScrollPane1.setViewportView(expAlertList);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(jScrollPane1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 0, 15);
        getContentPane().add(jPanel2, gridBagConstraints);

        jPanel3.setPreferredSize(new java.awt.Dimension(472, 264));

        visitorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Public User", "Visited Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(visitorTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        getContentPane().add(jPanel3, gridBagConstraints);

        jPanel4.setLayout(new java.awt.GridBagLayout());

        ackExpAlertBtn.setText("ACKNOWLEDGE");
        ackExpAlertBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        ackExpAlertBtn.setPreferredSize(new java.awt.Dimension(252, 23));
        ackExpAlertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ackAlert(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 7, 0);
        jPanel4.add(ackExpAlertBtn, gridBagConstraints);

        logoutBtn.setText("LOGOUT");
        logoutBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logoutBtn.setPreferredSize(new java.awt.Dimension(252, 23));
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 7, 0);
        jPanel4.add(logoutBtn, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 0, 15);
        getContentPane().add(jPanel4, gridBagConstraints);

        jPanel5.setPreferredSize(new java.awt.Dimension(34, 30));
        jPanel5.setLayout(new java.awt.GridBagLayout());

        dateLabel.setText("Date");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 7.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        jPanel5.add(dateLabel, gridBagConstraints);

        dateField.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 8.0;
        jPanel5.add(dateField, gridBagConstraints);

        showVisitorBtn.setText("SHOW");
        showVisitorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showVisitor(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        jPanel5.add(showVisitorBtn, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 0, 10);
        getContentPane().add(jPanel5, gridBagConstraints);

        visitorCountLabel.setText("Visitor Count");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        getContentPane().add(visitorCountLabel, gridBagConstraints);

        welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeLabel.setText("Welcome,  Test");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 15, 0);
        getContentPane().add(welcomeLabel, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void setUsername(String username) throws IOException, ParseException {
    
        welcomeLabel.setText("Welcome, " + username);
        
        this.currentUser = username;
        
        showAlert();
       
        dateField.setDate(new Date());
    }

    private void ackAlert(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ackAlert
        
        ArrayList<String> selectedList = new ArrayList<>();
        
        int[] selectedIx = expAlertList.getSelectedIndices();
        
        for (int i = 0; i < selectedIx.length; i++) {
            
            String selected = expAlertList.getModel().getElementAt(selectedIx[i]);
            
            selectedList.add(currentUser + " " + selected);
        }
        
        AckAlertCtrler ac = new AckAlertCtrler();
            
        try {
            ac.ackAlert(selectedList);
            
            JOptionPane.showMessageDialog(this, "Alert acknowledged");
            
            showAlert();
            
        } catch (IOException ex) {
            Logger.getLogger(BusinessOwnerPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ackAlert

    private void logout(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout
        // TODO add your handling code here:
        dispose();
        
        LoginPage lp = new LoginPage();
        lp.setVisible(true);
    }//GEN-LAST:event_logout

    private void showVisitor(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showVisitor
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel) visitorTable.getModel();
        model.setRowCount(0);
        
        ShowVisitorCtrler sv = new ShowVisitorCtrler();
            
        ArrayList<Visit> visitorList;
       
        try {
            visitorList = sv.showVisitor(dateField.getDate(), currentUser);
            
            Object rowData[] = new Object[2];
        
            for (Visit visitor : visitorList) {

                rowData[0] = visitor.getPuUsername();
                rowData[1] = visitor.getVisitedDate();

                model.addRow(rowData);
            }

            String count = Integer.toString(model.getRowCount());
            visitorCountLabel.setText("Visitor Count: " + count);
        
        } catch (IOException ex) {
            Logger.getLogger(BusinessOwnerPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(BusinessOwnerPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_showVisitor

    private void showAlert() throws IOException {
            
        DefaultListModel<String> model = new DefaultListModel<>(); 
         
        ShowAlertCtrler sac = new ShowAlertCtrler();
        ArrayList<Alert> aList = sac.showAlert(currentUser);
         
        for (Alert a : aList) {
            
            model.addElement(a.getAlertType() + " alert sent on " + a.getAlertDate());
        }
         
        expAlertList.setModel(model);
    }
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new BusinessOwnerPage().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(BusinessOwnerPage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ackExpAlertBtn;
    private com.toedter.calendar.JDateChooser dateField;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JList<String> expAlertList;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton showVisitorBtn;
    private javax.swing.JLabel visitorCountLabel;
    private javax.swing.JTable visitorTable;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
