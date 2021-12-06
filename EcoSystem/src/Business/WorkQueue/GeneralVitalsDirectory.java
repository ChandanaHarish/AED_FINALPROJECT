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
    ArrayList<GeneralVitals> gv = new ArrayList<GeneralVitals>();
    
    public ArrayList<GeneralVitals> getarray() {
        return gv;
    }

    public void setarray(ArrayList<GeneralVitals> user) {
        this.gv = gv;
    }
    public void addrequest(GeneralVitals user){
        gv.add(user);
    }
    
    public void removerequest(GeneralVitals user){
        gv.remove(user);
    }
    
}
