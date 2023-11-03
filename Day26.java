
package pkg100day;

public class Day26 {
    public static void main(String[] args) {
        String [][] Array ={
            {"Tata", "UNM", "Maros","PMM3 Unida",},
            {"Riska", "UNM", "Sidrap","PMM3 Unida"},
            {"Kia", "UNISMUH", "Jenneponto","PMM3 Unida"}
    };
        for (int i = 0 ; i < Array.length; i++){
            System.out.println("Tampilankan Data"  );
            System.out.println("Nama        :" + Array[i][0] );
            System.out.println("Universitas :" + Array[i][1] );
            System.out.println("Alamat      :" + Array[i][2] );
            System.out.println("Mahasiswa   :" + Array[i][3] ); 
            System.out.println("-------------------------------" );
        }
    }
 
}
