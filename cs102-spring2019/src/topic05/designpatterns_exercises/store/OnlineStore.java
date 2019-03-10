
package topic05.designpatterns_exercises.store;


public class OnlineStore {
    
    public static void main(String [] args){
        
        /** task 1: Create the object [store] of the class Store **/
        
        
        /** task 2: create a new FactoryProduct object **/
        
        
       
        //define books
        String [] authors_book1= {"Anis Koubaa"};
        String [] authors_book2= {"Mohamed Affendi"};
        
        /** task 3: 
         * task 3.1: using Product Factory, create a book1 as 1, "Java Programming", 120.35, authors_book1, "1234569" 
         * task 3.2: add the created book into the products ArrayList of the store object
         */
         
        
        
        /** task 4: 
         * task 4.1: using Product Factory, create a mobile1 as {1, 2, "iPhone6", 3500.0, "iPhone"} 
         * task 4.2: add the created book into the products ArrayList of the store object
         */
        
        

        //define customer
        //define customer
        Street st1 = new Street (1,"Rafha Street", "Riyadh");
        Address a1 = new Address (st1, "Riyadh ", "Saud Arabia", 14523);
        
        Street st2 = new Street (12,"Olya Street", "Riyadh");
        Address a2 = new Address (st2, "Riyadh ", "Saud Arabia", 14523);
        
        Customer customer1 = new Customer ("FG21", "Khaled Ali", a1);
        Customer customer2 = new Customer ("FG25", "Hassan Mounir", a1);
        
        /** task 5: 
         * fix the error in "phones[0]" and "books[0]" by putting the two products that are in the store ArrayList
         */
        
        Order order1 = new Order (customer1, phones [0], customer1.getAddress());
        
        Address shippingAddress1 = a2;
        Order order2 = new Order (customer2, books [0], customer2.getAddress());
        
        /** task 6: 
         * add the orders into the orders ArrayList of store
         */
        
        
    }
    
}

