package topic03.polymorphism_exercises.iot.core;
import topic03.polymorphism_exercises.iot.interfaces.* ;
public  abstract  class SensorImpl implements Sensor{
    private String id;
    private String brand;
    private String name;
    private double value;

    public SensorImpl(String id, String brand, String name, double value) {
        setId(id);
        setBrand(brand);
        setName(name);
        setValue(value);
    }
    
    public SensorImpl(SensorImpl s){
        this(s.id,s.brand,s.name, s.value);
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
    
    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    

    @Override
    public String toString() {
        return String.format("id : %s , brand : %s , name : %s",id,brand,name);
    }
    
    @Override
    public double value(){
        return value;
    }
    @Override
    public int compareTo(Measurable o) {
        if (this.value() > o.value())
            return 1;
        else if (this.value() < o.value())
            return -1;
        return 0;
    }
    


    
    
}

