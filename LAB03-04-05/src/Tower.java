/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author stewie.
 */
import java.util.*;
public class Tower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("plese enter your tower hight : ");
        int x = sc.nextInt();
        for (int y=1;y<=x;y++){
            System.out.println("#-#-#-#-#");
        }
    }
    
}
