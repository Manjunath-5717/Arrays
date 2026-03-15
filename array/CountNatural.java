package array;

public class CountNatural {

	public static void main(String[] args) {
		int count=0;
		
		int n=1234;
		
		while(n!=0) {
			int digit=n%10;
			count++;
			n=n/10;
		}
        System.out.println(count);
	}

}
