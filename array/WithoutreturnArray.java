package array;

public class WithoutreturnArray {
	
	static void add(int [] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		
     int []a= {1,2,3};
     add(a);
	}

}
