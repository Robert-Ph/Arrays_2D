package Thuc_hanh;

public class GetSize {
	public static int getsize(int[][] arr) {
		int result=0;
		for(int i=0;i< arr.length; i++) {
			for(int j=0; j< arr[i].length;j++) {
				result++;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int[][] arr = {{1,2},{3,4,5},{6,7,8}};
		System.out.println(getsize(arr));
	}

}
