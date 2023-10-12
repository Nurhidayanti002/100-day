
package pkg100day;

import java.util.Scanner;

public class DAY04 {
    public static void main(String[] args) {
        // TODO code application logic here
        
      int poin = 0;
      Scanner scan = new Scanner(System.in);
      System.out.println("Harga belanja kamu");
      poin = scan.nextInt();
      if (poin < 20){
           System.out.println (" SILAHKAN BERBELANJA LAGI ");
    }
      else{
      System.out.println("SELAMAT ANDA MENDAPATKAN DISKON ");
    }
    System.out.println ("Terimakasih selamat datang kembali");
    }
}