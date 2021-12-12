/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.user;

import Business.DB4OUtil.DB4OUtil;
import Business.Doctor.Doctor;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.Doctor_appointment;
import Business.WorkQueue.Doctor_appointment_directory;
import Business.WorkQueue.Donate_blood_Directory;
import Business.user.User;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raksh
 */
public class Doctor_App extends javax.swing.JPanel {

    private final JPanel container;
    private final EcoSystem ecosystem;
    private final UserAccount userAccount;

    /**
     * Creates new form Doctor_App
     */
    public Doctor_App(JPanel container,EcoSystem ecosystem,UserAccount userAccount) {
        initComponents();
        this.container=container;
        this.ecosystem=ecosystem;
        this.userAccount=userAccount;
        combobox();
    }

    public void combobox()
    {
        ArrayList<Doctor> d=ecosystem.getDoctordirectory().getA();
        int s=d.size();
        ArrayList<String> spe =new ArrayList<String>();
        for(int i=0;i<s;i++)
        {
            Doctor d1=d.get(i);
            if(!spe.contains(d1.getSpealization()))
                    {
                        spe.add(d1.getSpealization());
                    }
            
        }
        for(int i=0;i<spe.size();i++)
        {
            jComboBox1.addItem(spe.get(i));
        }
        
    }
     
    public void table()
    {
        String spe=jComboBox1.getSelectedItem().toString();
         ArrayList<Doctor> d=ecosystem.getDoctordirectory().getA();
        int s=d.size();
        ArrayList<String> spe1 =new ArrayList<String>();
        jTable1.setModel(new DefaultTableModel(null,new String[]{"Name","Hospital","Spealization","Phone Number"}));
        for(int i=0;i<s;i++)
        {
            Doctor d1=d.get(i);
            if(d1.getSpealization().matches(spe))
            {
                DefaultTableModel t2 = (DefaultTableModel) jTable1.getModel();    
                String s1[]={d1.getFirstname(),d1.getLastname(),d1.getSpealization(),d1.getPhonenumber()};
                t2.addRow(s1);
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

        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(123, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        table();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        blood_bank();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel t = (DefaultTableModel) jTable1.getModel();
        int t1=jTable1.getSelectedRow();
        if(t1>=0)
        {
            if(jDateChooser1.getDate()!=null)
            {
                int x = 1 + (int) (Math.random() * 100);

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String d1 = sdf.format(jDateChooser1.getDate());
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDateTime d2 = LocalDateTime.now();
                if(d1.compareTo(d2.toString()) >= 0) {
                    Doctor_appointment d=new Doctor_appointment();
                    d.setId(x);
                    String s=(t.getValueAt(t1, 0).toString());
                    d.setDoctor_name(s);
                    String s1=(t.getValueAt(t1, 1).toString());
                    d.setLast_name(s1);
                    d.setDate(d1);
                    d.setStatus("Appointment Booked");
                    d.setTime(jComboBox2.getSelectedItem().toString());
                    User u=(User)(userAccount);
                    d.setUser_id(u.getUser_id());
                    d.setUser_name(u.getFirst_name());
                    Doctor_appointment_directory dad=ecosystem.getDoctor_appointment_directory();
                    dad.addrequest(d);
                    DB4OUtil.dB4OUtil.storeSystem(ecosystem);
                    JOptionPane.showMessageDialog(null,"Appointment booked!!");
                    

                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Appointment Available from Tomorrow");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Pick A Date!!");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please Select a Row!!");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    public void blood_bank()
    {
        opp_status ur=new opp_status(container,ecosystem,userAccount);
        container.add(ur);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
