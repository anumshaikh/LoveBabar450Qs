package Arrays;

public class Pgm_10_Min_jump_array {
    public static int findMinJumpArray(int arr[]) {
        int jump = 1, maxReach = arr[0], step = arr[0];

        if (arr.length <= 1)
            return 0; // only 1 element reached
        if (arr[0] == 0)
            return -1; // cant jump from first position

        for (int i = 1; i < arr.length; i++) {
            if (i == arr.length - 1)
                return jump;

            maxReach = Math.max(maxReach, i + arr[i]);

            step--;

            if (step == 0) {
                jump++;
                if (maxReach <= i)
                    return -1;
                step = maxReach - i;

            }

        }

        return -1;

    }

    public static void main(String[] args) {
        int arr[] = new int[] { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
        System.out.println(findMinJumpArray(arr));

    }
}
