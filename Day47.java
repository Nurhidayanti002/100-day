
package pkg100day;
import java.util.Scanner;
public class Day47 {
    public static void main(String[] args) {
        System.out.println("Menghitung gaji/jam seorang karyawan UMR, jika iya membayar pajak sebesar Rp 200.000 lalu tampilkan lagi sisa Gajinya");
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Gaji/Bulan: ");
        double Gaji = sc.nextDouble();
        System.out.print("Total jam kerja/bulan: ");
        int JamKerja = sc.nextInt();
        double Total = Gaji / JamKerja ;
        System.out.println("Gaji/jam seorang pekerja : "+ Total + "/Jam");
        double Sisa = Gaji - 200.000;
        System.out.println("Sisa gaji kariawan : " + Sisa);
    }
}
