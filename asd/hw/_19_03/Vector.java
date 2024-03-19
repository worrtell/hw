package asd.hw._19_03;

public class Vector {
    int[] array;
    String vector;
    String temp;
    public Vector(String vector) {
        this.vector = vector;
        temp = vector;
        array = new int[this.numberOf()];
        for (int i = 0; i < this.numberOf(); i++) {
            array[i] = this.part();
        }
    }

    public int numberOf() {
        int cnt = 0;
        for (int i = 0; i < this.vector.length(); i++) {
            if (this.vector.charAt(i) == ',') {
                cnt += 1;
            }
        }
        return cnt+1;
    }

    public int part() {
        String s = "";
        int i = 0;
        while(i < temp.length() && temp.charAt(i) != ',') {
            s += temp.charAt(i);
            i++;
        }
        if (i == temp.length()) {
            return Integer.parseInt(temp);
        }
        this.temp = temp.substring(i+1);
        return Integer.parseInt(s);
    }

    public boolean biggerThan(Vector a) {
        boolean flag = true;
        boolean equal = true;
        for (int i = 0; i < Math.min(this.array.length, a.array.length); i++) {
            if (this.array[i] < a.array[i]) {
                flag = false;
            }
            if (this.array[i] != a.array[i]) {
                equal = false;
            }
        }
        if (equal & (this.array.length < a.array.length)) {
            flag = false;
        }
        return flag;
    }

    public void print() {
        System.out.println(this.vector);
    }
}
