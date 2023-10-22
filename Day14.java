
package pkg100day;
import java.util.Scanner;
public class Day14 {
    public static void main (String [] args ){
        //MEMBUAT OPERASI MENENTUKAN HARI DARI ANGKA 1-7
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan angka 1 - 7, untuk mengetahui hari = ");
        int Hari= sc.nextInt();
        if (Hari < 2){
            System.out.println("SENIN");
        }else if ( Hari < 3){
            System.out.println("SELASA");
        }else if (Hari < 4){
            System.out.println("RABU");
        }else if (Hari < 5){
            System.out.println("KAMIS");
        }else if (Hari < 6){
            System.out.println("JUM'AT");
        }else if (Hari < 7){
            System.out.println("SABTU");
        }else {
            System.out.println("MINGGU");
        }
        } 
    }
    
