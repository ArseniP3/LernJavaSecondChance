/*
Напишите программу, заносящую в массив первые 100 натуральных чисел, делящихся на 13 или на 17, и печатающую его.
 */
package Lection03_Сycles_Arrays;

public class ArrayWith1317 {
    public static void main(String[] args) {
        int array [] = new int [100];
        int count = 0;
        for (int i = 13; i < 1_000_000; i++ ){
            if (i % 13 == 0 || i % 17 == 0){
                array[count] = i;
                count++;
                if(count == array.length){
                    break;
                }
            }
        }
        int countArr = 1;
        for (int j: array) {
            System.out.println(countArr + " - " + j );
            countArr++;

        }
    }
}
