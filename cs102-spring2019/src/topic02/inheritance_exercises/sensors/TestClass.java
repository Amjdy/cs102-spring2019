
package topic02.inheritance_exercises.sensors;

import java.util.ArrayList;
import java.util.Arrays;


public class TestClass {
    public static boolean DangerAlarm(ArrayList<DistanceSensor> d,ArrayList<GazSensor> g ){
        for (int i = 0; i < g.size(); i++) {
            GazSensor get = g.get(i);
            if (get.getValue()>=500) return true;
            
        }
        
        for (int i = 0; i < d.size(); i++) {
            DistanceSensor get = d.get(i);
            if (get.getRange()<=1) return true;
        }
        return false;
    }
    
    public static boolean randomize(ArrayList<DistanceSensor> d, ArrayList<GazSensor> g){
        for (int i = 0; i < g.size(); i++) {
            GazSensor get = g.get(i);
            get.setValue(Math.random()* 1000);
            
        }
        
        for (int i = 0; i < d.size(); i++) {
            DistanceSensor get = d.get(i);
            get.setRange(Math.random()*(get.getMAX_RANGE()-get.getMIN_RANGE())+get.getMIN_RANGE());
        }
        
        return DangerAlarm(d, g);
    }


    
    public static void main(String[] args) {
        ArrayList<GazSensor> gazSensors = new ArrayList<GazSensor>(Arrays.asList( 
                new GazSensor("MQ2", 200, "ppm", "G12345", "Arduino", "SG01"),
                new GazSensor("MQ5", 350, "ppm", "G12346", "Arduino", "SG02")));
        ArrayList<DistanceSensor> distanceSensors =new ArrayList<DistanceSensor>(Arrays.asList( 
                new DistanceSensor(1.0, 0.3, 5.0, "D12345", "Sharp", "SD01"),
                new DistanceSensor(3.0, 0.1, 10.0, "D12346", "Sharp", "SD02")));
       
    }
}
