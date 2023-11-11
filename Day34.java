package pkg100day;
import java.util.Scanner;

public class Day34 {
    public static void main(String[] args) {
        String[] nama = new String[4];
        Scanner sc = new Scanner(System.in);
         for( int i = 0; i < nama.length ; i++ ){
            System.out.print(" ke-" + i + ": ");
            nama[i] = sc.nextLine();
         }
        System.out.println("--------------------------");
        for( String b : nama ){
            System.out.println(b);
        }
    }
}
