
package topic01.classes;


public class DistanceSensor {
    private String id;
    private double range;
    private final double MAX_RANGE;
    private final double MIN_RANGE;

    public DistanceSensor(String id, double range, double MAX_RANGE, double MIN_RANGE) {
        this.MAX_RANGE = 6.0;
        this.MIN_RANGE = 0.2;
        setId(id);
        setRange(range);
    }
    public DistanceSensor(String id){
        this(id, Math.random()*4.8+0.2, 6.0,0.2);
    }
    
    public DistanceSensor(DistanceSensor sensor){
        this(sensor.getId(), sensor.getRange(), sensor.MAX_RANGE, sensor.MIN_RANGE);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        if((range<MAX_RANGE)&&(range>MIN_RANGE))
        this.range = range;
        else throw new IllegalArgumentException("range must be between MAX_RANGE and MIN_RANGE");
    }
    //{"id":"1", "range":"3.2", “MAX_RANGE”:”5.0”, “MIN_RANGE”:”0.2”}


    @Override
    public String toString() {
        return String.format("{id\":\"%s\", \"range\":\"%s\",\"MAX_RANGE\":\"%s\", \"MIN_RANGE\":\"%s\"}");
    }

    
}
