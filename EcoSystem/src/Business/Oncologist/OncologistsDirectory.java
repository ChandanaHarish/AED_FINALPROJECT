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
    ArrayList<Oncologist> oncDir =new ArrayList<Oncologist>();
    
    public void addOncologist(Oncologist o)
    {        
       oncDir.add(o);
    }

    public ArrayList<Oncologist> getOncDir() {
        return oncDir;
    }

    public void setOncDir(ArrayList<Oncologist> oncDir) {
        this.oncDir = oncDir;
    }

    
    
    public void removeOncologist(Oncologist customer){
        oncDir.remove(customer);
    }
}
