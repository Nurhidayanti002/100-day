
package pkg100day;
import java.util.Scanner;
public class Day45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Masukkan angka n :");
        int Angka =sc.nextInt();
         int Bilangangenap = 0;
        for (int i = 1 ; i <= Angka; i++){
            System.out.println(i);
            if (i % 2 == 0){
         System.out.println("Angka genapnya :" + i);
            }
        }
        
        
        
    }
}
