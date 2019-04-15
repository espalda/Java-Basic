package day11;

public class d11trycatch01 {

	public static void main(String[] args) {
		/* d11 예외처리 exception 
		 * 예외처리 프로그램의 안정화를 위해서
		 * 일반적으로 예외처리가안된 상태에서 예외가 발생하면
		 * 프로그램이 중단되는데 예외처리를 하면 예외가 발생해도
		 * 프로그램을 중단하지 않고 다음 코드를 실행할 수 있다
		 * try{ 예외가 발생할수 있는 코드
		 * }catch{	예외가 발생했을 때 실행될 코드
		 * }catch(Exception e){
		 * }finally{ 예외와 상관없이 무조건 실행되는 코드}

		 * RuntimeException 프로그래머의 실수로 발생하는 예외 종류
		 * ArithmeticException
		 * ClassCastException
		 * NullPointException
		 * ArrayIndexOutOfBoundsException
		 */
	
		int num1=1, num2=0;
		int res;
		int arr[] = new int[10];
		try{	//예외 상황이 발생할 수 있는 코드
			//arr[10]= 0;
			res= num1/num2;
			System.out.println(res);
			//try문에서 ArithmeticException이 발생하면
			//아래 catch 문을 실행하고 다음 코드를 실행해라
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("연산 예외 발생!!! ");
		}catch(ArrayIndexOutOfBoundsException e){	//e : e라는 객체를 만들어서 사용하겠다
													//exception e = new exception("0으로 나눌수없습니다");
			System.out.println("배열 예외 발생!!!");
		}catch(Exception e){	//모든 클래스는 exception 클래스를 상속받기 때문에
			System.out.println("예외 발생!"); 	//어떠한 예외가 발생됬는지 모를때 마지막에 처리 else처럼 처리
		}
		System.out.println("프로그램 종료!!");
		
		Shape ss = new Shape();
		System.out.println(ss);
	}
	
	
}
