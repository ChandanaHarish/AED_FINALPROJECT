/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author preranaj
 */
public class OrderMedicine {
    int ID;
    String orderStatus;
    String patientID;
    String pharmacyName;
    String oncologistName;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getPharmacyName() {
        return pharmacyName;
    }

    public void setPharmacyName(String pharmacyName) {
        this.pharmacyName = pharmacyName;
    }

    public String getOncologistName() {
        return oncologistName;
    }

    public void setOncologistName(String oncologistName) {
        this.oncologistName = oncologistName;
    }
    
    Map<String,String> listOfOrders = new HashMap<String,String>();
    Map<String,String> listOfCost = new HashMap<String,String>();

    public Map<String, String> getListOfOrders() {
        return listOfOrders;
    }

    public void setListOfOrders(Map<String, String> listOfOrders) {
        this.listOfOrders = listOfOrders;
    }

    public Map<String, String> getListOfCost() {
        return listOfCost;
    }

    public void setListOfCost(Map<String, String> listOfCost) {
        this.listOfCost = listOfCost;
    }
    
    
    
}
