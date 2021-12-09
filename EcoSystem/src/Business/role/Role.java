/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.role;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author chand
 */
public abstract class Role {
    
    public enum RoleType{
        
        PharmacyAdministrator("PharmacyAdmin"),
        MedicineDeliveryAdmin("MedicineDeliveryAdmin"),
        PoliceRole("PoilceAdmin"),
        Customer("Customer"),
        User("user"),
        Vaccination_admin("Vaccination_admin"),
        Doctor("Doctor"),
        covidtestingadmin("covidtestingadmin"),
        SysAdmin("Sysadmin");
        
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account,  
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}
