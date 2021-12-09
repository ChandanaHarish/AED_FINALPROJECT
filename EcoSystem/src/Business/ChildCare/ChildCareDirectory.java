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
    ArrayList<ChildCareAdmin> a =new ArrayList<ChildCareAdmin>();
    
    public void addChild(ChildCareAdmin c)
    {        
       a.add(c);
    }

    public ArrayList<ChildCareAdmin> getA() {
        return a;
    }

    public void setA(ArrayList<ChildCareAdmin> a) {
        this.a = a;
    }
    public void removeChild(ChildCareAdmin customer){
        a.remove(customer);
    }
    
}
