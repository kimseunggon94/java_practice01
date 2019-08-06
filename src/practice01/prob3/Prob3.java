package practice01.prob3;

import java.util.Scanner;

public class Prob3 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int sum=0;
		if(number%2==0) {
			for(int i=0;i<=number;i=i+2) {
				sum+=i;
			}
		}else {
			for(int i=1;i<=number;i=i+2){
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}
