/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author preranaj
 */
public class MentalHealthDirectory {
    ArrayList<MentalHealth> us = new ArrayList<MentalHealth>();
    
    public ArrayList<MentalHealth> getArray() {
        return us;
    }

    public void setArray(ArrayList<MentalHealth> user) {
        this.us = user;
    }
    
    public void addRequest(MentalHealth user){
        us.add(user);
    }
    
    public void removeRequest(MentalHealth user){
        us.remove(user);
    }
    
}
