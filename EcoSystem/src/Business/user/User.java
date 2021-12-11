/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.user;

import Business.UserAccount.UserAccount;
import Business.role.UserRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author ajay09
 */
public class User extends UserAccount{
    String firstName;
    String lastName;
    String emailID;
    String phoneNumber;
    String userID;
    String password;
    String location;
    
    public User(String firstName, String lastName, String emailID, String userID, String password, String phoneNumber,String location) {
        setUsername(userID);
        setPassword(password);
        setRole(new UserRole());
        this.firstName = firstName;
        this.lastName = lastName;
        this.userID= userID;
        this.password= password;        
        this.phoneNumber = phoneNumber;
        this.location= location;
        this.emailID= emailID;
        
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

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOncologistName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
