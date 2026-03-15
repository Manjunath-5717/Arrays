package array;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int [] a=new int[4];
	    System.out.println("enter the elements to be stored in the array");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("reversed array");
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}

	}

}
