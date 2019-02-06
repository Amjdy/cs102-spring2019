package topic03.polymorphism.shapes;


public class Shape {
    
    private String name;
    
    
    public Shape (String name){
        setName(name);
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    @Override
    public String toString() {
        return "Shape" + name ;
    }

    
}
