package day23;

public class Card {

	private int num;
	private String shape;
	public int getNum() {
		return num;
	}
	public String getShape() {
		return shape;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	
	@Override
	public String toString() {
		String s = new String();
		if(shape.equals("S")) s += "♠"; 		//s = s + ♠
		else if (shape.equals("D")) s += "◆";	//s = "♠"; 라고 하면 안되는 이유는 무엇?
		else if (shape.equals("C")) s += "♣";
		else if (shape.equals("H")) s += "♥";
		
		if(num == 11) s += "J";
		else if(num == 12) s += "Q";
		else if(num == 13) s += "K";
		else s += num;
		return s;
	}
	//[기본생성자]
	public Card(){};
	//[복사생성자]
	public Card(Card c){
		this.num = c.num;
		this.shape = c.shape;
	}
}
