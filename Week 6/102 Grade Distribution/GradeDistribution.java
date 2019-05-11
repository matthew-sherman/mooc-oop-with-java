
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matthew
 */
public class GradeDistribution {
    private int[] grades;
    
    public GradeDistribution(){
        grades = new int[6];
    }
   
    public void inputScores(Scanner scanner){
        System.out.println("Type exam scores, -1 completes: ");
        
        while(true){
            int score = Integer.parseInt(scanner.nextLine());
            if(score == -1){
                break;
            }
            
            addScore(score);
        }
    }
    
    public void addScore(int score){
        if(score < 0 || score > 60){
            return;
        }
        
        int grade = getGrade(score);
        this.grades[grade]++;
    }
    
    public int getGrade(int score){
        int grade = 0;
        
        if(score < 30){
            grade = 0;
        }else if(score < 35){
            grade = 1;
        }else if(score < 40){
            grade = 2;
        }else if(score < 45){
            grade = 3;
        }else if(score < 50){
            grade = 4;
        }else if(score <= 60){
            grade = 5;
        }
        
        return grade;
    }
    
    private static String stars(int number) {
        String stars = "";
        
        for (int i = 0; i < number; i++) {
            stars += "*";
        }
        
        return stars;
    }
    
    private double acceptancePercentage() {
        double allScores = 0;

        for (int i = 0; i < grades.length; i++) {
            allScores += grades[i];
        }


        return 100 * (allScores - (double) grades[0])/ allScores;
    }

    public void print() {
        System.out.println("Grade distribution: ");

        for(int i = 5; i >= 0; i--) {
            System.out.println(i + ": " + stars(grades[i]));

        }

        System.out.println("Acceptance Percentage " + acceptancePercentage());
    }
   
}
