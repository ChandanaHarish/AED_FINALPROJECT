/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.MedicineDelivery.FireDepartment;
import Business.MedicineDelivery.FireDepartmentDirectory;
import Business.pharmacy.Pharmacy;
import Business.pharmacy.Pharmacy_directory;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author preranaj
 */
public class firedept extends javax.swing.JPanel {

    private final EcoSystem system;
    private final JPanel container;

    /**
     * Creates new form firedept
     */
    public firedept(JPanel container,EcoSystem system) {
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
        jTextField5 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(26, 39, 68));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Name:");

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Location:");

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Phone Number:");

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("User ID :");

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Password :");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Location", "Phone_Number", "User_ID", "Password"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(130, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextField1, jTextField2, jTextField3, jTextField4, jTextField5});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2, jButton3});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addContainerGap(112, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel t = (DefaultTableModel) jTable1.getModel();
        int t1=jTable1.getSelectedRow();
        jTextField1.setText(t.getValueAt(t1,0).toString());
        jTextField2.setText(t.getValueAt(t1,1).toString());
        jTextField3.setText(t.getValueAt(t1,2).toString());
        jTextField4.setText(t.getValueAt(t1,3).toString());
        jTextField5.setText(t.getValueAt(t1,4).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if( jTextField1.getText().isEmpty()||jTextField2.getText().isEmpty()|| jTextField3.getText().isEmpty() || jTextField5.getText().isEmpty() || jTextField4.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "please enter all mandatory fields");
            return;
        }

        if(system.getUserAccountDirectory().checkIfUsernameIsUnique(jTextField4.getText())){
            if(!jTextField3.getText().matches("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]"))
            {
                JOptionPane.showMessageDialog(null, " 10 digit phone number");
                jTextField3.setText("");
                return;
            }

            FireDepartment customer = new FireDepartment(jTextField1.getText(),jTextField4.getText(), jTextField5.getText(),  jTextField3.getText(),jTextField2.getText() );
            system.getUserAccountDirectory().addAccount(customer);
            system.getFd().addpharmacy(customer);
            populateTable();
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
            jTextField5.setText("");
        }else{
            JOptionPane.showMessageDialog(null, "Username " + jTextField4.getText() + " already exists !!!, Please try a new one");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String username=jTextField4.getText();
        DefaultTableModel t = (DefaultTableModel) jTable1.getModel();
        int t1=jTable1.getSelectedRow();
        if(t1>=0)
        {
            
            {
        String a=(String)t.getValueAt(t1, 3);
        FireDepartmentDirectory pd = system.getFd();
        ArrayList<FireDepartment> cd1=pd.getA();
        int z=cd1.size();
        for(int i=0;i<z;i++)
        {
            FireDepartment c=cd1.get(i);
            c.getUsername();
            if(c.getUsername().matches(a))
            {
                if(!jTextField3.getText().matches("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]"))
            {
                JOptionPane.showMessageDialog(null, " 10 digit phone number");
                jTextField3.setText("");
                return;
            }

                c.setName(jTextField1.getText());
                c.setLocation(jTextField2.getText());
                c.setPhonenumber(jTextField3.getText());
                c.setUserid(jTextField4.getText());
                c.setPassword(jTextField5.getText());
            }
        }
        populateTable();
    }//GEN-LAST:event_jButton2ActionPerformed

        }
            else
        {
            JOptionPane.showMessageDialog(null, "Please Select a Row!!");
        }
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String username=jTextField4.getText();
        DefaultTableModel t = (DefaultTableModel) jTable1.getModel();
        int t1=jTable1.getSelectedRow();
        if(t1>=0)
        {
        String a=(String)t.getValueAt(t1, 3);
        FireDepartmentDirectory pd = system.getFd();
        ArrayList<FireDepartment> cd1=pd.getA();
        int z=cd1.size();
        for(int i=0;i<z;i++)
        {
            FireDepartment c=cd1.get(i);
            System.out.println(c.getUsername());
            if(c.getUsername().matches(a))
            {
                cd1.remove(c);
                system.getUserAccountDirectory().removeccount(c);
                System.out.println("delete");
                 break;
            }
        }
        populateTable();
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed
else
        {
            JOptionPane.showMessageDialog(null, "Please Select a Row!!");
        }
    }
    private void populateTable() {
        FireDepartmentDirectory pd = system.getFd();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for (FireDepartment customer : pd.getA()) {
                    Object[] row = new Object[5];
                    row[0] = customer.getName();
                    row[1] = customer.getLocation();                    
                    row[2] = customer.getPhonenumber();
                    row[3] = customer.getUsername();
                    row[4] = customer.getPassword();

                    model.addRow(row);
                
            }
        
    }
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(Character.isDigit(c))
        {
            jTextField1.setEditable(false);
            JOptionPane.showMessageDialog(null, "enter Alphabets");
        }
        else
        {
            jTextField1.setEditable(true);
        }

    }//GEN-LAST:event_jTextField1KeyPressed

        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
