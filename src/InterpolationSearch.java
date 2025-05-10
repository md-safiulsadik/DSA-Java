public class InterpolationSearch {
    public static void main(String[] args) {
        //interpolation search =  improvement over binary search best used for "uniformly" distributed data
        //					     "guesses" where a value might be based on calculated probe results
        //				          if probe is incorrect, search area is narrowed, and a new probe is calculated

        //						  average case: O(log(log(n)))
        //						  worst case: O(n) [values increase exponentially]

        int[] array = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512};

        int index = interpolationSearch(array, 16);

        if (index != -1) System.out.println("Value found at index: " + index);
        else System.out.println("Value NOT found");

    }

    private static int interpolationSearch(int[] array, int value) {
        int lower = 0;
        int higher = array.length - 1;

        while (value >= array[lower] && value <= array[higher] && lower <= higher) {

            int probe = lower + (higher - lower) * (value - array[lower]) /
                        (array[higher] - array[lower]);
            System.out.println(array[probe]);

            if (array[probe] == value) return probe;
            else if (value < array[probe]) higher = probe - 1;
            else lower = probe + 1;
        }
        return -1;
    }
}
