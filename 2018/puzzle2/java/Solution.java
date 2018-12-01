
/**
 * Solution
 */
import java.io.File;
import java.util.Scanner;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;

public class Solution {

    public static void main(String args[]) throws Exception {
        File file = new File("../input.txt");
        Scanner sc = new Scanner(file).useDelimiter("\n");
        List<Integer> numbers = new ArrayList<>();

        while (sc.hasNext()) {
            String line = sc.nextLine();
            try {
                int number = Integer.parseInt(line);
                numbers.add(number);
            } catch (Exception e) {}
        }

        int idx = 0;
        int currFreq = 0;
        Set<Integer> pastFreqs = new HashSet<Integer>();

        while (true) {
            if (idx == numbers.size()) idx = 0;
            if (pastFreqs.contains(currFreq)) break;
            pastFreqs.add(currFreq);
            currFreq += numbers.get(idx);
            idx++;
        }

        System.out.println(currFreq);
    }
}