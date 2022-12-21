import java.util.*;
public class Main {
    public static void main(String[] args) {
      int temp = romanToInt("XXXX");
        System.out.println(temp);
    }
    public static int romanToInt(String s) {
        Map<Character, Integer> mapping = new HashMap<>();
        mapping.put('I', 1);
        mapping.put('V', 5);
        mapping.put('X', 10);
        mapping.put('L', 50);
        mapping.put('C', 100);
        mapping.put('D', 500);
        mapping.put('M', 1000);

        int result = 0;
        int prev = Integer.MAX_VALUE;  // initialize prev to a large value
        for (char c : s.toCharArray()) {
            int curr = mapping.get(c);  // look up the integer value of the current Roman numeral
            if (curr > prev) {
                result -= 2 * prev;  // subtract the value of prev from result
            }
            result += curr;
            prev = curr;
        }
        return result;
    }

}