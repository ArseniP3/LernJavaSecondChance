package Lection03_Сycles_Arrays;

public class ArrayEquals {

    public void equalss(int array[][], int a, int b, int c, int d){
        if(array[a][b] == array[c][d]){
            System.out.println("Два выбранных эллемента массива равны");

        }else {
            System.out.println("Два выбранных эллемента массива не равны");
        }

    }


    public static void main(String[] args) {
        ArrayEquals arrayEquals = new ArrayEquals();
        int[][] ar = {{12, 13, 11, 11}, {12, 22, 111, 21}};
        System.out.println(ar[0][1]);
        arrayEquals.equalss(ar, 0,0,1,0);
        arrayEquals.equalss(ar, 0, 1, 0, 2);
    }
}
