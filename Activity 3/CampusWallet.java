/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity3;

/**
 *
 * @author CORESIS_CPE113
 */
public class CampusWallet {
    private String owner;
    private int balance;

    public CampusWallet(String owner, int balance) {
        this.owner = owner;
        if (balance < 0) {
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    public CampusWallet(String owner) {
        this(owner, 0);
    }

    public boolean deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean transferTo(CampusWallet recipient, int amount) {
        if (recipient == null || recipient == this || amount <= 0 || balance < amount) {
            return false;
        }
        this.balance -= amount;
        recipient.balance += amount;
        return true;
    }

    public int getBalance() {
        return balance;
    }
}
