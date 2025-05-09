public class LinearSearch {
    public static void main(String[] args) {

        // Linear search = Iterate through a collection one element at a time
        //                 --> Run-time: O(n)
        //                 --> Slow for large data set
        //                 --> Fast for small and medium data set
        //                 --> Doesn't need to sort
        //                 --> Useful for data structure that doesn't have random access (LinkedList)

        int[] array = {1, 5, 7, 8, 5, 4, 2, 0, 3};
        int index = linerSearch(array, 20);

        if (index != -1) {
            System.out.println("Found a index: " + index);
        }
        else System.out.println("NOT found!");

    }

    private static int linerSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) return i;
        }
        return -1;
    }

}
