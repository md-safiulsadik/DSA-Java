import java.security.spec.RSAOtherPrimeInfo;

public class BubbleSort {
    public static void main(String[] args) {
        // bubble sort = pairs of adjacent elements are compared, and the elements
        //		            swapped if they are not in order.

        //				 Quadratic time O(n^2)
        //				 small data set = okay-ish
        //				 large data set = BAD (plz don't)

        int[] array = {8, 9, 3, 5, 7, 0};
        System.out.print("Unsorted array: ");
        print(array);
        bubbleSort(array);
        System.out.print("Sorted array: ");
        print(array);
    }

    private static void bubbleSort(int[] array) {
       int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    private static void print(int[] array) {
        for (int index : array) {
            System.out.print(index + " ");
        }
        System.out.println();
    }
}
