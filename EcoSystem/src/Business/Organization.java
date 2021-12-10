/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.WorkQueue.OrderRequestDirectory;
import Business.Employee.EmployeeDirectory;
import Business.Oncologist.OncologistsDirectory;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.OncologistAppointmentDirectory;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.appointmentCheck;
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
    appointmentCheck appcheck;
    userDirectory userdirectory;
    OncologistAppointmentDirectory oncologistAppointmentDirectory;
    OncologistsDirectory oncologistsDirectory;
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
    
    public OncologistsDirectory OncologistsDirectory() {
        if(oncologistsDirectory==null)
        {
            oncologistsDirectory = new OncologistsDirectory();
        }
        return oncologistsDirectory;
    }
    
    public OncologistAppointmentDirectory getoncologistAppointmentDirectory() {
        if(oncologistAppointmentDirectory==null)
        {
            oncologistAppointmentDirectory = new OncologistAppointmentDirectory();        
        }
        return oncologistAppointmentDirectory;
        
    }

    public void setDoctor_appointment_directory(OncologistAppointmentDirectory oncologistAppointmentDirectory) {
        this.oncologistAppointmentDirectory = oncologistAppointmentDirectory;
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
    
    public appointmentCheck getAppcheck() {
        if(appcheck ==null)
        {
            appcheck = new appointmentCheck();       
        }
        return appcheck;
    }

    public void setAppcheck(appointmentCheck appcheck) {
        this.appcheck = appcheck;
    }

    public void setOrderRequestDirectory(OrderRequestDirectory OrderRequestDirectory) {
        this.OrderRequestDirectory = OrderRequestDirectory;
    }
}