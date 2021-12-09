/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.Pharmacy;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Pharmacy.Pharmacy;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.OrderMedicine;
import Business.WorkQueue.OrderRequestDirectory;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chand
 */
public class OrderMedicines extends javax.swing.JPanel {
    private final JPanel container;
    private final EcoSystem ecoSystem;
    private final UserAccount ua;

    /**
     * Creates new form OrderMedicines
     */
    public OrderMedicines(JPanel container,EcoSystem ecoSystem,UserAccount ua) {
         initComponents(); 
         this.container=container;
         this.ecoSystem=ecoSystem;
         this.ua=ua;
         populateordertable();
        
    }
    
     public void populateordertable()
    {
        OrderRequestDirectory dire=ecoSystem.getOrderRequestDirectory();
        ArrayList<OrderMedicine> orderMedicines=dire.getUser();
        int u=orderMedicines.size();
        Pharmacy r=(Pharmacy)ua;
        for(int i=0;i<u;i++)
        {
            OrderMedicine o=orderMedicines.get(i);
            if(r.getName().matches(o.getPharmacyName()))
            {
                DefaultTableModel t2 = (DefaultTableModel) jTable1.getModel();
                String s1=String.valueOf(o.getID());
                
                
                String s[]={s1,o.getPatientID(),o.getOncologistName(),o.getOrderStatus()};
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblOrderMedicines = new javax.swing.JLabel();
        lbltMedicinesCost = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaOrderMedicines = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        TextAreaMedicinesCost = new javax.swing.JTextArea();
        btnReady = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Patient Name", "Doctor Name", "Status"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        lblOrderMedicines.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblOrderMedicines.setText("Order");

        lbltMedicinesCost.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lbltMedicinesCost.setText("Cost");

        TextAreaOrderMedicines.setColumns(20);
        TextAreaOrderMedicines.setRows(5);
        jScrollPane1.setViewportView(TextAreaOrderMedicines);

        TextAreaMedicinesCost.setColumns(20);
        TextAreaMedicinesCost.setRows(5);
        jScrollPane3.setViewportView(TextAreaMedicinesCost);

        btnReady.setBackground(new java.awt.Color(195, 233, 245));
        btnReady.setText("Ready ");
        btnReady.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(lblOrderMedicines)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbltMedicinesCost)
                                .addGap(120, 120, 120))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(255, 255, 255)
                                .addComponent(btnReady)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 307, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltMedicinesCost)
                    .addComponent(lblOrderMedicines))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(btnReady)
                .addContainerGap(67, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        TextAreaMedicinesCost.setText("");
        TextAreaOrderMedicines.setText("");

        DefaultTableModel t2 = (DefaultTableModel) jTable1.getModel();
        int selectedRow=jTable1.getSelectedRow();
        int s=Integer.parseInt(t2.getValueAt(selectedRow, 0).toString());
        System.out.println("id"+s);
        OrderRequestDirectory dire=ecoSystem.getOrderRequestDirectory();
        ArrayList<OrderMedicine> order=dire.getUser();
        int u=order.size();
        for(int i=0;i<u;i++)
        {
            OrderMedicine o=order.get(i);
            if(s==o.getID())
            {
                Map<String,String> f=o.getListOfOrders();
                int count =0;
                for (String key: f.keySet()) {
                    TextAreaOrderMedicines.append("Item "+ count+ " : "+key+" Quantity : "+f.get(key)+"\n");
                    count++;

                }
                Map<String,String> f1=o.getListOfCost();
                int a=0;
                for (String key: f1.keySet()) {
                    System.out.println(Integer.parseInt(f1.get(key)));
                    a=a+(Integer.parseInt(f1.get(key)));
                    System.out.println("a"+a);

                }
                TextAreaMedicinesCost.append(String.valueOf(a));

            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnReadyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadyActionPerformed
        // TODO add your handling code here:
        DefaultTableModel  t2 = (DefaultTableModel) jTable1.getModel();
        int selectedRow=jTable1.getSelectedRow();
        if(selectedRow>=0)
        {
            int s=Integer.parseInt(t2.getValueAt(selectedRow, 0).toString());
            System.out.println("id"+s);
            OrderRequestDirectory dire=ecoSystem.getOrderRequestDirectory();
            ArrayList<OrderMedicine> order=dire.getUser();
            int u=order.size();

            for(int i=0;i<u;i++)
            {
                OrderMedicine o=order.get(i);
                if(s==o.getID()/*&&o.getStatus().matches("Deliver Man Assigned")*/)
                {
                    if(o.getOrderStatus().matches("Order Placed"))
                    {
                        o.setOrderStatus("Ready for pickup");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Order Canceled");

                    }
                }
            }
            jTable1.setModel(new DefaultTableModel(null,new String[]{"ID","Patient Name","Doctor Name","Status"}));
            populateordertable();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Select a Row!!");
        }
        DB4OUtil.dB4OUtil.storeSystem(ecoSystem);
    }//GEN-LAST:event_btnReadyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TextAreaMedicinesCost;
    private javax.swing.JTextArea TextAreaOrderMedicines;
    private javax.swing.JButton btnReady;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblOrderMedicines;
    private javax.swing.JLabel lbltMedicinesCost;
    // End of variables declaration//GEN-END:variables
}
