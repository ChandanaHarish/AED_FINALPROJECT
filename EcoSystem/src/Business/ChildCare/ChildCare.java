/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.ChildCare;

import Business.UserAccount.UserAccount;
import Business.role.ChildCareAdmin;

/**
 *
 * @author preranaj
 */
public class ChildCare extends UserAccount {
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
        this.userID = userID;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public ChildCare(String userName, String userLocation, String phNumber, String userID, String pwd) {
        setUsername(userID);
        setPassword(pwd);
        setRole(new ChildCareAdmin());
        this.userName = userName;
        this.userLocation = userLocation;
        this.phNumber = phNumber;
        this.userID = userID;
        this.pwd = pwd;
    }
    
    
    
}
