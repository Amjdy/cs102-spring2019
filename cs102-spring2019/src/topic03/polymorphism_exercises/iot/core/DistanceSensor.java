package topic03.polymorphism_exercises.iot.core;

public class DistanceSensor extends SensorImpl{
    
    private double range;
    
    private final double MIN_RANGE;
    private final double MAX_RANGE;

    public double alertThreshold = 1.0;
    
    public DistanceSensor(
     String id, String brand, String name,double range, double MIN_RANGE, double MAX_RANGE, String unit) {
        super(id, brand, name, range);
        this.MIN_RANGE = MIN_RANGE;
        this.MAX_RANGE = MAX_RANGE;
    }
    
    
    public String unit() {
        return "m";
    }

    public DistanceSensor(DistanceSensor d){
        this(d.getId(),d.getBrand(),d.getName(),d.range,d.MAX_RANGE,d.MIN_RANGE,d.unit());
    }

    @Override
    public void setId(String id) {
         boolean check = true;        
            if((id.length()==5)&&id.startsWith("D")){
                super.setId(id); 
            }
       else throw new IllegalArgumentException("wrong id");
    }

    public double getMinRange() {
        return MIN_RANGE;
    }

    public double getMaxRange() {
        return MAX_RANGE;
    }
    
    
    
    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        if(range>=MIN_RANGE&&range<=MAX_RANGE)
            this.range = range;
        else throw new IllegalArgumentException("wrong range");
    }
    
    

    @Override
    public String toString() {
        return String.format("type : distance , %s , range : %.3f , MIN_RANGE : %.3f , MAX_RANGE : %.3f, unit: ", super.toString(),
                range,MIN_RANGE,MAX_RANGE, this.unit());
    }

    
    
    
}

