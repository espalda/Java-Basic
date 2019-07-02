package review;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=1, num2=3;
		double res=0;
		char op = '*';
		try{
			res = calc(num1, num2, op);
			System.out.println(""+num1+op+num2+"="+res);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	public static double calc(int num1, int num2, char op)
		throws Exception{
		double res = 0;
		switch(op){
		case('+'): res = num1+num2; break;
		case('-'): res = num1-num2; break;
		case('*'): res = num1*num2; break;
		case('/'): 
			if(num2 == 0)	throw new ArithmeticException("0으로 나눌수 없습니다");
				res =(double)num1/num2; break;
		case('%'):
			if(num2 == 0)	throw new ArithmeticException("0으로 나눌수 없습니다");
				res =(double)num1%num2; break;
		default:
			throw new Exception("잘못된 연산입니다");
		}return res;
	}
}
