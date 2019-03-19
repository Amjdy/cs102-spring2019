/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic06.jcf_exercises.iot.interfaces;

import topic06.jcf_exercises.iot.core.Date;
import java.util.Set;

/**
 *
 * @author akoubaa
 */
public interface Measurement {
    public abstract Date getDate();
    Set<Sensor> getSensors();
    String getCityName();
    public GPS getGps();
}
