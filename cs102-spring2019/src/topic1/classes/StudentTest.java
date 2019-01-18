package topic1.classes;


public class StudentTest {
    
     public static void main(String []args){
     
         //create my three students
         Date d1 = new Date(1,1,2000);
         Student student1 = new Student("Mohamed", "Ali",23,"0589873484",d1);//the constructor  
         
         System.out.println("count: "+ Student.getCount());
         
         Student student2 = new Student("Mounir","Kamal",25,"0584345484", new Date(2,3,2001));//the DEFAULT constructor
 
         System.out.println("count: "+ Student.getCount());
         
         Student student3 = new Student("Sami","Adel",27,"0584345489", new Date(5,9,2002));//the constructor
         
         System.out.println("count: "+ Student.getCount());
         
         //student1.firstName="Salah";
         student1.setFirstName("Salah");
         //student2.age = -33;//data is not valid 
         //student2.setAge(33);
         
         
         System.out.println("student1 first name: "+ student1.getFirstName());
         
         student1.printInfo();
         student2.printInfo();
         student3.printInfo();
         
         
         
         Student student4 = new Student("Samir", "Waleed", 30,"0598393827", new Date(12,4,2003));//the constructor
         student4.printInfo();
         
         System.out.println("student1: "+ student1);
         System.out.println("student2: "+ student2);
         
         //what is the day of birth of student1 .
         System.out.println("day of birth of student1: "+ student1.getBirthDate().getDay());
         //what is the year of birth of student3
         System.out.println("year of birth of student3: "+ student3.getBirthDate().getYear());
         
         
         //change the year of birth of student2 to 2003
         student2.setBirthDate(new Date(2,3,2003));
         
         student2.getBirthDate().setYear(2003);
         student2.printInfo();

     }
    
}
