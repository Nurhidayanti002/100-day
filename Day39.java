
package pkg100day;
import java.util.Scanner;
public class Day39 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan usia
        System.out.print("Masukkan umur Anda: ");
        int umur = sc.nextInt();

        // Meminta pengguna untuk memasukkan status pekerjaan
        System.out.print("Apakah Anda bekerja? (true/false): ");
        boolean kerja = sc.nextBoolean();

        // Memeriksa kriteria usia dan status pekerjaan
        if (umur >= 18 && kerja) {
            System.out.println("Anda adalah orang dewasa yang bekerja.");
        } else if (umur >= 18) {
            System.out.println("Anda adalah orang dewasa yang tidak bekerja.");
        } else {
            System.out.println("Anda bukan orang dewasa.");
        }
    }
}
