
package pkg100day;
import java.util.Scanner;
public class Day41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen dalam array: ");
        int jumlahElemen = scanner.nextInt();
        int[] array = new int[jumlahElemen];
        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println("\nNilai-nilai dalam array:");
        for (int i = 0; i < jumlahElemen; i++) {
            System.out.println("Elemen ke-" + (i + 1) + ": " + array[i]);
        }
        scanner.close();
    }

}
