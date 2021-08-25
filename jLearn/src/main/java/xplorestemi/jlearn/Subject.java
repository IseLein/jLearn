/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xplorestemi.jlearn;

/**
 *
 * @author Iseoluwa
 */
public class Subject {
    private double caScore1;
    private double caScore2;
    private double caScore3;
    private double examScore;
    private double totalScore;
    private char grade;
    private String remark;
    private int position;
    
    public Subject(){
        
    }
    
    public void setScore(int ca, double sc){
        switch(ca){
            case 1:
                caScore1 = sc;
            case 2:
                caScore2 = sc;
            case 3:
                caScore3 = sc;
            case 4:
                examScore = sc;
            default:
                //Error Handling...
        }
    }
    
    public void findTotalScore(){
        totalScore = caScore1 + caScore2 + caScore3 + examScore;
    }
    
    public void findGrade(){
        if (totalScore >= 0 && totalScore < 40){
            grade = 'F';
        }else if (totalScore >= 40 && totalScore < 45){
            grade = 'E';
        }else if (totalScore >= 45 && totalScore < 50){
            grade = 'D';
        }else if (totalScore >= 50 && totalScore < 65){
            grade = 'C';
        }else if (totalScore >= 65 && totalScore < 75){
            grade = 'B';
        }else if (totalScore >= 75 && totalScore <= 100){
            grade = 'A';
        }
    }
    
    public void findRemark(){
        switch (grade) {
            case 'F':
                remark = "Very Poor";
                break;
            case 'E':
                remark = "Weak Pass";
                break;
            case 'D':
                remark = "Pass";
                break;
            case 'C':
                remark = "Good";
                break;
            case 'B':
                remark = "Very good";
                break;
            case 'A':
                remark = "Distinction";
                break;
            default:
                break;
        }
    }
    
    public void setPosition(int i){
        position = i;
    }
    
    public double getScore(int ca){
        double score;
        switch(ca){
            case 1:
                score = caScore1;
            case 2:
                score = caScore2;
            case 3:
                score = caScore3;
            case 4:
                score = examScore;
            case 5:
                score = totalScore;
            default:
                score = 0;
        }
        return score;
    }
    
    public char getGrade(){
        return grade;
    }
    
    public String getRemark(){
        return remark;
    }
    
    public int getPosition(){
        return position;
    }
}
