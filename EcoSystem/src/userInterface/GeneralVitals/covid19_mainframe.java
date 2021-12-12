/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.GeneralVitals;

import Business.Customer.Order;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Lab.BloodBank;
import Business.Lab.bloodbank_directory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.Covid19;
import Business.WorkQueue.Covid19_directory;
import Business.WorkQueue.Donate_blood;
import Business.WorkQueue.Donate_blood_Directory;
import Business.CancerHospitals.covidcenter;
import Business.user.User;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Container;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.DeliveryManRole.ProcessWorkRequestJPanel;
import userinterface.loginpage;
import userinterface.user.usermainpannel;
/**
 *
 * @author preranaj
 */
public class covid19_mainframe extends javax.swing.JPanel {

  private final JPanel container;
    private final EcoSystem ecosystem;
    private final UserAccount userAccount;
    private Covid19 covid;
    
    /**
     * Creates new form covid19_mainframe
     */
    public covid19_mainframe(JPanel container,EcoSystem ecosystem,UserAccount userAccount) {
        initComponents();
        this.container=container;
        this.ecosystem=ecosystem;
        this.userAccount=userAccount;
        covidcenter c=(covidcenter)userAccount;
        jLabel4.setText("Welcome "+c.getName());
        populate_table();
        
    }
     public void populate_table()
    {
        Covid19_directory c =ecosystem.getCdd();
        ArrayList<Covid19> ol=c.getarray();
        int u=ol.size();
        System.out.println("size"+u);
        for(int i=0;i<u;i++)
        {
            Covid19 o=ol.get(i);
            covidcenter bb=(covidcenter)(userAccount);
            System.out.println(o.getCenter());
            System.out.println(bb.getName());
            if(o.getCenter().matches(bb.getName()))
            {
            
                DefaultTableModel t2 = (DefaultTableModel) tbl1.getModel();
                String s1=String.valueOf(o.getId());
                
                
                String s[]={s1,o.getStatus(),o.getUsername(),o.getTemp(),o.getContact(),o.getSymp(),o.getPositive(), o.getAppoinment_date(),o.getResult()};
                t2.addRow(s);
            
            }
         
            
        }
    }
     
     
    public void result()
         
{   
    DefaultTableModel t2 = (DefaultTableModel) tbl1.getModel();
  int selectedRow=tbl1.getSelectedRow();
    if(selectedRow>=0)
        {
            
        int s=Integer.parseInt(t2.getValueAt(selectedRow, 0).toString());
        System.out.println("id"+s);
        Covid19_directory red=ecosystem.getCdd();
        ArrayList<Covid19> ol=red.getarray();
        int u=ol.size();
        for(int i=0;i<u;i++)
        {
            Covid19 o=ol.get(i);
            if(s==o.getId())
            {
                if(o.getResult().matches("NA"))
                {
                if(o.getStatus().matches("Appoinment Booked"))
                {
                    o.setResult(jComboBox1.getSelectedItem().toString());
                    o.setStatus("Done");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Appoinment Canceled");
                }
                }
                
              
            }
            
            
        }
        tbl1.setModel(new DefaultTableModel(null,new String[]{"ID","Status","Name","Temperature","Contact","Symptoms","Postive","Date","Result"}));
        populate_table();
        
     
        
        }
    else
    {
        
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(1036, 539));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back-button.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel3.setText("Set result :");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        tbl1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Status", "Name", "Temperature", "Contacts", "Symptoms", "Positive", "Appoitment date", "Result"
            }
        ));
        jScrollPane2.setViewportView(tbl1);

        jComboBox1.setBackground(new java.awt.Color(153, 153, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Positive", "Negative" }));

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Set Result");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(402, 402, 402)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 55, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        add(jPanel2, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        backAction();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        result();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void backAction() {
        container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        loginpage manageSuppliersJPanel = (loginpage) component;        
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
        DB4OUtil.dB4OUtil.storeSystem(ecosystem);
    }
public void delete()
{
     DefaultTableModel t2 = (DefaultTableModel) tbl1.getModel();
        if(tbl1.getSelectedRow() != -1) {
               
               t2.removeRow(tbl1.getSelectedRow());
               JOptionPane.showMessageDialog(null, "Selected row deleted successfully");
            }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl1;
    // End of variables declaration//GEN-END:variables

    
}
