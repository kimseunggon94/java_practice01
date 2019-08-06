package practice01.prob4;

import java.util.Scanner;

public class Prob4 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		for(int i=0; i<str.length();i++) {
			for(int j=0; j<i+1;j++) {
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}
		
	}
}
