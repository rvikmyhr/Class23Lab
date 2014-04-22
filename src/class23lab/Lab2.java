/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class23lab;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rvikmyhr
 */
public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        List employees1 = new ArrayList();
        Employee emp1 = new Employee("John", "Doe", "111-11-1111");
        Employee emp2 = new Employee("Bob", "Smith", "222-22-2222");
        Employee emp3 = new Employee("Bill", "Brown", "333-33-3333");
        Employee emp4 = new Employee("Doug", "White", "333-33-3333");

        employees1.add(emp1);
        employees1.add(emp2);
        employees1.add(emp3);
        employees1.add(emp4);

        System.out.println(employees1.size());

        System.out.println(employees1.get(1));

        Employee emp5 = (Employee) employees1.get(1);

        System.out.println(emp5);
        
        System.out.println("");
        
        for (int i=0; i < employees1.size(); i++){
            System.out.println(employees1.get(i));
        }
        
        employees1.addAll(employees1);
        
        System.out.println("");
        
        for (int i=0; i < employees1.size(); i++){
            System.out.println(employees1.get(i));
        }
        
        employees1.clear();
        
        for (int i=0; i < employees1.size(); i++){
            System.out.println(employees1.get(i));
        }
        
        
    }
}
