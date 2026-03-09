/*
 * Program to check whether the given number is perfect number or not
 */

package assessemt;

import java.util.Scanner;

public class PerfectNumber {
	
	static int factors(int num) {
		int sum = 0;
		
		for(int i=1;i<=(num/2);i++) {
			if(num%i==0) sum+=i;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number:");
		int num = sc.nextInt();
		
		int sum_of_factors=factors(num);
		
		if(sum_of_factors==num)
			System.out.println("The given number is perfect");
		else
			System.out.println("The given number is not perfect");
		
		sc.close();
	}

}
