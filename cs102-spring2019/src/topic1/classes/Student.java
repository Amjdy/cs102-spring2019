package topic1.classes;

public class Student {
    
    //attributes: properties
    String firstName;
    String lastName;
    int age;   
    
    
    //constructor: it allows to assign values to attributes at creation time
    //1- it has the same name of the class
    //2= it must be public 
    //3- it does not return anything
    
    public Student(String fn, String ln, int a){
        firstName=fn;
        lastName = ln;
        age = a;
    }
    
    
    
    //default constructor
    public Student(){
        
    }
    
    //operations: methods
    public void printInfo(){
        System.out.println("Student Info");
        System.out.printf("Student %s %s is %d years old\n",
                firstName, lastName, age);
    }
    
    
    public int getAge(){
        return age;
    }
    
    
}
