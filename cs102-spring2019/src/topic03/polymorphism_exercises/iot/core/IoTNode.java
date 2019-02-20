package topic03.polymorphism_exercises.iot.core;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import topic03.polymorphism_exercises.iot.interfaces.* ;

public class IoTNode implements Node{
    ArrayList<Measurable> sensors = new ArrayList<Measurable>();
    WiFi wifi;
    
    @Override
    public ArrayList<Measurable> getSensors() {
        return sensors;
    }

    @Override
    public WiFi getWiFi() {
        return wifi;
    }
    
    public boolean alert(){
        for (Measurable m:sensors){
            if (m instanceof AirQualitySensor)
            {
                AirQualitySensor a = (AirQualitySensor) m;
                if (a.value() > a.alertThreshold)
                    return true;
            }
            if (m instanceof DistanceSensor)
            {
                DistanceSensor a = (DistanceSensor) m;
                if (a.value() > a.alertThreshold)
                    return true;
            }
        }
        return false;
        

    }
    
    public void Read(String filename){
        File file = new File(filename);
        Scanner sc;
        try {
            sc = new Scanner (file);
            
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                String[] array = line.split(";");
                if (array[0].startsWith("A")){
                    sensors.add(new AirQualitySensor(array[0], array[1], array[2], 
                            Double.parseDouble(array[3]), array[4]));
                }
                if (array[0].startsWith("D")){
                    sensors.add(new DistanceSensor(array[0], array[1], array[2], 
                            Double.parseDouble(array[3]), Double.parseDouble(array[4]), 
                            Double.parseDouble(array[5]), array[6]));
                }
                
            
            
            }
             
        } catch (FileNotFoundException ex) {
            Logger.getLogger(IoTNode.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        
    }
    
    public void Write(String filename){
        try {
            FileWriter fw = new FileWriter(filename);
            for (Measurable m:sensors){
                if (m instanceof AirQualitySensor){
                    AirQualitySensor a = (AirQualitySensor) m;
                    fw.write(String.format("%s;%s;%s;%d;%d\n", a.getId(), a.getBrand(),
                            a.getName(), a.getValue(), a.getUnit()));
                    
                }
                else  if (m instanceof DistanceSensor){
                    DistanceSensor a = (DistanceSensor) m;
                    fw.write(String.format("%s;%s;%s;%d;%d\n", a.getId(), a.getBrand(),
                            a.getName(), a.getValue(), a.getMinRange(), a.getMaxRange(),
                            a.unit()));
                    
                }
                
                fw.close();
            }
            
            
        } catch (IOException ex) {
            Logger.getLogger(IoTNode.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
}