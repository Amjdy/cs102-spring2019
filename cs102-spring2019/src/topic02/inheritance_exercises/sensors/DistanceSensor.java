/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic02.inheritance_exercises.sensors;


public class DistanceSensor extends Sensor{
    private double range;
    private final double MIN_RANGE;
    private final double MAX_RANGE;

    public DistanceSensor(double range, double MIN_RANGE, double MAX_RANGE, String id, String brand, String name) {
        super(id, brand, name);
        setRange(range);
        this.MIN_RANGE = MIN_RANGE;
        this.MAX_RANGE = MAX_RANGE;
    }
    public DistanceSensor(DistanceSensor d){
        this(d.getRange(), d.getMIN_RANGE(), d.getMAX_RANGE(), d.getId(), d.getBrand(), d.getName() );
    }
    public double getMIN_RANGE() {
        return MIN_RANGE;
    }

    @Override
    public void setId(String id) {
        if(id.startsWith("D")&&id.length()==6&&id.substring(1).matches("[0-9]+"))
        super.setId(id); 
        else throw new IllegalArgumentException("wrong id");
    }

    public double getMAX_RANGE() {
        return MAX_RANGE;
    }

    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        this.range = range;
    }

    @Override
    public String toString() {
        return String.format("{“type” : “distance”, %s, “range”:”%f”, “MIN_RANGE”: “%f” , “MAX_RANGE”: “%f” }\n" +
"", super.toString(), getRange(), getMIN_RANGE(), getMAX_RANGE());
    }
    

}
