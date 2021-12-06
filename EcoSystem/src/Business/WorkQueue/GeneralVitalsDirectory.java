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
    
    public ArrayList<GeneralVitals> getArray() {
        return gv;
    }

    public void setArray(ArrayList<GeneralVitals> user) {
        this.gv = gv;
    }
    public void addRequest(GeneralVitals user){
        gv.add(user);
    }
    
    public void removeRequest(GeneralVitals user){
        gv.remove(user);
    }
    
}
