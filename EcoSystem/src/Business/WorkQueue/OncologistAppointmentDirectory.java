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
public class OncologistAppointmentDirectory {
    ArrayList<OncologistAppointment> oa = new ArrayList<OncologistAppointment>();
    
    public ArrayList<OncologistAppointment> getArray() {
        return oa;
    }

    public void setArray(ArrayList<OncologistAppointment> user) {
        this.oa = user;
    }
    
    public void addRequest(OncologistAppointment user){
        oa.add(user);
    }
    
    public void removeRequest(OncologistAppointment user){
        oa.remove(user);
    }
    
}
