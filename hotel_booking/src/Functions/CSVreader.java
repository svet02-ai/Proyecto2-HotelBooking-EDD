/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Functions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Svetlana Valentina
 */
public class CSVreader {
    public static String getCsv(String filepath){
    String data = "";
        try (Scanner scanner = new Scanner(new File(filepath))) {
        scanner.useDelimiter(","); 
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            data += line;
            data += "\n";
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    return data;
    } 
}
