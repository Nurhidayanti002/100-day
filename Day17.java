
package pkg100day;
import java.util.Scanner;
public class Day17 {
    public static void main (String [] agrs){
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan berat badan kg : ");
        float berat = sc.nextFloat();
        System.out.print("Masukkan tinggi badan cm: ");
        float tinggi = sc.nextFloat();
        float total = berat / (tinggi * tinggi) ;
        if (total <= 18.5){
        System.out.print("Berat badan anda kurus");
        }else if (total >= 18.5 & total <= 25){
        System.out.print("berat badan anda ideal");
        }else {
           System.out.print("obesitas");
        System.out.println ("");
        }
        
    }
}
