/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atmmachine;

/**
 *
 * @author LENOVO
 */
public class CashDispenser {
    public final static int INITIAL_COUNT = 500;
    private int count;
    
    public CashDispenser() {
        count = INITIAL_COUNT;
    }
    
    public void dispenseCash(int amount) {
        int billsRequired = amount / 20;
        count -= billsRequired;
    }
    public boolean isSufficientCashAvailable( int amount ) {
        int billsRequired = amount / 20;
        return count >= billsRequired;
    }
    
}
