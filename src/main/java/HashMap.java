import java.util.LinkedList;
import java.util.List;

public class HashMap {

    class KeyValue<K, V> {
        public K key;
        public V value;

        public KeyValue(K key, V value) {
            this.key = key;
            this.value = value;

        }

        K getKey() {
            return this.key;
        }

        V getValue() {
            return this.value;
        }

        void setKey(K key) {
            this.key = key;
        }

        void setValue(V value) {
            this.value = value;
        }
    }

    @SuppressWarnings("unchecked")
    public class HashTable<K, V> {
        private int size = 0;
        private int capacity;
        private List<KeyValue>[] elements;

        public HashTable() { }

        public HashTable(int capacity) {
            this.capacity = capacity;
            this.elements = new LinkedList[this.capacity];
        }
        

        public V get(K key) {        }

        public void remove(K key) { }

        public void clearAll() {
            for (int i = 0; i < this.capacity; i++) {
                if (elements[i] != null) {
                    this.size -= elements[i].size();
                    elements[i].clear();
                }
            }
        }

        public int size() { return this.size; }

        public void ensureSpace() { }

        private int getKeyIndex(K key) {
            return key.hashCode() % capacity;
        }
    }
}
