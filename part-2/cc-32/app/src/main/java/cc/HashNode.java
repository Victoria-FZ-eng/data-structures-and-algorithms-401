package cc;


public class HashNode <K, V>{
    K key;
    int value;
    final int hashCode;

    HashNode<K, V> next;

    public HashNode(K key, V value, int hashCode)
    {
        this.key = key;
        this.value = (int) value;
        this.hashCode = hashCode;
    }
}