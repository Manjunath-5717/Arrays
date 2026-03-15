package array;

public class WithUsingThirdA {

	public static void main(String[] args) {
		
		int [][] a1= {{2,3},{4,6}};
		int [][] b1= {{4,6},{5,1}};
		int [][] c1=new int[a1.length][a1[0].length];
		
		
		for(int i=0;i<a1.length;i++) {
			for(int j=0;j<a1[i].length;j++) {
				c1[i][j]=a1[i][j]+b1[i][j];
			}
		}
		for(int i=0;i<a1.length;i++) {
			for(int j=0;j<a1[i].length;j++) {
				System.out.print(c1[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
