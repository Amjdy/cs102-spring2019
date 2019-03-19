/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic06.jcf_exercises.shop.interfaces;


public interface OrderMap <String, T extends Order> {
    
    public abstract void addOrder(String id, T t);
    public abstract void cancelOrder(String id);
    
       
    
    
}
