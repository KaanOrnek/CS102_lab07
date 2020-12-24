public class SimpleQueue {
    SimpleLinkedList queue;

    public SimpleQueue(){
        queue = new SimpleLinkedList();
    }

    public void enqueue(String data){
        queue.addToTail(data);
    }

    public String dequeue(){
        return queue.removeFromHead();
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public String toString(){
        return queue.toString();
    }
}
