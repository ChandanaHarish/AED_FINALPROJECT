/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.RestaurantAdminRole;

import Business.Customer.Order;
import Business.Customer.OrderDirectory;
import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raksh
 */
public class manageorder extends javax.swing.JPanel {

    private final JPanel userProcessContainer;
    private final EcoSystem ecosystem;
    private final UserAccount userAccount;

    /**
     * Creates new form manageorder
     */
    public manageorder(JPanel userProcessContainer, UserAccount userAccount, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        this.userAccount = userAccount;
        populateordertable();
        
    }
    
    public void populateordertable()
    {
        OrderDirectory od=ecosystem.getOrderdirectory();
        ArrayList<Order> ol=od.getOd();
        int u=ol.size();
                Restaurant r=(Restaurant)userAccount;

        for(int i=0;i<u;i++)
        {
            Order o=ol.get(i);
            if(r.getName().matches(o.getRestaurant()))
            {
                DefaultTableModel t2 = (DefaultTableModel) jTable1.getModel();
                String s1=String.valueOf(o.getId());
                
                
                String s[]={s1,o.getCustomer(),o.getRestaurant(),o.getDelivaryman(),o.getStatus(),o.getMessage()};
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

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Coustomer Name", "Restaurant Name", "Delivary Partner", "Status", "Message"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Accept Order ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Decline Order ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("refresh");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel4.setText("Order List Pannel");

        jLabel1.setText("<<back");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(jLabel4)
                .addGap(175, 175, 175)
                .addComponent(jLabel1)
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(111, 111, 111)
                .addComponent(jLabel3)
                .addGap(53, 53, 53))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel t2 = (DefaultTableModel) jTable1.getModel();
        int selectedRow=jTable1.getSelectedRow();
        int s=Integer.parseInt(t2.getValueAt(selectedRow, 0).toString());
        System.out.println("id"+s);
        OrderDirectory od=ecosystem.getOrderdirectory();
        ArrayList<Order> ol=od.getOd();
        int u=ol.size();
        for(int i=0;i<u;i++)
        {
            Order o=ol.get(i);
            if(s==o.getId())
            {
                if(o.getStatus().matches("out for delivery")||o.getStatus().matches("delivered"))
                {
                    JOptionPane.showMessageDialog(null, "status cannot be changed");
                    break;
                }
                else{
                    o.setStatus("in process");                
            }
                
            }
            
        }
        
        jTable1.setModel(new DefaultTableModel(null,new String[]{"ID","customer name","resturant name","delivery name ","status","message"}));
        populateordertable();
        setmenuorder();      
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel t2 = (DefaultTableModel) jTable1.getModel();
        int selectedRow=jTable1.getSelectedRow();
        int s=Integer.parseInt(t2.getValueAt(selectedRow, 0).toString());
        System.out.println("id"+s);
        OrderDirectory od=ecosystem.getOrderdirectory();
        ArrayList<Order> ol=od.getOd();
        int u=ol.size();
        for(int i=0;i<u;i++)
        {
            Order o=ol.get(i);
            if(s==o.getId())
            {
                if(o.getStatus().matches("Pending"))
                {
                o.setStatus("Order Declined");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Order Can not be declined at this point in time");
                }
            }
            
        }
        jTable1.setModel(new DefaultTableModel(null,new String[]{"ID","customer name","resturant name","delivery name ","status","message"}));
        populateordertable();
        //setmenuorder();
    }//GEN-LAST:event_jButton2ActionPerformed

  
    
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        backAction();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        jTable1.setModel(new DefaultTableModel(null,new String[]{"ID","customer name","resturant name","delivery name ","status","message"}));
        populateordertable();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        jTextArea1.setText("");
        DefaultTableModel t2 = (DefaultTableModel) jTable1.getModel();
        int selectedRow=jTable1.getSelectedRow();
        int s=Integer.parseInt(t2.getValueAt(selectedRow, 0).toString());
        System.out.println("id"+s);
        OrderDirectory od=ecosystem.getOrderdirectory();
        ArrayList<Order> ol=od.getOd();
        int u=ol.size();
        for(int i=0;i<u;i++)
        {
            Order o=ol.get(i);
            if(s==o.getId())
            {
                Map<String,String> f=o.getOrderlist();
                int count =0;
                for (String key: f.keySet()) {
                    jTextArea1.append("Item "+ count+ " : "+key+" Quantity : "+f.get(key)+"\n");
                    count++;
                   
            }
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked
    
    private void backAction() {
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        AdminWorkAreaJPanel manageSuppliersJPanel = (AdminWorkAreaJPanel) component;        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }
    
    private void setmenuorder() {
        assigndeliverymanname wa=new assigndeliverymanname(userProcessContainer,userAccount,ecosystem);
        userProcessContainer.add(wa);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
