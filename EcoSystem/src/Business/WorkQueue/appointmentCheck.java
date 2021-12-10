/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ajay09
 */
public class appointmentCheck {
     Map<String, List<String>> peopleByFirstName = new HashMap<>(); 

    public Map<String, List<String>> getPeopleByFirstName() {
        return peopleByFirstName;
    }

    public void setPeopleByFirstname(Map<String, List<String>> peopleByFirstName) {
        this.peopleByFirstName = peopleByFirstName;
    }
    
}
