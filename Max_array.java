package geekster_methods;

import java.util.Scanner;

public class Max_array {
	
	public static void main(String args[]) {
		
		System.out.println("Enter the elements in array-");
		int max=max_arr();
		System.out.println("The maximium element in the array is :");
		System.out.println(max);
		
	}
	
	public static int max_arr() {
		
		int[] arr=new int[5];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=sc.nextInt();
			sc.nextLine();
			
		}
		
		int max=0;
		for(int j=0;j<arr.length;j++) {
			if(arr[j]>max) {
				max=arr[j];
			}
			
		}
		return max;
		
	}

}
