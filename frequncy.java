package javalab;

import java.util.Scanner;

public class frequncy {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String input=sc.nextLine();
	System.out.println("enter the characters");
	char checkMe=sc.next().charAt(0);
	int charCount=checkFreq(input,checkMe);
	System.out.println("the occurance is:"+charCount);
}
static int checkFreq(String input,char checkMe) {
	char[] charArray=input.toCharArray();
	int charcount=0;
	for(int i=0;i<input.length();i++) {
		if(charArray[i]==checkMe) {
			charcount++;
		}
}
return charcount;
}
}
