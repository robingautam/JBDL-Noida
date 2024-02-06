package HashMapImpl;

import java.util.LinkedList;

public class CustomHashMap<K,V> {
    LinkedList bucket[] = new LinkedList[16];
    static final double LOAD_FACTOR = 0.75;
    int size = 0;

    CustomHashMap(){
        for (int i=0;i<bucket.length;i++){
            bucket[i] = new LinkedList();
        }
    }

    public void put(K key, V value){
        int index = hashFunction(key);
        int ni = getkeyFromList(key,index);

        if (ni==-1){ // key not found
            LinkedList<Node> bnl = bucket[index];
            bnl.add(new Node(key,value));
            size++;
        }else { // key found
            LinkedList<Node> bnl = bucket[index];
            bnl.get(ni).value = value;
        }

        double lf = size/bucket.length;

        if (lf>LOAD_FACTOR){
            //reAdjustment();
        }
    }

    public int getkeyFromList(K key, int index){
        LinkedList<Node> list = bucket[index];
        for (int i=0;i<list.size();i++){
            Node node = list.get(i);
            if (node.key==key){
                return i;
            }
        }
        return -1;
    }

    public int hashFunction(K key){
        int code = key.hashCode();
        int index = code%bucket.length;
        return index;
    }

    public V get(K key){
        int index = hashFunction(key);
        int ni = getkeyFromList(key,index);

        if (ni==-1){ // key not found
            throw new NullPointerException();
        }else { // key found
            LinkedList<Node> bnl = bucket[index];
            return (V) bnl.get(ni).value;
        }

    }

    public boolean remove(K key){
        int index = hashFunction(key);
        int ni = getkeyFromList(key,index);

        if (ni==-1){ // key not found
           return false;
        }else { // key found
            LinkedList<Node> bnl = bucket[index];
            bnl.remove(ni);
            size--;
            return true;
        }
    }

    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }

}
