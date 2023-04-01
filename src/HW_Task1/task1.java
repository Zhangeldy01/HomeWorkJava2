/*
Task_1
public class Task_1 {
    // Вам дается строка S и целочисленный массив индексов int index[s.length].
// Напишите программу, которая перетасует символы в S таким образом,
// что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
//
// Пример: s = “cba”, index = [3,2,1] result “abc”
    public static void main(String[] args) {
    }
    public String shuffle(final String s, final int[] index){
        return "";
    }
}
*/

package HW_Task1;

public class task1 {
    public static void main(String[] args) {
        String s = "cba";
        int[] index = {2, 1, 0};
        String result = shuffle(s, index);
        System.out.println(result);
    }

    public static String shuffle(final String s, final int[] index) {
        char[] shuffled = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            shuffled[index[i]] = s.charAt(i);
        }
        return new String(shuffled);
    }

}
