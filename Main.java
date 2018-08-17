import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        FileReader fr = new FileReader(str);

        int i=0;
        char c='a';

        while ((i=fr.read()) != -1){
            c = (char)i;
            Integer val = mp.get(c);
            if (val != null) {
                mp.put(c, new Integer(val + 1));
            }
            else {
                mp.put(c, 1);
            }
        }
        FileWriter fw = new FileWriter("two.txt");
        PrintWriter pw = new PrintWriter(fw);

        for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
            pw.printf("Key = %c , Value = %d\n",entry.getKey(),entry.getValue());
        }
        pw.close();
    }
}