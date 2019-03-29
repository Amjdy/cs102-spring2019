/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic06.jcf_exercises.realestate.impl;

import topic06.jcf_exercises.realestate.interfaces.IRealEstate;
import topic06.jcf_exercises.realestate.interfaces.IRealEstateFactory;


public class RealEstateFactory implements IRealEstateFactory{

    @Override
    public IRealEstate getRealEstate(String realEstateType, String id, String name, double surface) {
        if (realEstateType.equalsIgnoreCase("home")){
            return new Home(id, name, surface, 0, false);
        } else  if (realEstateType.equalsIgnoreCase("terrain")){
            return new Terrain(id, name, surface, false);
        } else   if (realEstateType.equalsIgnoreCase("apartment")){
            return new Apartment(id, name, surface, 0, 0, 0);
        }
        else throw new IllegalArgumentException(" wrong realEstateType");
    }
    
}
