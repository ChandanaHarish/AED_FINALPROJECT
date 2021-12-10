/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.WorkQueue.OrderRequestDirectory;
import Business.Employee.EmployeeDirectory;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import Business.user.userDirectory;
import Business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author chand
 */
public abstract class Organization {
    
    private String name;
    private WorkQueue workQueue;
    userDirectory userdirectory;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    
    OrderRequestDirectory OrderRequestDirectory;
    public enum Type{ 
//        RestaurantAdmin("RestaurantAdmin"),
//        Customer("Customer"),
//        DeliveryMan("Delivery"),
        SysAdmin("Sysadmin");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    

    public Organization(String name) {
        this.name = name;
        WorkQueue workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        OrderRequestDirectory = new OrderRequestDirectory();
        userdirectory =new userDirectory();
    }
    
    public userDirectory getUserdirectory() {
        if(userdirectory==null)
        {
            userdirectory =new userDirectory();
        }
            
        return userdirectory;
    }

    public void setUserdirectory(userDirectory userdirectory) {
        this.userdirectory = userdirectory;
    }

    public OrderRequestDirectory getOrderRequestDirectory() {
        if(OrderRequestDirectory==null)
        {
            OrderRequestDirectory = new OrderRequestDirectory();        
        }
        return OrderRequestDirectory;
    }
    
     public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }


    public void setOrderRequestDirectory(OrderRequestDirectory OrderRequestDirectory) {
        this.OrderRequestDirectory = OrderRequestDirectory;
    }
}