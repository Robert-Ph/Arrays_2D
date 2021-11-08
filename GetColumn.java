package Thuc_hanh;

import java.util.Arrays;

public class GetColumn {
	// tinh toan kich thuoc cua mang result trong method getcolumn
	public static int dem(int[][] arr, int n) {
		int result=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].length == n) {
				result ++;
			}
		}
		return result;
	}
	public static int[] getcolumn(int[][] arr, int n) {
		int size = dem(arr, n);
		int[] result=new int[size];
		int j=0;
		for(int i=0;i< arr.length;i++) {
			if(arr[i].length == (n)) {
				result[j] = arr[i][n-1];
				j++;
			}
			
			
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2},{3,4,5},{6,7,8}};
		System.out.println(Arrays.toString(getcolumn(arr, 3)));
	}

}
