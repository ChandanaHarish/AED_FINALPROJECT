/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;
import Business.Ambulance.Ambulance;
import Business.Ambulance.AmbulanceDirectory;
import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryMan;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Oncologist.Oncologist;
import Business.Oncologist.OncologistsDirectory;
import Business.EcoSystem;
//import Business.Lab.BloodBank;
//import Business.Lab.bloodbank_directory;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import Business.CancerHospitals.CancerHospitals;
import Business.CancerHospitals.CancerHospitalsDirectory;
import Business.MedicineDelivery.MedicineDelivery;
import Business.MedicineDelivery.MedicineDeliveryDirectory;
import Business.NCI.NCI;
import Business.NCI.NCIDirectory;
import Business.Pharmacy.Pharmacy;
import Business.Pharmacy.PharmacyDirectory;
import Business.ChildCare.ChildCare;
import Business.ChildCare.ChildCareDirectory;
import Business.user.User;
import Business.user.userDirectory;
import Business.Consultancy.ConsultancyPage;
import Business.Consultancy.ConsultancyPageDirectory;
import Business.role.AmbulanceDriver;
import Business.role.ChildCareAdmin;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userInterface.CustomerRole.CustomerAreaJPanel;
//import userinterface.CustomerRole.customer_main;
import userInterface.DeliveryManRole.DeliveryManWorkAreaJPanel;
import userInterface.DeliveryManRole.ProcessWorkRequestJPanel;
import userInterface.RestaurantAdminRole.AdminWorkAreaJPanel;
import userInterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
//import userInterface.SystemAdminWorkArea.systemadmin;
//import userInterface.ambulance.Ambulanceframe;
//import userinterface.bloodbankframe.bloodbankframe;
//import userInterface.MentalHealthDirectory.covid19_mainframe;
//import userinterface.doctor.Doctorframe;
//import userinterface.firedepartment.firedepartmentframe;
//import userinterface.government.government_main_frame;
//import userinterface.pharmacy.pharmacyframe;
//import userinterface.policeframe.police_frame;
//import userinterface.user.usermainpannel;
import java.awt.Color;
import userInterface.Ambulance.AmbulanceUI;
import userInterface.ChildCare.ChildCareUI;
import userInterface.MedicineDelivery.MedicineDeliveryUI;
//import userinterface.SystemAdminWorkArea.systemadminenterprise;
//import userinterface.vaccination.vaccination;

/**
 *
 * @author raksh
 */
public class loginPage extends javax.swing.JPanel {

    /**
     * Creates new form loginpage
     */
    EcoSystem system;
    JPanel container;
    UserAccount userAccount;
    public loginPage() {
        initComponents();
    }
    
    public loginPage(JPanel container, EcoSystem system) {
        initComponents();
        this.system=system;
        this.container=container;
        this.setSize(1036, 539);
        this.setBackground(new Color(0,0,0,0));
        jTextField1.setBackground(new Color(0,0,0,0));
        jPasswordField1.setBackground(new Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1036, 537));

