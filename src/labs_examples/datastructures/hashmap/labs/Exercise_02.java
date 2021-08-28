package labs_examples.datastructures.hashmap.labs;


/**
 *      HashMaps Exercise_02
 *
 *      Rewrite the CustomHashMap class to meet the following requirements:
 *      1) no method has the same name as any in CustomHashMap
 *          (do not use refactor - do it manually)
 *      2) no variable has the same name as any in CustomHashMap
 *          (do not use refactor - do it manually)
 *      3) resize the HashMap when the underlying array is more than half full
 *      4) triple the size of the underlying array on resize()
 *      5) instead of checking the number of keys to resize, check the number of values
 *      6) on collisions, add new elements to the front of the LinkedList, not the end
 *      7) anytime someone tries to get/update/remove an element that does not exist, print
 *          out a message indicating that the element does not exist
 *      8) add at least one more method that you think could be useful to the HashMap
 *          review Java's built-in HashMap for inspiration
 */
public class Exercise_02 {

    static class MyHashMap<K, V> {

        private Entry<K, V>[] data = new Entry[5];
        private int numOfElements = 0;

        private int hashMethod(K key) {
            int index = Math.abs(key.hashCode()) % data.length;
            return index;
        }

        public void pushMethod(K key, V value) {
            int index = hashMethod(key);

            Entry<K, V> entry = new Entry(key, value);

            if (data[index] == null) {
                data[index] = entry;
                numOfElements++;

            } else {
                Entry<K, V> f1 = data[index];
                while (f1.next != null) {
                    f1 = f1.next;
                }
                f1.next = entry;
                numOfElements++;
            }

            if (numOfElements > data.length * .50) {
                resizeMethod();
            }
        }



        private void resizeMethod() {
            Entry<K, V>[] copy = data;
            data = new Entry[copy.length * 3];

            for (int i = 0; i < copy.length; i++) {
                try {
                    Entry entry = copy[i];

                    pushMethod((K) entry.getKey(), (V) entry.getValue());

                    while (entry.next != null) {
                        entry = entry.next;

                        pushMethod((K) entry.getKey(), (V) entry.getValue());
                    }
                } catch (Exception e) {

                }

            }

        }

        public void remove(K key) {
            if(get(key)==null) {
                return;
            }

            int index = hashMethod(key);

            Entry<K,V> entry = data[index];

            if(entry.getKey().equals(key)){
                data[index] = null;
                numOfElements--;
                return;
            }

            while(entry.next!=null){
                if(entry.next.getKey() !=key){
                    entry = entry.next;
                }
            }

            if(entry.next.next != null){
                entry.next = entry.next.next;
                numOfElements--;
                return;
            } else {
                entry.next = null;
                numOfElements--;
                return;
            }

        }


        public V get(K key) {
            int index = hashMethod(key);

            if (data[index] == null) {
                return null;
            }

            Entry<K, V> entry = data[index];

            while (entry.getKey() != key) {

                if (entry.next == null) {
                    return null;
                }

                entry = entry.next;
            }

            return entry.getValue();
        }




        class Entry<K, V> {
            private K key;
            private V value;
            Entry next = null;


            Entry(K key, V value) {
                this.key = key;
                this.value = value;
            }


            public K getKey() {
                return key;
            }


            public V getValue() {
                return value;
            }


            public void setValue(V value) {
                this.value = value;
            }
        }

    }
}