package topic03.polymorphism.interfaces;


public class SalariedEmployee extends Employee {
    
    private double weeklySalary;
    
    public SalariedEmployee (String first, String last, String ssn, double salary){
        super(first, last,ssn);
        setWeeklySalary(salary);
    }
    
    public void print(){
           System.out.println(this.toString());
    }
    
    //set Salary
    public void setWeeklySalary(double salary){
        if (salary>=0.0)
            weeklySalary=salary;
        else
            weeklySalary=0.0;
    }
    
    //get Salary
    public double getWeeklySalary(){
        return weeklySalary;
    }
    
    //calculate earnings methods for salaried employee
    @Override
    public double totalSalary(){
        return getWeeklySalary();
    }
    
    
    @Override
    public double getPayment(){
        return getWeeklySalary();
    }
    
    public String toString(){
        return 
           String.format("salaried employee: %s weekly salary: %.2f, payment: %.2f\n\n", 
           super.toString(),getWeeklySalary(), totalSalary());
    }

    
    
    
}
