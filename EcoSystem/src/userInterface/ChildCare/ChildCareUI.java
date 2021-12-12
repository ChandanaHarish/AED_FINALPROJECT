/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.ChildCare;

import Business.ChildCare.ChildCare;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.EmergencyReport;
import Business.WorkQueue.EmergencyReportDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import static java.time.Clock.system;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userInterface.loginPage;

/**
 *
 * @author chand
 */
public class ChildCareUI extends javax.swing.JPanel {
     private final JPanel container;
    private final EcoSystem ecoSystem;
    private final UserAccount userAccount;

    /**
     * Creates new form ChildCare
     */
    public ChildCareUI(JPanel container,EcoSystem ecoSystem,UserAccount userAccount) {
        initComponents();
        this.container=container;
        this.ecoSystem=ecoSystem;
        this.userAccount=userAccount;
        ChildCare p=(ChildCare)userAccount;
        jLabel4.setText(p.getUserName()+" Welcome!!");
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
        btnRespondChildCare = new javax.swing.JButton();
        btnFalseAlarmChildCare = new javax.swing.JButton();
        btnCloseChildCare = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Emergency", "Location", "Status", "Response"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnRespondChildCare.setBackground(new java.awt.Color(195, 233, 245));
        btnRespondChildCare.setText("Respond");
        btnRespondChildCare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRespondChildCareActionPerformed(evt);
            }
        });

        btnFalseAlarmChildCare.setBackground(new java.awt.Color(195, 233, 245));
        btnFalseAlarmChildCare.setText("False Alarm");
        btnFalseAlarmChildCare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFalseAlarmChildCareActionPerformed(evt);
            }
        });

        btnCloseChildCare.setBackground(new java.awt.Color(195, 233, 245));
        btnCloseChildCare.setText("Close Case");
        btnCloseChildCare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseChildCareActionPerformed(evt);
            }
        });

        jLabel4.setText("jLabel4");

        jLabel1.setText("go back");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(415, 415, 415))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(233, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(btnRespondChildCare)
                .addGap(18, 18, 18)
                .addComponent(btnFalseAlarmChildCare)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCloseChildCare)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(174, 174, 174))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRespondChildCare)
                    .addComponent(btnFalseAlarmChildCare)
                    .addComponent(btnCloseChildCare))
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRespondChildCareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRespondChildCareActionPerformed
        // TODO add your handling code here:
        DefaultTableModel  t2 = (DefaultTableModel) jTable1.getModel();
        int selectedRow=jTable1.getSelectedRow();
        if(selectedRow>=0)
        {
            int s=Integer.parseInt(t2.getValueAt(selectedRow, 0).toString());
            System.out.println("id"+s);
            EmergencyReportDirectory red=ecoSystem.getErd();
            ArrayList<EmergencyReport> ol=red.getUser();
            int u=ol.size();
            ChildCare a=(ChildCare)userAccount;
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
            JOptionPane.showMessageDialog(null, "Select A Row!!");
        }
    }//GEN-LAST:event_btnRespondChildCareActionPerformed

    private void btnFalseAlarmChildCareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFalseAlarmChildCareActionPerformed
        // TODO add your handling code here:
        DefaultTableModel t2 = (DefaultTableModel) jTable1.getModel();
        int selectedRow=jTable1.getSelectedRow();
        if(selectedRow>=0)
        {
            int s=Integer.parseInt(t2.getValueAt(selectedRow, 0).toString());
            System.out.println("id"+s);
            EmergencyReportDirectory red=ecoSystem.getErd();
            ArrayList<EmergencyReport> ol=red.getUser();
            ChildCare a=(ChildCare)userAccount;
            int u=ol.size();
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
            JOptionPane.showMessageDialog(null, "Select A Row!!");
        }
    }//GEN-LAST:event_btnFalseAlarmChildCareActionPerformed

    private void btnCloseChildCareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseChildCareActionPerformed
        // TODO add your handling code here:
        DefaultTableModel t2 = (DefaultTableModel) jTable1.getModel();
        int selectedRow=jTable1.getSelectedRow();
        if(selectedRow>=0)
        {
            int s=Integer.parseInt(t2.getValueAt(selectedRow, 0).toString());
            System.out.println("id"+s);
            EmergencyReportDirectory red=ecoSystem.getErd();
            ArrayList<EmergencyReport> ol=red.getUser();
            int u=ol.size();
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
            JOptionPane.showMessageDialog(null, "Select A Row!!");
        }
    }//GEN-LAST:event_btnCloseChildCareActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        backAction();
        DB4OUtil.dB4OUtil.storeSystem(ecoSystem);
    }//GEN-LAST:event_jLabel1MouseClicked
    
    private void backAction() {
        container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        loginPage manageSuppliersJPanel = (loginPage) component;        
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }
    public void populate_table()
    {
        EmergencyReportDirectory red=ecoSystem.getErd();
        ArrayList<EmergencyReport> ol=red.getUser();
        int u=ol.size();
        System.out.println(u);
        for(int i=0;i<u;i++)
        {
            EmergencyReport o=ol.get(i);
            if(o.getEmergency().matches("Crime"))
            {
            
                DefaultTableModel t2 = (DefaultTableModel) jTable1.getModel();
                String s1=String.valueOf(o.getId());
                
                
                String s[]={s1,o.getName(),o.getEmergency(),o.getLocation(),o.getStatus(),o.getResponse()};
                t2.addRow(s);
            
            }
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCloseChildCare;
    private javax.swing.JButton btnFalseAlarmChildCare;
    private javax.swing.JButton btnRespondChildCare;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
