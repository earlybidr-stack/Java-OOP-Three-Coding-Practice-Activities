/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity3;

import Activity3.CampusWallet;

/**
 *
 * @author CORESIS_CPE113
 */
public class Main {
public static void main(String[] args) {
    
        // Create Aly's wallet with 100 credits and Ben's with the 1-arg constructor
        CampusWallet aly = new CampusWallet("Aly", 100);
        CampusWallet ben = new CampusWallet("Ben");
        System.out.println("Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());

        // Aly transfers 35 credits to Ben
        System.out.println(aly.transferTo(ben, 35) + "; Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());

        // Aly tries to transfer 70 credits to Ben
        System.out.println(aly.transferTo(ben, 70) + "; Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());

        // Aly tries to transfer 10 credits to her own wallet
        System.out.println(aly.transferTo(aly, 10) + "; Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());

        // Ben deposits 15 credits
        System.out.println(ben.deposit(15) + "; Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());

        // Aly transfers all 65 remaining credits to Ben
        System.out.println(aly.transferTo(ben, 65) + "; Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());

        // Additional Test A: Zero-credit transfer (Ben tries to transfer 0 to Aly)
        // Expected result: false; Aly: 0, Ben: 115
        System.out.println(ben.transferTo(aly, 0) + "; Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());

        // Additional Test B: Transfer to null (Ben tries to transfer 10 to null)
        // Expected result: false; Aly: 0, Ben: 115
        System.out.println(ben.transferTo(null, 10) + "; Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());
    }
}
