public class SimpleLinkedList {
    private Node head;
    private Node current;

    public SimpleLinkedList(){
        head=null;

    }

    public void addToTail(String data){
        Node temp = head;
        if( this.isEmpty())
            head = new Node(data);
        else {
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext( new Node(data) );
        }
    }

    public String removeFromHead(){
        String removedHead = head.getData();
        head = head.getNext();
        return removedHead;
    }

    public boolean isEmpty(){
        if(head==null)
            return true;
        return false;
    }

    public Node get(String data){
       Node temp = head;
       while ( temp.getData()!=data){
           temp=temp.getNext();
           if(temp.getData()==data)
               return temp;
       }
       return null;
    }

    public Node get( int index ){
        Node temp = head;
        for( int i = 0; i < index; i++){
            temp = temp.getNext();
        }
        return temp;
    }

    public String toString(){
        String result="";
        Node temp = head;
        while(temp!=null){
            result = result + "\n" + temp.getData();
            temp=temp.getNext();
        }

        return result;
    }
}
