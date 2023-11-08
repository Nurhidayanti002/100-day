
package pkg100day;
import java.util.Arrays;
import java.util.Scanner;
public class Day31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan kalimat anda : ");
        String Kalimat = sc.nextLine();
        String [] ArraySplit = Kalimat.split(("\\s"));
        System.out.println(Arrays.toString(ArraySplit));
        for (String Hasil :ArraySplit ){
            System.out.println(Hasil);
        }
    }
}
