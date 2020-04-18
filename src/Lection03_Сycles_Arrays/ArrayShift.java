/*
Напишите программу, которая циклически сдвигает элементы массива вправо на одну позицию, и печатает результат.
Цикличность означает, что последний элемент массива становится самым первым его элементом.
 */
package Lection03_Сycles_Arrays;

public class ArrayShift {

    public static void main(String[] args) {
        int ar[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int ar1[] = new int[ar.length];

        int j = 1;

        for (int i = 0; i < ar.length; i++){
            if (j == ar.length){
                ar1[0] = ar[ar.length-1];
            }else {
                ar1[j] = ar[i];
            }
            j++;
        }

        for (int i: ar1) {
            System.out.print(i+ " ");

        }
    }
}