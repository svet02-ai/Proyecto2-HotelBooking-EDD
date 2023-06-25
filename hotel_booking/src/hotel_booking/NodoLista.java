/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel_booking;

/**
 *
 * @author Svetlana Valentina
 */
public class NodoLista<K, V> {
    private K key;
    private V value;
    private NodoLista<K, V> pnext;

    public NodoLista(K key, V value) {
        this.key = key;
        this.value = value;
        this.pnext = null;
    }

    /**
     * @return the key
     */
    public K getKey() {
        return key;
    }

    /**
     * @param key the key to set
     */
    public void setKey(K key) {
        this.key = key;
    }

    /**
     * @return the value
     */
    public V getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(V value) {
        this.value = value;
    }

    /**
     * @return the pnext
     */
    public NodoLista<K, V> getPnext() {
        return pnext;
    }

    /**
     * @param pnext the pnext to set
     */
    public void setPnext(NodoLista<K, V> pnext) {
        this.pnext = pnext;
    }
    
    
}
