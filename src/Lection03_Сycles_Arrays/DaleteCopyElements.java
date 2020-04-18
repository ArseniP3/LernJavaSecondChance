/*
Написать программу, удаляющую все повторяющиеся целые числа из массива и печатающую результат.
 */
package Lection03_Сycles_Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DaleteCopyElements {
    public static void main(String[] args) {
        Integer ar[] = {1, 2, 2, 3, 3, 5, 8, 66, 66, 14, 75, 11, 11};
        List<Integer> list= Arrays.asList(ar);
        Set<Integer> set = new HashSet<>();
        set.addAll(list);
        for (Object j: set) {
            System.out.println(j);
        }
    }
}
