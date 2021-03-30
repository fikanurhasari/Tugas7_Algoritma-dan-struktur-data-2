/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author LENOVO
 */
public class Matriks4 {
    public static void main(String[] args){
        int B[][] = {
            {2, 1, -5},
            {3, 4, 2}
        };
        int B_trans[][] = new int[3][2];
        
        for(int i = 0; i < B.length; i++){
            for(int j = 0; j < B[0].length; j++){
                System.out.print(B[i][j] + "\t");
            }
            System.out.println("");
        }
            System.out.println("B Transpose: ");
            for(int i = 0; i < B.length; i++){
                for(int j = 0 ; j < B[0].length; j++){
                    B_trans[j][i] = B[i][j];
                }
            }
            for(int i = 0; i < B[0].length; i++){
                for(int j = 0; j < B.length; j++){
                    System.out.print(B_trans[i][j]+"\t");
                }
                System.out.println();    
            }
            System.out.println("Diannita Amjani");
        }
    
}
