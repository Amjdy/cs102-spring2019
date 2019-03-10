package topic05.designpatterns;


public class University {
    
    
    private String name;
    
    static int count=0;
    
    
    //early instantiation 
    private static University instance = null;

    private University(String name) {
        this.name = name;
        count=count+1;
    }
    
    public static University getInstance(){
        if (instance == null)
            instance = new University("PSU");
        return instance;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
