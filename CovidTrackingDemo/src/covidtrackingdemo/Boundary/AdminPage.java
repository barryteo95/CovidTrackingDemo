/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Boundary;

import covidtrackingdemo.Controller.HealthOrganization.CreateAccCtrler;
import covidtrackingdemo.Controller.HealthOrganization.GenerateReportCtrler;
import covidtrackingdemo.Controller.HealthOrganization.ShowUserProfilesCtrler;
import covidtrackingdemo.Controller.HealthOrganization.SuspendAccCtrler;
import covidtrackingdemo.Controller.HealthOrganization.UpdateAccCtrler;
import covidtrackingdemo.Entity.User;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author barry
 */
public class AdminPage extends javax.swing.JFrame {
    
    private String currentUser;
    
    public AdminPage() throws IOException {
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
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        privilegeLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JTextField();
        firstNameField = new javax.swing.JTextField();
        lastNameField = new javax.swing.JTextField();
        privilegeComboBox = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        userProfilesTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        createAccBtn = new javax.swing.JButton();
        updateAccBtn = new javax.swing.JButton();
        suspendAccBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        generateReportBtn = new javax.swing.JButton();
        startDateLabel = new javax.swing.JLabel();
        endDateLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        welcomeLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMinimumSize(new java.awt.Dimension(127, 400));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(120, 120));

        headerLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        headerLabel.setForeground(new java.awt.Color(255, 255, 255));
        headerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLabel.setText("ADMIN");
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

