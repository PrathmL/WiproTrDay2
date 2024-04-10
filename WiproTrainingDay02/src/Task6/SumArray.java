package Task6;

public class SumArray {
	static int findSum(int[] arr, int N) {
        if (N <= 0)
            return 0;
        return findSum(arr, N - 1) + arr[N - 1];
    }

    public static void main(String[] args) {
        int[] arr = {21,45,90,78};
        int N = arr.length;
        System.out.println("Sum of array elements: " + findSum(arr, N));
    }
}
