/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author preranaj
 */
public class GeneralVitalsDirectory {
    ArrayList<GeneralVitals> g = new ArrayList<GeneralVitals>();
    
    public ArrayList<GeneralVitals> getarray() {
        return g;
    }

    public void setarray(ArrayList<GeneralVitals> user) {
        this.g = g;
    }
    public void addrequest(GeneralVitals user){
        g.add(user);
    }
    
    public void removerequest(GeneralVitals user){
        g.remove(user);
    }
    
}
