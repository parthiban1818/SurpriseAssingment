package assingment;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public void process(String s1 ,String s2) { 
		if(s1.length()!=s2.length())
              System.out.println("not a anagram");
		else {
			char[] first=s1.toLowerCase().toCharArray();
			char []second=s2.toLowerCase().toCharArray();
			Arrays.sort(first);
			Arrays.sort(second);
//			System.out.println(first);
//			System.out.println(second);
			if(first.equals(second))
				System.out.println("not a anagram");
			else
				System.out.println("the given strings are anagram"); 
		}
 
	}

	public static void main(String[] args) {
		 Anagram obj =new Anagram();
		 Scanner sc =new Scanner(System.in);
		 System.out.println("enter first string");
		 String s1=sc.next();
		 System.out.println("enter second string");
		 String s2=sc.next();
		 obj.process(s1, s2);

	}

}
