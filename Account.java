/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atmmachine;

/**
 *
 * @author LENOVO
 */
public class Account {
     private int accountNumber;
    private int pin;
    private double availableBalance;
    private double totalBalance;
    
    public Account(int theAccountNumber, int thePIN, double theAvailableBalance, double theTotalBalance ) {
        accountNumber = theAccountNumber;
        pin = thePIN;
        availableBalance = theAvailableBalance;
        totalBalance = theTotalBalance;
    }
    
    public boolean validatePIN(int userPIN) {
        return userPIN == pin;
    }
    
    public double getAvailableBalance() {
        return availableBalance;
    }
    
    public double getTotalBalance() {
        return totalBalance;
    }
    
    public void credit(double amount) {
        totalBalance += amount;
    }
    
    public void debit(double amount){
        availableBalance -= amount;
        totalBalance -= amount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    
}
