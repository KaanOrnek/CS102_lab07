public class SimpleQueue {
    SimpleLinkedList queue;

    public SimpleQueue(){
        queue = new SimpleLinkedList();
    }

    public void enqueue(String data){
        queue.addToTail(data);
    }

    public void dequeue(){
        queue.removeFromHead();
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }
}
