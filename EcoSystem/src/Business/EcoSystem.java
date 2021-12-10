/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.WorkQueue.OrderRequestDirectory;
import Business.user.userDirectory;
import Business.role.Role;
import java.util.ArrayList;
import Business.role.Role;
import Business.role.SystemAdminRole;



/**
 *
 * @author ajay09
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;

    //public EcoSystem (userDirectory userdirectory) {
       // this.userdirectory = userdirectory;
    //}
//    public OrderRequestDirectory getOrderRequestDirectory() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
     private EcoSystem(){
        super(null);
       
    }
 
    
    public boolean checkIfUserIsUnique(String userName){
       //
       return false;
    }

//    Object getUserAccountDirectory() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    

    
   
}
