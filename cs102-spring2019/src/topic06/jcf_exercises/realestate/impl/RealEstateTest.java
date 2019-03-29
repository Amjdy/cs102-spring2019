package topic06.jcf_exercises.realestate.impl;

import java.util.ArrayList;
import java.util.List;
import topic06.jcf_exercises.realestate.interfaces.IRealEstate;


public class RealEstateTest 
{
    public static void main(String[] args) {
        RealEstateCompany real_estate_company = RealEstateCompany.getInstance();
        real_estate_company.loadRealEstates("reral_estate.csv");
        List<IRealEstate> real_estates = real_estate_company.getRealEstates();
        int home_number =0;
        int terrain_number =0;
        int apartment_number =0;
        double home_prices =0;
        double terrain_prices =0;
        double apartment_prices =0;
        for(IRealEstate real_estate:real_estates){
           
            if (real_estate instanceof Home ){
                home_number++;
                home_prices += real_estate.getPrice();
            }
            
            if (real_estate instanceof Terrain){
                terrain_number++;
                terrain_prices +=real_estate.getPrice();
            }
            
            if (real_estate instanceof Apartment){
                apartment_number++;
                apartment_prices +=real_estate.getPrice();
            }
                
            System.out.println("number of homes =" + home_number);
            System.out.println("average price of home ="+ home_prices/home_number);
            
            System.out.println("number of terrain =" + terrain_number);
            System.out.println("average price of terrain ="+ terrain_prices/terrain_number);
            
            System.out.println("number of apartment =" + apartment_number);
            System.out.println("average price of apartment ="+ apartment_prices/apartment_number);
            
        
        }
}
}

