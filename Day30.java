
package pkg100day;
import java.util.Scanner;
public class Day30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int Min = sc.nextInt();
        int Max = sc.nextInt ();
        for (int i = Max+1 ; i < Min; i++){
                System.out.print(i + ", "); 
            }
    }
}
