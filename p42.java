import java.util.LinkedList;

public class p42 {
    public static void main(String args[]){
        LinkedList <String> linkedList= new LinkedList<String>();
        linkedList.add("Paper");
        linkedList.add("Pen");
        linkedList.add("Eraser");
        linkedList.add("Bag");
        linkedList.add(1, "Book");
        linkedList.addFirst("Pencil");
        linkedList.addLast("Scale");
        System.out.println("Original List is "+linkedList);
        linkedList.remove(2);
        linkedList.remove("Bag");
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("Linked List after delition is "+linkedList);

    }
}
