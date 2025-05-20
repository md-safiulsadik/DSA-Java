import java.util.Hashtable;

public class JavaHashTable {
    public static void main(String[] args) {

        // Hashtable = A data structure that stores unique keys to values ex.<Integer, String>
        //			   Each key/value pair is known as an Entry
        //			   FAST insertion, look up, deletion of key/value pairs
        // 			   Not ideal for small data sets, great with large data sets

        // hashing = Takes a key and computes an integer (formula will vary based on key & data type)
        //		    In a Hashtable, we use the hash % capacity to calculate an index number
        //			key.hashCode() % capacity = index

        // bucket = an indexed storage location for one or more Entries
        //	        can store multiple Entries in case of a collision (similarly linked a LinkedList)

        // collision = hash function generates the same index for more than one key
        //			   less collision = more efficiency

        // Runtime complexity: Best Case O(1)
        //                     Worst Case O(n)

        Hashtable<String, String> hashtable = new Hashtable<>();

        hashtable.put("100", "Alome");
        hashtable.put("123", "Kolome");
        hashtable.put("321", "Zolome");
        hashtable.put("555", "Rolome");
        hashtable.put("777", "Elome");
        hashtable.put("985", "Holome");



//        System.out.println(hashtable.size());
//        System.out.println(hashtable.get(777));
//        System.out.println(hashtable.keySet());

        hashtable.remove("985");

        for (String key : hashtable.keySet()) {
            System.out.println(key.hashCode() % 11 + "\t" + hashtable.get(key));
        }
    }

}
