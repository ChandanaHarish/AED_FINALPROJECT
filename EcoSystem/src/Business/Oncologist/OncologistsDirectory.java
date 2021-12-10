/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Oncologist;

import java.util.ArrayList;

/**
 *
 * @author ajay09
 */
public class OncologistsDirectory {
    ArrayList<Oncologist> onc =new ArrayList<Oncologist>();
    
    public void addOncologist(Oncologist o)
    {        
       onc.add(o);
    }

    public ArrayList<Oncologist> getOnc() {
        return onc;
    }

    public void setA(ArrayList<Oncologist> onc) {
        this.onc = onc;
    }

    
    
    public void removeOncologist(Oncologist customer){
        onc.remove(customer);
    }
}
