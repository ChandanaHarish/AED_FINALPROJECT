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
import Business.Restaurant.RestaurantDirectory;
import Business.WorkQueue.EmergencyReportDirectory;
import Business.WorkQueue.OncologistAppointmentDirectory;
import Business.WorkQueue.OrderRequestDirectory;
import Business.user.userDirectory;
import Business.role.Role;
import Business.role.SystemAdminRole;
import java.util.ArrayList;


/**
 *
 * @author ajay09
 */
public class EcoSystem extends Organization {
    private static EcoSystem business;
    private RestaurantDirectory restaurantDirectory;
    private CustomerDirectory customerDirectory;
    private DeliveryManDirectory deliveryManDirectory;
    private OrderDirectory orderdirectory;
    private userDirectory userdirectory;
    
    
    /**
     *
     * @param restaurantDirectory
     * @param customerDirectory
     * @param deliveryManDirectory
     * @param orderdirectory
     * @param userdirectory
     */
    
//    public EcoSystem(RestaurantDirectory restaurantDirectory, CustomerDirectory customerDirectory, DeliveryManDirectory deliveryManDirectory, OrderDirectory orderdirectory, userDirectory userdirectory) {
//        
//        this.restaurantDirectory = restaurantDirectory;
//        this.customerDirectory = customerDirectory;
//        this.deliveryManDirectory = deliveryManDirectory;
//        this.orderdirectory=orderdirectory;
//        this.userdirectory=userdirectory;
//    }

    public EcoSystem(RestaurantDirectory restaurantDirectory, CustomerDirectory customerDirectory, DeliveryManDirectory deliveryManDirectory, OrderDirectory orderdirectory, userDirectory userdirectory, String name) {
        super(name);
        this.restaurantDirectory = restaurantDirectory;
        this.customerDirectory = customerDirectory;
        this.deliveryManDirectory = deliveryManDirectory;
        this.orderdirectory = orderdirectory;
        this.userdirectory = userdirectory;
    }
    
    
    public static EcoSystem getInstance(){
        if(business==null){
            business= new EcoSystem();
        }
        return business;
    }
    
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    
    private EcoSystem(){
        super(null);
       // networkList=new ArrayList<Network>();
    }

    
    public boolean checkIfUserIsUnique(String userName){
       //
       return false;
    }

    public OrderRequestDirectory getOrderRequestDirectory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public EmergencyReportDirectory getEmergencyReportDirectory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public OrderDirectory getOrderdirectory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public DeliveryManDirectory getDeliveryManDirectory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//    public void getRestaurantDirectory() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    public OncologistAppointmentDirectory getOncologistAppointmentDirectory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getOncologistsDirectory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//    public Object getOncologistsDirectory() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    public Object getOncologistsDirectory() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

   
   
}
   

