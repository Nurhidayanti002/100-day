
package pkg100day;
import java.util.Scanner;
public class Day49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah bilangan: ");
        int jumlah = scanner.nextInt();

        int[] bilangan = new int[jumlah];
        int total = 0;

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
            bilangan[i] = scanner.nextInt();
            total += bilangan[i];
        }

        double rataRata =  total / jumlah;
        System.out.println("Rata-rata: " + rataRata);
    }

}


        
   
