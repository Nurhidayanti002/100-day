
package pkg100day;
import java.util.Scanner;
public class Day45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan angka n :");
        int Angka =sc.nextInt();
         System.out.println("bilangan genap dari angka 1 sampai "+ Angka + " adalah ");
        for (int i = 1 ; i <= Angka; i++){
            if (i % 2 == 0){
         System.out.print(  i + " ");
            }
        }
        
        
        
    }
}
