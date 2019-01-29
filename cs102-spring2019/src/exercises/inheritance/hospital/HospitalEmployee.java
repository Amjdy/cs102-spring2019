
package exercises.inheritance.hospital;

/*
Write a class HospitalEmployee that inherits from Person.
It has one more specific attribute called employeeID of type String. 
It starts with EM and must have 10 characters length. It has:
A constructor with four      arguments.
A toString() method      that calls super class toString()  method and displays as follows
employeeID, firstName lastName, contact
Implement the class HospitalEmployee.
*/
public class HospitalEmployee extends Person {
    
    private String employeeID;
    
    public HospitalEmployee(String firstName, String lastName, Contact contact,
            String employeeID){
        super(firstName, lastName, contact);
        setEmployeeID(employeeID);
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        if (employeeID.startsWith("EM") && employeeID.length()==10)
            this.employeeID = employeeID;
        else throw new IllegalArgumentException("wrong employeeID");
    }
    
    @Override
    public String toString(){
        return String.format("[%s] %s",
                employeeID, super.toString());
    }
    
    
    
}
