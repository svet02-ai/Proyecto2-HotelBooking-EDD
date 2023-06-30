/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel_booking;

/**
 *
 * @author USUARIO 03
 */
public class Funciones {
    
    private SearchBinaryTree arbol;

    public Funciones() {
        this.arbol = new SearchBinaryTree();
    }

    public SearchBinaryTree getArbol() {
        return arbol;
    }

    public void setArbol(SearchBinaryTree arbol) {
        this.arbol = arbol;
    }
    
    public void balancedTree(int greaterReference, int lesserReference) {
        int roomNum = 0;
        if ((greaterReference - lesserReference - 1)%2 == 0) {
            roomNum = (greaterReference - lesserReference - 1)/2 + lesserReference;
        } else {
            roomNum = ((greaterReference - lesserReference - 2)/2) + 1 + lesserReference;
        } Room newRoom = new Room(roomNum);
        arbol.addRoom(newRoom, arbol.getRoot());
        if (roomNum != lesserReference + 1) {
            balancedTree(roomNum, lesserReference);
             
        } if (roomNum != greaterReference - 1) {
            balancedTree(greaterReference, roomNum);
        }
    } 
    
    
    
}
