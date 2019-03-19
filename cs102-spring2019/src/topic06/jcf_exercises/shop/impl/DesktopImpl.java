package topic06.jcf_exercises.shop.impl;



import topic06.jcf_exercises.shop.interfaces.Desktop;
import java.util.ArrayList;

public class DesktopImpl extends ComputerImpl implements Desktop{
    
   public static final ArrayList<String> BRANDS = new ArrayList<String>();

    public DesktopImpl(String id, double price, String brand, int ram) {
        super(id, price, brand, ram);
    
        BRANDS.add("HP");
        BRANDS.add("ASUS");
        BRANDS.add("DELL");
        
        setBrand(brand);
    }
    
    
    @Override
    public void setBrand(String brand) {
        if (BRANDS.contains(brand))
            super.setBrand(brand);
    }
    
    
    @Override
    public void setId(String ID){
        if (ID.startsWith("DK"))
            super.setId(ID);
    }
      
    
}
