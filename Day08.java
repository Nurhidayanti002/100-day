
package isc;

import java.util.Scanner;

public class Day08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner (System.in);
System.out.println("masukkan angka pertama:");
int angka1 =scan.nextInt();
Scanner scan2 = new Scanner (System.in);
System.out.println("masukkan angka ke dua:");
int angka2 = scan2.nextInt();
int hasil = angka1 - angka2;
System.out.println("hasil= "+ hasil);
hasil= angka1 * angka2;
System.out.println("hasil= " + hasil);
hasil = angka1 / angka2;
System.out.println("hasil= "+hasil);
hasil = angka1 % angka2 ;
System.out.println("hasil= "+ hasil);
    }
    
}
