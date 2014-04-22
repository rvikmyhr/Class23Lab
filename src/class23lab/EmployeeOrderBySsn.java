/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package class23lab;

import java.util.Comparator;

/**
 *
 * @author Ron
 */
public class EmployeeOrderBySsn implements Comparator<Employee> {
    public int compare(Employee emp1, Employee emp2) {
        return emp1.getSsn().compareTo(emp2.getSsn());
    }
}
