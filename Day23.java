
package pkg100day;
import java.util.Scanner;

public class Day23 {
    public static void main(String[] args) {
        //menghitung luas persegi panjang
        // Rumus Luas = panjang * lebar
        Scanner Sc = new Scanner (System.in);
        System.out.print("panjang kotak : ");
        double PanjangKotak =Sc.nextDouble();
        System.out.print("Lebar : ");
        double lebarKotak = Sc.nextDouble();
        
       double LuasKotak = PanjangKotak * lebarKotak ;
       
       System.out.print ("Jumlah keliling kotak : " + LuasKotak);
        
    }
 
}
