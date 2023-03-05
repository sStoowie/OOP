/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author stewie.
 */
import java.util.*;
public class Tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Input your money : ");
        double money = sc.nextDouble();
        System.out.print("Input your accout type (Please type A B C or X in uppercase) : ");
        String type = sc1.nextLine();
        if("A".equals(type)){
            money += (money*1.5)/100;
        }
        else if ("B".equals(type)){
            money += (money*2.0)/100;
        }
        else if ("C".equals(type)){
            money += (money*1.5)/100;
        }
        else if ("X".equals(type)){
            money += (money*5.0)/100;
        }
        System.out.println("Your total money in one year = " + (int)money);
        
        
        
        
    }
    
}
