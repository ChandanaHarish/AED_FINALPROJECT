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
public class ambulance_directory {
     ArrayList<Ambulance> amb =new ArrayList<Ambulance>();
     
     public void addambulance(Ambulance c)
    {        
       amb.add(c);
    }

    public ArrayList<Ambulance> getAmb() {
        return amb;
    }

    public void setAmb(ArrayList<Ambulance> amb) {
        this.amb = amb;
    }
     
    public void removeambulance(Ambulance customer){
        amb.remove(customer);
    }
    
   
    
}
