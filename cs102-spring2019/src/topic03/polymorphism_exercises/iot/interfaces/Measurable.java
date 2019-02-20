
package topic03.polymorphism_exercises.iot.interfaces;


public interface Measurable extends Comparable<Measurable>{
    double value();
    String unit();
}
