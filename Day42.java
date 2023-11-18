
package pkg100day;
import java.util.Scanner;
public class Day42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka: ");
        int angka = scanner.nextInt();
        if (angka > 0) {
            System.out.println("Angka yang dimasukkan adalah positif.");
        } else if (angka < 0) {
            System.out.println("Angka yang dimasukkan adalah negatif.");
        } else {
            System.out.println("Angka yang dimasukkan adalah nol.");
        }
    }
    }
