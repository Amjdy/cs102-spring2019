
package topic06.jcf_exercises.shop.interfaces;

import java.util.Map;

public interface ProductMap <T extends Product>{
    
    void add(String id, T t);
    void remove(String id);
    T get(String id);
    Map<String, T> getProducts();

}
