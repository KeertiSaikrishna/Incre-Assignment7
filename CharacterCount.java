import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class Charactercount {
    public static void main(String[] args) throws Exception {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        // map variable to store the character count
        String str = args[0];
        // accepting the file as string from command line argument
        FileReader fr = new FileReader(str);
        // creating file reader to read the file

        int i = 0;
        // creating a temporary variable for iteration
        char c = 'a';
        // creating a temporary character variable for character at each index

        while ((i = fr.read()) != -1) {
            c = (char) i;
            Integer val = map.get(c);
            if (val != null) {
                map.put(c, new Integer(val + 1));
            } else {
                map.put(c, 1);
            }
        }
        FileWriter fw = new FileWriter("two.txt");
        PrintWriter pw = new PrintWriter(fw);
        // creating the file writer and print writer objects to write the charater count on to another file

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            pw.printf("Key = %c , Value = %d\n", entry.getKey(), entry.getValue());
        }
        // writing the character count into a second file
        pw.close();
    }
}

}
