package lab2_1;

import java.util.Iterator;
import java.util.Scanner;

public class Test {
	public static void main(String args[]) {
		SmallestArray sa= new SmallestArray();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the total size of array");
		int total=sc.nextInt();
		int[] array=new int[total];
		for(int i=0;i<total;i++) {
			System.out.println("enter the numbers "+i+" index:");
			array[i] = sc.nextInt();
		}
		
		System.out.println("smallest second num of " +total+ "numbers is:"
			+sa.getSecondSmallest(array));
		
		
		
	}

}
