/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author stewie.
 */
public class Fraction {
    public int topN;
    public int btmN;
    
    public String toFraction(){
        return topN + "/" + btmN;
    }

    public String toFloat(){
        return "" + ((double)topN/btmN);
    }

    public void addFraction(Fraction f){
        if (btmN == f.btmN){
            topN = topN + f.topN;
        }
        else{
            topN = topN * f.btmN + f.topN * btmN;
            btmN = (btmN * f.btmN);
        }
    }
}
