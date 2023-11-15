
package pkg100day;
import java.util.Scanner;

public class Day40 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen array: ");
        int jumlahElemen = Sc.nextInt();
        int[] nilaiArray = new int[jumlahElemen];
        
        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilaiArray[i] = Sc.nextInt();
        }
        System.out.println("Nilai dalam array:");
        for (int i = 0; i < jumlahElemen; i++) {
            System.out.println("Nilai ke-" + (i + 1) + ": " + nilaiArray[i]);
        }

    }
}
