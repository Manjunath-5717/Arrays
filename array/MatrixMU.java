package array;

public class MatrixMU {

	public static void main(String[] args) {

		int[][] a1 = {{2,3},{4,5}};
		int[][] b1 = {{8,9},{10,11}};
		int[][] c1 = new int[a1.length][b1[0].length];

		for(int i = 0; i < a1.length; i++) {
			for(int j = 0; j < a1[i].length; j++) {
				for(int k = 0; k < a1[i].length; k++) {
					c1[i][j] += a1[i][k] * b1[k][j];
				}
			}
		}

		for(int i = 0; i < c1.length; i++) {
			for(int j = 0; j < c1[i].length; j++) {
				System.out.print(c1[i][j] + " ");
			}
			System.out.println();
		}

	}
}