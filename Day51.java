
package pkg100day;
import java.util.ArrayList;
public class Day50 {
    public static void main(String[] args) {
    ArrayList kantongAjaib = new ArrayList();

        kantongAjaib.add("Mobil");
        kantongAjaib.add(567);
        kantongAjaib.add("Kucing");
        kantongAjaib.add(1234343.5654);
        kantongAjaib.add(true);

        kantongAjaib.remove("Kucing");
        System.out.println(kantongAjaib);

        System.out.println("Kantong ajaib berisi "+ kantongAjaib.size() +" item");
    }
}


    

    
