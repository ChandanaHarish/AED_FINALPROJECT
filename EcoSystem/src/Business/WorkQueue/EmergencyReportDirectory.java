/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author chand
 */
public class EmergencyReportDirectory {
    ArrayList<EmergencyReport> us = new ArrayList<EmergencyReport>();

    public ArrayList<EmergencyReport> getUser() {
        return us;
    }

    public void setUser(ArrayList<EmergencyReport> user) {
        this.us = user;
    }
    
    public void addUser(EmergencyReport user){
        us.add(user);
    }
    
    public void removeUser(EmergencyReport user){
        us.remove(user);
    }
}
