package array;
import java.util.Scanner;
public class Factorial {
public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  
	System.out.println("eneter the number:");
		
		int num=sc.nextInt();

		int fact=1;
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				
				System.out.println(i);
				count++;
			}
			
		}
		System.out.println("total count "+ count);

	}

}
