/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic06.jcf_exercises.realestate.interfaces;


public interface IRealEstateFactory {
    public abstract IRealEstate getRealEstate(String realEstateType, String id, String name, double surface);
}
