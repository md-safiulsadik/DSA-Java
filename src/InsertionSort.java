public class InsertionSort {
    public static void main(String[] args) {
        // Insertion sort = after comparing elements to the left,
        //				shift elements to the right to make room to insert a value

        //				Quadratic time O(n^2)
        //				small data set = decent
        //				large data set = BAD

        //				Fewer steps than Bubble sort
        //				Best case is O(n) compared to Selection sort O(n^2)


        int[] array = {5, 6, 2, 8, 9, 2, 0};
        System.out.print("Unsorted array: ");
        print(array);
        insertionSort(array);
        System.out.print("Sorted array: ");
        print(array);
    }

    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }

    private static void print(int[] array) {
        for (int index : array) {
            System.out.print(index + " ");
        }
        System.out.println();
    }
}
