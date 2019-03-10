
package topic04.generics_exercises;
import topic04.generics.*;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack_string = new Stack<String>();
        Stack<Student> stack_students = new Stack<Student>();
        
        stack_string.push("st1");
        stack_string.push("st2");
        stack_string.push("st3");
        
        stack_students.push(new Student("ali", "salah"));
        stack_students.push(new Student("ahmed", "ali"));
        
        stack_string.print();
        stack_students.print();
        
        while (!stack_string.getElements().isEmpty())
            stack_string.pop();
        
        while (!stack_students.getElements().isEmpty())
            stack_students.pop();
        
        stack_string.print();
        stack_students.print();
    }
}
