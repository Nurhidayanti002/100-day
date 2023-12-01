
package pkg100day;
import java.util.Scanner;
public class Day54 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.print("Masukkan kata: ");
        String kata = Sc.nextLine();

        System.out.println("karakter dalam kata:");
        for (int i = 0; i < kata.length(); i++) {
            char karakter = kata.charAt(i);
            System.out.println(karakter);
        }

    
    }
}

