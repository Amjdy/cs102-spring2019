
package topic03.polymorphism_exercises.iot.interfaces;

import java.util.ArrayList;


public interface Node {
    ArrayList<Measurable> getSensors();
    WiFi getWiFi();
}
