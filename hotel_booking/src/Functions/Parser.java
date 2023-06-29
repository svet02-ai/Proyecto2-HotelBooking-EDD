/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Functions;
import hotel_booking.Rooms;
import hotel_booking.Client;
import hotel_booking.Reservation;
import hotel_booking.Historic;
import hotel_booking.HashTable;

/**
 *
 * @author Svetlana Valentina
 */
public class Parser {
    public static void parseHabitaciones(String data){
        String[] lines = data.split("\n");
        int i = 1;
        while (i < lines.length) {
            String[] datos = lines[i].split(",");
            Rooms room = new Rooms(datos[0], datos[2], datos[1]);
            System.out.println(room.getNumber());
            i++;
        }
    }
    
    public static HashTable parseClientes(String data){
        HashTable myHashTable = new HashTable<>(11);
        String[] lines = data.split("\n");
        int i = 1;
        while (i < lines.length) {
            String[] datos = lines[i].split(",");
            if (datos.length == 11) {
                String aux = datos[0] + datos[1] + datos[2];
                Client user = new Client(datos[3],datos[4],datos[7],datos[9],datos[10],aux,datos[6],datos[5],datos[8]);
                String temp = user.getFirstName() + " " + user.getLastName();
                myHashTable.put(temp, user.getRoom());
            } else if (datos.length == 10) {
                String aux = datos[0] + datos[1];
                Client user = new Client(datos[2],datos[3],datos[6],datos[8],datos[9],aux,datos[5],datos[4],datos[7]);
                String temp = user.getFirstName() + " " + user.getLastName();
                myHashTable.put(temp, user.getRoom());
            } else {
                String aux = datos[0];
                Client user = new Client(datos[2],datos[3],datos[6],datos[8],datos[9],aux,datos[5],datos[4],datos[7]);
                String temp = user.getFirstName() + " " + user.getLastName();
                myHashTable.put(temp, user.getRoom());
            }
            i++;
        }
        return myHashTable;
    }
    
    public static void parseReservas(String data){
        String[] lines = data.split("\n");
        int i = 1;
        while(i < lines.length){
            String[] datos = lines[i].split(",");
            Reservation reserva = new Reservation(datos[0],datos[1],datos[2],datos[3],datos[4],datos[5],datos[6]);
            System.out.println(reserva.getCheckinDate());
            i++;
        }
    }
    
    public static void parseHistorico(String data){
        String[] lines = data.split("\n");
        int i = 1;
        while (i < lines.length) {
            String[] datos = lines[i].split(",");
            if (datos.length == 9) {
                String aux = datos[0] + datos[1] + datos[2];
                Historic history = new Historic(aux,datos[3],datos[4],datos[5],datos[6],datos[7],datos[8]);
            } else if (datos.length == 8) {
                String aux = datos[0] + datos[1];
                Historic history = new Historic(aux,datos[2],datos[3],datos[4],datos[5],datos[6],datos[7]);
            } else {
                String aux = datos[0];
                Historic history = new Historic(aux,datos[1],datos[2],datos[3],datos[4],datos[5],datos[6]);
            }
            i++;
        }
    }
}
