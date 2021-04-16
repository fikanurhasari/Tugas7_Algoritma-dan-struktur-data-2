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
public class SortingdanSearching {
    public static void insertionSort(int[] A){
        for(int i = 1; i < A.length; i++){
            int key = A[i];
            int j = i - 1;
            while((j >= 0) && (A[j] > key)){
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = key;
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
        int cari = 7;
        int ketemu = 0;
        
        SortingdanSearching.tampil(A);
        SortingdanSearching.insertionSort(A);
        SortingdanSearching.tampil(A);
        
        System.out.println("Isi data A adalah: ");
        for(int i = 0; i < A.length; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println("");
        System.out.println("");
        
        for(int i = 0; i < A.length; i++){
            if(A[i] == cari){
                ketemu = 1;
                System.out.println("data " + cari + " berada di indeks ke-" + i);
            }
        }
        System.out.println("");
        
        if(ketemu == 1)
            System.out.println("Kesimpulan: data ditemukan");
        else
            System.out.println("data yang dicari= " + cari);
            System.out.println("Kesimpulan: data tidak ditemukan");
    }
    
}
