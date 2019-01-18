package topic1.classes;

public class Student {
    
    //attributes: properties
    private String firstName;
    private String lastName;
    private int age;   
    private String mobilePhone;
    
    private Date birthDate; 
    
    private static int count =0;
    
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
        
        count = count +1;
        
    }
    
    public Student(String fn, String ln, int a,String mp, Date birthDate){
        //firstName=fn;
        setFirstName(fn);
        //lastName = ln;
        setLastName(ln);
        //age = a;
        setAge(a);
        //mobilePhone=mp;
        setMobilePhone(mp);
        
        setBirthDate(birthDate);
        
        count = count +1;
        
    }
    
    public Student(){
        count = count + 1;
    }
    
    public static int getCount(){
        return count;
    }
    
    
    public Date getBirthDate(){
        return birthDate;
    }
    
    public void setBirthDate(Date d){
        birthDate = d;
    }
    
    
    
    //operations: methods
    public void printInfo(){
        System.out.println("Student Info");
        System.out.printf("Student %s %s is %d years old. his mobile phone is %s. \nHe is born on %s\n",
                firstName, lastName, age, mobilePhone, birthDate);
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
    
    @Override
    public String toString(){
        return String.format("%s %s: age= %d", firstName, lastName, age);
    }
    
    
    
}
