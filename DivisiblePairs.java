package assingment;

import java.util.Arrays;
import java.util.Scanner;

public class DivisiblePairs {
	public void process(int a[],int k) {
		Arrays.sort(a);
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if((a[i]+a[j])%5==0)
					System.out.print("["+a[i]+","+a[j]+"]");
			}
		}
	}

	public static void main(String[] args) {
		DivisiblePairs obj =new DivisiblePairs();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		int n =sc.nextInt();
		System.out.println("enter k");
		int k =sc.nextInt(); 
		int a[]=new int[n]; 
		System.out.println("enter numbers");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		obj.process(a,k);

	}

}
