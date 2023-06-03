/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package materi.pkg06;

/**
 *
 * @author Nabilah Fitriani
 */
public class Main {

    public static void main(String[] args) {

        DoubleLinkedList dll = new DoubleLinkedList();

        System.out.println("======DOUBLE LINKED LIST========");

        dll.addFirst(new Node2P(28));
        dll.addFirst(new Node2P(20));
        dll.addFirst(new Node2P(24));

        dll.cetak("Isi DLL setelah penambahan dari depan ");
        dll.print();
        System.out.println("--------------------------------");
       
        dll.addLast(new Node2P(9));
        dll.cetak("Isi DLL setelah penambahan dari belakang ");
        dll.print();
        System.out.println("--------------------------------");

        dll.insertBefore(24, new Node2P(6));
        dll.cetak("Isi DLL setelah penambahan sebelum node x ");
        dll.print();
        System.out.println("--------------------------------");
        
        dll.insertAfter(20, new Node2P(5));
        dll.cetak("Isi DLL setelah penambahan setelah node x ");
        dll.print();
        System.out.println("--------------------------------");
        
        dll.removeFirst();
        dll.cetak("Isi DLL setelah penghapusan dari depan");
        dll.print();
        System.out.println("--------------------------------");
        
        dll.removeLast();
        dll.cetak("Isi DLL setelah penghapusan dari belakang");
        dll.print();
        System.out.println("--------------------------------");
        
        dll.remove(5);
        dll.cetak("isi DLL setelah penghapusan node tertentu");
        dll.print();
        System.out.println("--------------------------------");
        
       
    }
}
