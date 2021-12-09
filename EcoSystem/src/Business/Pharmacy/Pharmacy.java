/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Pharmacy;

import Business.UserAccount.UserAccount;
import Business.role.PharmacyAdministrator;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author chand
 */
public class Pharmacy extends UserAccount {
    

 

    String name;
    String Location;
    String phoneNumber;
    String userID;
    String password;
    public Map<String,String> generalMedicines=new HashMap<String,String>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        setUsername(userID);
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Map<String, String> getGeneralMedicines() {
        return generalMedicines;
    }

    public void setGeneralMedicines(Map<String, String> generalMedicines) {
        this.generalMedicines = generalMedicines;
    }

    public Pharmacy(String name,  String userID, String password, String phoneNumber,String location) {
        setUsername(userID);
        setPassword(password);
        setRole(new PharmacyAdministrator());
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.Location = location;
        this.userID=userID;
        this.password=password;
        
        
    }

    
}
