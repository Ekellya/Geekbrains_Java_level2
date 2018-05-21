package homeworkl2l3;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        WordMass.uniqueWord();
        WordMass.hmRepeat();

        Phonebook phonebook = new Phonebook();
        phonebook.add("Алиев", "2334678012");
        phonebook.add("Алиев", "2384678012");
        phonebook.add("Малинка", "2344678012");
        phonebook.add("Кудинов", "2334698012");
        phonebook.add("Кудинов", "2334678312");
        phonebook.add("Алиев", "2335578012");

        phonebook.getName("Алиев");
    }
}
