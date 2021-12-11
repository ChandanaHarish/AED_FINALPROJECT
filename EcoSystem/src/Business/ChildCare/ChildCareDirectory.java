/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.ChildCare;

import Business.role.ChildCareAdmin;
import java.util.ArrayList;

/**
 *
 * @author preranaj
 */
public class ChildCareDirectory {
    ArrayList<ChildCare> a =new ArrayList<ChildCare>();
    
    public void addChild(ChildCare c)
    {        
       a.add(c);
    }

    public ArrayList<ChildCare> getA() {
        return a;
    }

    public void setA(ArrayList<ChildCare> a) {
        this.a = a;
    }
    public void removeChild(ChildCare customer){
        a.remove(customer);
    }
    
}
