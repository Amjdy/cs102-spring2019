package topic1.classes;

public class Student {
    
    //attributes: properties
    private String firstName;
    private String lastName;
    private int age;   
    private String mobilePhone;
    
    
    //constructor: it allows to assign values to attributes at creation time
    //1- it has the same name of the class
    //2= it must be public 
    //3- it does not return anything
    
    public Student(String fn, String ln, int a,String mp){
        //firstName=fn;
        setFirstName(fn);
        //lastName = ln;
        setLastName(ln);
        //age = a;
        setAge(a);
        //mobilePhone=mp;
        setMobilePhone(mp);
    }
    
    
    
    //default constructor
    public Student(){
        
    }
    
    //operations: methods
    public void printInfo(){
        System.out.println("Student Info");
        System.out.printf("Student %s %s is %d years old. his mobile phone is %s\n",
                firstName, lastName, age, mobilePhone);
    }
    
    
    //to read the value: get
    public String getFirstName(){
        return firstName;
    }
    
    //to change the value: set
    public void setFirstName(String firstName){
       this.firstName = firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public void setLastName(String ln){
        this.lastName = ln;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int a){
        if (a>0)
            age = a;
        else
            throw new IllegalArgumentException("age must be positive");
    }
    
    public String getMobilePhone(){
        return mobilePhone;
    }
    
    public void setMobilePhone(String mp){
        //must start with 05 and it has 10 digit
        if (mp.startsWith("05") &&(mp.length()==10))
            mobilePhone = mp;
        else
            throw new IllegalArgumentException("wrong phone format");
    }
    
    
    
}
