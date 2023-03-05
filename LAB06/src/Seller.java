/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author stewie.
 */
public class Seller extends Employee{
    Food food = new Food();
    public Food sell(Employee e){
        if(Food.getPrice() <= e.getWallet().getBalance()){
            getWallet().setBalance(getWallet().getBalance() + Food.getPrice());
            e.getWallet().setBalance(e.getWallet().getBalance() - Food.getPrice());
            return food;
        }
        else{
            System.out.println("Your money is not enough.");
            return null;
        }
    }
}