        jPanel1.setBackground(new java.awt.Color(216, 235, 228));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MicrosoftTeams-image.png"))); // NOI18N
        jLabel12.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 310, 280, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 210, 280, 10));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/x-button (2).png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MicrosoftTeams-image (2).png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, 100, 110));

        jPasswordField1.setBackground(new java.awt.Color(0, 0, 0));
        jPasswordField1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(204, 204, 204));
        jPasswordField1.setText("*******");
        jPasswordField1.setToolTipText("");
        jPasswordField1.setBorder(null);
        jPasswordField1.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, 280, 40));

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(204, 204, 204));
        jTextField1.setText("Enter Username here");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 180, 290, 40));

        jButton1.setBackground(new java.awt.Color(195, 233, 245));
        jButton1.setFont(new java.awt.Font("Lucida Fax", 0, 16)); // NOI18N
        jButton1.setText("Login");
        jButton1.setBorderPainted(false);
        jButton1.setPreferredSize(new java.awt.Dimension(146, 25));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 380, 160, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/key (2).png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 32, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user (3).png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 32, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo@2x (1).png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(300, 120));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        jButton2.setBackground(new java.awt.Color(195, 233, 245));
        jButton2.setFont(new java.awt.Font("Lucida Fax", 0, 16)); // NOI18N
        jButton2.setText("User Registration");
        jButton2.setBorderPainted(false);
        jButton2.setPreferredSize(new java.awt.Dimension(146, 25));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 380, 170, -1));

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Password");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 240, 140, 40));

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Username");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, 140, 40));

        jLabel3.setBackground(new java.awt.Color(26, 39, 68));
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 630, 540));

        jLabel2.setBackground(new java.awt.Color(195, 233, 245));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 540));

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Username");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 80, 140, 40));

        jLabel10.setText("jLabel10");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 20, 80, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String userName = jTextField1.getText();
        char[] passwordCharArray = jPasswordField1.getPassword();
        String password = String.valueOf(passwordCharArray);

       userAccount = system.getUserAccountDirectory().authenticateUser(userName, password);
      
        if(userAccount==null){
            JOptionPane.showMessageDialog(null, "Invalid credentials");
            return;
        }else{
            jTextField1.setText("");
            jPasswordField1.setText("");
            System.out.println(userAccount.getRole());
            String a=(userAccount.getRole().toString());
            
            if(a.equals("Business.Role.SystemAdminRole"))
            {
                callSystemAdminWorkAreaJPanel();
                
            }
            else if(a.equals("Business.Role.CustomerRole"))
            {
                CustomerDirectory cd=system.getCustomerDirectory();
                ArrayList<Customer> c=cd.getA();
                int size=c.size();
                int count=0;
                for(int i=0;i<size;i++)
                {
                Customer c1=c.get(i);
                if(userAccount.getUsername().matches(c1.getUsername()))
                {
                callCustomerAreaJPanel();
                count+=1;
                }            
                }
                if(count==0)
                {
                  JOptionPane.showMessageDialog(null, "Invalid credentials");  
                }
            }
            else if(a.equals("Business.Role.AdminRole"))
            {
                
                RestaurantDirectory cd=system.getRestaurantDirectory();
                ArrayList<Restaurant> c=cd.getRestaurantList();
                int size=c.size();
                int count=0;
                for(int i=0;i<size;i++)
                {
                Restaurant c1=c.get(i);
                if(userAccount.getUsername().matches(c1.getUsername()))
                {
                callAdminWorkAreaJPanel();
                count+=1;
                }            
                }
                if(count==0)
                {
                  JOptionPane.showMessageDialog(null, "Invalid credentials");  
                }
            }
            else if(a.equals("Business.Role.UserRole"))
            {
                userDirectory cd=system.getUserDirectory();
                ArrayList<User> c=cd.getUser();
                int size=c.size();
                System.out.println(c.size());
                int count=0;
                for(int i=0;i<size;i++)
                {
                User c1=c.get(i);
                if(userAccount.getUsername().matches(c1.getUserID()))
                {
                calluser();
                count+=1;
                }            
                }
                if(count==0)
                {
                  JOptionPane.showMessageDialog(null, "Invalid credentials");  
                }
            }
            else if(a.equals("Business.Role.OncologistRole"))
            {
                OncologistsDirectory cd=system.getOncologistsDirectory();
                ArrayList<Oncologist> c=cd.getOncDir();
                int size=c.size();
                System.out.println(c.size());
                int count=0;
                for(int i=0;i<size;i++)
                {
                Oncologist c1=c.get(i);
                System.out.println(userAccount.getUsername());
                System.out.println(c1.getUserID());                
                if(userAccount.getUsername().matches(c1.getUsername()))
                {
                    
                callOncologist();
                count+=1;
                }       
                }
                if(count==0)
                {
                  JOptionPane.showMessageDialog(null, "Invalid credentials");  
                }
            }
//            else if(a.equals("Business.Role.bloodbankadminrole"))
//            {
//                bloodbank_directory cd=system.getBloodbankdirectory();
//                ArrayList<BloodBank> c=cd.getA();
//                int size=c.size();
//                System.out.println(c.size());
//                int count=0;
//                for(int i=0;i<size;i++)
//                {
//                BloodBank c1=c.get(i);
//                if(userAccount.getUsername().matches(c1.getUserid()))
//                {
//                callbloodbank();
//                count+=1;
//                }            
//                }
//                if(count==0)
//                {
//                  JOptionPane.showMessageDialog(null, "Invalid credentials");  
//                }
//            }
            else if(a.equals("Business.Role.PharmacyAdmin"))
            {
                PharmacyDirectory cd=system.getPharmacyDirectory();
                ArrayList<Pharmacy> c=cd.getPh();
                int size=c.size();
                System.out.println(c.size());
                int count=0;
                for(int i=0;i<size;i++)
                {
                Pharmacy c1=c.get(i);
                if(userAccount.getUsername().matches(c1.getUserID()))
                {
                callpharmacy();
                count+=1;
                }            
                }
                if(count==0)
                {
                  JOptionPane.showMessageDialog(null, "Invalid credentials");  
                }
            }
            else if(a.equals("Business.Role.ChildCareRole"))
            {
                ChildCareDirectory cd=system.getCcd();
                ArrayList<ChildCare> c=cd.getA();
                int size=c.size();
                System.out.println(c.size());
                int count=0;
                for(int i=0;i<size;i++)
                {
                ChildCare c1=c.get(i);
                if(userAccount.getUsername().matches(c1.getUserID()))
                {
                callChildCare();
                count+=1;
                }            
                }
                if(count==0)
                {
                  JOptionPane.showMessageDialog(null, "Invalid credentials");  
                }
            }
            else if(a.equals("Business.Role.MedicineDeliveryAdmin"))
            {
                MedicineDeliveryDirectory cd=system.getMedicineDelivery();
                ArrayList<MedicineDelivery> c=cd.getA();
                int size=c.size();
                System.out.println(c.size());
                int count=0;
                for(int i=0;i<size;i++)
                {
                MedicineDelivery c1=c.get(i);
                if(userAccount.getUsername().matches(c1.getUserID()))
                {
                callMedicineDelivery();
                count+=1;
                }            
                }
                if(count==0)
                {
                  JOptionPane.showMessageDialog(null, "Invalid credentials");  
                }
            }
            else if(a.equals("Business.Role.NCI"))
            {
                NCIDirectory nd=system.getNciDirectory();
                ArrayList<NCI> c=nd.getA();
                int size=c.size();
                System.out.println(c.size());
                int count=0;
                for(int i=0;i<size;i++)
                {
                NCI c1=c.get(i);
                if(userAccount.getUsername().matches(c1.getUserID()))
                {
                callNCI();
                count+=1;
                }            
                }
                if(count==0)
                {
                  JOptionPane.showMessageDialog(null, "Invalid credentials");  
                }
            }
            else if(a.equals("Business.Role.AmbulanceDriver"))
            {
                AmbulanceDirectory cd=system.getAmbulanceDirectory();
                ArrayList<Ambulance> c=cd.getAmb();
                int size=c.size();
                System.out.println(c.size());
                int count=0;
                for(int i=0;i<size;i++)
                {
                Ambulance c1=c.get(i);
                if(userAccount.getUsername().matches(c1.getUserID()))
                {
                callambulance();
                count+=1;
                }            
                }
                if(count==0)
                {
                  JOptionPane.showMessageDialog(null, "Invalid credentials");  
                }
            }
            else if(a.equals("Business.Role.CancerHospitalsadmin"))
            {
                CancerHospitalsDirectory cd=system.getChd();
                ArrayList<CancerHospitals> c=cd.getA();
                int size=c.size();
                System.out.println(c.size());
                int count=0;
                for(int i=0;i<size;i++)
                {
                CancerHospitals c1=c.get(i);
                if(userAccount.getUsername().matches(c1.getUserID()))
                {
                callambulance1();
                count+=1;
                }            
                }
                if(count==0)
                {
                  JOptionPane.showMessageDialog(null, "Invalid credentials");  
                }
            }
            else if(a.equals("Business.Role.Vaccination_admin"))
            {
                ConsultancyPageDirectory cd=system.getCpd();
                ArrayList<ConsultancyPage> c=cd.getA();
                int size=c.size();
                System.out.println(c.size());
                int count=0;
                for(int i=0;i<size;i++)
                {
                ConsultancyPage c1=c.get(i);
                if(userAccount.getUsername().matches(c1.getUserID()))
                {
                vaccination();
                count+=1;
                }            
                }
                if(count==0)
                {
                  JOptionPane.showMessageDialog(null, "Invalid credentials");  
                }
            }
            
            else
            {
                System.out.println(userAccount.getRole());
            }           
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public void vaccination()
    {
        vaccination ur=new vaccination(container,system,userAccount);
        container.add(ur);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container); 
    }
    public void callambulance1()
    {
        covid19_mainframe ur=new covid19_mainframe(container,system,userAccount);
        container.add(ur);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container); 
    }
    
    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        calluserregisteration();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        System.exit(0);
        
        
    }//GEN-LAST:event_jLabel11MouseClicked

    public void callambulance()
    {
        AmbulanceUI ur=new AmbulanceUI(container,system,userAccount);
        container.add(ur);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container); 
    }
    public void callgov()
    {
        government_main_frame ur=new government_main_frame(container,system,userAccount);
        container.add(ur);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container); 
    }
    
    public void callMedicineDelivery()
    {
        MedicineDeliveryUI ur=new MedicineDeliveryUI(container,system,userAccount);
        container.add(ur);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container); 
    }
    
    public void callChildCare()
    {
        ChildCareUI ur=new ChildCareUI(container,system,userAccount);
        container.add(ur);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container); 
    }
    
    public void callpharmacy()
    {
        pharmacyframe ur=new pharmacyframe(container,system,userAccount);
        container.add(ur);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container); 
    }
    
