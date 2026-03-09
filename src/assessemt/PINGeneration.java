/*
 * Program to generate PIN by using the three inputs from the user
 */

package assessemt;

import java.util.Scanner;

public class PINGeneration {
	
	public static int max(int num) {
		int max=Integer.MIN_VALUE;
		
		while(num > 0) {
			int digit = num%10;
			if(digit > max) max = digit;
			num/=10;
		}
		
		return max;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] inputs = new int[3];
		
		for(int i=0;i<3;i++) {
			System.out.print("Enter input "+(i+1)+":");
			inputs[i]=sc.nextInt();
		}
		
		
		int pin;
		
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<3;i++) {
			max=Math.max(max,max(inputs[i]));
		}
		
		int min_h = Integer.MAX_VALUE;
		
		for(int i=0;i<3;i++) {
			min_h=Math.min(min_h,inputs[i]/100);
		}
		
		int min_t = Integer.MAX_VALUE;
		
		for(int i=0;i<3;i++) {
			min_t=Math.min(min_t,(inputs[i]/10)%10);
		}
		
		int min_o = Integer.MAX_VALUE;
		
		for(int i=0;i<3;i++) {
			min_o=Math.min(min_o,inputs[i]%10);
		}
		
		pin = max*1000 + min_h*100 + min_t*10 + min_o*1;
		
		System.out.println("The PIN : "+pin);
		
		sc.close();

	}

}
