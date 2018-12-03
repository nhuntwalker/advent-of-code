/**
 * Solution
 */
import java.io.File;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Solution {

    public static void main(String args[]) throws Exception {
        File file = new File("../input.txt");
        Scanner sc = new Scanner(file).useDelimiter("\n");

        List<String> boxIds = new ArrayList<String>();

        while (sc.hasNext()) boxIds.add(sc.nextLine());

        boolean found = false;
        int diff = 0;
        int diffIdx = 0;
        String checkAgainst = "";

        for (int i = 0; i < boxIds.size(); i++) {
            if (found) break;

            for (int j = 0; j < boxIds.size(); j++) {
                if (i == j) continue;
                String id1 = boxIds.get(i);
                String id2 = boxIds.get(j);
                diff = 0;
                diffIdx = 0;
                for (int k = 0; k < id1.length(); k++) {
                    if (id1.charAt(k) != id2.charAt(k)) {
                        diff++;
                        diffIdx = k;
                    }
                }
                if (diff == 1) {
                    found = true;
                    checkAgainst = id1;
                    break;
                }
            }
        }

        System.out.println(checkAgainst);
    }}