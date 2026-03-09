/*
 * Program to find which token number got first,second and third prize based on the conditions
 */

package assessemt;

import java.util.Scanner;

public class LuckyDrawEvent {
	
	public int sum(int num) {
		
		int total=0;
		
		while(num>0) {
			total+=(num%10);
			num/=10;
		}
		
		if(total>=10) total = sum(total);
		
		return total;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		LuckyDrawEvent l = new LuckyDrawEvent();
		
		System.out.print("Enter the total number of particiants:");
		int total = sc.nextInt();
		
		int[] participants = new int[total];
		
		System.out.println("Token number for "+total+" Participants:");
		
		for(int i=0;i<total;i++) {
			participants[i] = sc.nextInt();
		}
		
		int first_prize=0,second_prize=0,third_prize=0;
		
		for(int i=0;i<total;i++) {
			int sum = l.sum(participants[i]);
			
			//System.out.println(sum);
			
			if(sum==7)
					first_prize = participants[i];
			else if(sum==5)
				    second_prize = participants[i];
			else if(sum==3)
					third_prize = participants[i];
		 }
		
		 System.out.println("First Prize is to token: "+first_prize);
		 System.out.println("First Prize is to token: "+second_prize);
		 System.out.println("First Prize is to token: "+third_prize);
		
		 sc.close();
		
	}

}
