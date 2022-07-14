package assingment;

import java.util.Scanner;

public class Fourte {
	public void process(int input[],int result) {
		char [] operators= {'+','-','*','/'};
		String calculation="";
		int count=0;
		int myResult=0;
		while(true) {
		for(int i=0;i<4;i++) {
			calculation+=input[i];
			if(i<3)
			calculation+=operators[count];
		}
		if(count<3)
		count++;
		System.out.println(calculation +"..,.");
		 
		/*
		 * if(result==myResult) {
		 * 
		 * break; }
		 */
		}
		
	}

	public static void main(String[] args) { 
		Fourte obj =new Fourte();
		int input[]=new int[4]; 
		Scanner sc =new Scanner(System.in);
		System.out.println("enter result value");
		int result=sc.nextInt();
		System.out.println("enter 4 values");
		for(int i=0;i<4;i++) {
			input[i]=sc.nextInt();
		}
		
		obj.process(input,result);

	}

}
