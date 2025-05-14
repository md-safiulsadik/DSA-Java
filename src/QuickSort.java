public class QuickSort {
    public static void main(String[] args) {

        // quick sort = moves smaller elements to the left of a pivot.
        //			   recursively divide the array in 2 partitions
        //             run-time complexity = Best case O(n log(n))
        //		       Average case O(n log(n))
        //			   Worst case O(n^2) if already sorted

        // pace complexity = O(log(n)) due to recursion

        int[] array = {4, 5, 7, 3, 8, 9, 1, 0};

        quickSort(array, 0, array.length - 1);

        for (int index : array) {
            System.out.print(index + " ");
        }
    }

    private static void quickSort(int[] array, int start, int end) {

        if (end <= start) return; // base case

        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);
    }

    private static int partition(int[] array, int start, int end) {

        int pivot = array[end];
        int i = start - 1;

        for (int j = start; j < end; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;
    }
}

//quickSort(0,7)
//├── quickSort(0,-1)
//└── quickSort(1,7)
//    ├── quickSort(1,2)
//    │   ├── quickSort(1,0)
//    │   └── quickSort(2,2)
//    └── quickSort(4,7)
//        ├── quickSort(4,3)
//        └── quickSort(5,7)
//            ├── quickSort(5,5)
//            └── quickSort(7,7)

