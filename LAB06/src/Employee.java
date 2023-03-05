/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author stewie.
 */
public class Employee {
    private static String nationality = "Thai";
    private String name;
    private Wallet wallet;
    private int energy;
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setWallet(Wallet wallet){
        this.wallet = wallet;
    }
    public Wallet getWallet(){
        return this.wallet;
    }
    public void setEnergy(int energy){
        this.energy = energy;
    }
    public int getEnergy(){
        return this.energy;
    }
    public static void setNationality(String nationality){
        Employee.nationality = nationality;
    }
    public static String getNationality(){
        return nationality;
    }
    public void eat(Food f){
        this.energy += f.getEnergy();
    }
    public boolean buyFood(Seller s){
        Food f = s.sell(this);
        if(f == null){
            return false;
        }
        else{
            this.eat(f);
            return true;
        }
    }
    public boolean equals(Employee e){
        return e.getName().equals(name);
    }

    @Override
    public String toString(){
        return "My name is "+getName()+"."
                +"\nI have "+getEnergy()+" energy left. \nI have a balance of "
                +getWallet().getBalance()+" baht.";
                }
}
