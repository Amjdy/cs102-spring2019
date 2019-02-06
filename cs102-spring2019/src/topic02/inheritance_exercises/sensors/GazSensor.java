
package topic02.inheritance_exercises.sensors;

import java.util.ArrayList;
import java.util.Arrays;


public class GazSensor extends AirQualitySensor{
    private String type;
    private final ArrayList<String> TYPES=new ArrayList<String>( Arrays.asList("MQ2", "MQ3", "MQ5", "MQ9"));

    public GazSensor(String type, double value, String unit, String id, String brand, String name) {
        super(value, unit, id, brand, name);
        setType(type);
    }
    
    @Override
    public void setId(String id) {
        if(id.startsWith("G")&&id.length()==6&&id.substring(1).matches("[0-9]+"))
        super.setId(id); 
        else throw new IllegalArgumentException("wrong id");
    }
    public GazSensor(GazSensor g){
        this(g.getType(), g.getValue(), g.getUnit(), g.getId(), g.getBrand(), g.getName());
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (TYPES.contains(type))
        this.type = type;
        else throw new IllegalArgumentException("wrong type");
    }

    public ArrayList<String> getTYPES() {
        return TYPES;
    }

    @Override
    public String toString() {
        return String.format("{“type” : “gaz”, %s, “gaz_type”=”%s”}", super.toString(), getType());
    }


}
