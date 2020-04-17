/*
Написать программу, которая считывает год, введённый пользователем, и определяет, является ли этот год високосным.
Год считается високосным, если он делится без остатка на 4. Однако, если год также делится на 100, то этот год не
високосный, за исключением годов, делящихся на 400.

Например:
    1992 - високосный
    1900 - не високосный
    2000 - високосный

 */
package Lection02;

public class WhatYear {

    static void leapOrNot(int year){
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 !=0))){
            System.out.println("Year " + year + " is leap.");
        }else {
            System.out.println("Year " + year + " is not leap.");
        }
    }

    public static void main(String[] args) {
        leapOrNot(1600);
        leapOrNot(1700);
        leapOrNot(1624);
        leapOrNot(1992);
        leapOrNot(1900);
        leapOrNot(2000);
    }
}
