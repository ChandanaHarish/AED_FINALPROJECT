/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Consultancy;

import java.util.ArrayList;

/**
 *
 * @author preranaj
 */
public class ConsultancyPageDirectory {
    ArrayList<ConsultancyPage> a =new ArrayList<ConsultancyPage>();
    
    public void addConsultant(ConsultancyPage c)
    {        
       a.add(c);
    }

    public ArrayList<ConsultancyPage> getA() {
        return a;
    }

    public void setA(ArrayList<ConsultancyPage> a) {
        this.a = a;
    }
    public void removeConsultant(ConsultancyPage customer){
        a.remove(customer);
    }
}
