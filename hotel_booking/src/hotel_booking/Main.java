/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotel_booking;
import Functions.Parser;
import Functions.CSVreader;
import Interfaces.WelcomeWindow;

/**
 *
 * @author Svetlana Valentina
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WelcomeWindow w = new WelcomeWindow();
        System.out.println(Integer.parseInt("212323.3.2.".replace(".", "")));
        String data2 = CSVreader.getCsv("Booking_hotel - habitaciones.csv");
        String data4 = CSVreader.getCsv("Booking_hotel - Histórico.csv");
        String data1 = CSVreader.getCsv("Booking_hotel - reservas.csv");
        //App.Start();
        Parser newParser = new Parser();
        Client newClient = new Client("santiago", "briceno", "75", "fh", "sajdh");
        BST bst = newParser.parseHistory(data4, data2);
        HashTable<Integer, Client> reser = newParser.parseClientes(data1);
        NodoLista<Client> pointer = bst.searchRoom(1).getRecord().getHead();
        System.out.println(bst.searchRoom(1).getRoomNumber() + "funcionó");
        System.out.println(newClient.getfName());
        Client client = reser.get(13502927);
        System.out.println(bst.searchRoom(1).getType());
        System.out.println(client.getfName());
        while (pointer != null) {
            
            System.out.println(pointer.getData().getfName());
            pointer = pointer.getPnext();
        }
        System.out.println(bst.searchVacant("suite", bst.getRoot()));
    }
    
}
