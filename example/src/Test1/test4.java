package Test1;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	calc(2,3,'*');
	}
	public static double calc(int num1, int num2, char op){
		double res = 0;
		switch(op){
		case('+'): System.out.println(res = num1+num2); break;
		case('-'): System.out.println(res = num1-num2); break;
		case('*'): System.out.println(res = num1*num2); break;
		case('/'): System.out.println(res = num1/num2); break;
		case('%'): System.out.println(res = num1%num2); break;
		
		}return res;
		//예외처리
	}
}
