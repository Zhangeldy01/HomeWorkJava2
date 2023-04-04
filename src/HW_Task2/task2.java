/*Task_2
На первой строке записывается натуральное число n - количество строчек в книге. Затем вводится n строк - строки книги.
потом вводится натуральное число m - количество продуктов, на которые у человека аллергия.
Потом вводится m строк - вида "продукт1 - продукт2", где продукт1 - продукт, на который у человека аллергия и продукт2 - продукт,
на который следует заменить продукт1. Гарантируется что любой продукт состоит из 1 слова. название продуктов написаны строчными буквами.
Гарантируется, что продукты, на которые нужно выполнить замену, не встречаются изначально в тексте.
        Выходные данные
Замените все продукты в поваренной книге Васи и выведите их построчно на экран. На окончания не обращайте внимание. ВАЖНО!!!
Если продукт, который следует заменить написан с большой буквы, то и замена тоже должна начинаться с большой буквы!
        Sample Input:
        2
Рецепт 1. Арахис 100гр, мороженое 200гр. Возьмите арахис и измельчите его. Посыпьте измельчённый арахис на мороженое.
Рецепт 2. Клубника 100гр, сгущенка 3кг. Смешать, есть) Радоваться жизни.
        3
        арахис - колбаса
        клубника - вишня
        сгущенка - молоко
        Sample Output:
Рецепт 1. Колбаса 100гр, мороженое 200гр. Возьмите колбаса и измельчите его. Посыпьте измельчённый колбаса на мороженое.
Рецепт 2. Вишня 100гр, молоко 3кг. Смешать, есть) Радоваться жизни.*/


package HW_Task2;
import java.util.*;
public class task2 {
    public static void main(String[] args) {
        int n = 2;
        int m = 3;

        String[] receipts   = new String[n];
        String[] components = new String[m];

        receipts[0] = "Рецепт 1. Арахис 100гр, мороженое 200гр. Возьмите арахис и измелчите его. Посыпьте измельчённый арахис на мороженое.";
        receipts[1] = "Рецепт 2. Клубника 100гр, сгущенка 3кг. Смешать, есть) Радоваться жизни.";

        components[0] = "арахис - колбаса";
        components[1] = "клубника - вишня";
        components[2] = "сгущенка - молоко";

        String target = "";
        String replmt = "";

        for (String component : components) {
            target = component.substring(0, component.indexOf(" -"));
            replmt = component.substring(component.indexOf("- ")+2);

            for (String receipt : receipts) {
                String newReceipt = receipt;
                String[] words = receipt.split("\\s");
                for (String word : words) {
                    StringBuilder replmnt2 = new StringBuilder(replmt);
                    if (word.compareToIgnoreCase(target) == 0) {
                        if (Character.isUpperCase(word.charAt(0))) replmnt2.setCharAt(0, Character.toUpperCase(replmnt2.charAt(0)));
                        newReceipt = newReceipt.replace(word, replmnt2);
                    }
                }
                receipts[java.util.Arrays.asList(receipts).indexOf(receipt)] = newReceipt;
            }
        }

        for (String receipt : receipts) {
            System.out.println(receipt);
        }
    }
}