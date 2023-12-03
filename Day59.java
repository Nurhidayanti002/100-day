
package pkg100day;
import java.util.Scanner;
public class Day59 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner (System.in);
        System.out.print("Masukkan kata pertama : ");
        String Kata1 = Sc.nextLine();
        System.out.print("Masukkan kata kedua :");
        String kata2 =Sc.nextLine();
        
        String Kalimat = Kata1.concat("" +kata2);
        System.out.println("Hasil Kalimat : " + Kalimat);
        
    }
}
