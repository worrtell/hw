package asd.hw._19_03;

import java.sql.SQLOutput;
import java.util.Stack;

public class Main2 {

    public static String merge(String L, String R) {
        String res = "";
        int i = 0, j = 0;
        int sizeL = L.length();
        int sizeR = R.length();

        while (i < sizeL && j < sizeR) {
            if (L.charAt(i) > R.charAt(j)) {
                res += R.charAt(j);
                ++ j;
            }
            else {
                res += L.charAt(i);
                ++ i;
            }
        }

        while (i < sizeL) {
            res += L.charAt(i);
            ++ i;
        }
        while (j < sizeR) {
            res += R.charAt(j);
            ++ j;
        }
        return res;
    }

    public static void combine(String[] mas) {
        int length = mas.length;
        if (length == 1) {
            return;
        }
        String[] temp = new String[length/2 + length%2];
        for (int i = 0; i < length/2; i++) {
            temp[i] = merge(mas[i],mas[i+length/2]);
        }
        if (length%2 == 1) {
            temp[length/2] = mas[length-1];
        }
        System.out.println(temp[0]);
        combine(temp);
    }
    public static void main(String[] args) {
        String[] mas = new String[]{"1234","1358","12","78","67"};
        combine(mas);
    }
}
