/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Ambulance;

import Business.UserAccount.UserAccount;
import Business.role.AmbulanceDriver;

/**
 *
 * @author chand
 */
public class Ambulance extends UserAccount{
    String ambulanceName;
    String driverName;
    String phoneNumber;
    String userID;
    String password;
    
    public Ambulance(String ambulanceName, String driverName, String phoneNumber, String userID, String password) {
        setUsername(userID);
        setPassword(password);
        
        setRole(new AmbulanceDriver());
        this.ambulanceName = ambulanceName;
        this.driverName = driverName;
        this.userID=userID;
        this.password= password;        
        this.phoneNumber = phoneNumber;
    }

    public String getAmbulanceName() {
        return ambulanceName;
    }

    public void setAmbulanceName(String ambulanceName) {
        this.ambulanceName = ambulanceName;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
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

   
    
    
}
