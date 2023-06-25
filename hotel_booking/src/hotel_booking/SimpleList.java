/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel_booking;

/**
 *
 * @author Svetlana Valentina
 */
public class SimpleList<K, V> {
    private NodoLista<K, V> head;
    private int size;

    public SimpleList() {
        this.head = null;
        this.size = 0;
    }

    /**
     * @return the head
     */
    public NodoLista<K, V> getHead() {
        return head;
    }

    /**
     * @param head the head to set
     */
    public void setHead(NodoLista<K, V> head) {
        this.head = head;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }
    
    public boolean isEmpty(){
        return getHead() == null;
    }
    
    public void add(K key, V value){
        NodoLista<K, V> node = new NodoLista<>(key, value);
        if (isEmpty()){
            setHead(node);
        } else {
            node.setPnext(getHead());
            setHead(node);
        }
        size++;
    }
    
    public V get(K key){
        if (isEmpty()){
            return null;
        } else {
            NodoLista<K, V> node = this.head;
            while (node != null){
             if (node.getKey().equals(key)){
                return node.getValue();   
            }
            node = node.getPnext();
            }
        }
        return null;
    }
    
    public void delete(K key){
        if (isEmpty()){
            return;
        }
        if (getHead().getKey().equals(key)){
            setHead(getHead().getPnext());
            return;
        }
        NodoLista<K, V> node = this.head;
        while(node.getPnext() != null){
            if (node.getPnext().getKey().equals(key)){
                node.setPnext(node.getPnext().getPnext());
                return;
            }
            node = node.getPnext();
        }
    }
}
