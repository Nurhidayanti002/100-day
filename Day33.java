
package pkg100day;
import java.util.Scanner;
public class Day33 {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
        System.out.print("Input nilai pre Test anda :");
        int Nilai = sc.nextInt();
        if (Nilai >= 50){
            System.out.println("Lulus");
        }else{
        System.out.println("Tidak Lulus");
           
       }
    } 
 
}
