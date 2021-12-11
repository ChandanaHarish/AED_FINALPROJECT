/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.CancerHospitals;

import Business.UserAccount.UserAccount;
import Business.role.CancerHospitalAdmin;

/**
 *
 * @author preranaj
 */
public class CancerHospitals extends UserAccount{
    String hospitalName;
    String hospitalLocation;
    String phoneNumber;
    String userID;
    String pwd;
    String emailID;
    String result;

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalLocation() {
        return hospitalLocation;
    }

    public void setHospitalLocation(String hospitalLocation) {
        this.hospitalLocation = hospitalLocation;
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
        this.userID = userID;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public CancerHospitals(String hospitalName, String hospitalLocation, String phoneNumber, String userID, String pwd) {
        setUsername(userID);
        setPassword(pwd);
        setRole(new CancerHospitalAdmin());
        this.hospitalName = hospitalName;
        this.hospitalLocation = hospitalLocation;
        this.phoneNumber = phoneNumber;
        this.userID = userID;
        this.pwd = pwd;
        this.emailID = emailID;
        this.result = result;
    }
    
    
    
    
}
