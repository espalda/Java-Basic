package coding;

public class arr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] [] arr = new int [3][4];
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[0][3] = 4;
		
		int [][] arr2 = new int [3][];
		arr2[0] = new int [1];
		arr2[1] = new int [2];
		arr2[2] = new int [3];
		arr2[0][0] = 10;
		
		int [][] arr3 = { {1},{1,2},{1,2,3} };
		System.out.println(arr3[0][0]);
		System.out.println(arr3[2][2]);
	} 

}
