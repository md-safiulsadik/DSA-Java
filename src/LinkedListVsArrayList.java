import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListVsArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        long startTime;
        long endTime;

        for (int i = 0; i < 10000000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        startTime = System.nanoTime();
//        arrayList.get(5000000);
//        arrayList.getLast();
        arrayList.remove(5000000);
        endTime = System.nanoTime();

        System.out.println("ArrayList time took: " + (endTime - startTime) + "ns");

        startTime = System.nanoTime();
//        linkedList.get(5000000);
//        linkedList.getLast();
        linkedList.remove(5000000);
        endTime = System.nanoTime();

        System.out.println("LinkList time took: " + (endTime - startTime) + "ns");


    }
}
