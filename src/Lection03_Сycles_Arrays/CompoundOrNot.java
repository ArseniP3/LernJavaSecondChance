/*
Имеется целое число, определить является ли это число простым, т.е. делится без остатка только на 1 и себя.
 */
package Lection03_Сycles_Arrays;

public class CompoundOrNot {

    public static void compoundOrNot(int a){
        for (int i = 2; i < a; i++){
            if (a % i == 0){
                System.out.println("Number: " + a + " is compound");
                return;
            }
        }
        System.out.println("Number: " + a + " not compound");
    }

    public static void main(String[] args) {
        compoundOrNot(2);
        compoundOrNot(4);
        compoundOrNot(3);
        compoundOrNot(157);
    }
}
