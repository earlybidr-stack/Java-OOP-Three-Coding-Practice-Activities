/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activty1;

/**
 *
 * @author CORESIS_CPE113
 */
public class PrintAccount {
   private String studentName;
    private int credits;

    public PrintAccount(String studentName, int credits) {
        this.studentName = studentName;
        if (credits < 0) {
            this.credits = 0;
        } else {
            this.credits = credits;
        }
    }

    public boolean addCredits(int amount) {
        if (amount > 0) {
            credits += amount;
            return true;
        }
        return false;
    }

    public boolean printPages(int pages) {
        if (pages > 0 && credits >= pages) {
            credits -= pages;
            return true;
        }
        return false;
    }

    public int getCredits() {
        return credits;
    }
}