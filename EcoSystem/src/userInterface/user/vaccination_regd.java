/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.user;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.vaccination_request;
import Business.WorkQueue.vaccination_request_directory;
import Business.user.User;
import Business.user.User_directory;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author preranaj
 */
public class vaccination_regd extends javax.swing.JPanel {

    private final JPanel container;
    private final EcoSystem ecosystem;
    private final UserAccount userAccount;

    /**
     * Creates new form vaccination_regd
     */
    public vaccination_regd(JPanel container,EcoSystem ecosystem,UserAccount userAccount) {
        initComponents();
        this.container=container;
        this.ecosystem=ecosystem;
        this.userAccount=userAccount;
        jRadioButton1.setActionCommand("Yes");
        jRadioButton3.setActionCommand("Yes");
        jRadioButton5.setActionCommand("Yes");
        jRadioButton7.setActionCommand("Yes");
        jRadioButton2.setActionCommand("No");
        jRadioButton4.setActionCommand("No");
        jRadioButton6.setActionCommand("No");
        jRadioButton8.setActionCommand("No");
         populate_table();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(26, 39, 68));
        setPreferredSize(new java.awt.Dimension(770, 539));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Are you feeling anxious today ?");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Status", "Pharmacy", "Therapy", "Date", "Time"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(204, 204, 204));
        jRadioButton1.setText("Yes");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(204, 204, 204));
        jRadioButton2.setText("No");

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Are you sleeping well ?");

        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(204, 204, 204));
        jRadioButton3.setText("Yes");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(204, 204, 204));
        jRadioButton4.setText("No");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Are you feeling content ?");

        buttonGroup3.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jRadioButton5.setForeground(new java.awt.Color(204, 204, 204));
        jRadioButton5.setText("Yes");

        buttonGroup3.add(jRadioButton6);
        jRadioButton6.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jRadioButton6.setForeground(new java.awt.Color(204, 204, 204));
        jRadioButton6.setText("No");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Are you under any medication ?");

        buttonGroup4.add(jRadioButton7);
        jRadioButton7.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jRadioButton7.setForeground(new java.awt.Color(204, 204, 204));
        jRadioButton7.setText("Yes ");

        buttonGroup4.add(jRadioButton8);
        jRadioButton8.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jRadioButton8.setForeground(new java.awt.Color(204, 204, 204));
        jRadioButton8.setText("No");
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(195, 233, 245));
        jButton1.setText("Register ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(195, 233, 245));
        jButton2.setText("Cancel ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Mental Health Portal");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(65, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jRadioButton5)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton6)
                                .addGap(68, 68, 68))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(36, 36, 36)
                                                .addComponent(jRadioButton1))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(37, 37, 37)
                                                .addComponent(jRadioButton3)))
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioButton4)
                                            .addComponent(jRadioButton2)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(jRadioButton7)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton8)))
                                .addGap(65, 65, 65)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(127, 127, 127))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(212, 212, 212))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton6)
                            .addComponent(jRadioButton5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jButton2)))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton7)
                    .addComponent(jRadioButton8))
                .addContainerGap(62, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        vaccination_request_directory vrd=ecosystem.getVrd();
        ArrayList<vaccination_request> ol=vrd.getarray();
        int u=ol.size();
        System.out.println(u);
        boolean r=true;
        for(int i=0;i<u;i++)
        {
            vaccination_request o=ol.get(i);
            System.out.println(userAccount.getUsername());
            System.out.println(o.getUser_id());
            if(userAccount.getUsername().matches(o.getUser_id()))
            {
                if(o.getStatus().equals("In progress")||o.getStatus().equals("Done")||o.getStatus().equals("Approved"))
                {
                    r=false;
                    JOptionPane.showMessageDialog(null,"Status : "+o.getStatus());
                }
                
            }
            
            
        }
        if(r==true)
        {
            if((jRadioButton1.isSelected()||jRadioButton2.isSelected())&&(jRadioButton3.isSelected()||jRadioButton4.isSelected())&&(jRadioButton5.isSelected()||jRadioButton6.isSelected())&&(jRadioButton7.isSelected()||jRadioButton8.isSelected())){
                int x = 1 + (int) (Math.random() * 100);
                        vaccination_request vr= new vaccination_request();
                        vr.setId(x);
                        vr.setCovid_19(buttonGroup1.getSelection().getActionCommand());
                        vr.setDiabetese(buttonGroup2.getSelection().getActionCommand());
                        vr.setMedication(buttonGroup3.getSelection().getActionCommand());
                        vr.setBlood_thinner(buttonGroup4.getSelection().getActionCommand());
                        System.out.println(buttonGroup1.getSelection().getActionCommand());
                        vr.setStatus("In progress");
                        vr.setPharmacy("NA");
                        vr.setVaccination("NA");
                        vr.setDate("NA");
                        vr.setTime("NA");
                        User u1=(User)(userAccount);
                        vr.setFirst_name(u1.getFirst_name());
                        vr.setUser_id(u1.getUser_id());
                        vrd.addrequest(vr);
                         JOptionPane.showMessageDialog(null, "Registered!!");
                        jTable1.setModel(new DefaultTableModel(null,new String[]{"ID","Status","Pharmacy","Vaccination","Date","Time"}));
                        populate_table();
                
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Please select all Botton");
            }
        }
        DB4OUtil.dB4OUtil.storeSystem(ecosystem);
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed
  
    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel  t2 = (DefaultTableModel) jTable1.getModel();
        int selectedRow=jTable1.getSelectedRow();
        if(selectedRow>=0)
        {
        int s=Integer.parseInt(t2.getValueAt(selectedRow, 0).toString());
        System.out.println("id"+s);
        vaccination_request_directory vrd=ecosystem.getVrd();
        ArrayList<vaccination_request> ol=vrd.getarray();
        int u=ol.size();
        User bb=(User)(userAccount);
        for(int i=0;i<u;i++)
        {
            vaccination_request o=ol.get(i);
            if(s==o.getId()/*&&o.getStatus().matches("Deliver Man Assigned")*/)
            {
                if(o.getStatus().equals("Cancel")||o.getStatus().equals("Done")||o.getStatus().equals("Approved"))
                {
                     JOptionPane.showMessageDialog(null,"wrong move!!");
                }
                else
                        {
                            
                            o.setStatus("Cancel");
                        }
               
            }
            }
        jTable1.setModel(new DefaultTableModel(null,new String[]{"ID","Status","Pharmacy","Vaccination","Date","Time"}));
        populate_table();
    }                                        
else
        {
            JOptionPane.showMessageDialog(null,"Select a Row!!");
        }
    
        
        /*vaccination_request_directory vrd=ecosystem.getVrd();
        ArrayList<vaccination_request> ol=vrd.getarray();
        int u=ol.size();
        System.out.println(u);
        boolean r=true;
        for(int i=0;i<u;i++)
        {
            vaccination_request o=ol.get(i);
            System.out.println(userAccount.getUsername());
            System.out.println(o.getUser_id());
            if(userAccount.getUsername().matches(o.getUser_id()))
            {
                if(o.getStatus().equals("Cancel")||o.getStatus().equals("Done"))
                {
                    r=false;
                    JOptionPane.showMessageDialog(null,"Status : "+o.getStatus());
                }
                
            }
            
            
        }
        if(r==true)
        {
            for(int i=0;i<u;i++)
        {
            vaccination_request o=ol.get(i);
            System.out.println(userAccount.getUsername());
            System.out.println(o.getUser_id());
            if(userAccount.getUsername().matches(o.getUser_id()))
            {
                o.setStatus("Cancel");
            }
            }
            jTable1.setModel(new DefaultTableModel(null,new String[]{"ID","Status","Pharmacy","Vaccination"}));
            populate_table();
                        
        }
        DB4OUtil.dB4OUtil.storeSystem(ecosystem);*/
        
    }//GEN-LAST:event_jButton2ActionPerformed

    public void populate_table()
    {
        vaccination_request_directory vrd=ecosystem.getVrd();
        ArrayList<vaccination_request> ol=vrd.getarray();
        int u=ol.size();
        System.out.println(u);
        for(int i=0;i<u;i++)
        {
            vaccination_request o=ol.get(i);
            System.out.println(userAccount.getUsername());
            System.out.println(o.getUser_id());
            if(userAccount.getUsername().matches(o.getUser_id()))
            {
                DefaultTableModel t2 = (DefaultTableModel) jTable1.getModel();
                String s1=String.valueOf(o.getId());    
                String s[]={s1,o.getStatus(),o.getPharmacy(),o.getVaccination(),o.getDate(),o.getTime()};
                t2.addRow(s);
            }
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
