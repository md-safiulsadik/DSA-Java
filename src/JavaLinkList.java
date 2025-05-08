import java.util.LinkedList;

public class JavaLinkList {
    public static void main(String[] args) {

        // LinkedList = Nodes are in 2 parts (data+address)
        //              Nodes are in non-consecutive memory locations
        //              Elements are linked using pointers

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");

        linkedList.add(1, "E");
        linkedList.remove("D");

        linkedList.addFirst("SAFIUL");
        linkedList.addLast("SADIK");

        linkedList.removeFirst();
        linkedList.removeLast();

        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());



        System.out.println(linkedList);

    }
}



//    Advantages?
//    1. Dynamic Data Structure (allocates necessary memory while running)
//    2. Insertion and Deletion of Nodes is easy. O(1)
//    3. No/Low memory waste

//    Disadvantages?
//    1. Greater memory usage (additional pointer)
//    2. No random access of elements (no index [i])
//    3. Accessing/searching elements is more time consuming. O(n)
