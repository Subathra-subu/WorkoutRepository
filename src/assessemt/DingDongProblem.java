/*
 * Program to Ding for every 5th and Dong for every 10th number
 */


package assessemt;

import java.util.Scanner;

public class DingDongProblem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the starting interval:");
		int start = sc.nextInt();
		
		System.out.print("Enter the ending interval:");
		int end = sc.nextInt();
		
		int count=1;
		for(int i=start;i<=end;i++) {
			if(count%10==0)
				System.out.print("dong"+" ");
			else if(count%5==0)
				System.out.print("ding"+" ");
			else
				System.out.print(i+" ");
			count++;
		}
		
		sc.close();

	}

}
