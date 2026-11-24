/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity2;

/**
 *
 * @author CORESIS_CPE113
 */
public class LabGrade {
    private String studentName;
    private int quizScore;
    private int labScore;

    public LabGrade(String studentName, int quizScore, int labScore) {
        this.studentName = studentName;
        this.quizScore = isValidScore(quizScore) ? quizScore : 0;
        this.labScore = isValidScore(labScore) ? labScore : 0;
    }

    public boolean updateScores(int quizScore, int labScore) {
        if (isValidScore(quizScore) && isValidScore(labScore)) {
            this.quizScore = quizScore;
            this.labScore = labScore;
            return true;
        }
        return false;
    }

    public double getFinalGrade() {
        return (quizScore * 0.40) + (labScore * 0.60);
    }

    public boolean isPassing() {
        return getFinalGrade() >= 75.0;
    }

    private boolean isValidScore(int score) {
        return score >= 0 && score <= 100;
    }
}
