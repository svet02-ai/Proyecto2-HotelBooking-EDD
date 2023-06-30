/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Functions;
import hotel_booking.Status;
import hotel_booking.Reservation;

/**
 *
 * @author Svetlana Valentina
 */
public class Converter {
    public Status checkIn(Reservation reserva){
        String room = null;
        Status estado = new Status(room, reserva.getFirstName(), reserva.getLastName(), reserva.getEmail(), reserva.getGender(), reserva.getPhoneNumber(), reserva.getCheckinDate());
        return estado;
    }
}
