package topic1.classes;


public class TimeTest {
    
    public static void main(String []args){
        
        
        Time t1 = new Time(5,11,25);
        System.out.println("t1: "+ t1.toUniversalString());
        
        Time t2 = new Time(7,11);
        Time t3 = new Time(15);
        
        
        Time t4 = new Time(t1);
        
        System.out.println("t4: "+ t4.toUniversalString());
        
        System.out.println("t1==t4: "+ (t1==t4));
        
        
        String s1 = new String("ABC");
        String s2 = new String("ABC");
        
        System.out.println("s1==s2: "+ (s1==s2));
        
        
        System.out.println(s1.compareTo(s2)==0);
        
        System.out.println("t1: "+ t1.toString());
        System.out.println("t2: "+ t2);
        
        //System.out.println(t1.compareTo(t2)==0);
        
        
        
    }
    
}