        usernameLabel.setText("Username");
        usernameLabel.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 15);
        jPanel2.add(usernameLabel, gridBagConstraints);

        passwordLabel.setText("Password");
        passwordLabel.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 15);
        jPanel2.add(passwordLabel, gridBagConstraints);

        firstNameLabel.setText("First Name");
        firstNameLabel.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 15);
        jPanel2.add(firstNameLabel, gridBagConstraints);

        lastNameLabel.setText("Last Name");
        lastNameLabel.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 15);
        jPanel2.add(lastNameLabel, gridBagConstraints);

        privilegeLabel.setText("Privilege");
        privilegeLabel.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 15);
        jPanel2.add(privilegeLabel, gridBagConstraints);

        usernameField.setToolTipText("Please enter a valid username");
        usernameField.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel2.add(usernameField, gridBagConstraints);

        passwordField.setToolTipText("Please enter a valid password");
        passwordField.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        jPanel2.add(passwordField, gridBagConstraints);

        firstNameField.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        jPanel2.add(firstNameField, gridBagConstraints);

        lastNameField.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        jPanel2.add(lastNameField, gridBagConstraints);

        privilegeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Public User", "Business Owner", "Health Staff", "Admin" }));
        privilegeComboBox.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        jPanel2.add(privilegeComboBox, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 0, 15);
        getContentPane().add(jPanel2, gridBagConstraints);

        jPanel3.setPreferredSize(new java.awt.Dimension(472, 264));

        userProfilesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Password", "Privilege", "First Name", "Last Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        userProfilesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickUserProfile(evt);
            }
        });
        jScrollPane2.setViewportView(userProfilesTable);

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
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        getContentPane().add(jPanel3, gridBagConstraints);

        jPanel4.setLayout(new java.awt.GridBagLayout());

        createAccBtn.setText("CREATE");
        createAccBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        createAccBtn.setPreferredSize(new java.awt.Dimension(98, 23));
        createAccBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAcc(evt);
            }
        });
        jPanel4.add(createAccBtn, new java.awt.GridBagConstraints());

        updateAccBtn.setText("UPDATE");
        updateAccBtn.setPreferredSize(new java.awt.Dimension(98, 23));
        updateAccBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateAcc(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.insets = new java.awt.Insets(3, 6, 3, 6);
        jPanel4.add(updateAccBtn, gridBagConstraints);

        suspendAccBtn.setText("SUSPEND");
        suspendAccBtn.setPreferredSize(new java.awt.Dimension(98, 23));
        suspendAccBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suspendAcc(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 3, 0);
        jPanel4.add(suspendAccBtn, gridBagConstraints);

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
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 7, 0);
        jPanel4.add(logoutBtn, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 0, 15);
        getContentPane().add(jPanel4, gridBagConstraints);

        jPanel5.setLayout(new java.awt.GridBagLayout());

        generateReportBtn.setText("GENERATE REPORT");
        generateReportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateReport(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel5.add(generateReportBtn, gridBagConstraints);

        startDateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        startDateLabel.setText("DD/MM/YYYY");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 5);
        jPanel5.add(startDateLabel, gridBagConstraints);

        endDateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        endDateLabel.setText("DD/MM/YYYY");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 10, 0);
        jPanel5.add(endDateLabel, gridBagConstraints);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("-");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanel5.add(jLabel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 0, 15);
        getContentPane().add(jPanel5, gridBagConstraints);

        welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeLabel.setText("Welcome, Test");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 15, 0);
        getContentPane().add(welcomeLabel, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void setUsername(String username) throws IOException {
    
        welcomeLabel.setText("Welcome, " + username);
        
        this.currentUser = username;
        
        // Populate user profile table 
        showUserProfiles();
        
        // Initialize the dates to show range of report
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate endDate = LocalDate.now();
        LocalDate startDate = LocalDate.now().minusDays(7);
        
        endDateLabel.setText(formatter.format(endDate));
        startDateLabel.setText(formatter.format(startDate));
    }
    
    private void createAcc(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAcc
        
        int result = JOptionPane.showConfirmDialog(this ,"Confirm create account?", "",
               JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE);
        
        switch (result) {
            
            case JOptionPane.YES_OPTION :  
                
                CreateAccCtrler cc = new CreateAccCtrler();
        
                try {
                    int validationIsSuccessful = cc.createAcc(
                            usernameField.getText(), 
                            passwordField.getText(), 
                            (String)privilegeComboBox.getSelectedItem(), 
                            firstNameField.getText(), 
                            lastNameField.getText());
                    
                    switch (validationIsSuccessful) {
                        
                        case 0:
                            // Validation is successful 
                            DefaultTableModel model = (DefaultTableModel) userProfilesTable.getModel();
                            model.setRowCount(0);
                            showUserProfiles();
                            break;
                        case 1:
                            JOptionPane.showMessageDialog(null, "Please fill in all fields");
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null, "Please enter username in this format : \n - @example.com");
                            break;
                        case 3:
                            JOptionPane.showMessageDialog(null, "Please enter password in this format : "
                                    + "\n - Contain at least 8 characters"
                                    + "\n - Include uppercase "
                                    + "\n - Include lowercase "
                                    + "\n - Include numbers "
                                    + "\n - Include special char");
                            break;
                        default:
                            break;
                    }
                } catch (IOException ex) {
                    Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case JOptionPane.NO_OPTION : 
                break;
        }
    }//GEN-LAST:event_createAcc

    private void updateAcc(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateAcc
        
        int result = JOptionPane.showConfirmDialog(this ,"Confirm update account?", "",
               JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE);
        
        switch (result) {
            
            case JOptionPane.YES_OPTION : 
                
                UpdateAccCtrler uc = new UpdateAccCtrler();
        
                try {
                    int validationIsSuccessful = uc.updateAcc(
                            usernameField.getText(), 
                            passwordField.getText(), 
                            (String)privilegeComboBox.getSelectedItem(), 
                            firstNameField.getText(), 
                            lastNameField.getText());
                    
                    switch (validationIsSuccessful) {
                        
                        case 0:
                            // Validation is successful
                            DefaultTableModel model = (DefaultTableModel) userProfilesTable.getModel();
                            model.setRowCount(0);
                            showUserProfiles();
                            break;
                        case 1:
                            JOptionPane.showMessageDialog(null, "Please fill in all fields");
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null, "Please enter a valid username");
                            break;
                        case 3:
                            JOptionPane.showMessageDialog(null, "Please enter a stronger password");
                            break;
                        default:
                            break;
                    }
                } catch (IOException ex) {
                    Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case JOptionPane.NO_OPTION :
                break;
        }
    }//GEN-LAST:event_updateAcc

    private void suspendAcc(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suspendAcc
                
        int result = JOptionPane.showConfirmDialog(this ,"Confirm suspend account?", "",
               JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE);
        
        switch (result) {
            
            case JOptionPane.YES_OPTION : 
                
                SuspendAccCtrler sc = new SuspendAccCtrler();
                
                try {
                    int validationIsSuccessful = sc.suspendAcc(usernameField.getText(), passwordField.getText(), (String)privilegeComboBox.getSelectedItem(), firstNameField.getText(), lastNameField.getText());
                    
                    switch(validationIsSuccessful) {
                    
                        case 0:
                            // Validation is successful
                            DefaultTableModel model = (DefaultTableModel) userProfilesTable.getModel();
                            model.setRowCount(0);
                            showUserProfiles();
                            break;
                        case 1:
                            JOptionPane.showMessageDialog(null, "Please enter a valid username");
                            break;
                        default:
                            break;
                    }
                } catch (IOException ex) {
                    Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case JOptionPane.NO_OPTION : 
                break;
        }
    }//GEN-LAST:event_suspendAcc

    private void clickUserProfile(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickUserProfile
        // TODO add your handling code here:
        
        // Find the index of the selected row 
        int i = userProfilesTable.getSelectedRow();
        
        // Populate the fields with what was selected
        DefaultTableModel model = (DefaultTableModel) userProfilesTable.getModel();
        usernameField.setText(model.getValueAt(i, 0).toString());
        passwordField.setText(model.getValueAt(i, 1).toString());

        String privilegeCurrent = model.getValueAt(i, 2).toString();

        switch(privilegeCurrent) {

            case "Public User" : 
                privilegeComboBox.setSelectedIndex(0);
                break;
            case "Business Owner" : 
                privilegeComboBox.setSelectedIndex(1);
                break;
            case "Health Staff" : 
                privilegeComboBox.setSelectedIndex(2);
                break;
            case "Admin" : 
                privilegeComboBox.setSelectedIndex(3);
                break;
            default:
                break;
        }

        firstNameField.setText(model.getValueAt(i, 3).toString());
        lastNameField.setText(model.getValueAt(i, 4).toString());
    }//GEN-LAST:event_clickUserProfile

    private void logout(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout
        // TODO add your handling code here:
        
        // Remove current frame
        dispose();
    }//GEN-LAST:event_logout

    private void generateReport(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateReport
        // TODO add your handling code here:
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        try {
            
            GenerateReportCtrler grc = new GenerateReportCtrler();
            
            HashMap<String, Integer> dict = grc.generateReport(startDateLabel.getText(), endDateLabel.getText());
            
            // Use TreeMap to sort LocalDate variables
            Map<LocalDate, Integer> vacDict = new TreeMap<>();
            Map<LocalDate, Integer> infDict = new TreeMap<>();
            
            String tempKey;
            Integer tempVal;
            LocalDate tempDate;
            
            // Separate infection and vaccination dates
            for (Map.Entry<String, Integer> me : dict.entrySet()) {
                
                tempKey = me.getKey();
                tempVal = me.getValue();
                tempDate = LocalDate.parse(tempKey.substring(2, tempKey.length()), formatter);
                
                // If tempKey is a Vaccination date
                if (tempKey.contains("V")) {
                                        
                    vacDict.put(tempDate, tempVal);
                }
                
                // If tempKey is a Infection date
                else {
                    
                    infDict.put(tempDate, tempVal);
                }                
            }
            
            // Here create a new JFrame
            AdminReportPage report = new AdminReportPage();
            report.setDict(vacDict, infDict);
        
        } catch (IOException ex) {
            Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_generateReport
    
    private void showUserProfiles() throws IOException {
        
        // Retrieve all user profile entries
        ShowUserProfilesCtrler dc = new ShowUserProfilesCtrler();
        ArrayList<User> userList = dc.showUserProfiles();
        
        // Populate user profile table 
        DefaultTableModel model = (DefaultTableModel) userProfilesTable.getModel();
        
        Object rowData[] = new Object[5];
        
        for (User user : userList) {
            
            rowData[0] = user.getUsername();
            rowData[1] = user.getPassword();
            rowData[2] = user.getPrivilege();
            rowData[3] = user.getFirstName();
            rowData[4] = user.getLastName();
            
            model.addRow(rowData);
        }
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
                    new AdminPage().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createAccBtn;
    private javax.swing.JLabel endDateLabel;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JButton generateReportBtn;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JTextField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JComboBox<String> privilegeComboBox;
    private javax.swing.JLabel privilegeLabel;
    private javax.swing.JLabel startDateLabel;
    private javax.swing.JButton suspendAccBtn;
    private javax.swing.JButton updateAccBtn;
    private javax.swing.JTable userProfilesTable;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
