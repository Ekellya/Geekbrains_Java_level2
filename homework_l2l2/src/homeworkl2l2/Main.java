package homeworkl2l2;

/*1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4, при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.
3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и MyArrayDataException, и вывести результат расчета.
*/

public class Main {
    final static int needMassLength = 4;

    private static int sumAllStrings(String[][] str) throws MySizeArrayException, MyArrayDataException {
        int sum = 0;
        if (str.length != needMassLength) {
            throw new MySizeArrayException("Общая длина двумерного массива не равна " + needMassLength);
        }
        for (int i = 0; i < str.length; i++) {
            if (str[i].length != needMassLength) {
                throw new MySizeArrayException("Длина массива с индексом " + "[" + i + "] не равна " + needMassLength);
            }
            for (int j = 0; j < str[i].length; j++) {
                try {
                    sum += Integer.parseInt(str[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Ячейку массива с индексом [" + i + "] " + "[" + j + "] не удалось преобразовать в число");
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String[][] mass = {{"0", "1", "2", "2"}, {"0", "1", "2", "3"}, {"0", "1", "2", "3"}, {"1", "2", "3"}};
        int sumResult = 0;
        try {
            try {
                sumResult = sumAllStrings(mass);
            } catch (MySizeArrayException e) {
                e.printStackTrace();
            }
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
        System.out.println("Сумма элементов равна " + sumResult);
    }
}



