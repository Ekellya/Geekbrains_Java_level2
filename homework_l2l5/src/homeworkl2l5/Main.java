package homeworkl2l5;

public class Main {

    public static void main(String[] args) {
        WorkTime obj1 = new WorkTime();
        obj1.oneFlow();
        obj1.twoFlow();// в результате содержание этого массива будет отлиаться от двух других, так как при разделении массива значение i с середины массива (начала нового) будет считаться от 0;
        obj1.alterTwoFlow();

    }
}
