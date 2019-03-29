package topic06.jcf_exercises.realestate.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import topic06.jcf_exercises.realestate.interfaces.IApartment;
import topic06.jcf_exercises.realestate.interfaces.IRealEstate;
import topic06.jcf_exercises.realestate.interfaces.IRealEstateCompany;


public class RealEstateCompany implements IRealEstateCompany{
    
    private List<IRealEstate> realEstates = new ArrayList<IRealEstate>();
    private static RealEstateCompany instance = null;
    private String name;
    

    public void addApartmentToBuilding(String buildingId, String apartmentId){
        int buildingIndex = -1;
        int apartmentIndex = -1;
        for (int i=0;i<realEstates.size();i++){
            IRealEstate realEstate = realEstates.get(i);
            if (realEstate instanceof Building){
                if (buildingId.compareTo(realEstates.get(i).getId())==0)
                buildingIndex = i;
                if ((buildingIndex !=-1) &&(apartmentIndex != -1)) break;
            }
            if (realEstate instanceof IApartment){
                if (buildingId.compareTo(realEstates.get(i).getId())==0)
                apartmentIndex = i;
                if ((buildingIndex !=-1) &&(apartmentIndex != -1)) break;
            }
        }
        if ((buildingIndex !=-1) &&(apartmentIndex != -1)){
            Building b = (Building) (realEstates.get(buildingIndex));
            IApartment a = (IApartment)(realEstates.get(apartmentIndex));
            b.getApartments().add(a);
        }
    }
    
    private RealEstateCompany(String name) {
        this.name = name;
    }
    
    public static RealEstateCompany getInstance(){
        if (instance == null){
            instance = new RealEstateCompany(" ");
        }
        
        return instance;
    }
    @Override
    public List<IRealEstate> getRealEstates() {
        return realEstates;
    }

    public void setRealEstates(ArrayList<IRealEstate> realEstates) {
        this.realEstates = realEstates;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public boolean addRealEstate (IRealEstate realEstate){
        for (int i=0;i<realEstates.size();i++){
            if (realEstate.getId().compareTo(realEstates.get(i).getId())==0)
                return false;
        }
        realEstates.add(realEstate);
        return true;
    }
    public boolean removeRealEstate (String id){
        int index = -1;
        for (int i=0;i<realEstates.size();i++){
            if (id.compareTo(realEstates.get(i).getId())==0)
                index = i;
                break;
        }
        if (index !=-1)
            realEstates.remove(index);
        return true;
    } 
    
    public void loadRealEstates(String filename){
        File file = new File(filename);
        RealEstateFactory real_estate_factory = new RealEstateFactory();
        try {
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                String str = sc.nextLine();
                String[] info = str.split(",");
                IRealEstate real_estate = real_estate_factory.getRealEstate(
                        info[0], info[1], info[2], Double.parseDouble(info[3]));
                
                if (real_estate instanceof Home){
                    Home home = (Home) real_estate;
                    home.setNumberOfRooms(Integer.parseInt(info[4]));
                    home.setHasGarage(Boolean.parseBoolean(info[5]));
                    home.setPrice(Integer.parseInt(info[6]));
                    
                }
               
                if (real_estate instanceof Terrain){
                    Terrain terrain = (Terrain) real_estate;
                    terrain.setHasSink(Boolean.parseBoolean(info[4]));
                    terrain.setPrice(Integer.parseInt(info[5]));
                    
                }
                
                if (real_estate instanceof Apartment){
                    Apartment apartment = (Apartment) real_estate;
                    apartment.setNumberOfRooms(Integer.parseInt(info[4]));
                    apartment.setNumber(Integer.parseInt(info[5]));
                    apartment.setFloorNumber(Integer.parseInt(info[6]));
                    apartment.setPrice(Double.parseDouble(info[7]));
                }
                
                realEstates.add(real_estate);
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RealEstateCompany.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
