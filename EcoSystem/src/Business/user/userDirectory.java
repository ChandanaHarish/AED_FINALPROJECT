/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.user;

import java.util.ArrayList;

/**
 *
 * @author ajay09
 */
public class userDirectory {
    ArrayList<User> userDir = new ArrayList<User>();

    public ArrayList<User> getUser() {
        return userDir;
    }

    public void setUser(ArrayList<User> user) {
        this.userDir = user;
    }
    
    public void addUser(User user){
        userDir.add(user);
    }
    
    public void removeUser(User user){
        userDir.remove(user);
    }
    
}
