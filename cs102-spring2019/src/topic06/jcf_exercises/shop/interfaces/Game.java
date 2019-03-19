package topic06.jcf_exercises.shop.interfaces;

import topic06.jcf_exercises.shop.util.Date;


public interface Game extends Product{
    
    public abstract Date getDate();
    public abstract String getTitle();
    
    public abstract void setDate(Date date);
    public abstract void setTitle(String title);
    
}
