/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mappractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author jbrown99
 */
public class Practice1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Employee e1 = new Employee("Brown","Josh","111-11-1111");
        Employee e2 = new Employee("Doe","Jane","222-44-5555");
        Employee e3 = new Employee("Smith","Fred","555-55-4444");
        Employee e4 = new Employee("Schmidt","Jenny","111-11-1111");
        
        
        Map<String,Object> employees = new HashMap<>();
        employees.put("111-11-1111",e1 );
        employees.put("222-44-5555",e2);
        employees.put("555-55-4444",e3);
        employees.put("111-11-1111",e4);
        
        Object emp = employees.get("222-44-5555");
        System.out.println("The following employee was retrieved: " + emp);
        
        
        //Looping through the keys
        Set<String> keys = employees.keySet();
        
        for(String person: keys){
            Object emps = employees.get(person);
            System.out.println(emps);
        }
        
        
        
        
        
        
        
    }
    
}
