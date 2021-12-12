/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Consultancy.ConsultancyPage;
import Business.Consultancy.ConsultancyPageDirectory;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chand
 */
public class Consultancy_org extends javax.swing.JPanel {

    private final JPanel container;
    private final EcoSystem ecosystem;

    /**
     * Creates new form Vaccination_org
     */
    public Consultancy_org(JPanel container,EcoSystem system) {
        
        initComponents();
        this.container=container;
        this.ecosystem=system;
        this.setSize(619,600);
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtName = new javax.swing.JTextField();
        txtPhNo = new javax.swing.JTextField();
        lblUserID = new javax.swing.JLabel();
        txtLocation = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        txtUserID = new javax.swing.JTextField();
        lblPwd = new javax.swing.JLabel();
        txtPwd = new javax.swing.JTextField();
        tblConsultancy = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblName = new javax.swing.JLabel();
        lblLocation = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        lblPhNo = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();

        setBackground(new java.awt.Color(26, 39, 68));

        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameKeyPressed(evt);
            }
        });

        lblUserID.setBackground(new java.awt.Color(0, 0, 0));
        lblUserID.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblUserID.setForeground(new java.awt.Color(204, 204, 204));
        lblUserID.setText("User ID :");

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblPwd.setBackground(new java.awt.Color(0, 0, 0));
        lblPwd.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblPwd.setForeground(new java.awt.Color(204, 204, 204));
        lblPwd.setText("Password :");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Phone_number", "Location", "User_ID", "Password"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        tblConsultancy.setViewportView(jTable1);

        lblName.setBackground(new java.awt.Color(0, 0, 0));
        lblName.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(204, 204, 204));
        lblName.setText("Name:");

        lblLocation.setBackground(new java.awt.Color(0, 0, 0));
        lblLocation.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblLocation.setForeground(new java.awt.Color(204, 204, 204));
        lblLocation.setText("Location :");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        lblPhNo.setBackground(new java.awt.Color(0, 0, 0));
        lblPhNo.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblPhNo.setForeground(new java.awt.Color(204, 204, 204));
        lblPhNo.setText("Phone Number :");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUserID, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblLocation, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPwd, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPhNo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblName, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPhNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDelete)
                            .addComponent(btnUpdate)
                            .addComponent(btnAdd))))
                .addGap(226, 226, 226))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(tblConsultancy, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtLocation, txtName, txtPhNo, txtPwd, txtUserID});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdd, btnDelete, btnUpdate});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tblConsultancy, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhNo)
                    .addComponent(txtPhNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLocation)
                    .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserID)
                    .addComponent(txtUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPwd)
                    .addComponent(txtPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete))
                .addContainerGap(101, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        String username=txtUserID.getText();
        DefaultTableModel t = (DefaultTableModel) jTable1.getModel();
        int t1=jTable1.getSelectedRow();
        if(t1>=0)
        {
        String a=(String)t.getValueAt(t1, 3);
        System.out.println(a);
        ConsultancyPageDirectory bbd = ecosystem.getCpd();
        ArrayList<ConsultancyPage> cd1=bbd.getA();
        int z=cd1.size();
        for(int i=0;i<z;i++)
        {
            ConsultancyPage c=cd1.get(i);
            System.out.println(c.getUsername());
            if(c.getUserID().matches(a))
            {
                cd1.remove(c);
                ecosystem.getUserAccountDirectory().removeAccount(c);
                System.out.println("delete");
                break;
            }
        }
        populateTable();
        txtName.setText("");
        txtPhNo.setText("");
        txtLocation.setText("");
        txtUserID.setText("");
        txtPwd.setText("");
    }//GEN-LAST:event_btnDeleteActionPerformed
        else
        {
          JOptionPane.showMessageDialog(null, "Please Select a Row!!");  
        }
    }
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel t = (DefaultTableModel) jTable1.getModel();
        int t1=jTable1.getSelectedRow();
        txtName.setText(t.getValueAt(t1,0).toString());
        txtPhNo.setText(t.getValueAt(t1,1).toString());
        txtLocation.setText(t.getValueAt(t1,2).toString());
        txtUserID.setText(t.getValueAt(t1,3).toString());
        txtPwd.setText(t.getValueAt(t1,4).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        if( txtName.getText().isEmpty()||txtPhNo.getText().isEmpty()|| txtLocation.getText().isEmpty() || txtPwd.getText().isEmpty() || txtUserID.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "please enter all mandatory fields");
            return;
        }

        if(ecosystem.getUserAccountDirectory().checkIfUsernameIsUnique(txtUserID.getText())){
            if(!txtPhNo.getText().matches("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]"))
            {
                JOptionPane.showMessageDialog(null, " 10 digit phone number");
                txtPhNo.setText("");
                return;
            }

            ConsultancyPage customer = new ConsultancyPage(txtName.getText(),  txtUserID.getText(),txtPwd.getText(),txtPhNo.getText(), txtLocation.getText() );
            ecosystem.getUserAccountDirectory().addAccount(customer);
            ecosystem.getCpd().addConsultant(customer);
            populateTable();
            txtName.setText("");
            txtPhNo.setText("");
            txtLocation.setText("");
            txtUserID.setText("");
            txtPwd.setText("");
        }else{
            JOptionPane.showMessageDialog(null, "Username " + txtUserID.getText() + " already exists !!!, Please try a new one");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String username=txtUserID.getText();
        DefaultTableModel t = (DefaultTableModel) jTable1.getModel();
        int t1=jTable1.getSelectedRow();
        if(t1>=0)
        {
           {
        String a=(String)t.getValueAt(t1, 3);
        ConsultancyPageDirectory bbd = ecosystem.getCpd();
        ArrayList<ConsultancyPage> cd1=bbd.getA();
        int z=cd1.size();
        for(int i=0;i<z;i++)
        {
            ConsultancyPage c=cd1.get(i);
            c.getUsername();
            if(c.getUsername().matches(a))
            {
                if(!txtPhNo.getText().matches("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]"))
            {
                JOptionPane.showMessageDialog(null, " 10 digit phone number");
                txtPhNo.setText("");
                return;
            }

                c.setCity(txtName.getText());
                c.setState(txtPhNo.getText());
                c.setPhoneNumber(txtLocation.getText());
                c.setUserID(txtUserID.getText());
                c.setPassword(txtPwd.getText());
            }
        }
        populateTable();
    }//GEN-LAST:event_btnUpdateActionPerformed

        }
            else
        {
            JOptionPane.showMessageDialog(null, "Please Select a Row!!");
        }
    }
    private void populateTable() {
        ConsultancyPageDirectory bbd = ecosystem.getCpd();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        model.setRowCount(0);
        for (ConsultancyPage customer : bbd.getA()) {
                    Object[] row = new Object[5];
                    row[0] = customer.getCity();
                    row[1] = customer.getState();
                    row[2] = customer.getPhoneNumber();
                    row[3] = customer.getUserID();
                    row[4] = customer.getPassword();

                    model.addRow(row);
                
            }
        
    }
    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyPressed
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(Character.isDigit(c))
        {
            txtName.setEditable(false);
            JOptionPane.showMessageDialog(null, "enter Alphabets");
        }
        else
        {
            txtName.setEditable(true);
        }

    }//GEN-LAST:event_txtNameKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhNo;
    private javax.swing.JLabel lblPwd;
    private javax.swing.JLabel lblUserID;
    private javax.swing.JScrollPane tblConsultancy;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhNo;
    private javax.swing.JTextField txtPwd;
    private javax.swing.JTextField txtUserID;
    // End of variables declaration//GEN-END:variables
}
