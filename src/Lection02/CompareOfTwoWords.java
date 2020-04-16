/*
Запросить у пользователя 2 слова. Если они одинаковы - вывести "Отлично! Слова одинаковы".
Если они отличаются лишь регистром - "Хорошо. Почти одинаковы"
Если они отличаются, но одной длины - "Ну, хотя бы они одной длины"
Использовать методы класса String: equals(String string), equalsIgnoreCase(String string), length()
 */
package Lection02;

import java.util.Scanner;

public class CompareOfTwoWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();

        if(word1.equals(word2)){
            System.out.println("Excellent words are the same");
        }else if (word1.equalsIgnoreCase(word2)){
            System.out.println("Ok, thr words are almost the same");
        }else if (word1.length() == word2.length()){
            System.out.println("They are same length");
        }else {
            System.out.println("Words are various");
        }
    }
}
