/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.NCI;

import Business.UserAccount.UserAccount;
import Business.role.Nci;


/**
 *
 * @author chand
 */
public class NCI extends UserAccount {
    String firstName;
    String lastName;
    String phoneNumber;
    String userID;
    String password;
    
    public NCI(String firstName, String lastName, String phoneNumber, String userID, String password) {
        setUsername(userID);
        setPassword(password);
        setRole(new Nci());
        this.firstName = firstName;
        this.lastName = lastName;
        this.userID=userID;
        this.password=password;        
        this.phoneNumber = phoneNumber;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
