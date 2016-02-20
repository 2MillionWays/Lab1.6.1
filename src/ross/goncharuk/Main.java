package ross.goncharuk;


import java.util.Arrays;

public class Main {
    static public void main(String[] args) {

        int[] arr1 = new int[15];
        int num = arr1.length;

        int arrayIndex = 0;
        for (int i = 2; i <= 30; i += 2) {
            arr1[arrayIndex] = i;
            arrayIndex++;
        }
        System.out.println(Arrays.toString(arr1));

    }
}
