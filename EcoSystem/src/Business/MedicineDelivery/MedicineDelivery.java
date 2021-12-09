/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.MedicineDelivery;

import Business.role.MedicineDeliveryAdmin;
import Business.UserAccount.UserAccount;

/**
 *
 * @author preranaj
 */
public class MedicineDelivery extends UserAccount{
    String userName;
    String userLocation;
    String phNumber;
    String userID;
    String pwd;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(String userLocation) {
        this.userLocation = userLocation;
    }

    public String getPhNumber() {
        return phNumber;
    }

    public void setPhNumber(String phNumber) {
        this.phNumber = phNumber;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        setUsername(userID);
        this.userID = userID;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public MedicineDelivery(String userName, String userLocation, String phNumber, String userID, String pwd) {
        setUserName(userID);
        setPwd(pwd);
        setRole(new MedicineDeliveryAdmin());
        this.userName = userName;
        this.userLocation = userLocation;
        this.phNumber = phNumber;
        this.userID = userID;
        this.pwd = pwd;
    }
    
    
    
}
