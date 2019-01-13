
package topic1.classes;


public class StudentTest {
    
     public static void main(String []args){
    
         //create my three students
         Student student1 = new Student("Mohamed", "Ali",23);//the constructor  
         Student student2 = new Student("Mounir","Kamal",25);//the DEFAULT constructor
 
         Student student3 = new Student("Sami","Adel",27);//the constructor
         
         student1.printInfo();
         student2.printInfo();
         student2.printInfo();
         
         Student student4 = new Student("Samir", "Waleed", 30);//the constructor
         student4.printInfo();

     }
    
}
