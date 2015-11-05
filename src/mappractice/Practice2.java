/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mappractice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author jbrown99
 */
public class Practice2 {
    
    public static void main(String[] args) {
        Employee e1 = new Employee("Brown","Josh","111-11-1111");
        Employee e2 = new Employee("Doe","Jane","222-44-5555");
        Employee e3 = new Employee("Smith","Fred","555-55-4444");
        Employee e4 = new Employee("Schmidt","Jenny","111-11-1111");
        
         Map<String,Object> employees = new TreeMap<>();
        employees.put("111-11-1111",e1 );
        employees.put("222-44-5555",e2);
        employees.put("555-55-4444",e3);
        employees.put("111-11-1111",e4);
        
        
        
        Set<String> keys = employees.keySet();
        for(String key : keys) {
            Object emp = employees.get(key);
            System.out.println(emp.toString());
        }
        
        
        
        
        
//        Collections.sort(keys, new EmployeeByFirstName());
        
       
            
        }
    }
    

