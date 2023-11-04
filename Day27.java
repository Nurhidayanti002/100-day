
package pkg100day;
import java.util.Scanner;
public class Day27 {
    public static void main(String[] args) {
        // Pemrograman Memilih menu
        System.out.println ("------------Menu------------");
        System.out.println("1. ice coffe \n2. ice Alfocado\n3. ice Coklat\n4. Nasi Goreng\n5. Nasi Padang " );   
        Scanner sc = new Scanner (System.in);
        // Hanya bisa menuliskan pesanan menggunakan Angka
        System.out.print(" Pesanan Anda : ");
        
        String Menu = null;
        int Harga = 0;
       int Pesanan = sc.nextInt();
        if (Pesanan == 1){
            Menu = "ice coffe";
            Harga = 10000 ;
        }else if (Pesanan == 2){
            Menu = "ice Alfocado";
            Harga = 12000;
        }else if (Pesanan == 3){
            Menu = "ice Coklat";
            Harga =15000;
        }else if (Pesanan == 4){
            Menu = "Nasi Goreng" ;
            Harga = 12000;
        }else {
            Menu = "Nasi padang";
            Harga = 10000;
            
    }
        System.out.println( "Menu yang di pesan : " );
            System.out.println(Menu + " Rp " + Harga );
    
    }
}
