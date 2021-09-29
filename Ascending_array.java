package geekster_methods;

import java.util.ArrayList;
import java.util.Scanner;

public class Ascending_array {
	
	public static void main(String args[]) {
		
		boolean check=ascend();
		System.out.println(check);
		
		
	
	}
	
	public static boolean ascend() {
		
	int[] arr=new int[5];
		
		Scanner scan=new Scanner(System.in);
		for (int i=0;i<arr.length;i++) {
			
			arr[i]=scan.nextInt();
			scan.nextLine();
		}
		
		scan.close();
		int flag=1;
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					flag=0;
					break;
				}
			}
			
		}
		if(flag==0) {
			return false;
		}
		else {
			return true;
		}
		
		
		
	}

}
