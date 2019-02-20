package topic03.polymorphism_exercises.books;


import java.util.*;

public class  Conference extends Publication{
    
    private String ConferenceName;
    private String ConferenceLocation;

    public String getPaperAbstract() {
        return paperAbstract;
    }

    public void setPaperAbstract(String paperAbstract) {
        this.paperAbstract = paperAbstract;
    }

    public String getPaperContent() {
        return paperContent;
    }

    public void setPaperContent(String paperContent) {
        this.paperContent = paperContent;
    }
    private String paperAbstract;
    private String paperContent;
      
    public Conference(){
        super();
    }
    
    public Conference (String title, ArrayList authorsList, Date pubDate, String ConfName, String ConfLocation, String PAbstract, String content){
        super(title, authorsList, pubDate);
        setConferenceName(ConfName);
        setConferenceLocation(ConfLocation);
        
    }
    
    public void setConferenceName(String ConfName){
        ConferenceName = ConfName;
    }
    
    public void setConferenceLocation(String ConfLocation){
        ConferenceLocation = ConfLocation;
    }
    
    public String getConferenceName(){
        return ConferenceName;
    }
    
    public String getConferenceLocation(){
        return ConferenceLocation;
    }  
    
    public String toString(){
        String str = super.toString();
        return String.format("%s, %s, %s.", super.toString(), getConferenceName(), getConferenceLocation());
    }

    @Override
    public String readTitle() {
        return getTitle();
    }

    @Override
    public String readAbstract() {
        return getPaperAbstract();
    }

    @Override
    public String readContent() {
        return  getPaperContent();
    }

    @Override
    public List<String> toArrayList() {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(getTitle(), getPaperAbstract()
        , getPaperContent()));
        return list;
    }
    
    
    
}
