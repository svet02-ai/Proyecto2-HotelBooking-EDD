/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Functions;
import hotel_booking.BST;
import hotel_booking.HashTable;
import hotel_booking.Client;

/**
 *
 * @author USUARIO 03
 */
public class Constructor {
    private HashTable<Integer, Client> reservations;
    private HashTable<String, Client> status;
    private BST historial;
    private Parser parser;
    
    public Constructor() {
        parser = new Parser();
        String data1 = CSVreader.getCsv("Booking_hotel - reservas.csv");
        String data2 = CSVreader.getCsv("Booking_hotel - habitaciones.csv");
        String data3 = CSVreader.getCsv("Booking_hotel - estado.csv");
        String data4 = CSVreader.getCsv("Booking_hotel - Histórico.csv");
        reservations = parser.parseClientes(data1);
        status = parser.parseStatus(data3);
        historial = parser.parseHistory(data4, data2);
    }

    public HashTable<Integer, Client> getReservations() {
        return reservations;
    }

    public void setReservations(HashTable<Integer, Client> reservations) {
        this.reservations = reservations;
    }

    public HashTable<String, Client> getStatus() {
        return status;
    }

    public void setStatus(HashTable<String, Client> status) {
        this.status = status;
    }

    public BST getHistorial() {
        return historial;
    }

    public void setHistorial(BST historial) {
        this.historial = historial;
    }

    public Parser getParser() {
        return parser;
    }

    public void setParser(Parser parser) {
        this.parser = parser;
    }
    
    
}
