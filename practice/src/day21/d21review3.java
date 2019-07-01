package day21;

public class d21review3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(1,10);
	}
	
	public static void sum(int min, int max) {
		//min에서 max 까지의 합
		int res = 0;
		if(max < min){
			int tmp = min;
			min = max;
			max = tmp;
		}
		for( ; min<=max; min++){
			res = res + min;
			System.out.print(res + " ");
		}
	}

}
