/*
Сгенерировать массив вещественных чисел из 1000 элементов. 
Для генерации использовать Random random = new Random(); random.nextDouble().
Отсортировать массив, найти среднее значение, максимальное и минимальное.

 */
package Lection03_Сycles_Arrays;

import java.util.Random;

public class GenerateArrayOf1000Elements {

    public static void main(String[] args) {

        Random random = new Random();
        int array[] = new int[1000];

        for (int i = 0; i<array.length; i++){
            array[i] = random.nextInt();
        }

        for (int i: array) { System.out.println(i);} // Print array.

        int min = array[0];
        for (int i = 1; i < array.length; i++){
            if (min > array[i]){
                min = array[i];
            }
        }

        int max= array[0];
        for (int i = 1; i < array.length; i++){
            if (max < array[i]){
                max = array[i];
            }
        }
        System.out.println("Minimal: " + min +". Maximal: " + max);

        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        System.out.println("Среднее значение: " + sum/array.length);



    }
}
