/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic02.inheritance.usinginheritance;

import java.util.ArrayList;

/**
 *
 * @author akoubaa
 */
public class PolymorphismTest {
    public static void main(String []args){
        
        ArrayList<Employee> employeeList = 
                new ArrayList<Employee>();
        
        employeeList.add(new SalariedEmployee //subclass
                        ("Ahmed", "Mounir", "263-39-3333", 
                                5000, 0.04, 300));

        employeeList.add(new SalesEmployee
                        ("Mohamed", "Ali", "333-33-3339",
                                5000, 0.3));
        employeeList.add(new SalesEmployee
                        ("Mounir", "Adel", "333-33-3336",
                                4500, 0.4));
        
        
        //print the base salary of all salaried employees
        //print the total salary of all sales employees
        
        //polymorphic processing
        
        
        for (int i=0; i<employeeList.size();i++){
            
            if (employeeList.get(i) instanceof SalariedEmployee){
            SalariedEmployee se = (SalariedEmployee) employeeList.get(i);
            System.out.printf("the base salary of the salaried employee "
                    + "%s %s is: %.2f\n",
                    employeeList.get(i).getFirstName(),
                    employeeList.get(i).getLastName(),
                    se.getBaseSalary());
            }else if (employeeList.get(i) instanceof SalesEmployee){
            SalesEmployee se = (SalesEmployee) employeeList.get(i);
            System.out.printf("the total salary of the sales employee "
                    + "%s %s is: %.2f\n",
                    employeeList.get(i).getFirstName(),
                    employeeList.get(i).getLastName(),
                    se.totalSalary());
            }
            
        }
        
    }
    
    
}
