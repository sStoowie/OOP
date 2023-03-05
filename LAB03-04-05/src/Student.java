/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author stewie.
 */
public class Student {
    public String name;
    public double mScore;
    public double fScore;
    
   public void showGrade(){
       System.out.println("Your grade : "+((mScore*0.4)+(fScore*0.4)+20));
   }
}
