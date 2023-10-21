package F07;

import java.util.Arrays;

public class Main {
    static int[] arr = {1, 2, 3, 4, 5};

    public static void main(String[] args) {
        System.out.println("Arr : " + Arrays.toString(arr));

        artirDizi(arr);

        System.out.println("Yeni Arr : " + Arrays.toString(arr));
    }

    public static int[] artirDizi(int[] arr) {
        int[] yeniArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 2;
        }

        return yeniArr;
    }
}
