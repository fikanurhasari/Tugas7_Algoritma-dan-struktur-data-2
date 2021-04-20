/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utsalgo2;

/**
 *
 * @author LENOVO
 */
public class no1 {
    public static void selectionsort(int A[]){
        int smallIndex;
        int pass, j, n = A.length;
        int temp;
        
        for(pass = 0; pass < n -1; pass++){
            smallIndex = pass;
            for(j = pass + 1; j < n; j++){
                if(A[j] < A[smallIndex]){
                    smallIndex = j;
                }
            }
            temp = A[pass];
            A[pass] = A[smallIndex];
            A[smallIndex] = temp;
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
        int A[] = {3, 10, 4, 2, 8, 13};
        int cari = 8;
        int indeksAwal = 0;
        int indeksAkhir = A.length - 1;
        int ketemu = 0;
        int point = 0;
        
        no1.tampil(A);
        no1.selectionsort(A);
        no1.tampil(A);
        
        System.out.print("Isi data adalah ");
        for(int i = 0; i < A.length; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println(" ");
        System.out.println(" ");
        
        while ((indeksAwal <= indeksAkhir)&&(ketemu == 0)){
            point = (indeksAwal + indeksAkhir)/ 2;
            System.out.println("Indeks pointer: " + point);
                if(cari == A[point]){
                    ketemu = 1;
                    System.out.println("Data " + cari + "Telah ditemukan pada indeks ke- " + point);
                    
                    
                }
                else if(cari < A[point]){
                    System.out.println("cari di kiri ");
                    indeksAkhir = point - 1;
                    
                }
                else{
                    indeksAwal = point + 1;
                    System.out.println("cari di kanan ");
                    
                }
                
        }
        if(ketemu == 1);
            System.out.println("Kesimpulan: Data ditemukan");
            /*else*/
            System.out.println("Kesimpulan: Data tidak ditemukan");
    }
    
}
