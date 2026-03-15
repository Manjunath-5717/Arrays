package array;

public class WThridArray {

	public static void main(String[] args) {
		int [][] a1= {{2,3},{4,6}};
		int [][] b1= {{4,6},{4,5}};
		
		for(int i=0;i<a1.length;i++){
			for(int j=0;j<a1[i].length;j++) {
				System.out.print(a1[i][j]+b1[i][j]+" ");
			}
			System.out.println();
		}

	}

}
