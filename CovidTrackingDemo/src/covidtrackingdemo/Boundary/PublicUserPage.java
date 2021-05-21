/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Boundary;

import covidtrackingdemo.Controller.BusinessOwner.AckAlertCtrler;
import covidtrackingdemo.Controller.BusinessOwner.ShowAlertCtrler;
import covidtrackingdemo.Controller.PublicUser.CheckInCtrler;
import covidtrackingdemo.Controller.PublicUser.CheckVacStatusCtrler;
import covidtrackingdemo.Controller.PublicUser.ShowUserProfileCtrler;
import covidtrackingdemo.Controller.PublicUser.ShowVisitedCtrler;
import covidtrackingdemo.Entity.Alert;
import covidtrackingdemo.Entity.User;
import covidtrackingdemo.Entity.Visit;
import java.awt.Color;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
public class PublicUserPage extends javax.swing.JFrame {
    
    private String currentUser;
    
    public PublicUserPage() throws IOException {
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
        welcomeLabel = new javax.swing.JLabel();
        userTab = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        boUsernameLabel = new javax.swing.JLabel();
        checkInDateLabel = new javax.swing.JLabel();
        boUsernameField = new javax.swing.JTextField();
        checkInBtn = new javax.swing.JButton();
        checkInDateField = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        alertList = new javax.swing.JList<>();
        ackAlertBtn = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        vacLabel = new javax.swing.JLabel();
        puUsernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        privilegeLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        puUsernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JTextField();
        privilegeField = new javax.swing.JTextField();
        firstNameField = new javax.swing.JTextField();
        lastNameField = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        dateLabel = new javax.swing.JLabel();
        dateField = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        visitedTable = new javax.swing.JTable();
        showVisitedBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

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
        headerLabel.setText("PUBLIC USER");
        headerLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        headerLabel.setPreferredSize(new java.awt.Dimension(127, 48));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
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
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        getContentPane().add(jPanel1, gridBagConstraints);

        welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeLabel.setText("Welcome, Test");
        welcomeLabel.setPreferredSize(new java.awt.Dimension(77, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 15, 0);
        getContentPane().add(welcomeLabel, gridBagConstraints);

        userTab.setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel2.setPreferredSize(new java.awt.Dimension(483, 400));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jPanel4.setPreferredSize(new java.awt.Dimension(270, 107));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        boUsernameLabel.setText("Business Owner");
        boUsernameLabel.setPreferredSize(new java.awt.Dimension(90, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 15);
        jPanel4.add(boUsernameLabel, gridBagConstraints);

        checkInDateLabel.setText("Date");
        checkInDateLabel.setPreferredSize(new java.awt.Dimension(90, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 15);
        jPanel4.add(checkInDateLabel, gridBagConstraints);

        boUsernameField.setToolTipText("Please enter a valid username");
        boUsernameField.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 30;
        jPanel4.add(boUsernameField, gridBagConstraints);

        checkInBtn.setText("CHECK-IN");
        checkInBtn.setPreferredSize(new java.awt.Dimension(100, 23));
        checkInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkIn(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        jPanel4.add(checkInBtn, gridBagConstraints);

        checkInDateField.setText("jLabel5");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        jPanel4.add(checkInDateField, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        jPanel2.add(jPanel4, gridBagConstraints);

        alertList.setToolTipText("Select to acknowledge an alert ");
        jScrollPane1.setViewportView(alertList);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        jPanel2.add(jScrollPane1, gridBagConstraints);

        ackAlertBtn.setText("ACKNOWLEDGE");
        ackAlertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ackAlert(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 0);
        jPanel2.add(ackAlertBtn, gridBagConstraints);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setPreferredSize(new java.awt.Dimension(5, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        jPanel2.add(jSeparator2, gridBagConstraints);

        userTab.addTab("MAIN", jPanel2);

        jPanel3.setPreferredSize(new java.awt.Dimension(700, 400));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jPanel5.setPreferredSize(new java.awt.Dimension(300, 300));
        jPanel5.setLayout(new java.awt.GridBagLayout());

        vacLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vacLabel.setText("YOU ARE VACCINATED");
        vacLabel.setFocusable(false);
        vacLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 15, 0);
        jPanel5.add(vacLabel, gridBagConstraints);

        puUsernameLabel.setText("Username");
        puUsernameLabel.setPreferredSize(new java.awt.Dimension(90, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        jPanel5.add(puUsernameLabel, gridBagConstraints);

        passwordLabel.setText("Password");
        passwordLabel.setPreferredSize(new java.awt.Dimension(90, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        jPanel5.add(passwordLabel, gridBagConstraints);

        privilegeLabel.setText("Privilege");
        privilegeLabel.setPreferredSize(new java.awt.Dimension(90, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        jPanel5.add(privilegeLabel, gridBagConstraints);

        firstNameLabel.setText("First Name");
        firstNameLabel.setPreferredSize(new java.awt.Dimension(90, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        jPanel5.add(firstNameLabel, gridBagConstraints);

        lastNameLabel.setText("Last Name");
        lastNameLabel.setPreferredSize(new java.awt.Dimension(90, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        jPanel5.add(lastNameLabel, gridBagConstraints);

        puUsernameField.setEditable(false);
        puUsernameField.setText("jTextField2");
        puUsernameField.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 10.0;
        jPanel5.add(puUsernameField, gridBagConstraints);

        passwordField.setEditable(false);
        passwordField.setText("jTextField3");
        passwordField.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.weightx = 10.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        jPanel5.add(passwordField, gridBagConstraints);

        privilegeField.setEditable(false);
        privilegeField.setText("jTextField4");
        privilegeField.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.weightx = 10.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        jPanel5.add(privilegeField, gridBagConstraints);

        firstNameField.setEditable(false);
        firstNameField.setText("jTextField5");
        firstNameField.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.weightx = 10.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        jPanel5.add(firstNameField, gridBagConstraints);

        lastNameField.setEditable(false);
        lastNameField.setText("jTextField6");
        lastNameField.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.weightx = 10.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        jPanel5.add(lastNameField, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 20);
        jPanel3.add(jPanel5, gridBagConstraints);

        jPanel6.setPreferredSize(new java.awt.Dimension(400, 200));
        jPanel6.setLayout(new java.awt.GridBagLayout());

        dateLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        dateLabel.setText("Date");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 15);
        jPanel6.add(dateLabel, gridBagConstraints);

        dateField.setToolTipText("Select a date and press SHOW");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 15);
        jPanel6.add(dateField, gridBagConstraints);

        jScrollPane2.setPreferredSize(new java.awt.Dimension(300, 100));

        visitedTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Business Owner", "Visited Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(visitedTable);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weighty = 1.0;
        jPanel6.add(jScrollPane2, gridBagConstraints);

        showVisitedBtn.setText("SHOW");
        showVisitedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showVisited(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        jPanel6.add(showVisitedBtn, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 0);
        jPanel3.add(jPanel6, gridBagConstraints);

        logoutBtn.setText("LOGOUT");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 20);
        jPanel3.add(logoutBtn, gridBagConstraints);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(5, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.insets = new java.awt.Insets(20, 5, 0, 5);
        jPanel3.add(jSeparator1, gridBagConstraints);

        userTab.addTab("USER", jPanel3);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(userTab, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setUsername(String username) throws IOException {
    
        welcomeLabel.setText("Welcome, " + username);
        
        this.currentUser = username;
        
        // Tab 1
        // populate today's date
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  
        String date = dateFormat.format(new Date());  
        checkInDateField.setText(date);
        
        // populate alerts
        showAlert();
        
        // Tab 2
        // populate "YOU ARE VACCINATED" label
        checkVacStatus();
        
        // populate user profile
        showUserProfile();
        // populate today's date
        dateField.setDate(new Date());
    }
    
    private void logout(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout
        // TODO add your handling code here:
        
        dispose();
    }//GEN-LAST:event_logout

    private void showVisited(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showVisited
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel) visitedTable.getModel();
        model.setRowCount(0);
        
        ShowVisitedCtrler uvc = new ShowVisitedCtrler();
        
        ArrayList<Visit> visitedList;
                
        try {
            
            visitedList = uvc.showVisited(dateField.getDate(), currentUser);
            
            Object rowData[] = new Object[2];
        
            for (Visit visited : visitedList) {

                rowData[0] = visited.getBoUsername();
                rowData[1] = visited.getVisitedDate();

                model.addRow(rowData);
            }
        
        } catch (IOException ex) {
            Logger.getLogger(PublicUserPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(PublicUserPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_showVisited

    private void ackAlert(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ackAlert
        // TODO add your handling code here:
        
        int[] selectedIx = alertList.getSelectedIndices();
        
        if (selectedIx.length == 0) {
        
            JOptionPane.showMessageDialog(this, "No alert selected!");
        }
        else {
            
            ArrayList<String> selectedList = new ArrayList<>();
            
            for (int i = 0; i < selectedIx.length; i++) {
            
                String selected = alertList.getModel().getElementAt(selectedIx[i]);

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
        }
    }//GEN-LAST:event_ackAlert

    private void checkIn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkIn
        // TODO add your handling code here:
                
        CheckInCtrler cic = new CheckInCtrler();
        
        try {
            Boolean response = cic.checkIn(boUsernameField.getText(), currentUser, checkInDateField.getText());
            
            if (response) {
                
                JOptionPane.showMessageDialog(this, "Checked into " + boUsernameField.getText());
            }
            
            else {
                
                JOptionPane.showMessageDialog(this, "Business Owner not found.");
            }
            
        } catch (IOException ex) {
            Logger.getLogger(PublicUserPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_checkIn
    
    private void showAlert() throws IOException {
    
        DefaultListModel<String> model = new DefaultListModel<>(); 
         
        ShowAlertCtrler sac = new ShowAlertCtrler();
        ArrayList<Alert> aList = sac.showAlert(currentUser);
         
        if (aList.isEmpty()) {
        
            model.addElement(" No alert");
        }
        else {
            
            for (Alert a : aList) {

                model.addElement(a.getAlertType() + " alert sent on " + a.getAlertDate());
            }
        }

        alertList.setModel(model);
    }
    
    private void checkVacStatus() throws IOException {
    
        CheckVacStatusCtrler vsc = new CheckVacStatusCtrler();
        
        Boolean response = vsc.checkVacStatus(currentUser);
        
        if (response) {
            
            vacLabel.setText("YOU ARE VACCINATED");
            vacLabel.setForeground(Color.BLACK);
            vacLabel.setBackground(Color.GREEN);
            vacLabel.setOpaque(true);
        } 
        else {
            
            vacLabel.setText("YOU ARE NOT VACCINATED");
            vacLabel.setForeground(Color.WHITE);
            vacLabel.setBackground(Color.RED);
            vacLabel.setOpaque(true);
        }
    }
    
    private void showUserProfile() throws IOException {
    
        ShowUserProfileCtrler upc = new ShowUserProfileCtrler();
        
        User user = upc.showUserProfile(welcomeLabel.getText().split(" ")[1]);
        
        puUsernameField.setText(user.getUsername());
        passwordField.setText(user.getPassword());
        privilegeField.setText(user.getPrivilege());
        firstNameField.setText(user.getFirstName());
        lastNameField.setText(user.getLastName());
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
                    new PublicUserPage().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(PublicUserPage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ackAlertBtn;
    private javax.swing.JList<String> alertList;
    private javax.swing.JTextField boUsernameField;
    private javax.swing.JLabel boUsernameLabel;
    private javax.swing.JButton checkInBtn;
    private javax.swing.JLabel checkInDateField;
    private javax.swing.JLabel checkInDateLabel;
    private com.toedter.calendar.JDateChooser dateField;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JTextField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField privilegeField;
    private javax.swing.JLabel privilegeLabel;
    private javax.swing.JTextField puUsernameField;
    private javax.swing.JLabel puUsernameLabel;
    private javax.swing.JButton showVisitedBtn;
    private javax.swing.JTabbedPane userTab;
    private javax.swing.JLabel vacLabel;
    private javax.swing.JTable visitedTable;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
