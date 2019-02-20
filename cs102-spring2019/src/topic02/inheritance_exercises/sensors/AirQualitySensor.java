/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic02.inheritance_exercises.sensors;


public class AirQualitySensor extends Sensor{
    private double value;
    private String unit;

    public AirQualitySensor(double value, String unit, String id, String brand, String name) {
        super(id, brand, name);
        setValue(value);
        setUnit(unit);
    }
    public AirQualitySensor(AirQualitySensor a){
        this(a.getValue(), a.getUnit(), a.getId(), a.getBrand(), a.getName());
    }
    
    @Override
    public void setId(String id) {
        if(this instanceof GazSensor)
            super.setId(id);
        else if(id.startsWith("A")&&id.length()==6&&id.substring(1).matches("[0-9]+"))
        super.setId(id); 
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
        return String.format("{“type” : “air_quality”, %s, “value”:”%f”, “unit”: “%s”}\n" +
"", super.toString(), getValue(), getUnit());
    }
    
}
