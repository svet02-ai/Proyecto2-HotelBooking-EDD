/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotel_booking;
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
        WelcomeWindow w1 = new WelcomeWindow();
        w1.setVisible(true);
        System.out.println(Math.round(45/2));
        Funciones f = new Funciones();
        f.balancedTree(13, 0);
        //f.getArbol().inOrden(f.getArbol().getRoot());
        f.getArbol().preOrden(f.getArbol().getRoot());
        Room room = f.getArbol().searchRoom(12, f.getArbol().getRoot());
        System.out.println(room.getRoomNumber() + "Cuarto Encontrado");
    }
    
}
