/*
Имеются три числа - день, месяц и год, вводимые пользователем с консоли.
Вывести дату следующего дня в формате "День.Месяц.Год".
Учесть переход на следующий месяц, а также следующий год.
Форматирование строки "День.Месяц.Год" вынести в отдельную функцию.

 */
package Lection02_Conditions_Functions;

import java.time.LocalDate;

public class NextDay {
    static LocalDate plusDay (int day, int month, int year, int plusDa){
        LocalDate date = LocalDate.of(year, month, day);
        date = date.plusDays(plusDa);
        return date;
    }

    static void printDate(int day, int month, int year, int plusDa){
        int day1 = plusDay(day, month, year, plusDa).getDayOfMonth();
        int month1 = plusDay(day, month, year, plusDa).getMonthValue();
        int year1 = plusDay(day, month, year, plusDa).getYear();
        System.out.println("Original date + " + plusDa + " days is: " + day1 + "." + month1 + "." + year1);
    }


    public static void main(String[] args) {
        printDate(28, 02, 2020, 45);


    }
}
