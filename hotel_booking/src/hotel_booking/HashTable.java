/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel_booking;

/**
 *
 * @author Svetlana Valentina
 */
public class HashTable<K, V> {
    private SimpleList<K, V>[] array;
    private int size;

    public HashTable(int size) {
        this.size = size;
        array = new SimpleList[size];
        for (int i = 0; i < 10; i++) {
            array[i] = new SimpleList<>();
        }
    }

    /**
     * @return the array
     */
    public SimpleList<K, V>[] getArray() {
        return array;
    }

    /**
     * @param array the array to set
     */
    public void setArray(SimpleList<K, V>[] array) {
        this.array = array;
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
    
    
    
    
}
