package topic06.jcf_exercises.tour.core.utils;

import topic06.jcf_exercises.tour.interfaces.Coordinate;

public class GPS implements Coordinate{

    private double lat;
    private double lon;
    private double altitude;
    
    
    public GPS() {
    }

    public GPS(double x, double y, double z) {
        setLat(x);
        setLon(y);
        setAltitude(z);
    }
    
    public GPS(double x, double y) {
        setLat(x);
        setLon(y);
        setAltitude(0.0);
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double latitude) {
        if((latitude >-85)&&(latitude <85))
            this.lat = latitude;
        else
            throw new IllegalArgumentException("Wrong latitude");
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double longitude) {
        if((longitude >-180)&&(longitude <180))
            this.lon = longitude;
        else
            throw new IllegalArgumentException("Wrong longitude");
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    @Override
    public double getX() {
        return getLat();
    }

    @Override
    public double getY() {
        return getLon();
    }

    @Override
    public double getZ() {
        return getAltitude();
    }

    @Override
    public void setX(double x) {
        setLat(x);
    }

    @Override
    public void setY(double y) {
        setLon(y);
    }

    @Override
    public void setZ(double z) {
        setAltitude(z);
    } 

    @Override
    public String toString() {
        return "("+lat+"," + lon +")";
    }
        
    
}
