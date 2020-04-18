/*
Создать массив из 3 случайных целых чисел из отрезка [10;99], вывести его на экран в строку.
Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.
 */
package Lection03_Сycles_Arrays;

public class ArrayOFThreeNumbers {
    public static void main(String[] args) {
        int ar[] = new int [3];
        for (int i = 0; i < ar.length; i++){
            ar[i] = (int) (Math.random()*100-10)+10;
            System.out.print(ar[i] + " ");
        }
        System.out.println();
        if(ar[0] < ar[1] & ar[1] < ar[2]){
            System.out.println("Массив является строго возрастающей прогрессией.");
        }else {
            System.out.println("Нет. Массив не является строго возрастающей прогрессией");
        }
    }
}
