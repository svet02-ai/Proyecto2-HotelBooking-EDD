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
        
        // importa los csv ya determinados
     String data1 = CSVreader.getCsv("Booking_hotel - General.csv");
     String data2 = CSVreader.getCsv("Booking_hotel - Habitaciones.csv");
     String data3 = CSVreader.getCsv("Booking_hotel - Estado.csv");
     String data4 = CSVreader.getCsv("Booking_hotel - Historico.csv");
     // los convirte en sus respectivas clases para poder entrarlos en hashmaps y ABB
     HashTable myHashtable = Parser.parseHabitaciones(data2);
     myHashtable = Parser.parseStatus(data3, myHashtable);
     Parser.parseClientes(data1);
     Parser.parseHistorico(data4);
    }
}
