package Exceptionhandling;

import java.util.Arrays;

public class TryCatch {
	public static void main(String[]args) {
		int[]arr= new int[5];
		System.out.println(Arrays.toString(arr));
		try {
		arr[10]=12;
		 
		}catch (Exception e) {
		System.out.println("Enter the index");
		}finally {
			System.out.println("completed");
		}
		System.out.println(Arrays.toString(arr));
	}
}

