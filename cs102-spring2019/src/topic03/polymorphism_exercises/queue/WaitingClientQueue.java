
package topic03.polymorphism_exercises.queue;

import java.util.ArrayList;
import java.util.Collections;


public class WaitingClientQueue implements Queuable{
    
    public ArrayList<Client> waitingQueue; 

    public WaitingClientQueue(ArrayList<Client> waitingQueue) {
        this.waitingQueue = waitingQueue;
    }public WaitingClientQueue() {
        this.waitingQueue = new ArrayList<Client>();
    }

    public ArrayList<Client> getWaitingQueue() {
        return waitingQueue;
    }

    public void setWaitingQueue(ArrayList<Client> waitingQueue) {
        this.waitingQueue = waitingQueue;
    }
    
    
    

    
    
    public String toString(){
        return String.format("%s",waitingQueue);
    }

    @Override
    public void enqueue(Object ob) {
        waitingQueue.add((Client) ob);
    }

    @Override
    public Object dequeue() {
        Client cl = waitingQueue.get(0);
        for (Client c:waitingQueue ){
            if (cl.compareTo(c)<0)
                cl = c;
        }
        waitingQueue.remove(cl);
        return cl;
    }
}
