/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atmmachine;

/**
 *
 * @author LENOVO
 */
public class BalanceInquiry extends Transaction{
    public BalanceInquiry(int userAccountNumber, Screen atmScreen, BankDatabase atmBankDatabase) {
        super(userAccountNumber, atmScreen, atmBankDatabase);
    }
    
    @Override
    public void execute() {
        BankDatabase bankDatabase = getBankDatabase();
        Screen screen = getScreen();
        
        double availableBalance = bankDatabase.getAvailableBalance(getAccountNumber());
        double totalBalance = bankDatabase.getTotalBalance(getAccountNumber());
        
        screen.displayMsgLine("\nBalance Information:");
        screen.displayMsg("- Available balance: ");
        screen.displayDollarAmount(availableBalance);
        screen.displayMsg("\n- Total balance: " );
        screen.displayDollarAmount( totalBalance );
        screen.displayMsgLine( "" );
    }
}