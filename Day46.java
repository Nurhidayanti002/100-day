
package pkg100day;
import java.util.Scanner;
public class Day46 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.print("Masukkan umur anda: ");
    int Umur = sc.nextInt();
    if (Umur >= 18){
        System.out.println("Anda udah cukup umur");
    }else 
        System.out.println("Anda belum cukup umur");
        
    }
}
