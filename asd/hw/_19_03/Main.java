package asd.hw._19_03;

public class Main {

    public static void mergeSort(Vector[] array) {
        int length = array.length;

        if (length == 1) {
            return;
        }

        Vector[] arrayL = new Vector[length/2];
        Vector[] arrayR = new Vector[length - length/2];
        for (int i = 0; i < length; i++) {
            if (i < length/2) {
                arrayL[i] = array[i];
            }
            else {
                arrayR[length-i-1] = array[i];
            }
        }
        mergeSort(arrayL);
        mergeSort(arrayR);
        merge(arrayL,arrayR, array);
    }
    public static void merge(Vector[] arrayL, Vector[] arrayR, Vector[] array) {
        int i = 0, j = 0;
        int p = 0;
        int sizeL = arrayL.length;
        int sizeR = arrayR.length;

        while (i < sizeL && j < sizeR) {
            if (arrayL[i].biggerThan(arrayR[j])) {
                array[p] = arrayR[j];
                ++ j;
            }
            else {
                array[p] = arrayL[i];
                ++ i;
            }
            ++ p;
        }

        while (i < sizeL) {
            array[p] = arrayL[i];
            ++ i;
            ++ p;
        }
        while (j < sizeR) {
            array[p] = arrayR[j];
            ++ j;
            ++ p;
        }
    }
    public static void printArray(Vector[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i].print();
        }
    }
    public static void main(String[] args) {
        Vector a = new Vector("1,2,3");
        Vector b = new Vector("134");
        Vector c = new Vector("58,2");

        Vector[] v = new Vector[]{a,b,c};
        mergeSort(v);
        printArray(v);
    }
}
