/*
Имеется целое число, вводимое пользователем с консоли. Это число - сумма денег в рублях.
Вывести это число, добавив к нему слово "рубль" в правильном падеже ("рубль", "рублей", "рубля").
a. Использовать конструкцию if-else.
b. Модифицировать в switch в отдельном файле.
 */
package Lection02;
public class Ruble1 {

    static void ifConstruct(int rub){
        if (rub>= 0){
            if (rub == 0){
                System.out.println(rub + " рублей.");
            }else if (rub == 1){
                System.out.println(rub + " рубль.");
            }else if (2 <= rub && rub <=4){
                System.out.println(rub + " рубля.");
            }else if (rub >= 5){
                System.out.println(rub + " рублей");
            }
        }else {
            System.out.println("You entered an invalid value");
        }

    }

    static void switchConstruct(int rub){
        switch (rub){
            case 0:
                System.out.println(rub + " рублей.");
                break;
            case 1:
                System.out.println(rub + " рубль.");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println(rub + " рубля.");
                break;
            default:
                System.out.println(rub + " рублей");
        }
    }

    public static void main(String[] args) {
        ifConstruct(118);
        switchConstruct(55);
    }
}
