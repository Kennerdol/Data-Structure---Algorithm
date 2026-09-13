import java.util.LinkedList;
import java.util.Queue;

public class Main{
    public static void main(String[] args){

        // Queues are FIFO - First In first Out
        // Enqueue - add an item to the end of the queue we use offer() or add() methods
        // Dequeue - remove an item from the front of the queue we use poll() or remove() methods
        // Peek - view the item at the front of the queue without removing it we use peek() method or element() method

        Queue<String> Q = new LinkedList<String>();
        Q.offer("John");
        Q.offer("Doe");
        Q.offer("Ryan");
        Q.offer("Sechela");
        Q.offer("Tembo");

        System.out.println("");
        System.out.println(Q);

        System.out.println("");
        System.out.println(Q.isEmpty());

        System.out.println("");
        System.out.println("Top most item: " + Q.peek());

        System.out.println("");
        String removed = Q.remove();
        System.out.println("Removed item: " + removed);

        System.out.println("");
        System.out.println(Q);

        for(int i = 0; i <= 15; i++){
            Q.add("Added " + i);
        }

        System.out.println(Q);
    }
}