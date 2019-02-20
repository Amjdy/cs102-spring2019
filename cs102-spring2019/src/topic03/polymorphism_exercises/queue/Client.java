package topic03.polymorphism_exercises.queue;

import java.util.ArrayList;

class Client extends Person implements QueuableObject, Comparable<Client>{

    private int waitingNumber;
    public String clientPriority;
    
    public String [] clientPriorities={"Normal", "VIP"};
    
    public Client(int waitingNumber, String clientPriority, String firstName, String lastName) {
        super(firstName, lastName);
        this.waitingNumber = waitingNumber;
        this.clientPriority = clientPriority;
    }
    

    public int getWaitingNumber() {
        return waitingNumber;
    }

    public void setWaitingNumber(int waitingNumber) {
        this.waitingNumber = waitingNumber;
    }
    
    

    
    
    public String toString(){
        return String.format("%s (%s,%d)", super.toString(), this.clientPriority,this.waitingNumber);
    }

    @Override
    public int compareTo(Client o) {
        if (this.clientPriority != o.clientPriority)
            return this.clientPriority.compareTo(o.clientPriority);
        else return (this.waitingNumber - o.waitingNumber);
            
    }
    
    
}
