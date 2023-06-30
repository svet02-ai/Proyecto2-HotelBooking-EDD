/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel_booking;

/**
 *
 * @author USUARIO 03
 */
public class Room {
    
    private int roomNumber;
    private Room rightSon;
    private Room leftSon;
    
    public Room(int num) {
        this.roomNumber = num;
        this.rightSon = null;
        this.leftSon = null;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Room getRightSon() {
        return rightSon;
    }

    public void setRightSon(Room rightSon) {
        this.rightSon = rightSon;
    }

    public Room getLeftSon() {
        return leftSon;
    }

    public void setLeftSon(Room leftSon) {
        this.leftSon = leftSon;
    }
    
    public boolean isLeaf() {
        return (leftSon == null) && (rightSon == null);
    }
    
}
