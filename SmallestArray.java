package lab2_1;

import java.util.Arrays;

public class SmallestArray {
	public static int getSecondSmallest(int[]a) {
		Arrays.sort(a);
		return a[1];
	}

}  
