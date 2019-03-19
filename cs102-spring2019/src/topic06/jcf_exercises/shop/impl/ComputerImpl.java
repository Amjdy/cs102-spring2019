package topic06.jcf_exercises.shop.impl;



import topic06.jcf_exercises.shop.interfaces.Computer;
import topic06.jcf_exercises.shop.impl.ProductImpl;

public class ComputerImpl extends ProductImpl implements Computer{
    
    private String brand; 
    private int ram;
    

    public ComputerImpl(String id, double price, String brand, int ram) {
        super(id, price);
        setBrand(brand);
        setRam(ram);
        
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

   
    
    
    @Override
    public String toString() {
        return String.format("%s, \"brand\": \"%s\", \"ram\" : \"%d\"}", 
                super.toString(), getBrand(), getRam());
    }
    
}
