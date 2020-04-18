/*
Написать функцию linearize, которая принимает в качестве параметра двумерный массив
и возвращает одномерный массив со всеми элементами двумерного.
 */
package Lection03_Сycles_Arrays;

public class ArrayConversion {


    public void linearize(int array[][]){
        int array1[] = new int[array[0].length +array[1].length];
        int s = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++){
                array1[s] = array[i][j];
                s++;
            }
        }
        for (int x:array1) {
            System.out.println(x + " ");
        }

    }
    public static void main(String[] args) {
        int arr[][] = new int[][]    {{1, 2, 3, 4, 7, 77, 98, 4},
                { 1, 22, 22, 5, 44, 78, 78, 4, 11, 1, 12}};


        ArrayConversion arrayConversion = new ArrayConversion();
        arrayConversion.linearize(arr);

    }

}
