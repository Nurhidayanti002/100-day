
package pkg100day;
import java.util.Scanner;
public class Day15 {
  public static void main (String []args){
      Scanner sc = new Scanner(System.in);
        System.out.print("masukkan kata semangat: " );
         String kata = sc.nextLine();
         System.out.println("masukkan berapa kali ingin di tampilkan:");
         int angka = sc.nextInt();
         for (int i = 0 ; i < angka ; i++){
             System.out.println(kata);
         }
         }
            
  
  }

