
package pkg100day;

public class Day48 {
    public static void main(String[] args) {
        // Mendeklarasikan array dengan ukuran 5
        String[] namaHari = new String[7];

        // Mengisi array dengan nilai
        namaHari[0] = "Minggu";
        namaHari[1] = "Senin";
        namaHari[2] = "Selasa";
        namaHari[3] = "Rabu";
        namaHari[4] = "Kamis";
        namaHari[5] = "Jumat";
        namaHari[6] = "Sabtu";

        // Mencetak nilai array ke konsol
        System.out.println("Nama-nama Hari:");
        for (int i = 0; i < namaHari.length; i++) {
            System.out.println("Hari ke-" + (i + 1) + ": " + namaHari[i]);
        }
    }
}

    

