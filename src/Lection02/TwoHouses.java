/*
Имеются два дома размерами a на b и c на d. Размеры вводятся польователем с консоли.
Проверить, помещаются ли эти дома на участке размерами e на f.
Стороны домов - параллельны сторонам участка, в остальном размещение может быть любым.
 */
package Lection02;

public class TwoHouses {

    public void validSizeofHouses(int a, int b, int c, int d, int e, int f){

        if((((a+c)>=e) && (b>=f || d>=f)) || (((b+c)>=e) && (a>=f || d>=f)) || (((a+d)>=e) && (b>=f || c>=f)) || (((b+d)>=e) && (a>=f || c>=f)) ||
                (((a+c)>=f) && (b>=e || d>=e)) || (((b+c)>=f) && (a>=e || d>=e)) || (((a+d)>=f) && (b>=e || c>=e)) || (((b+d)>=f) && (a>=e || c>=e))){
            System.out.println("Дом не поместиться на участок!!!");
        }else {
            System.out.println("Дом поместиться на участок!!!");
        }
    }

    public static void main(String[] args) {
        TwoHouses twoHouses = new TwoHouses();
        twoHouses.validSizeofHouses(1, 1, 2, 2, 100, 100);
        twoHouses.validSizeofHouses(15, 1, 2, 2, 12, 100);
        twoHouses.validSizeofHouses(9, 1, 2, 2, 8, 100);
        twoHouses.validSizeofHouses(41, 22, 11, 22, 1, 4);
        twoHouses.validSizeofHouses(10, 220, 220, 220, 430, 40);
    }


}
