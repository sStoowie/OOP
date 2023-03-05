/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author stewie.
 */
import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oddnum = 0;
        int evennum = 0;
        while(true){
            int num = sc.nextInt();
            if (num == -1){
                break;
            }
            if (num % 2 == 0){
                evennum += 1;
            }
            if (num % 2 != 0){
                oddnum += 1;
            }
        }
        System.out.print("Odd number = " + oddnum);
        System.out.println(" and Even number = " + evennum);
    }
    
}
