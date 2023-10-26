
package pkg100day;
import java.util.Scanner;
public class Day18 {
    public static void main (String []args ){
        //Pemrograman memasukkan nilai
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan Nilai anda :");
        int Angka = sc.nextInt();
        if (Angka >= 90 ){
            System.out.println("Nilai: A ");
        }else if (Angka >= 80 ){
            System.out.println("Nilai: B");
        }else if (Angka >= 70){
            System.out.print("Nilai: C");
        }else if (Angka >= 50){
            System.out.println("Nilai: D");
        }else{
            System.out.println("Nilai anda eror");
        }
    }
}
