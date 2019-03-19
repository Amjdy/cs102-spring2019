/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic06.jcf_exercises.shop.interfaces;
import topic06.jcf_exercises.shop.impl.Customer;
import topic06.jcf_exercises.shop.impl.ProductImpl;
import topic06.jcf_exercises.shop.util.Address;
import topic06.jcf_exercises.shop.util.Date;
import java.util.Collection;

/**
 *
 * @author akoubaa
 */
public interface Order extends Comparable <Order> {

    public Address getShippingAddress() ;

    public void setShippingAddress(Address ShippingAddress) ;

    public Customer getCustomer() ;

    public void setCustomer(Customer customer) ;

    public ProductMap<Product> getProducts() ;

    public void setProducts(ProductMap<Product> products) ;
    
    public Date getShippingDate();
    public  void setShippingDate(Date date);
    
    public double getTotal();
       
}