//    public void callbloodbank()
//    {
//        bloodbankframe ur=new bloodbankframe(container,system,userAccount);
//        container.add(ur);
//        CardLayout layout = (CardLayout) container.getLayout();
//        layout.next(container); 
//    }
    public void callOncologist()
    {
        Doctorframe ur=new Doctorframe(container,system,userAccount);
        container.add(ur);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container); 
    }
    
    public void calluser()
    {
        usermainpannel ur=new usermainpannel(container,system,userAccount);
        container.add(ur);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container); 
    }
    
    public void calluserregisteration()
    {
       User_register ur=new User_register(container,system);
        container.add(ur);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container); 
    }
    public void callSystemAdminWorkAreaJPanel()
    {
        systemadminenterprise sy=new systemadminenterprise(container,system);
        container.add(sy);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }
    
    public void callCustomerAreaJPanel()
    {
        CustomerAreaJPanel cajp=new CustomerAreaJPanel(container, userAccount ,system);
        container.add(cajp);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }
    
    public void callAdminWorkAreaJPanel()
    {
        AdminWorkAreaJPanel sy=new AdminWorkAreaJPanel(container, userAccount ,system);
        container.add(sy);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }
    
    public void callDeliveryManWorkAreaJPanel()
    {
        DeliveryManWorkAreaJPanel sy=new DeliveryManWorkAreaJPanel(container, userAccount ,system);
        container.add(sy);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

//    private void callChildCare() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    
//
//    private void callMedicineDelivery() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    private void callNCI() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
