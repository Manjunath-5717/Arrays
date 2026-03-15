package array;

public class Matrixmul {

	public static void main(String[] args) {
		int [][] a= {{5,6},{8,9}};
		int [][] b=new int[a.length][a[0].length];
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				b[j][i]=a[i][j];
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}

	}

}
