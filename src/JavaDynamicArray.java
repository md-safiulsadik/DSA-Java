import java.util.ArrayList;

public class JavaDynamicArray {
    public static void main(String[] args) {

       DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add(1);
        dynamicArray.add(2);
//        dynamicArray.add("3");

//        System.out.println(dynamicArray.get(4));
        dynamicArray.insert(5, 3);
//        dynamicArray.delete("A");

//        System.out.println(dynamicArray.search(3));
        dynamicArray.delete(1);
        dynamicArray.delete(2);
        dynamicArray.delete(3);
        dynamicArray.delete("A");
        dynamicArray.delete("B");
        dynamicArray.delete("C");

        System.out.println(dynamicArray);

    }
}
