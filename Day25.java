
package pkg100day;
import java.util.Scanner;
public class Day25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan angka :");
        int Angka = sc .nextInt();
        System.out.print("Masukkan angka :");
        int Angka02 = sc.nextInt();
        
        int jumlah = Angka * Angka02;
        System.out.println("perkalian : " + jumlah);
        int jumlah01 = Angka - Angka02;
          System.out.println ("pengurangan : " + jumlah01);
          int jumlah02 = Angka % Angka02;
          System.out.println("perkalian : " + jumlah02);
          int jumlah03 = Angka / Angka02 ;
            System.out.println("perkalian : " + jumlah03);
            int jumlah04 = Angka + Angka02;
              System.out.println("perkalian : " + jumlah04);
          
    }
}
