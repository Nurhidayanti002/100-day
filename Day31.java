
package pkg100day;
import java.util.Arrays;
public class Day31 {
    public static void main(String[] args) {
        String  Kalimat = "Di mana kaki berpijak di situ langit di junjung";
        String [] ArraySplit = Kalimat.split(("\\s"));
        System.out.println(Arrays.toString(ArraySplit));
        for (String s :ArraySplit ){
            System.out.println(s);
        }
    }
}
