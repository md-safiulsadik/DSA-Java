public class DynamicArray {

    private int size;
    private int capacity = 5;
    private Object[] array;

    public DynamicArray() {
        this.array = new Object[capacity];
    }

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    public Object get(int index) {
        return array[index];
    }

    public void add(Object data) {
        if (size >= capacity) {
            grow();
        }
        array[size] = data;
        size++;
    }

    public void delete(Object data) {
        if (data == null) return; // Avoid null comparisons

        for (int i = 0; i < size; i++) {
            if (array[i] != null && array[i].equals(data)) {
                // Shift elements left
                for (int j = i; j < size - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[size - 1] = null; // Clear last element
                size--;
                break;
            }
        }

        // Ensure shrinking works properly
        if (size > 0 && size <= capacity / 3) {
            shrink();
        }
    }

//    public void delete(int index) {
//        for (int i = index; i < (size - 1); i++) {
//            array[i] = array[i + 1];
//        }
//        array[size - 1] = null;                      // Tried to implement.
//        size--;
//
//        if (size <= (int)(capacity / 3)) {
//            shrink();
//        }
//    }

    public void insert(int index, Object data) {
        if (size >= capacity) grow();

        for (int i = size; i > index; i++) {
            array[i] = array[i - 1];
        }
        array[index] = data;
        size++;
    }

    public int search(Object data) {
        for (int i = 0; i < size; i++) {
            if (array[i] != null && array[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    public void grow() {
        int newCapacity = capacity * 2;
        Object[] newArray = new Object[newCapacity];

        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }

    private void shrink() {
        int newCapacity = capacity / 2;
        Object[] newArray = new Object[newCapacity];

        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }

    public Boolean isEmpty() {
        return size == 0;
    }

    public String toString() {
        String string = "";

        for (int i = 0; i < capacity; i++) {
            string += array[i] + ", ";
        }
        if (!isEmpty()) {
            string = "[" + string.substring(0, string.length() - 2) + "]";
        } else {
            string = "[]";
        }
        return string;
    }

}
