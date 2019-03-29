package topic06.jcf_exercises.realestate.impl;

import java.util.ArrayList;

public class Terrain extends RealEstate{
    
    private boolean hasSink;
    ArrayList<GPS> boundaries = new ArrayList<GPS>();

    public Terrain(String id, String name, double surface, boolean hasSink) {
        super(id, name, surface);
        this.hasSink = hasSink;
    }

    public boolean isHasSink() {
        return hasSink;
    }

    public void setHasSink(boolean hasSink) {
        this.hasSink = hasSink;
    }

    public ArrayList<GPS> getBoundaries() {
        return boundaries;
    }

    public void setBoundaries(ArrayList<GPS> boundaries) {
        this.boundaries = boundaries;
    }

    @Override
    public String toString() {
        return String.format("{“type” : “terrain” , %s, “boundaries” : “%s” ",
                super.toString(), this.boundaries);
    }

}
