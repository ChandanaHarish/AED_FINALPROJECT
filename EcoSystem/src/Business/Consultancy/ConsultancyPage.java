/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Consultancy;

import Business.UserAccount.UserAccount;
import Business.role.ConsultancyPageAdmin;

/**
 *
 * @author preranaj
 */
public class ConsultancyPage extends UserAccount {
    String city;
    String state;
    String phoneNumber;
    String userID;
    String pwd;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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

    public ConsultancyPage(String city, String state, String phoneNumber, String userID, String pwd) {
        setUsername(userID);
        setPassword(pwd);
        setRole(new ConsultancyPageAdmin());
        this.city = city;
        this.state = state;
        this.phoneNumber = phoneNumber;
        this.userID = userID;
        this.pwd = pwd;
    }
    
    
    
}
