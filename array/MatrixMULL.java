package array;

public class MatrixMULL {

	public static void main(String[] args) {
		
		int [][] a= {{2,3},{4,5}};
		int [][] b= {{8,9},{10,11}};
	    int [][] c=new int[a.length][a[0].length];
	    
	    for(int i=0;i<a.length;i++) {
	    	for(int j=0;j<a[0].length;j++) {
	    		for(int k=0;k<a[0].length;k++) {
	    			c[i][j]=c[i][j]+a[i][k]*b[k][j];	    		
	    	}
	    }
	}
	for(int i=0;i<c.length;i++) {
		for(int j=0;j<c[i].length;j++) {
			System.out.print(c[i][j]+" ");
		}
		System.out.println();
	}
}
}
