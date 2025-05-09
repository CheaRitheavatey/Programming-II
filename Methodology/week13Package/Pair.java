package Methodology.week13Package;

public class Pair <K,V> {
    // data field
    private K key;
    private V value;

    // constructor
    Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    Pair() {};
    // getter setter
    public K getkey() {return this.key;}
    public void setKey(K key) {this.key = key;}

    public V getvalue() {return this.value;}
    public void setvalue(V value) {this.value = value;}

    // return key and value
   
    
    
}
