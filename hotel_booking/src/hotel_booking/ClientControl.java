/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel_booking;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Svetlana Valentina
 */
public class ClientControl {
    private HashTable habitaciones;

    public ClientControl() {
        habitaciones = new HashTable(300);
        String filePath = "Booking_hotel - estado.csv";
        readCSV(filePath);
    }
    
    public void readCSV(String filePath){
        try (Scanner scanner = new Scanner(new File(filePath))) {
            scanner.useDelimiter(",");

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] valores = line.split(",");

                String habitacion = valores[0].trim();
                String nombre = valores[1].trim();
                String apellido = valores[2].trim();

                if (habitacion.isEmpty()) {
                    continue;
                }

                String nombreCompleto = nombre + " " + apellido;
                habitaciones.put(nombreCompleto, habitacion);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public HashTable getHabitaciones() {
        return habitaciones;
    }
}
