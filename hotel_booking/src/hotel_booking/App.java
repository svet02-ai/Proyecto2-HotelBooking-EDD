/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel_booking;
import Functions.*;

/**
 *
 * @author Svetlana Valentina
 */
public class App {
    
    public static void Start(){
        
        //String path = "C:\\Users\\Svetlana Valentina\\OneDrive\\Desktop\\EDD\\Booking_hotel - habitaciones.csv";
        String data = CSVreader.getCsv("Booking_hotel - estado.csv");
        Parser.parseHabitaciones(data);
    }
}
