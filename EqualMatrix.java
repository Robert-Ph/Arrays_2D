package Thuc_hanh;

public class EqualMatrix {
	public static boolean equalmatrix(int[][] arr1, int[][] arr2) {
		if(arr1.length == arr2.length){
			for(int i=0;i< arr1.length;i++ ) {
				if(arr1[i].length == arr2[i].length) {
					for(int j=0; j< arr1[i].length;j++) {
						if(arr1[i][j] != arr2[i][j]) {
							return false;
						}
					}
				}else {
					return false;
				}
			}
		}else {
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr1 = {{1,2},{3,4}};
		int[][] arr2 = {{1,5},{3,4}};
		System.out.println(equalmatrix(arr1, arr2));
	}

}
