package topic06.jcf_exercises.shop.interfaces;



public interface Computer extends Product{
    
    public abstract String getBrand ();
    public abstract int getRam();
    
    
    public abstract void setBrand (String brand);
    public abstract void setRam(int ram);
    
    
    
}
