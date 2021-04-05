/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class no1Sequential {
    public static void main(String[] args){
        System.out.println("Sequential Search"+"\n");
        String data[] = {"Galileo", "Archimedes", "Alkhawarizmi", "Aljabar", "Diannita Amjani", "Tesla"};
        String search;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan Data yang dicari: ");
        search = scan.nextLine();
        
        System.out.print("Isi data adalah: ");
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        
        System.out.println("");
        
        for(int i = 0; i <= data.length; i++){
            if(search.equalsIgnoreCase(data[i])){
                System.out.print("Data"+search+" berada pada indeks ke - "+ i);
                break;
            }
        }
        
        System.out.println("\n");
        System.out.println();
        System.out.println("Diannita Amjani");
    }
    
}
