/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xplorestemi.jlearn;

import java.io.*;
/**
 *
 * @author Iseoluwa
 */
public class Student {
    //General details
    private String firstName;
    private String lastName;
    private double average;
    private int position;
    
    Subject math = new Subject();
    Subject english = new Subject();
    Subject ict = new Subject();
    Subject french = new Subject();
    Subject science = new Subject();
    
    public Student(){
        
    }
    
    //Personal Stuff
    public void setName(int x,String name){
        if (x == 1){
            firstName = name;
        }else if (x == 2){
            lastName = name;
        }
    }
    
    public void setAverage(){
        double a = math.getScore(5);
        double b = english.getScore(5);
        double c = ict.getScore(5);
        double d = french.getScore(5);
        double e = science.getScore(5);
        
        average = (a + b + c + d + e)/5;
    }
    
    public void setPosition(int i){
        position = i;
    }
    
    public String getName(int a){
        String name;
        if (a == 1){
            name = firstName;
        }else if(a == 2){
            name = lastName;
        }else{
            name = "Error";
        }
        return name;
    }
    
    public double getAverage(){
        return average;
    }
    
    public int getPosition(){
        return position;
    }
    
    //Subjects
    public void setScore(int ca, Subject sub, double sc){
        sub.setScore(ca, sc);
    }
    
    public void findTotalScore(Subject sub){
        sub.findTotalScore();
    }
    
    public void findGrade(Subject sub){
        sub.findGrade();
    }
    
    public void findRemark(Subject sub){
        sub.findRemark();
    }
    
    public void setPosition(Subject sub, int i){
        sub.setPosition(i);
    }
    
    public double getScore(Subject sub, int ca){
        return sub.getScore(ca);
    }
    
    public char getGrade(Subject sub){
        return sub.getGrade();
    }
    
    public String getRemark(Subject sub){
        return sub.getRemark();
    }
    
    public int getPosition(Subject sub){
        return sub.getPosition();
    }
}
