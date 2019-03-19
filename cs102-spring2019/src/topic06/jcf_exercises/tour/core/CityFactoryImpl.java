package topic06.jcf_exercises.tour.core;

import topic06.jcf_exercises.tour.core.utils.GPS;
import topic06.jcf_exercises.tour.interfaces.City;
import topic06.jcf_exercises.tour.interfaces.CityFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CityFactoryImpl implements CityFactory{

    static String [] cities = {"Jeddah", "Makkah", "Madinah", "Riyadh"};
    static List<String> citiesNames = Arrays.asList(cities);
    
    private static CityFactory cf = new CityFactoryImpl();
    
    public static CityFactory getInstance(){
        return cf;
    }
    
    @Override
    public City getCity(String cityName) {
        //if (!citiesNames.contains(cityName))
        //    return null;
        
       if (cityName.toLowerCase().compareTo("makkah")==0){
           return new CityImpl("makkah", new GPS(21.3891, 39.8579));
       }else if (cityName.toLowerCase().compareTo("madinah")==0){
           return new CityImpl("madinah", new GPS(24.5247, 39.5692));
       }else if (cityName.toLowerCase().compareTo("jeddah")==0){
           return new CityImpl("jeddah", new GPS(21.2854, 39.2376));
       }else if (cityName.toLowerCase().compareTo("riyadh")==0){
           return new CityImpl("riyadh", new GPS(24.7136, 46.6753));
       } else if (cityName.toLowerCase().compareTo("boraidah")==0){
           return new CityImpl("boraidah", new GPS(26.3592,43.9818));
       }else if (cityName.toLowerCase().compareTo("aljouf")==0){
           return new CityImpl("aljouf", new GPS(29.8874,39.3206));
       }else if (cityName.toLowerCase().compareTo("riyadh")==0){
           return new CityImpl("tabouk", new GPS(24.7136, 46.6753));
       }else if (cityName.toLowerCase().compareTo("yunbu")==0){
           return new CityImpl("yunbu", new GPS(24.0232,38.1900));
       }else if (cityName.toLowerCase().compareTo("taif")==0){
           return new CityImpl("taif", new GPS(21.4373,40.5127));
       }else if (cityName.toLowerCase().compareTo("abha")==0){
           return new CityImpl("abha", new GPS(18.2465,42.5117));
       }else if (cityName.toLowerCase().compareTo("jizan")==0){
           return new CityImpl("jizan", new GPS(16.8894,42.5706));
       }else if (cityName.toLowerCase().compareTo("albaha")==0){
           return new CityImpl("albaha", new GPS(20.0217,41.4713));
       }else if (cityName.toLowerCase().compareTo("najran")==0){
           return new CityImpl("najran", new GPS(17.5656,44.2289));
       }else if (cityName.toLowerCase().compareTo("qatif")==0){
           return new CityImpl("qatif", new GPS(26.5765,49.9982));
       }else if (cityName.toLowerCase().compareTo("dhahran")==0){
           return new CityImpl("dhahran", new GPS(26.2361,50.0393));
       }else if (cityName.toLowerCase().compareTo("khobar")==0){
           return new CityImpl("khobar", new GPS(26.2172,50.1971));
       }else if (cityName.toLowerCase().compareTo("dammam")==0){
           return new CityImpl("dammam", new GPS(26.3927,49.9777));
       }else if (cityName.toLowerCase().compareTo("tabouk")==0){
           return new CityImpl("tabouk", new GPS(28.3835,36.5662));
       }
       
       return null;
    }
}



