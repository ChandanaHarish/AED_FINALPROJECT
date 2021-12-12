/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.Oncologist.Oncologist;
import Business.Oncologist.OncologistsDirectory;
import Business.EcoSystem;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chand
 */
public class OncologistRegistration extends javax.swing.JPanel {

    private final JPanel container;
    private final EcoSystem system;

    /**
     * Creates new form Doctorregistration
     */
    public OncologistRegistration(JPanel container,EcoSystem system) {
        initComponents();
        this.container=container;
        this.system=system;
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtHosp = new javax.swing.JTextField();
        txtUserID = new javax.swing.JTextField();
        txtPwd = new javax.swing.JTextField();
        txtPhNo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSpec = new javax.swing.JTextField();
        tblOncReg = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setBackground(new java.awt.Color(26, 39, 68));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("First Name :");

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Hospital:");

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("User ID:");

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Password :");

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Phone Number :");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameKeyPressed(evt);
            }
        });

        txtHosp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHospKeyPressed(evt);
            }
        });

        txtPwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPwdActionPerformed(evt);
            }
        });

        txtPhNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhNoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Sepcialization:");

        txtSpec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSpecActionPerformed(evt);
            }
        });
        txtSpec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSpecKeyPressed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First_Name", "Hospital", "Spealization", "User_ID", "Password", "Phone_Number"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        tblOncReg.setViewportView(jTable1);

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHosp)
                            .addComponent(txtPwd)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                    .addComponent(txtSpec, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPhNo)
                                    .addComponent(txtUserID))
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnUpdate)
                                    .addComponent(btnDelete)
                                    .addComponent(btnAdd)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(tblOncReg, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(169, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtHosp, txtName, txtPhNo, txtPwd, txtUserID});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdd, btnDelete, btnUpdate});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tblOncReg, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAdd))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHosp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSpec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btnUpdate)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPhNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete))
                .addContainerGap(163, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtHosp, txtName, txtPhNo, txtPwd, txtUserID});

    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtPwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPwdActionPerformed

    private void txtPhNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhNoActionPerformed

    private void txtSpecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSpecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSpecActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        if( txtName.getText().isEmpty()||txtHosp.getText().isEmpty()|| txtUserID.getText().isEmpty() || txtPhNo.getText().isEmpty() || txtPwd.getText().isEmpty()|| txtSpec.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "please enter all mandatory fields");
            return;
        }
        
         if(system.getUserAccountDirectory().checkIfUsernameIsUnique(txtUserID.getText())){
             if(!txtPhNo.getText().matches("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]"))
            {
                JOptionPane.showMessageDialog(null, " 10 digit phone number");
                txtPhNo.setText("");
                return;
            }

            Oncologist customer = new Oncologist(txtName.getText(), txtHosp.getText(),  txtUserID.getText(),txtPwd.getText(), txtPhNo.getText(), txtSpec.getText());
            system.getUserAccountDirectory().addAccount(customer);
            system.getOncologistsDirectory().addOncologist(customer);
            populateTable();
            txtName.setText("");
            txtHosp.setText("");
            txtUserID.setText("");
            txtPwd.setText("");
            txtPhNo.setText("");
            txtSpec.setText("");
         }else{
            JOptionPane.showMessageDialog(null, "Username " + txtUserID.getText() + " already exists !!!, Please try a new one");
         }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel t = (DefaultTableModel) jTable1.getModel();
        int t1=jTable1.getSelectedRow();
        if(t1>=0)
        {
             {
        String a=(String)t.getValueAt(t1, 3);
        OncologistsDirectory doctorDirectory = system.getOncologistsDirectory();
        ArrayList<Oncologist> cd1=doctorDirectory.getOncDir();
        int z=cd1.size();
        for(int i=0;i<z;i++)
        {
            Oncologist c=cd1.get(i);
            if(c.getUsername().matches(a))
                    {
                        if(!txtPhNo.getText().matches("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]"))
            {
                JOptionPane.showMessageDialog(null, " 10 digit phone number");
                txtPhNo.setText("");
                return;
            }

                        c.setFirstname(txtName.getText());
                        c.setLastname(txtHosp.getText());
                        c.setSpealization(txtSpec.getText());
                        c.setUserid(txtUserID.getText());
                        c.setPassword(txtPwd.getText());
                        c.setPhonenumber(txtPhNo.getText());
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
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        String username=txtUserID.getText();
        DefaultTableModel t = (DefaultTableModel) jTable1.getModel();
        int t1=jTable1.getSelectedRow();
        if(t1>=0)
        {
        String a=(String)t.getValueAt(t1, 3);
        OncologistsDirectory doctorDirectory = system.getOncologistsDirectory();
        ArrayList<Oncologist> cd1=doctorDirectory.getOncDir();
        int z=cd1.size();
        for(int i=0;i<z;i++)
        {
            Oncologist c=cd1.get(i);
            if(c.getUsername().matches(a))
                    {
                       doctorDirectory.removeOncologist(c);
                       system.getUserAccountDirectory().removeAccount(c);
                       System.out.println("delete");
                        break;
                    }
        }
        populateTable();
            txtName.setText("");
            txtHosp.setText("");
            txtUserID.setText("");
            txtPwd.setText("");
            txtPhNo.setText("");
            txtSpec.setText("");
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
        txtHosp.setText(t.getValueAt(t1,1).toString());
        txtSpec.setText(t.getValueAt(t1,2).toString());
        txtUserID.setText(t.getValueAt(t1,3).toString());
        txtPwd.setText(t.getValueAt(t1,4).toString());
        txtPhNo.setText(t.getValueAt(t1,5).toString());
    }//GEN-LAST:event_jTable1MouseClicked

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

    private void txtHospKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHospKeyPressed
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(Character.isDigit(c))
        {
            txtHosp.setEditable(false);
            JOptionPane.showMessageDialog(null, "enter Alphabets");
        }
        else
        {
            txtHosp.setEditable(true);
        }

    }//GEN-LAST:event_txtHospKeyPressed

    private void txtSpecKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSpecKeyPressed
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(Character.isDigit(c))
        {
            txtSpec.setEditable(false);
            JOptionPane.showMessageDialog(null, "enter Alphabets");
        }
        else
        {
            txtSpec.setEditable(true);
        }

    }//GEN-LAST:event_txtSpecKeyPressed

    
    
    private void populateTable() {
        OncologistsDirectory doctorDirectory = system.getOncologistsDirectory();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        model.setRowCount(0);
        for (Oncologist customer : doctorDirectory.getOncDir()) {
                    Object[] row = new Object[6];
                    row[0] = customer.getFirstname();
                    row[1] = customer.getLastname();
                    row[2] = customer.getSpealization();
                    row[3] = customer.getUsername();
                    row[4] = customer.getPassword();
                    row[5] = customer.getPhoneNumber();

                    model.addRow(row);
                
            }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTable jTable1;
    private javax.swing.JScrollPane tblOncReg;
    private javax.swing.JTextField txtHosp;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhNo;
    private javax.swing.JTextField txtPwd;
    private javax.swing.JTextField txtSpec;
    private javax.swing.JTextField txtUserID;
    // End of variables declaration//GEN-END:variables
}
