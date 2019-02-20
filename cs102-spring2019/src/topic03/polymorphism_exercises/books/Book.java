package topic03.polymorphism_exercises.books;
import topic03.polymorphism_exercises.books.Author;
import java.util.*;


public class Book extends Publication {

    private double Price;
    private String ISBN;
    private String bookAbstract;

    public String getBookAbstract() {
        return bookAbstract;
    }

    public void setBookAbstract(String bookAbstract) {
        this.bookAbstract = bookAbstract;
    }
    
    
    public Book(String title, ArrayList <Author> a, Date d, String ISBN, double Price, String bookAbstract){
      super(title, a, d);
      setPrice(Price);
      setISBN(ISBN);
      
    }
    
        public Book(){
        super();
    }
    
    
    
    public String getISBN(){
        return ISBN;
    }
    
    public void setISBN(String isbn){
        if (isbn.length()==10)
            ISBN = isbn;
        else 
            ISBN="0000000000";
    }
    
    public double getPrice(){
        return Price;
    }
    
    public void setPrice(double Price){
        this.Price = Price;
    }
    
    
    public String toString(){
        String str = super.toString();
        return String.format("%s, ISBN-10: %s. Price: %.2f SAR", super.toString(), getISBN(), getPrice());
    }

    @Override
    public String readTitle() {
        return getTitle();
    }

    @Override
    public String readAbstract() {
        return getBookAbstract();
    }

    @Override
    public String readContent() {
        return getBookAbstract();
    }

    @Override
    public List<String> toArrayList() {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(getTitle(), getBookAbstract()
        , getBookAbstract()));
        return list;
    }
    
   
}
