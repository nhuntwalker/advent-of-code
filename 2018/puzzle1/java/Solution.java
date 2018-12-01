/**
 * Solution
 */
import java.io.File;
import java.util.Scanner;

public class Solution {

    public static void main(String args[]) throws Exception {
        File file = new File("../input.txt");
        Scanner sc = new Scanner(file).useDelimiter("\n");
        int total = 0;

        while (sc.hasNextLine()) {
            int number = Integer.parseInt(sc.nextLine());
            total += number;
        }

        System.out.println(total);
    }
}