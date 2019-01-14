
package topic1.classes;


public class StudentTest {
    
     public static void main(String []args){
    
         //create my three students
         Student student1 = new Student("Mohamed", "Ali",23,"0589873484");//the constructor  
         Student student2 = new Student("Mounir","Kamal",25,"0584345484");//the DEFAULT constructor
 
         Student student3 = new Student("Sami","Adel",27,"0584345489");//the constructor
         
         
         //student1.firstName="Salah";
         student1.setFirstName("Salah");
         //student2.age = -33;//data is not valid 
         //student2.setAge(33);
         
         
         System.out.println("student1 first name: "+ student1.getFirstName());
         
         student1.printInfo();
         student2.printInfo();
         student3.printInfo();
         
         
         
         Student student4 = new Student("Samir", "Waleed", 30,"0598393827");//the constructor
         student4.printInfo();

     }
    
}
