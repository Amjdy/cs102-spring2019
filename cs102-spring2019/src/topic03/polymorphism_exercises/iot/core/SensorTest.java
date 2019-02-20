package topic03.polymorphism_exercises.iot.core;
import  topic03.polymorphism_exercises.iot.interfaces.*;


public class SensorTest{
    
    public static void main(String[] args) {
        IoTNode iotnode = new IoTNode();
        iotnode.Read("sensors.txt");
        System.out.println(iotnode.getSensors());
    }
}