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
public class shellSort {
    public static void shellsorting(int[] arr){
        int n = arr.length;
        int C, M;
        int Jarak, i, j, Kondisi;
        boolean Sudah = true;
        int temp;
        C = 0;
        M = 0;
        Jarak = n;
        
        while(Jarak >= 1){
            Jarak = Jarak / 2;
            Sudah = true;
            while(Sudah){
                Sudah = false;
                for(j = 0; j < n - Jarak; j++){
                    i = j + Jarak;
                    C++;
                    if(arr[j] > arr[i]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    Sudah = true;
                }
            }
            }
        }
    }
    
    public static void tampil(int data[]){
        for(int i = 0; i < data.length; i++)
            System.out.print(data[i] + " ");
        System.out.println();
    }
    
    public static void main(String[] args){
        System.out.println("Diannita Amjani");
        int A[] = {25, 7, 9, 13, 3};
        shellSort.tampil(A);
        shellSort.shellsorting(A);
        shellSort.tampil(A);
    }
    
}
