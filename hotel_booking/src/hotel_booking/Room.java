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
    private int floor;
    private String type;
    private SimpleList record;
    private boolean status;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public Room(int num) {
        this.roomNumber = num;
        this.rightSon = null;
        this.leftSon = null;
        this.status = false;
        this.record = new SimpleList<Client>();
    }

    public SimpleList getRecord() {
        return record;
    }

    public void setRecord(SimpleList record) {
        this.record = record;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
