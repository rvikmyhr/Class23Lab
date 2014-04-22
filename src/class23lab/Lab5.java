/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package class23lab;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Ron
 */
public class Lab5 {
    
    public static void main(String[] args) {
        
        Map<String,Employee> empMap = new HashMap<>();
        Employee emp1 = new Employee("John", "Doe", "111-11-1111");
        Employee emp2 = new Employee("Bob", "Smith", "222-22-2222");
        Employee emp3 = new Employee("Bill", "Brown", "333-33-3333");
        Employee emp4 = new Employee("Doug", "White", "333-33-3333");
        
        empMap.put(emp1.getSsn(), emp1);
        empMap.put(emp2.getSsn(), emp2);
        empMap.put(emp3.getSsn(), emp3);
        empMap.put(emp4.getSsn(), emp4);
        
        System.out.println(empMap);
        System.out.println("");
        
        //duplicate key replaces old key of same value       
        
        System.out.println(empMap);
        
        for(Employee emp: empMap.values()){
            System.out.println(emp);
        }
        
        System.out.println("");
        
        for(String key: empMap.keySet()){
            System.out.println(key);
        }
    }
    
}
