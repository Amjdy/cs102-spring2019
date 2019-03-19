/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic06.jcf_exercises.shop.impl;

import java.util.Map;
import java.util.TreeMap;
import topic06.jcf_exercises.shop.interfaces.Product;
import topic06.jcf_exercises.shop.interfaces.ProductMap;


public class ProductMapImpl <T extends Product > implements ProductMap<T> {
    
    private Map<String, T> productMaps = new TreeMap<String, T>();
    
    @Override
    public void add(String id, T t) {
        productMaps.put(id, t);
    }

    @Override
    public void remove(String id) {
        productMaps.remove(id);
    }

    @Override
    public T get(String id) {
        return productMaps.get(id);
    }

    @Override
    public Map<String, T> getProducts() {
        return productMaps;
    }
    
    
}
