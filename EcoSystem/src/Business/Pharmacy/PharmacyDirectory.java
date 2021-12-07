/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Pharmacy;

import java.util.ArrayList;

/**
 *
 * @author chand
 */
public class PharmacyDirectory {
    ArrayList<Pharmacy> ph =new ArrayList<Pharmacy>();
    
     public void addPharmacy(Pharmacy c)
    {        
       ph.add(c);
    } 

    public ArrayList<Pharmacy> getPh() {
        return ph;
    }

    public void setPh(ArrayList<Pharmacy> ph) {
        this.ph = ph;
    }
    
    public void removePharmacy(Pharmacy customer){
        ph.remove(customer);
    }
    
}
