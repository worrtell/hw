package asd.cw._20_03;

public class Main {
    public static void swap(int i, int j, int[][] array) {
        int t1 = array[i][0];
        int t2 = array[i][1];
        array[i][0] = array[j][0];
        array[j][0] = t1;
        array[i][1] = array[j][1];
        array[j][1] = t2;
    }
    public static void qsort(int l, int r, int[][] array) {
        if (l>=r) {
            return;
        }
        int i = l;
        int j = r-1;
        int pivot = array[r][0];
        while (i < j) {
            while (array[i][0] < pivot && i < j) {
                i++;
            }
            while (array[j][0] > pivot && i < j) {
                j--;
            }
            swap(i,j,array);
        }
        if (array[j][0] > array[r][0]) {
            swap(r,j,array);
        }
        qsort(l,j-1,array);
        qsort(j+1,r,array);
    }
    public static void print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i][0] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n = 4;
        int[][] array = {{1,2},{3,10},{4,7},{8,9}}; //n:2 n - кол-во отрезков
        int[][] newArray = new int[2*n][2]; //2*n:2
        for (int i = 0; i < 2*n; i ++) {
            if (i%2 == 0) {
                newArray[i][0] = array[i/2][0];
                newArray[i][1] = 1;
            }
            else {
                newArray[i][0] = array[i/2][1];
                newArray[i][1] = -1;
            }
        }
        print(newArray);
        qsort(0, newArray.length-1, newArray);
        print(newArray);

        int ans = 0;
        int maximum = 0;
        for (int i = 0; i < newArray.length; i++) {
            ans += newArray[i][1];
            maximum = Math.max(ans,maximum);
        }
        System.out.println(maximum);
    }
}
