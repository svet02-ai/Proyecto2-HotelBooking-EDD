/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel_booking;

/**
 *
 * @author USUARIO 03
 */
public class SearchBinaryTree {
    private Room root;
    
    public SearchBinaryTree() {
        this.root = null;
    }

    public Room getRoot() {
        return root;
    }

    public void setRoot(Room root) {
        this.root = root;
    }
    
    public boolean isEmpty() {
        return root == null;
    }
    
    public void addRoom(Room newRoom, Room root) {
        if (isEmpty()) {
            this.root = newRoom;
        } else {
            if (newRoom.getRoomNumber() < root.getRoomNumber()) {
                if (root.getLeftSon() == null) {
                    root.setLeftSon(newRoom);
                } else {
                    addRoom(newRoom, root.getLeftSon());
                }
            } else if (newRoom.getRoomNumber() > root.getRoomNumber()) {
                if (root.getRightSon() == null) {
                    root.setRightSon(newRoom);
                } else {
                    addRoom(newRoom, root.getRightSon());
                }
            }
        }
    }
    
    public Room searchRoom(int roomNum, Room root) {
        Room finalRoom = null;
        System.out.println(root.getRoomNumber());
        if (isEmpty()) {
            return null;
        } else {
            if (roomNum < root.getRoomNumber()) {
                if (root.getLeftSon() != null) {
                    searchRoom(roomNum, root.getLeftSon());
                } else {
                    System.out.println("No existe ningún cuarto con este número");
                }
            } else if (roomNum > root.getRoomNumber()) {
                if (root.getRightSon() != null) {
                    searchRoom(roomNum, root.getRightSon());
                } else {
                    System.out.println("No existe ningún cuarto con este número");
                }
            } else {
                System.out.println("ok" + root.getRoomNumber());
                finalRoom = root;
                
            }
            
        } return root;
    }
    
    public void inOrden(Room root) {
        if (root != null) {
            preOrden(root.getLeftSon());
            System.out.println("[ " + root.getRoomNumber() + " ]");
            preOrden(root.getRightSon());
        }
    }
    
    public void preOrden(Room root) {
        if (root != null) {
            System.out.println("[ " + root.getRoomNumber() + " ]");
            preOrden(root.getLeftSon());
            preOrden(root.getRightSon());
        }
    }
}
