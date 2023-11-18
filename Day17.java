
package pkg100day;
import java.util.Scanner;
public class Day17 {
    public static void main (String [] agrs){
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan berat badan kg : ");
        double berat = sc.nextFloat();
        System.out.print("Masukkan tinggi badan m: ");
        double tinggi = sc.nextFloat();
        double total = berat / (tinggi * tinggi) ;
        System.out.println(berat+ "/"+( tinggi+"*"+tinggi)+"="+ total );
        if (total < 18.5){
        System.out.print("Berat badan anda kurus");
        }else if (total > 18.5 && total < 25){
        System.out.print("berat badan anda ideal");
        }else {
           System.out.print("obesitas");
        System.out.println ("");
        }
        
    }
}
