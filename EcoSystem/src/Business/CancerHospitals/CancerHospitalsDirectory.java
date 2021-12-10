/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.CancerHospitals;

import java.util.ArrayList;

/**
 *
 * @author preranaj
 */
public class CancerHospitalsDirectory {
     ArrayList<CancerHospitals> a =new ArrayList<CancerHospitals>();
     
         public void addCancerHospital(CancerHospitals c)
    {        
       a.add(c);
    }

    public ArrayList<CancerHospitals> getA() {
        return a;
    }

    public void setA(ArrayList<CancerHospitals> a) {
        this.a = a;
    }

    
    
    public void removeCancerHospital(CancerHospitals customer){
        a.remove(customer);
    }
    
}
