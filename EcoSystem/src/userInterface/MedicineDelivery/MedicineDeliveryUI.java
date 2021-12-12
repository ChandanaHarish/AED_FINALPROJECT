/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.MedicineDelivery;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.EmergencyReport;
import Business.WorkQueue.EmergencyReportDirectory;
import Business.MedicineDelivery.MedicineDelivery;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userInterface.loginPage;

/**
 *
 * @author preranaj
 */
public class MedicineDeliveryUI extends javax.swing.JPanel {

    private final JPanel container;
    private final EcoSystem system;
    private final UserAccount userAccount;

    /**
     * Creates new form ChildCare
     */
    public MedicineDeliveryUI(JPanel container,EcoSystem system,UserAccount userAccount) {
        initComponents();
        this.container=container;
        this.system=system;
        this.userAccount=userAccount;
        populate_table();
    }
    
    public void populate_table()
    {
        EmergencyReportDirectory red=system.getErd();
        ArrayList<EmergencyReport> ol=red.getUser();
        int u=ol.size();
        System.out.println(u);
        for(int i=0;i<u;i++)
        {
            EmergencyReport o=ol.get(i);
            System.out.println(o.getEmergency());
            if(o.getEmergency().matches("MedicineDelivery"))
            {
            
                DefaultTableModel t2 = (DefaultTableModel) jTable1.getModel();
                String s1=String.valueOf(o.getId());
                
                
                String s[]={s1,o.getName(),o.getEmergency(),o.getLocation(),o.getStatus(),o.getResponse()};
                t2.addRow(s);
            }
            
            
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Fire Dept (1)_1.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Emergency", "Location", "Status", "Response"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 794, 230));

        jButton1.setBackground(new java.awt.Color(195, 233, 245));
        jButton1.setText("Respond");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, -1, -1));

        jButton2.setBackground(new java.awt.Color(195, 233, 245));
        jButton2.setText("False Alaram");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, -1, -1));

        jButton3.setBackground(new java.awt.Color(195, 233, 245));
        jButton3.setText("Close Case");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 420, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout (1).png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 30, -1, -1));

        jLabel3.setBackground(new java.awt.Color(26, 39, 68));
        jLabel3.setOpaque(true);
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 1040, 540));

        jLabel4.setText("go back");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel t2 = (DefaultTableModel) jTable1.getModel();
        int selectedRow=jTable1.getSelectedRow();
        if(selectedRow>=0)
        {
        int s=Integer.parseInt(t2.getValueAt(selectedRow, 0).toString());
        System.out.println("id"+s);
        EmergencyReportDirectory red=system.getErd();
        ArrayList<EmergencyReport> ol=red.getUser();
        int u=ol.size();
        MedicineDelivery a=(MedicineDelivery)userAccount;
        for(int i=0;i<u;i++)
        {
            EmergencyReport o=ol.get(i);
            if(s==o.getId()/*&&o.getStatus().matches("Deliver Man Assigned")*/)
            {
                if(o.getStatus().matches("Closed"))
                {
                    JOptionPane.showMessageDialog(null, "Emergency Closed");
                }
                else if(o.getStatus().matches("False Alaram"))
                {
                    JOptionPane.showMessageDialog(null, "Emergency is a false Alaram");
                }
                else if(o.getResponse().matches("No Response"))
                {
                    JOptionPane.showMessageDialog(null, "respond to emergency");
                }
                else
                {
                    o.setStatus("Closed");
                }              
            }
            
            
        }
        jTable1.setModel(new DefaultTableModel(null,new String[]{"ID","Name","Emergency","Location","Status","Response"}));
        populate_table();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Select a Row!!");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel t2 = (DefaultTableModel) jTable1.getModel();
        int selectedRow=jTable1.getSelectedRow();
        if(selectedRow>=0)
        {
        int s=Integer.parseInt(t2.getValueAt(selectedRow, 0).toString());
        System.out.println("id"+s);
        EmergencyReportDirectory red=system.getErd();
        ArrayList<EmergencyReport> ol=red.getUser();
        int u=ol.size();
        MedicineDelivery a=(MedicineDelivery)userAccount;
        for(int i=0;i<u;i++)
        {
            EmergencyReport o=ol.get(i);
            if(s==o.getId()/*&&o.getStatus().matches("Deliver Man Assigned")*/)
            {
                if(o.getStatus().matches("Closed"))
                {
                    JOptionPane.showMessageDialog(null, "Emergency Closed");
                }
                else if(o.getStatus().matches("False Alaram"))
                {
                    JOptionPane.showMessageDialog(null, "Emergency is a false Alaram");
                }
                else if(o.getResponse().matches("No Response"))
                {
                    o.setResponse(a.getUserName()+" "+"Responded");
                }
                else
                {
                   JOptionPane.showMessageDialog(null, "Already Responded!!"); 
                }              
              
            }
            
            
        }
        jTable1.setModel(new DefaultTableModel(null,new String[]{"ID","Name","Emergency","Location","Status","Response"}));
        populate_table();
    }
        else
        {
            JOptionPane.showMessageDialog(null, "Select a Row!!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel t2 = (DefaultTableModel) jTable1.getModel();
        int selectedRow=jTable1.getSelectedRow();
        if(selectedRow>=0)
        {
        int s=Integer.parseInt(t2.getValueAt(selectedRow, 0).toString());
        System.out.println("id"+s);
        EmergencyReportDirectory red=system.getErd();
        ArrayList<EmergencyReport> ol=red.getUser();
        int u=ol.size();
        MedicineDelivery a=(MedicineDelivery)userAccount;
        for(int i=0;i<u;i++)
        {
            EmergencyReport o=ol.get(i);
            if(s==o.getId()/*&&o.getStatus().matches("Deliver Man Assigned")*/)
            {               
                if(o.getStatus().matches("Closed"))
                {
                    JOptionPane.showMessageDialog(null, "Emergency Closed");
                }
                else if(o.getStatus().matches("False Alaram"))
                {
                    JOptionPane.showMessageDialog(null, "Emergency is a false Alaram");
                }
                else if(o.getResponse().matches("No Response"))
                {
                    JOptionPane.showMessageDialog(null, "respond to emergency");
                }
                else
                {
                    o.setStatus("False Alaram");
                }
            }
            
            
        }
        jTable1.setModel(new DefaultTableModel(null,new String[]{"ID","Name","Emergency","Location","Status","Response"}));
        populate_table();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Select a Row!!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
//        backAction();
//        DB4OUtil.dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        backAction();
       DB4OUtil.dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void backAction() {
        container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        loginPage manageSuppliersJPanel = (loginPage) component;        
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
