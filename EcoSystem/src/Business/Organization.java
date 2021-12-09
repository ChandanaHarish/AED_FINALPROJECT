/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.WorkQueue.OrderRequestDirectory;

/**
 *
 * @author chand
 */
public abstract class Organization {
    
    private String name;
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
        OrderRequestDirectory = new OrderRequestDirectory();
    }

    public OrderRequestDirectory getOrderRequestDirectory() {
        if(OrderRequestDirectory==null)
        {
            OrderRequestDirectory = new OrderRequestDirectory();        
        }
        return OrderRequestDirectory;
    }

    public void setOrderRequestDirectory(OrderRequestDirectory OrderRequestDirectory) {
        this.OrderRequestDirectory = OrderRequestDirectory;
    }
}