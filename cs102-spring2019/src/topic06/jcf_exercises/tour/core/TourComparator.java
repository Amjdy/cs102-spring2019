package topic06.jcf_exercises.tour.core;

import topic06.jcf_exercises.tour.core.utils.GPS;
import topic06.jcf_exercises.tour.core.utils.GPSDistanceCalculator;
import topic06.jcf_exercises.tour.interfaces.Tour;
import java.util.Comparator;

/** TASK 3: create a comparator class for Tour **********/
public class TourComparator implements Comparator<Tour>{

    @Override
    public int compare(Tour t1, Tour t2) {
        if (t1.getLength()<t2.getLength())
            return 1;
        else if (t1.getLength()>t2.getLength())
            return -1;
        else{
            GPS gps1 = (GPS) t1.getRoute().get(0).getLocation();
            GPS gps2 = (GPS) t1.getRoute().get(1).getLocation();
            double distance1 = GPSDistanceCalculator.distance(gps1, gps2, "K");
            
            GPS gps3 = (GPS) t2.getRoute().get(0).getLocation();
            GPS gps4 = (GPS) t2.getRoute().get(1).getLocation();
            double distance2 = GPSDistanceCalculator.distance(gps3, gps4, "K");
            
            if (distance1<distance2)
                return 1;
            else if (distance1>distance2)
                return -1;
            return 0;
        }
    }
    
}