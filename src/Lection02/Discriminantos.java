/*
Написать программу, вычисляющую корни квадратного уравнения вида ax ² + bx + c = 0, где a, b и c - вводимые пользователем из консоли данные.
    Учитывать только реальные корни (в случае отрицательного дискриминанта выводить сообщение пользователю).
    При решении создать и использовать следующие вынесенные функции:
    - функция isPositive, определяющая, является ли число положительным
    - функция isZero, определяющая, является ли число нулём
    - функция discriminant, вычисляющая дискриминант

 */
package Lection02;

public class Discriminantos {

    int a;
    int b;
    int c;
    double dis;

    public Discriminantos(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double discriminant (){
        if(a!=0){
            dis = (b*b) - 4 * a * c;
            System.out.println("Дискриминант квадратного уравнения: " + a + "x2+"+ b + "х+"+ c + "=0; равен: " + dis );
        }else {
            System.out.println("А не может быть равно 0");
        }
        return dis;
    }

    public void searchRoots(){
        if(dis < 0 ){
            System.out.println("У квадратного уравнения нету корней");
        }else if (dis ==0){
            double x = -b / (2*a);
            System.out.println("Так как дискриминант данного уравнения равен 0, то у уравнения 1 корень равный: " + x);
        }else if (dis > 0){
            double x1 = (-b - Math.sqrt(dis))/(2*a);
            double x2 = (-b + Math.sqrt(dis))/(2*a);
            System.out.println("Так как дискриминант данного уравнения больше 0, то у уравнения 2 корня: "+ x1 + " и " +x2);
        }
    }

    public static void main(String[] args) {
        Discriminantos discriminantos = new Discriminantos(1, 4, 4);
        discriminantos.discriminant();
        discriminantos.searchRoots();
        Discriminantos d1 = new Discriminantos(1, 8, 15);
        d1.discriminant();
        d1.searchRoots();


    }
}
