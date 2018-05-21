package homeworkl2l3;

/*1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем). Посчитать сколько раз встречается каждое слово.
 */

import java.util.HashMap;
import java.util.HashSet;

public class WordMass {

    static String[] word = {"белый", "зеленый", "синий", "белый"};

    public static void uniqueWord() {
        HashSet<String> wordList = new HashSet<>();
        for (String o : word) {
            wordList.add(o);
        }
        System.out.println(wordList);
    }

    public static void hmRepeat() {
        HashMap<String, Integer> wordR = new HashMap<>();
        for (String o : word) {
            wordR.put(o, wordR.getOrDefault(o, 0) + 1);
        }
        System.out.println(wordR);
    }

}


//                String[] arr = {"Abc","Bcd","Abc","Tre"};
//
//