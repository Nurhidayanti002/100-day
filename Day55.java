
package pkg100day;
import java.util.Scanner;
public class Day55 {
    public static void main(String[] args) {
         Scanner Sc = new Scanner(System.in);
        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = Sc.nextInt();
        
        if (bilangan % 2 == 0){
        for (int i = 0; i <= bilangan ; i+=2){
            System.out.println(i);
        }
        }else{
            for(int i = 1; i <= bilangan ; i += 2){
            System.out.println(i);
        }
        }
    }
}
