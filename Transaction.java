/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atmmachine;

/**
 *
 * @author LENOVO
 */
public class Transaction {
    private int accountNumber;
    private Screen screen;
    private BankDatabase bankDatabase;
    
    public Transaction(int userAccountNumber, Screen atmScreen, BankDatabase atmBankDatabase) {
        accountNumber = userAccountNumber;
        screen = atmScreen;
        bankDatabase = atmBankDatabase;
    }
    
    public int getAccountNumber() {
        return accountNumber;
    }
    
    public Screen getScreen() {
        return screen;
    }
    
    public BankDatabase getBankDatabase() {
        return bankDatabase;
    }
    
    abstract public void execute();
    
}
