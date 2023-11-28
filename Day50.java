
package pkg100day;
import java.util.Scanner;
public class Day50 {
    public static void main(String[] args) {
    String[] buah = new String[5        ];

        // membuat scanner
        Scanner Sc = new Scanner(System.in);

        // mengisi data ke array
        for( int i = 0; i < buah.length; i++ ){
            System.out.print("Buah ke-" + i + ": ");
            buah[i] = Sc.nextLine();
        }

        System.out.println("---------------------------");

        // menampilkan semua isi array
        for( String b : buah ){
            System.out.println(b);
        }

    }
}



    

    
