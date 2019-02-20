
package topic03.polymorphism_exercises.books;


public class Author {
    
    private String firstName;
    private String lastName;
    
    
    public Author (String fn, String ln){
        setFirstName(fn);
        setLastName(ln);
    }
    
    public void setFirstName(String fn){
        firstName = fn;                
    }
    
    public void setLastName(String ln){
        lastName = ln;                
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public String toString (){
        return String.format("%s %s",firstName, lastName);
    }
    
}
