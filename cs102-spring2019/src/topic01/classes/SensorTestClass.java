
package topic01.classes;


public class SensorTestClass {
    public static void main(String[] args){
        SensorGrid grid = new SensorGrid(new DistanceSensor[3][3], 3, 3);
        int id=1;
        for(int i=0;i<grid.getGridLength();i++){
            for(int j=0; j<grid.getGridWidth();j++){
                DistanceSensor d=  new DistanceSensor(Integer.toString(id), Math.random()*4.8+0.2, 5.0,0.2);
                grid.add(d, i, j);
                id++;
            }
        }
        
        System.out.println(" the maximum of the sensor grid is : "+ grid.max());
    }
}
