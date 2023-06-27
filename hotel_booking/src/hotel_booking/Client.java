/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel_booking;
import javax.swing.JOptionPane;
/**
 *
 * @author Svetlana Valentina
 */
public class Client {
    private int ci;
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private String phoneNumber;
    private String checkinDate;
    private String checkoutDate;

    /**
     * @return the ci
     */
    public int getCi() {
        return ci;
    }

    /**
     * @param ci the ci to set
     */
    public void setCi(int ci) {
        this.ci = ci;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the checkinDate
     */
    public String getCheckinDate() {
        return checkinDate;
    }

    /**
     * @param checkinDate the checkinDate to set
     */
    public void setCheckinDate(String checkinDate) {
        this.checkinDate = checkinDate;
    }

    /**
     * @return the checkoutDate
     */
    public String getCheckoutDate() {
        return checkoutDate;
    }

    /**
     * @param checkoutDate the checkoutDate to set
     */
    public void setCheckoutDate(String checkoutDate) {
        this.checkoutDate = checkoutDate;
    }
    
    public static void Estado(HashTable habitaciones){
        String nombre = JOptionPane.showInputDialog(null, "Por favor ingrese el nombre completo: ");
        if (nombre == null) {
            JOptionPane.showMessageDialog(null, "Ingreso invalido");
        } else {
            nombre =  nombre.toUpperCase();
            if (nombre.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese el nombre completo: ");
            } else if (habitaciones.get(nombre) == null) {
                JOptionPane.showMessageDialog(null, "La habitación de " + nombre + " no se encuentra registrada. Por favor, haga una reserva");
            } else {
                JOptionPane.showMessageDialog(null, "La habitación de " + nombre + " es la número: " + habitaciones.get(nombre) + ".");
            }
        }

    }
}
