package Task7;

public class BruteForceSortDemo {
	    public static void main(String[] args) {
	        int[] myArray = {90,15,48,57}; // Replace with your own array
	        
	        // Sort the array using the brute force approach (bubble sort)
	        bruteForceSort(myArray);
	        
	        // Print the sorted array
	        System.out.println("\nSorted array:");
	        for (int num : myArray) {
	            System.out.print(num + " ");
	        }
	    }
	    
	    public static void bruteForceSort(int[] arr) {
	        int n = arr.length;
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - 1 - i; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    // Swap elements
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }
	    }
	


}
