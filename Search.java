package Thuc_hanh;

public class Search {
	public static boolean search(int[][] arr, int target) {
		for(int i=0; i< arr.length;i++) {
			for(int j=0;j< arr[i].length;j++) {
				if(arr[i][j] == target) {
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3},{4,5,6,7}};
		System.out.println(search(arr, 7));
	}

}
