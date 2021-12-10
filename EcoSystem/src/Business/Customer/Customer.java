/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

<<<<<<< HEAD

import Business.UserAccount.UserAccount;
import Business.role.CustomerRole;

/**
 *
 * @author Chand
=======
import Business.role.CustomerRole;

import Business.UserAccount.UserAccount;

/**
 *
 * @author preranaj
>>>>>>> b1f533b23e72ad07e84c19fccb5337710757af4e
 */
public class Customer extends UserAccount {
    String firstname;
    String lastname;
    String userid;
    String password;
    String phonenumber;
    
    public Customer(String firstname, String lastname, String userid, String password, String phonenumber) {
        setUsername(userid);
        setPassword(password);
        setRole(new CustomerRole());
        this.firstname = firstname;
        this.lastname = lastname;
        this.phonenumber = phonenumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    

   
    
    
}
