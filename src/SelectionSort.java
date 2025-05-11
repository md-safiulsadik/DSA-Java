public class SelectionSort {
    public static void main(String[] args) {
        // selection sort = search through an array and keep track of the minimum value during
        //     each iteration. At the end of each iteration, we swap variables.

        //     Quadratic time O(n^2)
        //     small data set = okay
        //     large data set = BAD

        int[] array = {5, 6, 2, 8, 9, 2, 0};
        System.out.print("Unsorted array: ");
        print(array);
        selectionSort(array);
        System.out.print("Sorted array: ");
        print(array);
    }

    private static void selectionSort(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }

    private static void print(int[] array) {
        for (int index : array) {
            System.out.print(index + " ");
        }
        System.out.println();
    }
}

