
package pkg100day;
import java.util.Scanner;
public class Day52 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner (System.in);
        System.out.println("Total belanja : ");
        double Total = Sc.nextDouble();
        double HargaTotal = 0;
        double Sisa;
        if (Total <= 100000){
            System.out.println("Anda tidak mendapatkan Diskon ");
        }else if ((Total >= 100000)&& (Total <= 200000)){
        HargaTotal = Total - (0.1*Total);
            System.out.println("Anda mendapatkan Diskon 10%");
        }else if ((Total >= 500000) && (Total <= 1000000)){
            HargaTotal = Total - (0.2 * Total);
            System.out.println("Anda mendapatkan diskon 20%");
        }else  if (Total >= 100000 ){
            HargaTotal = Total - (0.3 *Total);
            System.out.println("Anda mendapatkan diskon 30%");
        }else {
            HargaTotal = Total;
        }
        System.out.println("Total yang anda bayar : Rp." + HargaTotal);
    }
}
