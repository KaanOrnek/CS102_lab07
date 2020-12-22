public class SimpleLinkedListTest {

    public static void main(String [] args){
        SimpleLinkedList list = new SimpleLinkedList();

        list.addToTail("str1");
        list.addToTail( "str2");
        list.addToTail( "str3");
        list.addToTail( "str4");
        list.addToTail( "str5");
        list.addToTail("str6");

        System.out.println( list.toString() );
        System.out.println( "\n*******************" );

        System.out.println( "String in the index 3: " + list.get(3));
        System.out.println( "String in the index 5: " + list.get(5));
        System.out.println( "\n*******************" );

        System.out.println( "Removed: " + list.removeFromHead());
        System.out.println( list.toString() );

        System.out.println( "\nRemoved: " + list.removeFromHead());
        System.out.println( list.toString() );

        System.out.println( "\nRemoved: " + list.removeFromHead());
        System.out.println( list.toString() );



    }
}
