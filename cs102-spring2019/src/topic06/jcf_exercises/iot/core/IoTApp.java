/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic06.jcf_exercises.iot.core;

import topic06.jcf_exercises.iot.interfaces.Humidity;
import topic06.jcf_exercises.iot.interfaces.Database;
import topic06.jcf_exercises.iot.interfaces.Distance;
import topic06.jcf_exercises.iot.interfaces.GPS;
import topic06.jcf_exercises.iot.interfaces.Measurement;
import topic06.jcf_exercises.iot.interfaces.Pressure;
import topic06.jcf_exercises.iot.interfaces.Sensor;
import topic06.jcf_exercises.iot.interfaces.SensorFactory;
import topic06.jcf_exercises.iot.interfaces.Temperature;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;


public class IoTApp {
    
    Database <Measurement> db = DatabaseImpl.getInstance();
    SensorFactory sf = new SensorFactoryImpl();
    Set<String> cities = new TreeSet<String>();
    
     /*** Task 1: loadData Method **/
    public void loadData(String filename){
        File file = new File(filename);
        try {
            Scanner sc = new Scanner(file);
            while( sc.hasNextLine()){
                String str = sc.nextLine();
                String[] array  = str.split(";");
                String cityName = array[0];
                GPS gps = new GPSImpl(Double.parseDouble(array[1]), Double.parseDouble(array[2]));
                Set<Sensor> sensors = new TreeSet<Sensor>();
                SensorFactory sf = new SensorFactoryImpl();
                
                sensors.add(sf.getSensor("temperature", array[4], Double.parseDouble(array[3])));
                sensors.add(sf.getSensor("humidity", array[6], Double.parseDouble(array[5])));
                sensors.add(sf.getSensor("pressure", array[8], Double.parseDouble(array[7])));
                sensors.add(sf.getSensor("distance", array[10], Double.parseDouble(array[9])));

                String[] date_string= array[11].split("/");
                Date d = new Date(Integer.parseInt(date_string[0]), Integer.parseInt(date_string[0]), Integer.parseInt(date_string[0]));
                Measurement measurement = new MeasurementImpl(d, cityName, gps, sensors);
                cities.add(cityName);
                db.storeElement(measurement);
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(IoTApp.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    /*** Task 2 Filter by Date and City **/
    public Set<Measurement> FilterByDateAndCity (String cityName, Date dmin, Date dmax){
        Set<Measurement> set_measurement = new HashSet<Measurement>();
        Iterator<Measurement> it = db.getDB().iterator();
        if (cityName.equalsIgnoreCase("all")){
            while(it.hasNext()){
                Measurement m = it.next();
                if (withinDateInterval(m.getDate(), dmin, dmax)){
                    set_measurement.add(m);
                }
            }
        }
        else{
            boolean cityNameexist = false;
            while(it.hasNext()){
                Measurement m = it.next();
                if ( cityName.equalsIgnoreCase(m.getCityName())){
                    cityNameexist = true;
                    if (withinDateInterval(m.getDate(), dmin, dmax)) set_measurement.add(m);
                }
            }
            if (cityNameexist == false)
                throw new IllegalArgumentException(" cityname doesn't exist");
        }
         return set_measurement;
    }


    
    /*** Task 4  maxTemperature  **/ 
    
    
    
    public boolean withinDateInterval(Date d, Date d1, Date d2){
        if (d1.compareTo(d2)<0){
            if ((d.compareTo(d1)>=0)&&(d.compareTo(d2)<=0)){
                return true;
            }
        }
        if (d1.compareTo(d2)>0){   
            if ((d.compareTo(d1)<=0)&&(d.compareTo(d2)>=0)){
                return true;
            }
        }
        return false;
    }
    
   
    
    
    public double maxTemperature (String cityName, Date dmin, Date dmax){
        Set<Measurement> mSet = new HashSet<Measurement>();
        mSet = FilterByDateAndCity(cityName, dmin, dmax);

        double ht = -9999;
        Measurement m = Collections.max(mSet, new MeasurementTemperatureComparator());
        for (Sensor s : m.getSensors()){
            if (s instanceof Temperature){
                ht=s.getValue();
            break;
            }
        }
        if (ht==-9999) throw new IllegalArgumentException("No temperature found in m1");
        return ht;
    }
    
    
    
    
}
