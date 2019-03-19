/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic05.designpatterns_exercises.store;

/**
 *
 * @author Bilel
 */
public class ProductFactory {
    public IProduct getProduct(  
       String productType,   
       int id,   
       String label,   
       double price,   
       String [] authors,   
       String brand_isbn){
        
        if (productType.equalsIgnoreCase("mobilephone")){
            authors = null;
            return new MobilePhoneProduct(id, label, price, brand_isbn);
        }
        else if(productType.equalsIgnoreCase("book")){
            return new BookProduct(id, label, price, authors, brand_isbn);
        }
        else throw new IllegalArgumentException("wrong product type");
        
        
    }
}
