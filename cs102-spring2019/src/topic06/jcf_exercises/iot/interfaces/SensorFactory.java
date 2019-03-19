
package topic06.jcf_exercises.iot.interfaces;


public interface SensorFactory {
    
    public abstract Sensor getSensor(String sensorType,String unit, double value);
    
}
