/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel_booking;


/**
 *
 * @author Svetlana Valentina
 */
public class Rooms {
    private Reservation customer;
    private String number;
    private String floor;
    private String type;

    public Rooms(Reservation customer, String number, String floor, String type) {
        this.customer = customer;
        this.number = number;
        this.floor = floor;
        this.type = type;
        customer.setRoom(number);
    }

    public Rooms(String number, String floor, String type) {
        this.number = number;
        this.floor = floor;
        this.type = type;
        this.customer = null;
    }

    /**
     * @return the customer
     */
    public Reservation getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(Reservation customer) {
        this.customer = customer;
    }

    /**
     * @return the number
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * @return the floor
     */
    public String getFloor() {
        return floor;
    }

    /**
     * @param floor the floor to set
     */
    public void setFloor(String floor) {
        this.floor = floor;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
    
    
    
    
}
