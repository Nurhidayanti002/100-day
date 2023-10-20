
package pkg100day;

import java.util.ArrayList;

public class Day12 {
    public static void main (String [] args){
        ArrayList <Integer> Elemen = new ArrayList <>();
         Elemen.add (10);
         Elemen.add(40);
         Elemen.add (30);
         Elemen.add (20);
         Elemen.add (15);
         Elemen.add (25);
         Elemen.add (35);
         Elemen.add (45);
         
         System.out.println ("menampilkan semua elemen:" + Elemen );
         int AngkaPertama = Elemen.get(0);
         int AngkaKedua = Elemen.get(7);
       
         System.out.println ( "menampilkan  elemen:" + AngkaPertama);
         System.out.println ( "menampilkan  elemen:" + AngkaKedua);
         
         System.out.println ( "menampilkan jumlah Elemen :" );
         System.out.println(Elemen.size());
         
         System.out.println ("menghapus salah satu Elemen:");
         System.out.println(Elemen.remove(4));
         System.out.println(Elemen.remove(6));
         
         System.out.println("Menampilkan lagi semua elemen:" + Elemen);
        
         
    }
}
