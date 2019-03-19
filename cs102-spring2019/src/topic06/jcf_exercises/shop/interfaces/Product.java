package topic06.jcf_exercises.shop.interfaces;



public interface Product extends Comparable<Product>{
    
    public abstract String getId();
    public abstract double getPrice();
    
    public abstract void setId(String id);
    public abstract void setPrice(double price);
    
}
