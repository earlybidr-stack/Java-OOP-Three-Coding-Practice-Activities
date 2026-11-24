/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity2;

/**
 *
 * @author CORESIS_CPE113
 */
public class Main {
   public static void main(String[] args) {
       
        // 1. Create Ana's record with quiz 80 and lab 90
        LabGrade ana = new LabGrade("Ana", 80, 90);
        System.out.println(ana.getFinalGrade() + "; " + (ana.isPassing() ? "passing" : "not passing"));

        // 2. Create Ben's record with quiz 101 and lab 85
        LabGrade ben = new LabGrade("Ben", 101, 85);
        System.out.println(ben.getFinalGrade() + "; " + (ben.isPassing() ? "passing" : "not passing"));

        // 3. Update Ana's scores to 95 and 101
        boolean update1 = ana.updateScores(95, 101);
        System.out.println(update1 + "; grade stays " + ana.getFinalGrade());

        // 4. Update Ana's scores to 74 and 75
        boolean update2 = ana.updateScores(74, 75);
        System.out.println(update2 + "; " + ana.getFinalGrade() + "; " + (ana.isPassing() ? "passing" : "not passing"));

        // 5. Update Ana's scores to 75 and 75
        boolean update3 = ana.updateScores(75, 75);
        System.out.println(update3 + "; " + ana.getFinalGrade() + "; " + (ana.isPassing() ? "passing" : "not passing"));

        // 6. Check Ben's record again
        System.out.println("Still " + ben.getFinalGrade() + "; " + (ben.isPassing() ? "passing" : "not passing"));
    }
}
        /**Activity 2, Q1: Why must you validate both new scores before assigning either one?
         * We must validate both scores first to prevent a partial update that overwrites 
         * the valid score before discovering the second score is invalid. 
         * By Checking both conditions together ensures the update is all-or-nothing, 
         * leaving both original scores unchanged if either input fails.
         */