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
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chand
 */


    /**
     * Creates new form ManageMedicines
     */
    public class ManageMedicines extends javax.swing.JPanel {

    private final JPanel container;
    private final EcoSystem ecoSystem;
    private final UserAccount ua;
    Map<String,String> generalMedicines;

    /**
     * Creates new form manage_medicines
     */
    public ManageMedicines(JPanel container,EcoSystem ecoSystem,UserAccount ua) {
        initComponents();
        this.container=container;
        this.ecoSystem=ecoSystem;
        this.ua=ua;
        Pharmacy ph=(Pharmacy)ua;
        generalMedicines=ph.getGeneralMedicines();
        populateTable();


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
        lblMedName = new javax.swing.JLabel();
        txtMedName = new javax.swing.JTextField();
        btnMedAdd = new javax.swing.JButton();
        btnMedDelete = new javax.swing.JButton();
        txtMedCost = new javax.swing.JTextField();
        lblMedCost = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name ", "Item Cost"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        lblMedName.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        lblMedName.setText("Name :");

        btnMedAdd.setBackground(new java.awt.Color(195, 233, 245));
        btnMedAdd.setText("Add ");
        btnMedAdd.setPreferredSize(new java.awt.Dimension(63, 23));
        btnMedAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedAddActionPerformed(evt);
            }
        });

        btnMedDelete.setBackground(new java.awt.Color(195, 233, 245));
        btnMedDelete.setText("Delete");
        btnMedDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedDeleteActionPerformed(evt);
            }
        });

        txtMedCost.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMedCostKeyPressed(evt);
            }
        });

        lblMedCost.setBackground(new java.awt.Color(26, 39, 68));
        lblMedCost.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        lblMedCost.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMedCost.setText("Cost :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMedName)
                    .addComponent(lblMedCost, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtMedCost, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnMedDelete))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtMedName, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnMedAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(388, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(277, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(265, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMedName)
                    .addComponent(txtMedName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMedAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMedCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMedCost)
                    .addComponent(btnMedDelete))
                .addGap(95, 95, 95))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(68, 68, 68)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(202, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnMedAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedAddActionPerformed
        // TODO add your handling code here:
        if(txtMedName.getText().isEmpty()||txtMedCost.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "All fields are mandatory!!");

        }
        else
        {
            String a=txtMedName.getText();
            String b=txtMedCost.getText();
            generalMedicines.put(a, b);
            populateTable();
            DB4OUtil.dB4OUtil.storeSystem(ecoSystem);
        }
    }//GEN-LAST:event_btnMedAddActionPerformed

    private void btnMedDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedDeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel t2 = (DefaultTableModel) jTable1.getModel();
        int selectedRow=jTable1.getSelectedRow();
        if(selectedRow>=0)
        {
            String key=t2.getValueAt(selectedRow, 0).toString();
            generalMedicines.remove(key);
            populateTable();
            DB4OUtil.dB4OUtil.storeSystem(ecoSystem);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Select a row!!");
        }
    }//GEN-LAST:event_btnMedDeleteActionPerformed

    private void txtMedCostKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMedCostKeyPressed
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(Character.isLetter(c))
        {
            txtMedCost.setEditable(false);
            JOptionPane.showMessageDialog(null, "enter number");
        }
        else
        {
            txtMedCost.setEditable(true);
        }
    }//GEN-LAST:event_txtMedCostKeyPressed
    
    public void populateTable()
    {
                  
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        

        model.setRowCount(0);
        for (String key: generalMedicines.keySet()) {
                    Object[] row = new Object[5];
                    row[0] = key;
                    row[1] =  generalMedicines.get(key);
                    

                    model.addRow(row);
                
            }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMedAdd;
    private javax.swing.JButton btnMedDelete;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblMedCost;
    private javax.swing.JLabel lblMedName;
    private javax.swing.JTextField txtMedCost;
    private javax.swing.JTextField txtMedName;
    // End of variables declaration//GEN-END:variables
}