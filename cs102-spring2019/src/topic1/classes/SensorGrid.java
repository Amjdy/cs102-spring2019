
package topic1.classes;

public class SensorGrid {
    private DistanceSensor[][] sensors;
    private int gridLength;
    private int gridWidth;

    public SensorGrid(DistanceSensor[][] sensors, int gridLength, int gridWidth) {
        setSensors(sensors);
        setGridLength(gridLength);
        setGridWidth(gridWidth);
    }
    
    public SensorGrid(){
        this(null, 0, 0);
    }
    
    public SensorGrid(SensorGrid sensor){
        this(sensor.getSensors(), sensor.getGridLength(),sensor.getGridWidth());
       
    }
    
    public DistanceSensor[][] getSensors() {
        return sensors;
    }

    public void setSensors(DistanceSensor[][] sensors) {
        this.sensors = sensors;
    }

    public int getGridLength() {
        return gridLength;
    }

    public void setGridLength(int gridLength) {
        this.gridLength = gridLength;
    }

    public int getGridWidth() {
        return gridWidth;
    }

    public void setGridWidth(int gridWidth) {
        this.gridWidth = gridWidth;
    }
    
    
    public void add(DistanceSensor s, int i, int j){
        sensors[i][j]= new DistanceSensor(s);
    }
    
    public void remove(int i,int j){
        sensors[i][j]= null;
    }
    
    public double max(){
        double max=-1;
        for(int i=0;i<getGridLength();i++){
            for(int j=0; j<getGridWidth();j++){
                if (max <sensors[i][j].getRange())
                    max =sensors[i][j].getRange();
            }
        }
        return max;
    }
}
