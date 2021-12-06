/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author preranaj
 */
public class EmployeeDirectory {
    private ArrayList<Employee> empList;

    public EmployeeDirectory() {
        empList = new ArrayList();
    }

    public ArrayList<Employee> getEmpList() {
        return empList;
    }

    
    public Employee createEmployee(String employeeName){
        Employee employee = new Employee();
        employee.setEmployeeName(employeeName);
        empList.add(employee);
        return employee;
    }
    
}
