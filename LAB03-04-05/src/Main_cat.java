/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author stewie.
 */
public class Main_cat {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.defineCat("Mew", "White");
        c.speak();
        
        c.upWeight(5);
        c.upHeight(10);
        c.speak();
                
        c.upWeight(-5);
        c.upHeight(-10);
        c.speak();
        
        
    }
}