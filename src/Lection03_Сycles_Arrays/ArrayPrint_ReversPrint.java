/*
Напишите программу, которая печатает массив сначала в обычном порядке, затем в обратном.
 */
package Lection03_Сycles_Arrays;

public class ArrayPrint_ReversPrint {
    public static void main(String[] args) {

        int array[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i: array) {
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println("--------------------------");

        for (int i = array.length-1; i>= 0; i-- ){
            System.out.print(array[i] + " ");
        }
    }
}
