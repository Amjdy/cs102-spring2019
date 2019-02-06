
package topic03.polmorphism.intro;



public class EmployeeTest {
    public static void main(String [] args){
        
        SalesEmployee cm = 
                new SalesEmployee
                        ("Mohamed", "Ali", "333-33-3333",
                                5000, 0.3);
        
        //using polymorphism 
        SalariedEmployee bpcm = 
                new SalariedEmployee
                        ("Ahmed", "Mounir", "263-39-3333", 
                                5000, 0.04, 300);
        
        System.out.println(cm+"\n");
        System.out.println(bpcm);
        
        System.out.println("");
        System.out.println("salary of sales employee: "+ cm.totalSalary());
        System.out.println("salary of salaried employee: "+bpcm.totalSalary());
        
        
        
        
        int x = 6;
        double y = 7.43;
        String s = "22";
        
        //casting: changing the type of a variable to another type
        int z = (int) y;
        //int f = (int)s;
        
        
        //change the type of bpcm to a SalariedEmployee so that
        //I am able to access all its methods. 
        
        //casting: change the type of bpcm to SalariedEmployee
        // downwe change from general class to specific class
        //downcasting
        SalariedEmployee se2 = (SalariedEmployee) bpcm;
        
        System.out.println("the base salary of bpcm: "+ se2.getBaseSalary());
        
        System.out.println("the base salary of bpcm: "+ ((SalariedEmployee) bpcm).getBaseSalary());
        
        //before casting, check if the object is CREATED as a subclass
        
        if (cm instanceof SalariedEmployee) {
            SalariedEmployee se3 = (SalariedEmployee) cm;
            System.out.println("the base salary of bpcm: "+ se3.getBaseSalary());
        }else{
            System.out.println("it is not an instance of salaried employee");
        }
    }
    
}
