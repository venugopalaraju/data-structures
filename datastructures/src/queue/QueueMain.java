package queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue queue = new Queue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.dequeue();
        queue.enqueue(4);
        queue.getFirst();
        queue.getLast();
        queue.getLength();
        queue.printQueue();
    }
}
