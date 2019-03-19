package topic06.jcf_exercises.shop.impl;


import topic06.jcf_exercises.shop.interfaces.Order;
import topic06.jcf_exercises.shop.interfaces.Product;
import topic06.jcf_exercises.shop.util.Date;
import topic06.jcf_exercises.shop.interfaces.Shop;
import topic06.jcf_exercises.shop.util.Address;
import topic06.jcf_exercises.shop.util.Street;
import java.util.ArrayList;

public class OnlineShop {    
    public static void main(String [] args){
        
        Shop shop = new ShopImpl();
        
        shop.addProduct(new GameImpl("GM1234567897", 1000.0, "FIFA2018", new Date(1,2,2018)));
        shop.addProduct(new GameImpl("GM9874567555", 800.0, "FIFA2017", new Date(1,3,2017)));
        shop.addProduct(new LaptopImpl("LP9854567354", 2500.00, "HP", 16));
        shop.addProduct(new LaptopImpl("LP7845845845", 3500.00, "MAC", 16));
        shop.addProduct(new DesktopImpl("DK7341524214", 4560.00, "DELL", 16));
        shop.addProduct(new GameImpl("GM1234567435", 700.0, "FIFA2016", new Date(1,2,2016)));
        shop.addProduct(new GameImpl("GM9874567111", 600.0, "FIFA2015", new Date(1,3,2015)));
        
        
        System.out.println("Stock Value: "+ shop.getStockValue());
        shop.saveToFile("shop.txt");
        
        System.out.println("List of Games Sorted Out");
        System.out.println(shop.sortedGames());

        //define customer
        Street st1 = new Street (1,"Rafha Street", "Riyadh");
        Address a1 = new Address (st1, "Riyadh ", "Saud Arabia", 14523);
        
        Street st2 = new Street (12,"Olya Street", "Riyadh");
        Address a2 = new Address (st2, "Riyadh ", "Saud Arabia", 14523);
        
        Customer customer1 = new Customer ("FG21", "Khaled Ali", a1);
        Customer customer2 = new Customer ("FG25", "Hassan Mounir", a1);
        
        //TODO: CREATE AN ORDER AND ADD TWO PRODUCTS TO IT THE DISPLAY THE TOTAL.
        Order order1 = new OrderImpl ("1", customer1, new ProductMapImpl<Product>(), customer1.getAddress(), new Date(1,1,2017));
        order1.getProducts().add(shop.getProducts().get(0).getId(), shop.getProducts().get(0));
        order1.getProducts().add(shop.getProducts().get(1).getId(), shop.getProducts().get(1));

        System.out.println("Total: "+order1.getTotal());
       
    }
    
}
