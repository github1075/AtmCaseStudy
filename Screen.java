/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atmmachine;

/**
 *
 * @author LENOVO
 */
public class Screen {
     public void displayMsg(String message) {
        System.out.println(message);
    }
    
    public void displayMsgLine(String message) {
        System.out.println(message);
    }
    
    public void displayDollarAmount(double amount) {
        System.out.printf("$%,.2f", amount);
    }
    
}
