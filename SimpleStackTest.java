public class SimpleStackTest {

    public static void main(String [] args){
        SimpleStackWithQueue stack = new SimpleStackWithQueue();

        stack.push("a1");
        stack.push("a2");
        stack.push("a3");
        stack.push("a4");
        stack.push("a5");
        stack.push("a6");

        System.out.println( stack.toString() );
        System.out.println( "\n*******************" );

        System.out.println( "Pop: " + stack.pop());
        System.out.println( "Stack: " + stack.toString() );

        System.out.println( "\nPop: " + stack.pop());
        System.out.println( "Stack: " + stack.toString() );

        System.out.println( "\nPop: " + stack.pop());
        System.out.println( "Stack: " + stack.toString() );

    }
}
