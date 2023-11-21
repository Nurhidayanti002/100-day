
package pkg100day;
import java.util.Scanner;
public class Day44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Masukkan angka: ");
        int Angka = sc.nextInt();
        if (Angka % 2 == 0){
            System.out.print("Angka yang anda masukkan Genap");
        }else 
        System.out.println("Angka yang anda masukkan Ganjil");
    }
}
