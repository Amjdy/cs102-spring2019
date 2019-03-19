package topic06.jcf_exercises.shop.impl;

import topic06.jcf_exercises.shop.impl.Customer;
import topic06.jcf_exercises.shop.impl.ProductImpl;
import topic06.jcf_exercises.shop.interfaces.Order;
import topic06.jcf_exercises.shop.interfaces.Product;
import topic06.jcf_exercises.shop.util.Address;
import topic06.jcf_exercises.shop.util.Date;
import java.util.Iterator;
import java.util.Set;
import topic06.jcf_exercises.shop.interfaces.*;


public class OrderImpl  implements Order {
    
    String id;
    Customer customer;
    ProductMap<Product> productsOfOrder;
    Address shippingAddress;
    Date shippingDate;

    public OrderImpl(String id, Customer customer, ProductMap<Product> products, Address shippingAddress, Date shippingDate) {
        this.id = id;
        this.customer = customer;
        this.productsOfOrder = products;
        this.shippingAddress = shippingAddress;
        this.shippingDate = shippingDate;
    }
    
    
    public Date getShippingDate(){
        return shippingDate;
    }

    public  void setShippingDate(Date date){
        this.shippingDate=date;
    }
    
    @Override
    public String toString() {
        return "Order{\n" + "\t customer=" + customer + "\t products=" + productsOfOrder + "\tShippingAddress=" + shippingAddress + "\n}\n";
    }
    
    

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address ShippingAddress) {
        this.shippingAddress = ShippingAddress;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ProductMap<Product> getProducts() {
        return productsOfOrder;
    }

    public void setProducts(ProductMap<Product> item) {
        this.productsOfOrder = item;
    }

    @Override
    public double getTotal() {
        Iterator<String> iterator = productsOfOrder.getProducts().keySet().iterator();
        double total =0.0;
        
        while(iterator.hasNext()){
            String id = iterator.next();
            Product product= productsOfOrder.getProducts().get(id);
            double price = product.getPrice();
            total +=price;
        }
        return total;
    }

    @Override
    public int compareTo(Order order) {

        if ((this.getShippingDate().compareTo(order.getShippingDate()))!=0){
            return this.getShippingDate().compareTo(order.getShippingDate());
        } else
        if (this.getTotal()>order.getTotal()){
            return 1;
        } else if (this.getTotal()<order.getTotal()){
            return -1;
        }
            return 0;
    }
 

}
