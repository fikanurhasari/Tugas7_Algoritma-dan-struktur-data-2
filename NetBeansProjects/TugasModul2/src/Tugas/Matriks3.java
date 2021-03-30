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
public class Matriks3 {
    public static void main(String[] args){
        int[][] A = {
            {1, 2, 3},
            {2, 3, 4}
        };
        int[][] B = {
            {2, 3},
            {3, 4},
            {4, 5}
        };
        
        if (A.length == B[0].length){
            
            int[][] C = new int[A.length][B[0].length];
            for(int i = 0; i < A.length; i++){
                for(int j = 0; j < B[0].length; j++){
                    for(int k = 0; k < A[0].length; k++){
                        C[i][j] += A[i][k] * B[k][j];
                    }
                }
            }
            for(int[] c: C){
                for(int i: c){
                    System.out.print(i+" ");
                }
                System.out.println();
            }
            System.out.println("Diannita Amjani");
        }
        else{
            System.out.println("Ukuran kolom A tidak sama dengan baris B");
        }
    }
    
}
