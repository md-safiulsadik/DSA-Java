import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        // Binary Search = Algorithm that finds the position of a taget value within a sorted array
        // Half of the array is eliminated during each step
        // Run-time: O(log n)

        int[] array = new int[1000000000];
        int target = 10;

        for (int i = 0, j = 0; j < array.length; i+=2) {
            array[j] = i;
            j++;
        }

//        int index = Arrays.binarySearch(array, target);
        int index = binarySearch(array, target);

        if (index == -1) System.out.println("Value not found!");
        else System.out.println("Value found at index: " + index);
    }

    private static int binarySearch(int[] array, int target) {
        int first = 0;
        int last = array.length - 1;
        int middle;
        int steps = 1;

        while (first <= last){
            middle = (last + first) / 2;
            System.out.println(steps++);
            if (array[middle] == target) {
                return middle;
            }
            else if (target < array[middle]) {
                last = middle - 1;
            } else if (target > array[middle]) {
                first = middle + 1;
            }
        }
        return -1;
    }
}
