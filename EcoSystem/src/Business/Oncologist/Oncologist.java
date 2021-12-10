/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Oncologist;

import Business.UserAccount.UserAccount;
import Business.role.OncologistRole;

/**
 *
 * @author ajay09
 */
public class Oncologist extends UserAccount{
    String firstName;
    String lastName;
    String userID;
    String password;
    String phoneNumber;
    String spealization;
    
    public Oncologist(String firstName, String lastName, String userID, String password, String phoneNumber, String Spealization) {
        setUsername(userID);
        setPassword(password);
        setRole(new OncologistRole());
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.spealization=Spealization;
        
    }

    public String getFirstname() {
        return firstName;
    }

    public void setFirstname(String firstname) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastName;
    }

    public void setLastname(String lastname) {
        this.lastName = lastName;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserid(String userid) {
        setUsername(userID);
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSpealization() {
        return spealization;
    }

    public void setSpealization(String spealization) {
        this.spealization = spealization;
    }
    
}
