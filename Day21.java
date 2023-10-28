
package pkg100day;
import java.util.ArrayList;
public class Day21 {
    public static void main(String[] args) {
       ArrayList <String> Nama = new ArrayList<>();
       
       Nama.add("mobil");
       Nama.add("motor");
       Nama.add("sepeda");
       Nama.add("Kapal");
       Nama.add("Kereta");
       Nama.add("bis");
       
       System.out.println("Cetak semua Array: " + Nama);

       String Kendaraan1 = Nama.get(4);
       String Kendaraan2 = Nama.get(5);
      
       System.out.println("Cetak Array yang di panggil: " +Nama.get(5)+","+Nama.get(3));
       System.out.println(Nama.remove( 3) );
       System.out.println(Nama.remove( 2) );
        System.out.println("cetak Array setelah di remove : " + Nama.size());
       System.out.println("Cetak Array kembali: "+ Nama);
        
       
       
    }
}
