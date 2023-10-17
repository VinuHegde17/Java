import java.util.Collections;
import java.util.LinkedList;

public class p43 {
    public static void main( String args[]){
    LinkedList <String> linkedList = new LinkedList <String>();
    linkedList.add("Apple");
    linkedList.add("Banana");
    linkedList.add("Orange");
    System.out.println("Original List is "+linkedList);
    linkedList.addFirst("Mango");
    linkedList.addLast("Watermelon");
    linkedList.add(3,"Grapes");
    Collections.sort(linkedList);
    System.out.println("Linked List after the sorting is "+linkedList);

    }
}
