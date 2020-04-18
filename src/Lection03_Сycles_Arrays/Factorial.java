package Lection03_Сycles_Arrays;

public class Factorial {

    public static void factorialFor(int a){
        long sum = 1;
        for (int i = 1; i <= a; i++){
            sum *=i;
        }
        System.out.println("Factorial number " + a + " is " + sum);
    }

    public static void factorialWhile(int a){
        int i = 1;
        long sum = 1;
        while (i<=a){
            sum*=i;
            i++;
        }
        System.out.println("Factorial number " + a + " is " + sum);
    }

    public static void main(String[] args) {
        factorialFor(5);
        factorialFor(10);
        System.out.println("==========================");
        factorialWhile(5);
        factorialWhile(10);
    }
}
