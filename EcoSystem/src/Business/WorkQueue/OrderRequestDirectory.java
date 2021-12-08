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
public class OrderRequestDirectory {
    
    ArrayList<OrderMedicine> us = new ArrayList<OrderMedicine>();

    public ArrayList<OrderMedicine> getUser() {
        return us;
    }

    public void setUser(ArrayList<OrderMedicine> user) {
        this.us = user;
    }
    
    public void addUser(OrderMedicine user){
        us.add(user);
    }
    
    public void removeUser(OrderMedicine user){
        us.remove(user);
    }
    
}
