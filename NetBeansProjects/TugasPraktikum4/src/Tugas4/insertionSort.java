/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas4;

/**
 *
 * @author LENOVO
 */
public class insertionSort {
    public static void insertionSorting(int[] A){
        for (int i = 1; i < A.length; i++){
            int kunci = A[i];
            int j = i - 1;
            while ((j >= 0) && (A[j] > kunci)){
                
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = kunci;
        }
    }
    
    public static void tampil(int data[]){
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
    System.out.println();
    }
    
    public static void main(String[] args){
        System.out.println("Diannita Amjani");
        int A[] = {25, 7, 9, 13, 3};
        insertionSort.tampil(A);
        insertionSort.insertionSorting(A);
        insertionSort.tampil(A);
    }
}
