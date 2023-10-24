package PriorityQueue;
import java.util.*;
public class add {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();//revese order ke liye commpertor.reverse
        pq.add(1);
        pq.add(23);
        pq.add(21);
        pq.add(25);
        pq.add(55);
        pq.add(11);

        while (!pq.isEmpty()) {
            System.out.print(pq.peek()+" ");
            pq.remove();
        }
    }
}
