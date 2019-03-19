/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic06.jcf_exercises.shop.impl;

import java.util.Comparator;
import topic06.jcf_exercises.shop.interfaces.Order;

public class OrderComparator implements Comparator<Order>{

public int compare (Order order1, Order order2){

    if (order1.getCustomer().getID().compareTo(order2.getCustomer().getID())!=0){
        return order1.getCustomer().getID().compareTo(order2.getCustomer().getID());
    } else
    if (order1.getTotal()>order2.getTotal()){
        return 1;
    } else if (order1.getTotal()<order2.getTotal()){
        return -1;
    } else
    if ((order1.getShippingDate().compareTo(order2.getShippingDate()))!=0){
        return order1.getShippingDate().compareTo(order2.getShippingDate());
    }

    return 0;
    }

}

