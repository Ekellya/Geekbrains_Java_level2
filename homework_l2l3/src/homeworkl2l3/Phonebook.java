package homeworkl2l3;


/*2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров. В этот телефонный справочник с помощью метода add() можно добавлять записи. С помощью метода get() искать номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
Желательно как можно меньше добавлять своего, чего нет в задании (т.е. не надо в телефонную запись добавлять еще дополнительные поля (имя, отчество, адрес), делать взаимодействие с пользователем через консоль и т.д.). Консоль желательно не использовать (в том числе Scanner), тестировать просто из метода main() прописывая add() и get().*/

import java.util.HashMap;
import java.util.HashSet;

public class Phonebook {

    HashMap<String, HashSet<String>> phonebook;

    public Phonebook() {
        this.phonebook = new HashMap<>();
    }

    public void add(String name, String phone) {
        HashSet<String> number = phonebook.getOrDefault(name, new HashSet<>());//  метод для получения доступа к данным phonebook по ключу name (будет использовать уже имеющийся список), при отсутствии значения name среди ключей в phonebook он вернёт значение по-умолчанию, передаваемое вторым аргументом, то есть создаст новый список
        number.add(phone);
        phonebook.put(name, number);
    }

    public void getName(String name) {
        if (phonebook.containsKey(name)) { // containsKey(Object key) - проверяет, существует ли в массиве элемент с ключом key
            System.out.println(name + " " + phonebook.get(name)); // выводит value в виде массива
        } else {
            System.out.println("Имя не найдено");
        }
    }
}





