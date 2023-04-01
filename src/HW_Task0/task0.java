/*Task_0
public class Task_0 {
    // Посчитайте сколько драгоценных камней в куче обычных камней
// Пример:
// jewels = “aB”, stones = “aaaAbbbB”
// Результат в консоль ”a3B1”
    public static void main(String[] args) {

    }
    public String findJewelsInStones(String jewels, String stones) {
        return "";
    }
}*/

package HW_Task0;
import java.util.*;
public class task0 {
    public static void main(String[] args) {
        String jewels = "aB";
        String stones = "aaaAbbbB";
        System.out.println(findJewelsInStones(jewels, stones));
    }

    public static String findJewelsInStones(String jewels, String stones) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < stones.length(); i++) {
            char c = stones.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < jewels.length(); i++) {
            char c = jewels.charAt(i);
            if (map.containsKey(c)) {
                sb.append(c).append(map.get(c));
            }
        }
        return sb.toString();
    }
}
