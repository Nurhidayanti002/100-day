
package pkg100day;
import java.util.Scanner;
public class Day30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int Min = sc.nextInt();
        int Max = sc.nextInt ();
        for (int i = Min ; i <= Max ; i++){
                System.out.print(  i );
                if(i >= Min && i < Max){
                    System.out.print(",");
                }
            }
        
    }
}
