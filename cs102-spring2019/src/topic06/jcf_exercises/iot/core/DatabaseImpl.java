/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic06.jcf_exercises.iot.core;

import topic06.jcf_exercises.iot.interfaces.Database;
import topic06.jcf_exercises.iot.interfaces.Measurement;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class DatabaseImpl <T extends Measurement> implements Database <T>{
    
    private String name;
    
    private Set<T> db = new HashSet<T>(); 
    
    private static Database instance = new DatabaseImpl();
    
    private DatabaseImpl(){
        
    }
    
    @Override
    public Set<T> getDB() {
        return db;    
    }

    
    public static Database getInstance(){
        return instance;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void storeElement(T t) {
        db.add(t);
    }

    @Override
    public void updateElement(T t) {
        db.add(t);
    }

    @Override
    public void removeElement(T t) {
        db.remove(t);
    }
    
    public String toString(){
        return db.toString();
    }

    
}

