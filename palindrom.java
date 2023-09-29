/***********************************************************************
 * name       :palindrom
 *description :program on finding palindrom
 *author      :adithyan biju
 *version     :1.0
 *date        :29/9/2024
 **********************************************************************/
package javalab;
import java.util.Scanner;
public class palindrom{
	     public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				System.out.println("enter the string");
		String name=sc.next();
		boolean ispalindrom=Check(name);
		if(ispalindrom) {
			System.out.println("the given string is palindrom");
		}
			else {
				System.out.println("the given is not palindrom");
			}
			}
		
		static boolean Check(String input) {
			char[]charArray=input.toCharArray();
			int length=input.length();
			for(int i=0;i<=length/2;i++) {
				if(charArray[i]!=charArray[length-i-1]) {
					return false;
				}
			}
			return true;
		}
}