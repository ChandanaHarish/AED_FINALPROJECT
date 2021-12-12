
package userinterface.user;

import Business.DB4OUtil.DB4OUtil;
import Business.Oncologist.Doctor;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.Doctor_appointment;
import Business.WorkQueue.Doctor_appointment_directory;
import Business.WorkQueue.app_check;
import Business.user.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raksh
 */
public class opp_status extends javax.swing.JPanel {

    private final JPanel container;
    private final EcoSystem ecosystem;
    private final UserAccount userAccount;

    /**
     * Creates new form opp_status
     */
    public opp_status(JPanel container,EcoSystem ecosystem,UserAccount userAccount) {
        initComponents();
        this.container=container;
        this.ecosystem=ecosystem;
        this.userAccount=userAccount;
        populate_table();
       
    }

     public void populate_table()
    {
        Doctor_appointment_directory dad=ecosystem.getDoctor_appointment_directory();
        ArrayList<Doctor_appointment> ol=dad.getarray();
        int u=ol.size();
        System.out.println(u);
        for(int i=0;i<u;i++)
        {
            Doctor_appointment o=ol.get(i);
            User d=(User)userAccount;
            System.out.println(o.getUser_id());
            System.out.println(d.getUser_id());
            if(o.getUser_id().matches(d.getUser_id()))
            {
            
                DefaultTableModel t2 = (DefaultTableModel) jTable1.getModel();
                String s1=String.valueOf(o.getId());
                
                
                String s[]={s1,o.getDoctor_name(),o.getLast_name(),o.getStatus(),o.getDate(),o.getTime()};
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(26, 39, 68));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Doctor Name", "Hospital", "Status", "Date", "Time"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setBackground(new java.awt.Color(195, 233, 245));
        jButton1.setText("Cancel Appointment");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Appointment Status");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(jLabel1)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(88, 88, 88)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jButton1)
                .addContainerGap(223, Short.MAX_VALUE))
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
        Doctor_appointment_directory red=ecosystem.getDoctor_appointment_directory();
        ArrayList<Doctor_appointment> ol=red.getarray();
        int u=ol.size();
        User a=(User)userAccount;
        for(int i=0;i<u;i++)
        {
            Doctor_appointment o=ol.get(i);
            if(s==o.getId()/*&&o.getStatus().matches("Deliver Man Assigned")*/)
            {
                System.out.println(o.getStatus());
                if(o.getStatus().matches("Appointment Booked"))
                {
                    o.setStatus("Canceled");
                    check(o.getDoctor_name(),o.getDate(),o.getTime());
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Wrong Move!!");
                }
                

            }

        }
        jTable1.setModel(new DefaultTableModel(null,new String[]{"ID","Doctor Name","Hospital","Status","Date","Time"}));
        populate_table();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Select A Row!!");
        }
        DB4OUtil.dB4OUtil.storeSystem(ecosystem);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void check(String s,String d1,String date)
    {
        boolean r=false;
        app_check check= ecosystem.getAppcheck();
        Map<String,List<String>> a=check.getPeopleByForename();
        for (Map.Entry mapElement : a.entrySet()) {
            if(mapElement.getKey().toString().matches(s))
            {
                List<String>a1=(List)mapElement.getValue();
                String s1=a1.get(0);
                String s2=a1.get(1);
                if(s1.matches(d1))
                {
                    if(s2.matches(date))
                    {
                        a.remove(s);
                    }
                }
            }
           
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
