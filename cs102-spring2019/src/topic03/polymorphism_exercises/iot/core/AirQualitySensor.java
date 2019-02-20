package topic03.polymorphism_exercises.iot.core;

public class AirQualitySensor extends SensorImpl{
    
    private double value;
    private String unit;
    
    public double alertThreshold = 200;

    public AirQualitySensor( String id, String brand, String name,double value, String unit) {
        super(id, brand, name, value);
        this.setUnit(unit);
    }
    
    public AirQualitySensor(AirQualitySensor a){
        this(a.getId(),a.getBrand(),a.getName(),a.value,a.unit);
    }
    
   
    public String unit() {
        return unit;
    }

    @Override
    public void setId(String id) {
         boolean check = true;        
            if((id.length()==5)&&id.startsWith("A")){
                super.setId(id); 
            }
       else throw new IllegalArgumentException("wrong id");
    }
    
    

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return String.format("type : air_quality , %s , value : %.3f , unit : %s",super.toString(),value,unit);
    }
    
    
     
    
}

