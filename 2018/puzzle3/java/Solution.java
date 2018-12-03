/**
 * Solution
 */
import java.io.File;
import java.util.Scanner;
import java.util.HashMap;

public class Solution {

    public static void main (String args[]) throws Exception {
        File file = new File("../input.txt");
        Scanner sc = new Scanner(file).useDelimiter("\n");
        
        int twoCt = 0;
        int threeCt = 0;

        while (sc.hasNext()) {
            String line = sc.nextLine();
            HashMap<Character, Integer> counts = new HashMap<Character, Integer>();

            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if (counts.get(c) == null) counts.put(c, 0);
                int currCt = counts.get(c);
                counts.put(c, currCt + 1);
            }

            if (counts.containsValue(2)) twoCt++;
            if (counts.containsValue(3)) threeCt++;
        }

        System.out.println(twoCt * threeCt);
    }
}