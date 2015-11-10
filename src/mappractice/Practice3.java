/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mappractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author joshuabrown
 */
public class Practice3 {
    
    public static void main(String[] args) {
        
    
    
        Employee e1 = new Employee("Brown","Josh","111-11-1111");
        Employee e2 = new Employee("Doe","Jane","222-44-5555");
        Employee e3 = new Employee("Smith","Fred","555-55-4444");
        Employee e4 = new Employee("Schmidt","Jenny","111-11-1111");
        
        Set<Employee> employees = new TreeSet<>();
        
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
    
        
        for(Employee e: employees){
            System.out.println(e);
        }
        
        List<Employee> emps = new ArrayList<>(employees);
        
        Collections.sort(emps, new EmployeeByFirstName());
        for(Employee e: emps){
            System.out.println();
        }
        
        
}

}