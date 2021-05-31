/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author LENOVO
 */
public class TumpukanApp {
    public static void main(String [] args){
        System.out.println("Diannita Amjani");
        
        Tumpukan tumpukan = new Tumpukan(10);
        tumpukan.push(50);
        tumpukan.baca();
        System.out.println(" ");
        
        tumpukan.push(100);
        tumpukan.baca();
        System.out.println(" ");
        
        tumpukan.pop();
        tumpukan.baca();
        System.out.println(" ");
        
        tumpukan.push(60);
        tumpukan.baca();
        System.out.println(" ");
        
        tumpukan.push(80);
        tumpukan.baca();
        System.out.println(" ");
        
        tumpukan.pop();
        tumpukan.baca();
        System.out.println(" ");
        
        long nilai1 = tumpukan.peek();
        System.out.println("nilai top = "+nilai1);
        System.out.println(" ");
        
    }
    
}
