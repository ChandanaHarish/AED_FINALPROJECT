/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Ambulance;

import java.util.ArrayList;

/**
 *
 * @author chand
 */
public class AmbulanceDirectory {
     ArrayList<Ambulance> amb =new ArrayList<Ambulance>();
     
     public void addAmbulance(Ambulance a)
    {        
       amb.add(a);
    }

    public ArrayList<Ambulance> getAmb() {
        return amb;
    }

    public void setAmb(ArrayList<Ambulance> amb) {
        this.amb = amb;
    }
     
    public void removeAmbulance(Ambulance customer){
        amb.remove(customer);
    }
    
   
    
}
