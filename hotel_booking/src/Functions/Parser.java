/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Functions;
import hotel_booking.Rooms;
import hotel_booking.Reservation;
import hotel_booking.Status;
import hotel_booking.Historic;
import hotel_booking.HashTable;

/**
 *
 * @author Svetlana Valentina
 */
public class Parser {
    public static HashTable parseHabitaciones(String data){
        HashTable myHashTable = new HashTable<>(11);
        String[] lines = data.split("\n");
        int i = 1;
        while (i < lines.length) {
            String[] datos = lines[i].split(",");
            Rooms room = new Rooms(datos[0], datos[2], datos[1]);
            System.out.println(room.getNumber());
            myHashTable.put(room.getNumber(), 0);
            i++;
        }
        return myHashTable;
    }
    
    public static HashTable parseClientes(String data){
        HashTable myHashTable = new HashTable<>(11);
        String[] lines = data.split("\n");
        int i = 1;
        while (i < lines.length) {
            String[] datos = lines[i].split(",");
            if (datos.length == 11) {
                String aux = datos[0] + datos[1] + datos[2];
                Reservation user = new Reservation(datos[3],datos[4],datos[7],datos[9],datos[10],aux,datos[6],datos[5],datos[8]);
                String temp = user.getFirstName() + " " + user.getLastName();
                myHashTable.put(temp, user.getRoom());
            } else if (datos.length == 10) {
                String aux = datos[0] + datos[1];
                Reservation user = new Reservation(datos[2],datos[3],datos[6],datos[8],datos[9],aux,datos[5],datos[4],datos[7]);
                String temp = user.getFirstName() + " " + user.getLastName();
                myHashTable.put(temp, user.getRoom());
            } else {
                String aux = datos[0];
                Reservation user = new Reservation(datos[2],datos[3],datos[6],datos[8],datos[9],aux,datos[5],datos[4],datos[7]);
                String temp = user.getFirstName() + " " + user.getLastName();
                myHashTable.put(temp, user.getRoom());
            }
            i++;
        }
        return myHashTable;
    }
    
    /*public static void parseReservas(String data){
        String[] lines = data.split("\n");
        int i = 1;
        while(i < lines.length){
            String[] datos = lines[i].split(",");
            Status reserva = new Status(datos[0],datos[1],datos[2],datos[3],datos[4],datos[5],datos[6]);
            System.out.println(reserva.getCheckinDate());
            i++;
        }
    }*/
    
    public static Historic[] parseHistorico(String data){
        Historic[] historial = null;
        String[] lines = data.split("\n");
        int i = 1;
        while (i < lines.length) {
            String[] datos = lines[i].split(",");
            if (datos.length == 9) {
                String aux = datos[0] + datos[1] + datos[2];
                Historic history = new Historic(aux,datos[3],datos[4],datos[5],datos[6],datos[7],datos[8]);
                historial[i-1] = history;
            } else if (datos.length == 8) {
                String aux = datos[0] + datos[1];
                Historic history = new Historic(aux,datos[2],datos[3],datos[4],datos[5],datos[6],datos[7]);
                historial[i-1] = history;
            } else {
                String aux = datos[0];
                Historic history = new Historic(aux,datos[1],datos[2],datos[3],datos[4],datos[5],datos[6]);
                historial[i-1] = history;
            }
            i++;
        }
        return historial;
    }
    
    public static HashTable parseStatus(String data, HashTable myHashTable){
        String[] lines = data.split("\n");
        int i = 1;
        while (i < lines.length){
            String[] datos  = lines[i].split(",");
            Status estado = new Status(datos[0],datos[1],datos[2],datos[3],datos[4],datos[5],datos[6]);
            String temp = estado.getFirstName()+" "+estado.getLastName();
            myHashTable.replaceValue(estado.getRoom(), temp);
            i++;
        }
        return myHashTable;
    }
    
}
