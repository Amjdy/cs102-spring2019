package topic05.designpatterns_exercises.store;

import java.util.ArrayList;

public class Store {
    
    private ArrayList<Product> products;
    private ArrayList<Order> orders;

    public ArrayList<Order> getOrders() {
        return orders;
    }
    
    private static Store instance = new Store();
        
    private Store(){
        products = new ArrayList<Product>();
        orders = new ArrayList<Order>();
        
    }
    
    public static Store getInstance(){
        return instance;
    }
    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
      
}
