package Task4;

public class CreatnIniArraynRevit {
	 static void reverse(int[] arr, int n) {
	        int[] reversedArray = new int[n];
	        int j = n;
	        for (int i = 0; i < n; i++) {
	            reversedArray[j - 1] = arr[i];
	            j = j - 1;
	        }
	        System.out.println("Reversed array is:");
	        for (int k = 0; k < n; k++) {
	            System.out.println(reversedArray[k]);
	        }
	    }
	public static void main( String args[] ) {  
		
        //declaration of an array  
        int [] numbers;  
          
        //initializing array after declaration  
        numbers = new int[]{80,81,82,83,84};  
      
        //print each element of the array  
        for (int i = 0; i < 5; i++)  
        {  
        	System.out.println(numbers[i]);  
        } 
        int[] arr = numbers;
        reverse(arr, arr.length);
}  
}


