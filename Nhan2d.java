package Thuc_hanh;

public class Nhan2d {
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
	// method nhan 2 mang 2 chieu
		public static int[][] nhan(int[][] arr1, int[][] arr2){
			int m1=arr1.length; // so dong arr1
			int n1 = arr1[0].length;// so cot arr1
			int m2=arr2.length;//so dong arr2
			int n2 = arr2[0].length;//so cot arr2
			int[][] result= new int[1][1]; // khoi tao mang tra ve, ban dau cho mang 1 gia tri =0
			// kiem tra xem 2 mang 2D co thoa dieu kien de nhan khong
			if(n1==m2) {
				// thoa dieu kien thi khoi tao lai kich thuoc mang voi kich thuoc mang m1xn2
				result = new int[m1][n2];
				for(int i=0; i< m1;i++) {
					for(int s=0;s<n2;s++) {
						for(int j=0; j<n2;j++) {
							result[i][s] +=arr1[i][j]*arr2[j][s];
						}
					}
					
				}
			}else {
				return result;
			}
		
			return result;
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[][] arr= {{1,2,3},{4,5,6}};
			int[][] arr1= {{3,2,1},{4,5,6},{7,8,9}};
			int[][] arr2 = {{1,2,3,4},{5,6,7,8},{9,1,2,3},{4,5,6,7}};
			//ket qua nhan 2 mang 2D thoa dieu kien de nhan
			System.out.println(toString(nhan(arr, arr1)));
			//ket qua nhan 2 mang 2D khong thoa dieu kien de nhan
			System.out.println(toString(nhan(arr, arr2)));
		}
}
