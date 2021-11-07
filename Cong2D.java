package Thuc_hanh;

public class Cong2D {
	public static String toString(int[][] arr) {
		int m = arr.length;
		int n = arr[0].length;
		String result="";
		for (int i = 0; i < m; i++) {
	        for (int j = 0; j < n; j++) {
	           result += arr[i][j] + "  ";
	        }
	        result +="\n";   
	    }
		return result;
	}
	public static int[][] cong2D(int[][] arr1, int[][] arr2){
		int m1 = arr1.length;
		int n1 = arr1[0].length;
		int m2 = arr2.length;
		int n2 = arr2[0].length;
		
		int[][] result = new int[1][1];
		if(m1==m2 && n1==n2) {
			result = new int[m1][n1];
			for(int i=0; i<m1;i++) {
				for(int j=0; j<n1;j++) {
					result[i][j] = arr1[i][j] + arr2[i][j];
				}
			}
		}
		else {
			return result;
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{1,2,3},{4,5,6}};
		int[][] arr1= {{3,2,1},{4,5,6}};
		int[][] arr2 = {{1,2,3,4},{5,6,7,8},{9,1,2,3},{4,5,6,7}};
		System.out.println(toString(cong2D(arr, arr1)) + "\n");
		// khong thoa đk để cộng hai ma trận
		System.out.println(toString(cong2D(arr, arr2)));
	}

}
