package homeworkl2l5;

import java.sql.Array;
import java.util.Arrays;

public class WorkTime {
    static final int size = 100000000;
    static final int h = size / 2;
    float[] arr = new float[size];

    private float[] arrayFilling(int x) {
        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }
        return arr;
    }
// Считает время при работе с одним потоком
    public void oneFlow() {
        arrayFilling(1);
        long a = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("Время oneFlow = " + (System.currentTimeMillis() - a));
//        System.out.println(Arrays.toString(arr));
    }
// Считает время при работе с двумя потоками с разбивкой на два новых массива
    public void twoFlow() {
        arrayFilling(1);
        long a = System.currentTimeMillis();
        synchronized (arr) {
            float[] a1 = new float[h];
            float[] a2 = new float[h];
            System.arraycopy(arr, 0, a1, 0, h);
            System.arraycopy(arr, h, a2, 0, h);
            go2flow(a1, a2);
            System.arraycopy(a1, 0, arr, 0, h);
            System.arraycopy(a2, 0, arr, h, h);
        }
        System.out.println("Время twoFlow = " + (System.currentTimeMillis() - a));
//        System.out.println(Arrays.toString(arr));
    }
    // Считает время при работе с двумя потоками без разбивки на два новых массива
    public void alterTwoFlow() {
        arrayFilling(1);
        long a = System.currentTimeMillis();
        go2flow(arr, h, size);
        System.out.println("Время alterTwoFlow = " + (System.currentTimeMillis() - a));
//        System.out.println(Arrays.toString(arr));
    }

    private void go2flow(float[] a1, float[] a2) {
       Thread arr1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < h; i++) {
                    a1[i] = (float) (a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });
        Thread arr2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < h; i++) {
                    a2[i] = (float) (a2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });
                arr1.start();
                arr2.start();
        try {
            arr1.join();
            arr2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void go2flow(float[] a1, int startNum2, int endNum) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < startNum2; i++) {
                    a1[i] = (float) (a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = startNum2; i < endNum; i++) {
                    a1[i] = (float) (a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        }).start();
    }
}
