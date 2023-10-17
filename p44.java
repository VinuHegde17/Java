import java.util.Collections;
import java.util.LinkedList;

public class p44 {
    public static void main(String args[]){
        LinkedList <String> linkedList= new LinkedList<String>();
        linkedList.add("Paper");
        linkedList.add("Pen");
        linkedList.add("Eraser");
        linkedList.add("Bag");
        linkedList.add(1, "Book");
        linkedList.addFirst("Pencil");
        linkedList.addLast("Scale");
        linkedList.element();
        System.out.println("List is "+linkedList);
        Collections.sort(linkedList,Collections.reverseOrder());
        System.out.println("Reverse list is "+linkedList);


    }
}
