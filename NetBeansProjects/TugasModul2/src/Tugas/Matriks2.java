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
public class Matriks2 {
    public static void main(String[] args){
        int[][] A = {
            {2, 1},
            {3, 4},
            {1, 3}
        };
        
        int[][] B = {
            {4, 5},
            {6, 7},
            {8, 9}
        };
        
        if((A.length == B.length) && (A[0].length == B[0].length)){
            int[][] C = new int[A.length][A[0].length];
            for(int i = 0; i < A.length; i++){
                for(int j = 0; j < A[0].length; j++){
                    C[i][j] = B[i][j] - A[i][j];
                }
            }
            
            for(int[] c: C){
                for(int q: c){
                    System.out.print(q+ " ");
                }
                System.out.println();
            }
            System.out.println("Diannita Amjani");
        }
        else{
            System.out.println("Ukuran matriks tidak sama");
        }
    }
    
}
