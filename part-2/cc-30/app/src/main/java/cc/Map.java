package cc;

import java.util.ArrayList;
import java.util.Objects;

public class Map<K, V> {

    private ArrayList<HashNode<K, V> > bucketArray;

    private int numBuckets;

    private int size;

    public Map() {
        bucketArray = new ArrayList<>();
        numBuckets = 10;
        size = 0;

        for (int i = 0; i < numBuckets; i++)
            bucketArray.add(null);
    }
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    private final int hashCode (K key) {
        return Objects.hashCode(key);
    }

    // get the index of in the collection for the key
    private int hash(K key)
    {
        int hashCode = hashCode(key);
        int index = hashCode % numBuckets;
        // key.hashCode() coule be negative.
        index = index < 0 ? index * -1 : index;
        return index;
    }

    // to remove key, value pair
    public V remove(K key) {
        int bucketIndex = hash(key);
        int hashCode = hashCode(key);

        HashNode<K, V> head = bucketArray.get(bucketIndex);


        HashNode<K, V> prev = null;
        while (head != null) {
            // If Key found
            if (head.key.equals(key) && hashCode == head.hashCode)
                break;

            // Else keep moving in chain
            prev = head;
            head = head.next;
        }

}
