
package pkg100day;
import java.util.Scanner;
public class Day43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Bilangan bulat ke-1: ");
        int Angka1 = sc.nextInt();
         System.out.print("Masukkan Bilangan Bulat ke-2: ");
         int Angka2 = sc.nextInt();
         System.out.print("Masukkan Bilangan bulat ke-3: ");
         int Angka3 = sc.nextInt();
         
        int Hasil = Angka1 + Angka2 + Angka3 ;
        int RataRata = Hasil / 3 ;
        System.out.println("-------------------------------------------");
        System.out.println ("Hasil jumlah: "+ Angka1 + " + " + Angka2 + " + " + Angka3 + " = "+ Hasil);
        System.out.println ("Hasil rata-rata: " + RataRata);
    }
}
