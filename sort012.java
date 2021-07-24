package JavaTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class sort012{
	public static void sort012(int[] arr,int n) {
		int count0=0,count1=0,count2=0;
		for (int i=0;i<n;i++) {
			if (arr[i]==0)
				count0++;
			if(arr[i]==1)
				count1++;
			if(arr[i]==2)
				count2++;
		}
		for(int i=0;i<count0;i++) {
			arr[i]=0;
		}
		for(int i=count0;i<(count0+count1);i++) {
			arr[i]=1;
		}
		for(int i=(count0+count1);i<n;i++) {
			arr[i]=2;
		}
		printArray(arr,n);
	}
	public static void printArray(int[] arr,int n) {
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		
	}
	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String c[] = s.split("\\s+");
		int arr[] = new int[c.length];
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(c[i]);
			//System.out.print(arr[i]+" ");
		}
		sort012(arr,n);
	}
}