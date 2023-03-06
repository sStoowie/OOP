/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author stewie.
 */
public class Pigeous extends Bird{
    public Pigeous(){
       super("",0);
       setPower(150) ;
    }
    public Pigeous(String name, int age){
        super(name, age);
        setPower(150);
    }
    public void wingAttack(Animal a, int times){
        for (int i=1;i<=times;i++){
            a.setPower(a.getPower()-5);
        }
    }
    @Override
    public void eat(Food f){
        setPower(getPower()+(f.getPower()*2));
    }
    @Override
    public void fly(){
        System.out.println(getName()+" fly fly ....");
    }
    @Override
    public void wingAttack(Animal a){
        a.setPower(a.getPower()-5);
    }
}
