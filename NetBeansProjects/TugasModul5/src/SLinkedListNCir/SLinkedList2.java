/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SLinkedListNCir;

/**
 *
 * @author LENOVO
 */
public class SLinkedList2 {
    public static void main(String[] ar)
    {
        SLinkedList1 lk = new SLinkedList1();
        lk.insertAwal(100);
        lk.display();
        lk.insertAkhir(200);
        lk.display();
        lk.insertAwal(50);
        lk.display();
        lk.insertAtPos(80, 2);
        lk.display();
        lk.deleteAtPos(1);
        lk.display();
    }
    
}