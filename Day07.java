
package javaapplication16;

import java.util.ArrayList;

public class Day07 {

    public static void main(String[] args) {
        // TODO code application logic here
           ArrayList namaBarang = new ArrayList();
      namaBarang.add("kursi");
      namaBarang.add("buku");
      namaBarang.add("meja");
      namaBarang.add("pulpen");
      namaBarang.add(123);
      System.out.println ("Tampilkan semua element:" + namaBarang);
      System.out.println("jumlah elemen "+ namaBarang.size()+ " barang");
    }
    
}
