
package pkg100day;
public class Day62 {
   
    public static void main(String[] args) {
        int totalGanjil = 0 ;
        int jumlahGanjil = 0 ;
        
        for (int i = 1; i <= 100 ; i +=2 ){
            totalGanjil += i ;
            jumlahGanjil++;
            System.out.println(i);
            }
           double rata = totalGanjil / jumlahGanjil;
            System.out.println("Rata rata bilangan ganjil dari 1-100 adalah = " + rata);
           
    }
}

    

