package Task8;
import java.util.Arrays;

public class SliceArrayDemo {
			public static int[] SliceArray(int[] array, int startIndex, int endIndex) {
	        return Arrays.copyOfRange(array, startIndex, endIndex);
	    }

	    public static void main(String[] args) {
	        int[] array = {50,64,84,105,28,10,46,79,34};
	        int startIndex = 3, endIndex = 8;
	        int[] slicedArray = SliceArray(array, startIndex, endIndex + 1);
	        System.out.println("Slice of Array: " + Arrays.toString(slicedArray));
	    }
	


}
