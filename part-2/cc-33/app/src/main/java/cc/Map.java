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
    public int hash(K key) {
        int hashCode = hashCode(key);
        int index = hashCode % numBuckets;
        // key.hashCode() coule be negative.
        index = index < 0 ? index * -1 : index;
        return index;
    }

    // Returns value for a key
    public V get(K key) {
        int bucketIndex = hash(key);
        int hashCode = hashCode(key);

        HashNode<K, V> head = bucketArray.get(bucketIndex);

        while (head != null) {
            if (head.key.equals(key) && head.hashCode == hashCode)
                return head.value;
            head = head.next;
        }
        return null;
    }

    // Adlds a key value pair to hash-tabe
    public void add(K key, V value) {

        int bucketIndex = hash(key);
        int hashCode = hashCode(key);
        HashNode<K, V> head = bucketArray.get(bucketIndex);


        while (head != null) {
            if (head.key.equals(key) && head.hashCode == hashCode) {
                head.value = value;

                return;
            }
            head = head.next;
        }


        size++;
        head = bucketArray.get(bucketIndex);
        HashNode<K, V> newNode
                = new HashNode<K, V>(key, value, hashCode);
        newNode.next = head;
        bucketArray.set(bucketIndex, newNode);


        // If load factor goes beyond threshold, then
        // double hash table size
        if ((1.0 * size) / numBuckets >= 0.7) {
            ArrayList<HashNode<K, V> > temp = bucketArray;
            bucketArray = new ArrayList<>();
            numBuckets = 2 * numBuckets;
            size = 0;
            for (int i = 0; i < numBuckets; i++)
                bucketArray.add(null);

            for (HashNode<K, V> headNode : temp) {
                while (headNode != null) {
                    add(headNode.key, headNode.value);
                    headNode = headNode.next;
                }
            }
        }

    }

    public boolean contains (K key){
        int bucketIndex = hash(key);
        int hashCode = hashCode(key);
        HashNode<K, V> head = bucketArray.get(bucketIndex);
        while (head != null) {
            if (head.key.equals(key) && head.hashCode == hashCode) {

                return true;
            }
            head = head.next;
        }
        return false;
    }

    public ArrayList getPair(){
        ArrayList<String> pairs = new ArrayList();
        for (HashNode<K, V> kvHashNode : bucketArray) {
            if(kvHashNode != null){
                System.out.println("key : "+kvHashNode.key);
                String keyValue = "\""+ (String) kvHashNode.key +": "+ (String) kvHashNode.value + "\"";
                pairs.add(keyValue);
            }
        }
        return pairs;
    }
    public ArrayList getKeys(){
        ArrayList<String> keys = new ArrayList();
        for (HashNode<K, V> kvHashNode : bucketArray) {
            if(kvHashNode != null){
                System.out.println(kvHashNode.key);
                String key = (String) kvHashNode.key ;
                keys.add(key);
            }
        }
        return keys;
    }



}