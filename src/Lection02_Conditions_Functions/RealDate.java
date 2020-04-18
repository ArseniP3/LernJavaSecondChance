/*
Написать программу, которая считывает число, месяц и год, введённые пользователем в виде трёх целых чисел.
Программа должна определять, является ли введённая дата реальной и выводить результат.

Использовать следующую информацию:
Январь, март, май, июль, август, октябрь, декабрь - 31 день
Апрель, июнь, сентябрь, ноябрь - 30 дней
Февраль - 28 дней в обычный год, 29 дней в високосный
 */
package Lection02_Conditions_Functions;

public class RealDate {

    public Boolean realDateOrNot (int day, int month, int year){
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){

            if (day >=1 && day <= 31 && year >=0){
                System.out.println("Date: " + day + "." + month + "." + year + " is correct.");
                return true;
            }else {
                System.out.println("Date: " + day + "." + month + "." + year + " not correct.");
                return false;
            }

        }else if (month == 4 || month == 6 || month == 9 || month == 11){

            if (day >=1 && day <= 30 && year >=0){
                System.out.println("Date: " + day + "." + month + "." + year + " is correct.");
                return true;
            }else {
                System.out.println("Date: " + day + "." + month + "." + year + " not correct.");
                return false;
            }


        }else if (month == 2){
            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 !=0))){

                if (day >=1 && day <= 29 && year >=0){
                    System.out.println("Date: " + day + "." + month + "." + year + " is correct.");
                    return true;
                }else {
                    System.out.println("Date: " + day + "." + month + "." + year + " not correct.");
                    return false;
                }

            }else {

                if (day >=1 && day <= 28 && year >=0){
                    System.out.println("Date: " + day + "." + month + "." + year + " is correct.");
                    return true;
                }else {
                    System.out.println("Date: " + day + "." + month + "." + year + " not correct.");
                    return false;
                }
            }

        }else {
            System.out.println("You enter incorrect date");
            return false;
        }
    }

    public static void main(String[] args) {

        RealDate real = new RealDate();
        real.realDateOrNot(29, 2, 2001);
        real.realDateOrNot(30,11,3222);
    }
}
