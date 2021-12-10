/*
<<<<<<< HEAD
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
=======
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
>>>>>>> b1f533b23e72ad07e84c19fccb5337710757af4e
 */
package Business.role;

import Business.EcoSystem;
<<<<<<< HEAD

import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.CustomerRole.*;

/**
 *
 * @author raunak
 */
public class CustomerRole extends Role{

=======
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.CustomerRole.CustomerAreaJPanel;

/**
 *
 * @author preranaj
 */
public class CustomerRole extends Role{
>>>>>>> b1f533b23e72ad07e84c19fccb5337710757af4e
    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new CustomerAreaJPanel(userProcessContainer, account, business);
    }
    
<<<<<<< HEAD
=======
    
>>>>>>> b1f533b23e72ad07e84c19fccb5337710757af4e
}
