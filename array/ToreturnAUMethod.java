package array;

public class ToreturnAUMethod {
	
	static int [] add(){
		int [] a= {10,20,30,40};
		
		return a;
	}

	public static void main(String[] args) {
		
		int [] arr= add();
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
