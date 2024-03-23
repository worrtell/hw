package asd.hw._12_03;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numbers = new int[10];
        int i = 0;
        while (s.hasNext()) {
            String temp = s.next();
            if (temp.equals("+")) {
                -- i;
                numbers[i-1] += numbers[i];
            }
            else if (temp.equals("-")) {
                -- i;
                numbers[i-1] -= numbers[i];
            }
            else if (temp.equals("*")) {
                -- i;
                numbers[i-1] *= numbers[i];
            }
            else if (temp.equals("a")) {
                break;
            }
            else {
                numbers[i] = Integer.parseInt(temp);
                ++ i;
            }
        }
        System.out.println(numbers[0]);
    }
}
