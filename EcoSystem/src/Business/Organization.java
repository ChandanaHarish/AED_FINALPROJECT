/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Ambulance.AmbulanceDirectory;
import Business.Customer.CustomerDirectory;
import Business.Customer.OrderDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.WorkQueue.OrderRequestDirectory;
import Business.Employee.EmployeeDirectory;
import Business.Oncologist.OncologistsDirectory;
import Business.Pharmacy.PharmacyDirectory;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.OncologistAppointmentDirectory;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.appointmentCheck;
import Business.user.userDirectory;
import Business.Restaurant.RestaurantDirectory;
import Business.WorkQueue.GeneralVitalsDirectory;
import Business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author chand
 */
public abstract class Organization {
    
    private String name;
    private WorkQueue workQueue;
    private appointmentCheck appcheck;
    private OrderDirectory orderdirectory;
    private userDirectory userdirectory;
    private OncologistAppointmentDirectory oncologistAppointmentDirectory;
    private OncologistsDirectory oncologistsDirectory;
    private CustomerDirectory customerDirectory;
    private DeliveryManDirectory deliveryManDirectory;
    private RestaurantDirectory restaurantDirectory;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;

    private PharmacyDirectory pharmacyDirectory;
    

    private GeneralVitalsDirectory gvd;

    private int organizationID;
    private static int counter=0;
    
    private OrderRequestDirectory OrderRequestDirectory;
    public enum Type{ 
        RestaurantAdmin("RestaurantAdmin"),
        Customer("Customer"),
        DeliveryMan("Delivery"),
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
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        OrderRequestDirectory = new OrderRequestDirectory();
        userdirectory =new userDirectory();
        customerDirectory = new CustomerDirectory();
        deliveryManDirectory = new DeliveryManDirectory();
        restaurantDirectory = new RestaurantDirectory();
        orderdirectory = new OrderDirectory();
        oncologistsDirectory = new OncologistsDirectory();
        appcheck = new appointmentCheck();
        oncologistAppointmentDirectory = new OncologistAppointmentDirectory();

        pharmacyDirectory = new PharmacyDirectory();
    }

    public PharmacyDirectory getPharmacyDirectory() {
        if(pharmacyDirectory == null)
        {
            pharmacyDirectory = new PharmacyDirectory();
        }
        return pharmacyDirectory;
    }

    public void setPharmacyDirectory(PharmacyDirectory pharmacyDirectory) {
        this.pharmacyDirectory = pharmacyDirectory;

        gvd = new GeneralVitalsDirectory();
        

    }
    
    public userDirectory getUserDirectory() {
        if(userdirectory==null)
        {
            userdirectory =new userDirectory();
        }
            
        return userdirectory;
    }

    public GeneralVitalsDirectory getGvd() {
        if(gvd==null)
        {
            gvd =new GeneralVitalsDirectory();
        }
        return gvd;
    }

    public void setGvd(GeneralVitalsDirectory gvd) {
        this.gvd = gvd;
    }

    public void setUserDirectory(userDirectory userdirectory) {
        this.userdirectory = userdirectory;
    }
    
    public CustomerDirectory getCustomerDirectory() {
        if(customerDirectory == null){
            customerDirectory = new CustomerDirectory();
        }
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public DeliveryManDirectory getDeliveryManDirectory() {
        
        if(deliveryManDirectory == null){
            deliveryManDirectory = new DeliveryManDirectory();
        }
        return deliveryManDirectory;
    }

    public void setDeliveryManDirectory(DeliveryManDirectory deliveryManDirectory) {
        this.deliveryManDirectory = deliveryManDirectory;
    }

    public RestaurantDirectory getRestaurantDirectory() {
        if(restaurantDirectory == null){
            restaurantDirectory = new RestaurantDirectory();
        }
        return restaurantDirectory;
    }

    public void setRestaurantDirectory(RestaurantDirectory restaurantDirectory) {
        this.restaurantDirectory = restaurantDirectory;
    }

    
     public OrderDirectory getOrderdirectory() {
        if(orderdirectory == null){
            orderdirectory = new OrderDirectory();
        }
        return orderdirectory;
        
    }

    public void setOrderdirectory(OrderDirectory orderdirectory) {
        this.orderdirectory = orderdirectory;
    }
    
    public OrderRequestDirectory getOrderRequestDirectory() {
        if(OrderRequestDirectory==null)
        {
            OrderRequestDirectory = new OrderRequestDirectory();        
        }
        return OrderRequestDirectory;
    }
    
    public OncologistsDirectory getOncologistsDirectory() {
        if(oncologistsDirectory==null)
        {
            oncologistsDirectory = new OncologistsDirectory();
        }
        return oncologistsDirectory;
    }
    public void setOncologistsDirectory(OncologistsDirectory oncologistsDirectory) {
        this.oncologistsDirectory = oncologistsDirectory;
    }
    
    public EmployeeDirectory getEmployeeDirectory() {
        if(employeeDirectory == null){
            employeeDirectory = new EmployeeDirectory();
        }
        return employeeDirectory;
    }
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
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