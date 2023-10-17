import java.util.LinkedList;

public class p41 {
public static void main(String args[]){
   LinkedList <String> linkedList=new LinkedList<String>(); 
   linkedList.add("Apple");
   linkedList.add("Banana");
   linkedList.add("Orange");
   System.out.println("Original List is "+linkedList);
   linkedList.addFirst("Mango");
   linkedList.addLast("Watermelon");
   linkedList.add(3,"Grapes");
   System.out.println("Linked List after the insertion is "+linkedList);
}
}
