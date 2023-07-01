/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Functions;
import hotel_booking.HashTable;
import hotel_booking.BST;
import hotel_booking.Client;
import hotel_booking.Room;
/**
 *
 * @author Svetlana Valentina
 */
public class Parser {
    
    //FUNCIONES FINALES
    //
    //
    //FUNCIONES FINALES
    
    public HashTable parseStatus(String data){
        HashTable<String, Client> newHashTable = new HashTable(15);
        String[] lines = data.split("\n");
        int i = 1;
        while (i < lines.length){
            String[] datos  = lines[i].split(",");
            if (!datos[0].equals("")) {
                Client newClient = new Client(datos[1].toLowerCase(), datos[2].toLowerCase(), datos[6], datos[4], datos[3]);
                newClient.setRoom(Integer.parseInt(datos[0]));
                newClient.setPhoneNumber(datos[5]);
                newHashTable.put(datos[1].toLowerCase()+datos[2].toLowerCase(), newClient);
            }
            i++;
        }
        return newHashTable;
    }
    
    public BST parseHistory(String data, String data2){
        BST historial = new BST();
        historial.balanceTree(301, 0);
        String[] rooms = data2.split("\n");
        int j = 1;
        while (j < rooms.length) {
            String[] datos2 = rooms[j].split(",");
            Room room = historial.searchRoom(Integer.parseInt(datos2[0]));
            room.setType(datos2[1]);
            room.setFloor(Integer.parseInt(datos2[2]));
            j++;
        }
        String[] lines = data.split("\n");
        int i = 1;
        while (i < lines.length) {
            String[] datos = lines[i].split(",");
            Client newClient = new Client(datos[1], datos[2], datos[5], datos[4], datos[3]);
            newClient.setRoom(Integer.parseInt(datos[6]));
            newClient.setId(Integer.parseInt(datos[0].replace(".", "")));
            historial.searchRoom(newClient.getRoom()).getRecord().add(newClient);
            
            i++;
        }
        return historial;
    }
    
    public HashTable parseClientes(String data){
        HashTable<Integer, Client> myHashTable = new HashTable(15);
        String[] lines = data.split("\n");
        int i = 1;
        while (i < lines.length) {
            String[] datos = lines[i].split(",");
            Client newClient = new Client(datos[1], datos[2], datos[7], datos[4], datos[3]);
            newClient.setId(Integer.parseInt(datos[0].replace(".", "")));
            newClient.setType(datos[5]);
            newClient.setPhoneNumber(datos[6]);
            myHashTable.put(Integer.parseInt(datos[0].replace(".", "")), newClient);
            i++;
        }
        return myHashTable;
    }
}
