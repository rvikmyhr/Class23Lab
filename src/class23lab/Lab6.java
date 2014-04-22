/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package class23lab;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Ron
 */
public class Lab6 {
    public static void main(String[] args) {
        
        Map<String,Employee> empMap = new TreeMap<>();
        Employee emp1 = new Employee("John", "Doe", "111-11-1111");
        Employee emp2 = new Employee("Bob", "Smith", "222-22-2222");
        Employee emp3 = new Employee("Bill", "Brown", "333-33-3333");
        Employee emp4 = new Employee("Doug", "White", "333-33-3333");
        
        empMap.put(emp1.getSsn(), emp1);
        empMap.put(emp2.getSsn(), emp2);
        empMap.put(emp3.getSsn(), emp3);
        empMap.put(emp4.getSsn(), emp4);
        
        Collection<Employee> empCol = empMap.values();
        
        List<Employee> empList = new ArrayList<>(empCol);
        
        Collections.sort(empCol, new EmployeeOrderBySsn());
        
    }
}
