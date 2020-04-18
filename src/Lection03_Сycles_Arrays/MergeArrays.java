/*
Заданы 2 массива целых чисел произвольной длины.
Написать программу, создающую третий массив, представляющий собой слияние 2-х заданных.
Пример:
1-й массив: {1, 2, 3, 4, 5}
2-й массив: {5, 6, 7}
Результат: {1, 5, 2, 6, 3, 7, 4, 5}
 */
package Lection03_Сycles_Arrays;

import java.util.ArrayList;

public class MergeArrays {
    public static void main(String[] args) {
        int a[] = {1, 3, 5, 7, 9, 7, 77777, 77777777, 55};
        int b[] = {2, 4, 6};
        ArrayList<Integer> list = new ArrayList<>();

        int j = 0;
        int k = 0;
        for (int i = 0; i<100; i++){
            if (j < a.length){
                list.add(a[j]);
                j++;
            }
            if(k < b.length){
                list.add(b[k]);
                k++;
            }
        }
        for (Integer s: list) {
            System.out.print(s + " ");
        }


    }

}
