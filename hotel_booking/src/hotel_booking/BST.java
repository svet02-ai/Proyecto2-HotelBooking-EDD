/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel_booking;

/**
 *
 * @author USUARIO 03
 */
public class BST {
    private Room root;
    
    public BST() {
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
    
    public Room searchRoom(int roomNum) {
        Room pointer = this.root;
        while (pointer.getRoomNumber() != roomNum) {
           if (roomNum < pointer.getRoomNumber() && pointer.getLeftSon() != null) {
               pointer = pointer.getLeftSon();
           } else if (roomNum > pointer.getRoomNumber() && pointer.getRightSon() != null){
               pointer = pointer.getRightSon();
           } else {
               return null;
           }
        } return pointer;
    }
        
    
    public void balanceTree(int greaterReference, int lesserReference) {
        int roomNum;
        if ((greaterReference - lesserReference - 1)%2 == 0) {
            roomNum = (greaterReference - lesserReference - 1)/2 + lesserReference;
        } else {
            roomNum = ((greaterReference - lesserReference - 2)/2) + 1 + lesserReference;
        } Room newRoom = new Room(roomNum);
        this.addRoom(newRoom, this.getRoot());
        if (roomNum != lesserReference + 1) {
            balanceTree(roomNum, lesserReference);
             
        } if (roomNum != greaterReference - 1) {
            balanceTree(greaterReference, roomNum);
        }
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
    
    public int searchVacant(String type, Room root) {
        if (root.getType().equals(type) && !root.isStatus()) {
            root.setStatus(true);
            return root.getRoomNumber();
        } else if (root.getLeftSon() == null && root.getRightSon() != null) {
            
            if (root.getRightSon().getType().equals(type) && !root.getRightSon().isStatus()) {
                return root.getRightSon().getRoomNumber();
            } else {
                return 0;
            }
        } else if (root.getRightSon() == null && root.getLeftSon() != null) {
            if (root.getLeftSon().getType().equals(type) && !root.getLeftSon().isStatus()) {
                return root.getRightSon().getRoomNumber();
            } else {
                return 0;
            }
        } else if (root.getLeftSon() == null && root.getRightSon() == null){
            return 0;
        }
        return searchVacant(type, root.getLeftSon()) + searchVacant(type, root.getRightSon());
    }
}
