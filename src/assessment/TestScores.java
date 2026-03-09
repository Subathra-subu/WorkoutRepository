package assessemt;

import java.util.Scanner;

public class TestScores {
	
	static void processArray(int[] arr,int len) {
		
		for(int i=0;i<len;i++) {
			
			if(arr[i]%9==0)  arr[i]=4;
			else if(arr[i]%10==3) arr[i]=3;
			else if(arr[i]%8==0)  arr[i]=2;
			else if(arr[i]%2!=0)  arr[i]=1;
			else if(arr[i]%2==0)  arr[i]=0;
		
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] test_scores = new int[100];
		
		System.out.print("Enter the test scores:");
		int count=0;
		for(int i=0;i<100;i++) {
			
			int score = sc.nextInt();
			
			if(score<0) break;
			
			test_scores[i]=score;
			count++;
		}
		
		System.out.println("Original Scores:");
		for(int i=0;i<count;i++) {
			System.out.print(test_scores[i]+" ");
		}
		
		processArray(test_scores,count);
		
		System.out.println("\nModified Scores:");
		for(int i=0;i<count;i++) {
			System.out.print(test_scores[i]+" ");
		}
		
		sc.close();

	}

}
