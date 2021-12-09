/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.MedicineDelivery;

import java.util.ArrayList;

/**
 *
 * @author preranaj
 */
public class MedicineDeliveryDirectory {
    ArrayList<MedicineDelivery> a =new ArrayList<MedicineDelivery>();
    
        public void addPharmacy(MedicineDelivery c)
    {        
       a.add(c);
    }

    public ArrayList<MedicineDelivery> getA() {
        return a;
    }

    public void setA(ArrayList<MedicineDelivery> a) {
        this.a = a;
    }

    
    
    public void removePharmacy(MedicineDelivery customer){
        a.remove(customer);
    }
    
}
