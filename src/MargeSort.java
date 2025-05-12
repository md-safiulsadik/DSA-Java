
public class MargeSort {
    public static void main(String[] args) {

        // merge sort = recursively divide array in 2, sort, re-combine
        // run-time complexity = O(n Log n)
        // space complexity    = O(n)

        int[] array = {2, 3, 5, 7, 8, 9, 1, 0};
        for (int index : array) {
            System.out.print(index + " ");
        }
        System.out.println();

        margeSort(array);

        for (int index : array) {
            System.out.print(index + " ");
        }
    }

    private static void margeSort(int[] array) {
        int len = array.length;

        if (len < 2) return;

        int mid = len / 2;
        int[] leftHalf = new int[mid];
        int[] rightHalf = new int[len - mid];

        for (int i = 0; i < mid; i++) {
            leftHalf[i] = array[i];
        }
        for (int i = mid, j = 0; i < len; i++, j++) {
            rightHalf[j] = array[i];
        }

        margeSort(leftHalf);
        margeSort(rightHalf);
        marge(array, leftHalf, rightHalf);
    }

    private static void marge(int[] array, int[] leftHalf, int[] rightHalf) {
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;

        int l = 0, r = 0, i = 0;

        while (l < leftSize && r < rightSize) {
            if (leftHalf[l] < rightHalf[r]) {
                array[i] = leftHalf[l];
                l++;
                i++;
            } else {
                array[i] = rightHalf[r];
                r++;
                i++;
            }
        }
        while (l < leftSize) {
            array[i] = leftHalf[l];
            i++;
            l++;
        }
        while (r < rightSize) {
            array[i] = rightHalf[r];
            i++;
            r++;
        }
    }
}
