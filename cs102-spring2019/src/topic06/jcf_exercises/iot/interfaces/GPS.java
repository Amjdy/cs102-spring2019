/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic06.jcf_exercises.iot.interfaces;

/**
 *
 * @author akoubaa
 */
public interface GPS {
    
    public abstract double getLat();
    public abstract double getLng();
    
    public abstract void setLat(double lat);
    public abstract void setLng(double lng);
    
}
