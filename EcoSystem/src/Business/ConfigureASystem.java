package Business;

import Business.Employee.Employee;
import Business.UserAccount.UserAccount;
import static java.time.Clock.system;
import Business.role.SystemAdminRole;


/**
 *
 * @author ajay09
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        
        //UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        return system;
    }     
        
        
    }
    
