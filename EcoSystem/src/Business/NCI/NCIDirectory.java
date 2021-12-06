/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.NCI;

import java.util.ArrayList;

/**
 *
 * @author chand
 */
public class NCIDirectory {
    ArrayList<NCI> a =new ArrayList<NCI>();
    
    public void addgovofficers(NCI c)
    {        
       a.add(c);
    }

    public ArrayList<NCI> getA() {
        return a;
    }

    public void setA(ArrayList<NCI> a) {
        this.a = a;
    }

    
    
    public void removegovofficers(NCI customer){
        a.remove(customer);
    }
    
}

