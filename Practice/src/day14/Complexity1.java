package day14;

public class Complexity1 {
		//d14 클래스 복소수
	public static void main(String[] args) {
		
		Complexity1 c1 = new Complexity1(1,2);
		Complexity1 c2 = new Complexity1(3,4);
		Complexity1 c3 = c1.add(c2);
		Complexity1 c4 = c1.sub(c2);
		System.out.println(c1+"+"+c2+"="+c3);
		System.out.println(c1+"-"+c2+"="+c4);
	}

	private int real;
	private int img;
	
	
	public int getReal() {
		return real;
	}


	public int getImg() {
		return img;
	}


	public void setReal(int real) {
		this.real = real;
	}


	public void setImg(int img) {
		this.img = img;
	}


	@Override
	public String toString() {
		String str = "";
		if(real != 0)
			str += real;
		
		if(img >1)
			str += "+"+img+"i";
		else if(img ==1)
			str += "+i";
		
		else if(img<0)
			str +=img+"i";
		
		if(real != 0 || img != 0)
			str = "("+str+")";
		
		return str;
		
	}
	
	public Complexity1(int real, int img){
		this.real=real;
		this.img=img;
	}
	public Complexity1(Complexity1 c){
		this(c.real, c.img);
	}
	/* 기능 : 매개변수 복소수와 현재 값을 더하여 더한 결과를 복소수 객체로 전달하는 메서드
	 * 매개변수 : Complexity c
	 * 리턴타입 : 더한 결과 Complexity
	 * 메서드명 : add
	 */
	public Complexity1 add(Complexity1 c){
		
		//return new Complexity(real+c.real, img+c.img);
		Complexity1 res = new Complexity1(0,0);
		res.real = real + c.real;
		res.img = img + c.img;
		return res;
	}
	public Complexity1 sub(Complexity1 c){
			
			//return new Complexity(real+c.real, img+c.img);
			Complexity1 res = new Complexity1(0,0);
			res.real = real - c.real;
			res.img = img - c.img;
			return res;
		}
	

}