package F10;

import java.util.Arrays;

public class mauntainArray {

    public static void main(String[] args) {
        int input1[] = {0, 2, 5, 3, 1};
        int input2[] = {5, 2, 7, 1, 4};

        boolean result1 = mountainArrayControl(input1);
        boolean result2 = mountainArrayControl(input2);

        if (result1) {
            System.out.println(Arrays.toString(input1) + " => Mountain Arraydir.");
        } else {
            System.out.println(Arrays.toString(input1) + " => Mountain Array Degildir.");
        }

        if (result2) {
            System.out.println(Arrays.toString(input2) + " => Mountain Arraydir.");
        } else {
            System.out.println(Arrays.toString(input2) + " => Mountain Array Degildir.");
        }
    }

    public static boolean mountainArrayControl(int[] arr) {
        int max = arr[0];
        int index = 0;
        boolean result = true;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }

        for (int i = 0; i < index; i++) {
            if (arr[i] < arr[i + 1]) {
                continue;
            } else {
                result = false;
                break;
            }
        }
        if (result) {
            for (int i = index; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    continue;
                } else {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
