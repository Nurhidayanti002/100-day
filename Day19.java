package pkg100day;
import java.util.Scanner;
public class Day19 {
  public static void main (String [] args){
      Scanner sc = new Scanner (System.in);
      System.out.print("masukkan Angka pertama : "); 
      int angka =sc.nextInt();
      System.out.print("masukkan angka ke dua : ");
      int angka2 = sc.nextInt();
     
    
      //penjumlahan
      System.out.println( angka + angka2);
      //pengurangan 
      System.out.println(angka - angka2 );
      //perkalian
       System.out.println(angka * angka2 );
       //hasil bagi 
        System.out.println(angka / angka2 );
        //modulus
         System.out.println(angka % angka2 );
  }
}
