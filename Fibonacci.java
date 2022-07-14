package assingment;

import java.util.Scanner;

public class Fibonacci {
	 

	public void process(int n) { 
        int num1=0;
        int num2=1;
        int num3;
        int count =0; 
        while (count<n){
            num3 = num1+num2;
            boolean flag=true;
            for(int i=2;i<num3/2;i++){
                if(num3%i ==0){
                    flag=false;
                }
            }
            if(flag  ){
                System.out.print(num3+" ");
                count++;
            }
            num1=num2;
            num2=num3;
        }
	}
	
	//1 2 3 5 13 89 233 1597 28657 514229 
	public static void main(String[] args) { 
		Fibonacci obj =new Fibonacci();
		Scanner sc =new Scanner(System.in);
		System.out.println("enter n");
		int n=sc.nextInt();
		obj.process(n);  
	}

}
