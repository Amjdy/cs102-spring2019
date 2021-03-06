
package topic02.inheritance.usinginheritance;

public class EmployeeTest {
    public static void main(String [] args){
        
        Employee cm = 
                new SalesEmployee
                        ("Mohamed", "Ali", "333-33-3333",
                                5000, 0.3);
        
        Employee bpcm = 
                new SalariedEmployee
                        ("Ahmed", "Mounir", "263-39-3333", 
                                5000, 0.04, 300);
        
        System.out.println(cm+"\n");
        System.out.println(bpcm);
        
        System.out.println("");
        System.out.println("salary of sales employee: "+ cm.totalSalary());
        System.out.println("salary of salaried employee: "+bpcm.totalSalary());
        
        
    }
    
}
