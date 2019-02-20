package topic03.polymorphism_exercises.queue;

import java.util.ArrayList;


public class ClientQueuableDemo {
    public static void main(String[]args){
        
        Queuable q = new WaitingClientQueue();
        
       ArrayList<QueuableObject> qlist = new ArrayList<QueuableObject>();
        
        qlist.add((QueuableObject)new Client(350, "Normal", "Mohamed", "Ali"));
        qlist.add((QueuableObject) new Client(353, "VIP", "Salah", "Raed"));
        qlist.add((QueuableObject) new Task("Task2", 22, 1));
        qlist.add((QueuableObject) new Client(352, "Normal", "Mounir", "Hassan"));
        qlist.add((QueuableObject) new Task("Task3", 23, 2));
        qlist.add((QueuableObject) new Client(357, "VIP", "Shahed", "Boudhir"));
        qlist.add((QueuableObject) new Task("Task1", 21, 3));
        
        
        /** task 1: Enqueue all client objects of the qlist in the WaitingClientQueue **/
        for(QueuableObject ql:qlist){
            if (ql instanceof Client)
                q.enqueue(ql);
        }
        
        /** task 2: Print the size and the elements of WaitingClientQueue */
        WaitingClientQueue wq = (WaitingClientQueue)q;
        System.out.printf("size of WaitingClientQueue = %d\n", wq.waitingQueue.size());
        
        for (Client cl:wq.waitingQueue){
            System.out.printf("%s\n", cl);
        }
        
        /** task 3: Dequeue and display all the Client objects from the WaitingClientQueue */
        
        while(wq.waitingQueue.size() !=0){
            Object ob = wq.dequeue();
            Client cl = (Client) ob;
            System.out.printf("dequeued client  %s\n",cl);
        
        }
        
        
       
    }
    
}
