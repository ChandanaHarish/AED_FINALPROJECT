/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.user;

import Business.DB4OUtil.DB4OUtil;
import Business.Oncologist.Doctor;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.Doctor_appointment;
import Business.WorkQueue.Doctor_appointment_directory;
import Business.WorkQueue.app_check;
import Business.user.User;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raksh
 */
public class Doctor_opp extends javax.swing.JPanel {

    private final JPanel container;
    private final EcoSystem ecosystem;
    private final UserAccount userAccount;

    /**
     * Creates new form Doctor_opp
     */
    public Doctor_opp(JPanel container,EcoSystem ecosystem,UserAccount userAccount) {
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

        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(26, 39, 68));

        jPanel1.setLayout(new java.awt.CardLayout());

        jComboBox1.setPreferredSize(new java.awt.Dimension(140, 30));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Hospital", "Specialization", "Phone Number"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jDateChooser1.setMaxSelectableDate(new java.util.Date(1641016905000L));
        jDateChooser1.setPreferredSize(new java.awt.Dimension(140, 30));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "09:00-10:00", "10:00-11:00", "11:00-12:00", "12:00-13:00", "13:00-14:00", "14:00-15:00", "15:00-16:00", "16:00-17:00", "17:00-18:00" }));

        jButton1.setBackground(new java.awt.Color(195, 233, 245));
        jButton1.setText("Book Appointment");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(195, 233, 245));
        jButton2.setText("View Appointment Status");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Specialization :");

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Date :");
        jLabel2.setPreferredSize(new java.awt.Dimension(70, 30));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Time :");

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Doctor's Appointment");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(259, 259, 259))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(222, 222, 222)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jButton1)
                        .addGap(20, 20, 20)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jLabel3});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jComboBox1, jComboBox2, jDateChooser1});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(132, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, jLabel3});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jComboBox1, jComboBox2, jDateChooser1});

    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        table();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel t = (DefaultTableModel) jTable1.getModel();
        int t1=jTable1.getSelectedRow();
        if(t1>=0)
        {
            if(jDateChooser1.getDate()!=null)
            {
                int x = 1 + (int) (Math.random() * 100);
                boolean r=false;
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String d1 = sdf.format(jDateChooser1.getDate());
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDateTime d2 = LocalDateTime.now();
                String s=(t.getValueAt(t1, 0).toString());
                String date=jComboBox2.getSelectedItem().toString();
                if(d1.compareTo(d2.toString()) >= 0) {
                    r=check(s,d1,date);
                    if(r==false)
                    {
                    Doctor_appointment d=new Doctor_appointment();
                    d.setId(x);                    
                    d.setDoctor_name(s);
                    String s1=(t.getValueAt(t1, 1).toString());
                    d.setLast_name(s1);
                    d.setDate(d1);
                    d.setStatus("Appointment Booked");
                    d.setTime(date);
                    User u=(User)(userAccount);
                    d.setUser_id(u.getUser_id());
                    d.setUser_name(u.getFirst_name());
                    Doctor_appointment_directory dad=ecosystem.getDoctor_appointment_directory();
                    dad.addrequest(d);
                    app_check check= ecosystem.getAppcheck();
                    Map<String,List<String>> a=check.getPeopleByForename();
                    List<String> list = new ArrayList<String>();
                    list.add(d1);
                    list.add(jComboBox2.getSelectedItem().toString());                    
                    a.put(s, list);
                    DB4OUtil.dB4OUtil.storeSystem(ecosystem);
                     
                    //code to send email
                    {
        String ToEmail = u.getEmail();
        String myAccountEmail = "aedtesting123";
        String password = "aedtesting123456";
       
        
        Properties properties = new Properties();
        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.put("mail.smtp.port","587");
        
        Session session = Session.getDefaultInstance(properties,new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(myAccountEmail, password);
            }
            
        });
        try{
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail));
            message.addRecipient(javax.mail.Message.RecipientType.TO, new InternetAddress(ToEmail));
            message.setSubject("Appointment Booked!!");
            message.setText("Doctor : "+s+"\n"+"Hospital : "+s1+"\n"+"Date : "+d1+"\n"+"Time : "+jComboBox2.getSelectedItem().toString());
            javax.mail.Transport.send(message);
        }catch(Exception ex){
            System.out.println(""+ex);
        }
        
        }
                    //end of code
                    JOptionPane.showMessageDialog(null,"Appointment booked!!");

                }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Appointment slot not available!!");
                    }
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
            JOptionPane.showMessageDialog(null, "Please Select a Doctor!!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Doct_opp();
    }//GEN-LAST:event_jButton2ActionPerformed

    public boolean check(String s,String d1,String date)
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
                        r=true;
                        break;
                    }
                }
            }
           
        }
        return r;
    }
    public void Doct_opp()
    {
        opp_status ur=new opp_status(container,ecosystem,userAccount);
        jPanel1.add(ur);
        CardLayout layout = (CardLayout) jPanel1.getLayout();
        layout.next(jPanel1); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
