/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.bloodbankframe;

import Business.EcoSystem;
import Business.Lab.BloodBank;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.Donate_blood;
import Business.WorkQueue.Donate_blood_Directory;
import Business.WorkQueue.request_blood;
import Business.WorkQueue.request_blood_directory;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ajay09
 */
public class Doctor_request extends javax.swing.JPanel {

    private final JPanel container;
    private final UserAccount userAccount;
    private final EcoSystem ecosystem;

    /**
     * Creates new form Doctor_request
     */
    public Doctor_request(JPanel container,EcoSystem ecosystem,UserAccount userAccount) {
        initComponents();
        this.container=container;
        this.ecosystem=ecosystem;
        this.userAccount=userAccount;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Status", "Blood Type", "Units Requested"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Process Request");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel1.setText("Request Pending..");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userInterface/bloodbankframe/req1.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(304, 304, 304)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(275, 275, 275))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton1))
                        .addGap(72, 72, 72))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(58, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel  t2 = (DefaultTableModel) jTable1.getModel();
        int selectedRow=jTable1.getSelectedRow();
        if(selectedRow>=0)
        {
        int s=Integer.parseInt(t2.getValueAt(selectedRow, 0).toString());
        System.out.println("id"+s);
        request_blood_directory rbd=ecosystem.getRbd();
        ArrayList<request_blood> ol=rbd.getarray();
        int u=ol.size();
        BloodBank bb=(BloodBank)(userAccount);
        for(int i=0;i<u;i++)
        {
            request_blood o=ol.get(i);
            if(s==o.getId()/*&&o.getStatus().matches("Deliver Man Assigned")*/)
            {
                if(o.getStatus().matches("In Progress"))
                {
                boolean r=check();
                if(r==false)
                {
                    o.setStatus("Cancled");
                     JOptionPane.showMessageDialog(null,"Inadequate Inventory");  
                    
                }
                else
                {
                    sub();
                    o.setStatus("Approved");
                     JOptionPane.showMessageDialog(null, "Request Approved!!");

                }
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Wrong Move!!");  
                    
                
                }
                
            }
            
            }
        jTable1.setModel(new DefaultTableModel(null,new String[]{"ID","Name","Status","Blood Type","Units requested"}));
        populate_table();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Select a Row!!"); 
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel  t2 = (DefaultTableModel) jTable1.getModel();
        int selectedRow=jTable1.getSelectedRow();
        if(selectedRow>=0)
        {
        int s=Integer.parseInt(t2.getValueAt(selectedRow, 0).toString());
        System.out.println("id"+s);
        request_blood_directory rbd=ecosystem.getRbd();
        ArrayList<request_blood> ol=rbd.getarray();
        int u=ol.size();
        BloodBank bb=(BloodBank)(userAccount);
        for(int i=0;i<u;i++)
        {
            request_blood o=ol.get(i);
            if(s==o.getId()/*&&o.getStatus().matches("Deliver Man Assigned")*/)
            {
                if(o.getStatus().matches("In Progress"))
                {
                    o.setStatus("Cancled");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Wrong Move!!");
                }
            }
        }
        jTable1.setModel(new DefaultTableModel(null,new String[]{"ID","Name","Status","Blood Type","Units requested"}));
        populate_table();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Select a Row!!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    public void sub()
    {
        request_blood_directory rbd=ecosystem.getRbd();
        ArrayList<request_blood> ol=rbd.getarray();
        int u=ol.size();
        BloodBank bb=(BloodBank)(userAccount);
        for(int i=0;i<u;i++)
        {
            request_blood o=ol.get(i);
            String gj=o.getBlood_type();
                int a=o.getUnits();
                System.out.println(gj);
                System.out.println(a);
                Map<String,Integer> stock=bb.getHmap();  
                for (Map.Entry<String, Integer> set : stock.entrySet()) 
                {
                    System.out.println(set.getKey());
                    System.out.println(gj);
                    if(set.getKey().equals(gj))
                    {
                        int a1=set.getValue();
                        int b=a1-a;
                        set.setValue(b);
                        
                    }
                }
        }
               
        
    }
    public boolean check()
    {
        DefaultTableModel  t2 = (DefaultTableModel) jTable1.getModel();
        int selectedRow=jTable1.getSelectedRow();
        int s=Integer.parseInt(t2.getValueAt(selectedRow, 0).toString());
        System.out.println("id"+s);
        request_blood_directory rbd=ecosystem.getRbd();
        ArrayList<request_blood> ol=rbd.getarray();
        int u=ol.size();
        boolean r=false;
        BloodBank bb=(BloodBank)(userAccount);
        for(int i=0;i<u;i++)
        {
            request_blood o=ol.get(i);
            if(s==o.getId()/*&&o.getStatus().matches("Deliver Man Assigned")*/)
            {
                
                String gj=o.getBlood_type();
                int a=o.getUnits();
                System.out.println(gj);
                System.out.println(a);
                Map<String,Integer> stock=bb.getHmap();  
                for (Map.Entry<String, Integer> set : stock.entrySet()) 
                {
                    System.out.println(set.getKey());
                    System.out.println(gj);
                    if(set.getKey().equals(gj))
                    {
                        if(set.getValue()>a)
                        {
                            System.out.println("if1");
                            System.out.println(set.getValue());
                            r= true;
                            break;
                        }
                    }
		}
            }
        }
        return r;
        
    }
        public void populate_table()
    {
        request_blood_directory rbd=ecosystem.getRbd();
        ArrayList<request_blood> ol=rbd.getarray();
        int u=ol.size();
        System.out.println(u);
        for(int i=0;i<u;i++)
        {
            request_blood o=ol.get(i);
            BloodBank bb=(BloodBank)(userAccount);
            System.out.println(o.getBlood_bank_name());
            System.out.println(bb.getName());
            if(o.getBlood_bank_name().matches(bb.getName()))
            {
                DefaultTableModel t2 = (DefaultTableModel) jTable1.getModel();
                String s1=String.valueOf(o.getId());    
                String s[]={s1,o.getFirst_name(),o.getStatus(),o.getBlood_type(),Integer.toString(o.getUnits())};
                t2.addRow(s);
            }
        }
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
