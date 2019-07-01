package day18;

public class d18enumskind {

	public static void main(String[] args) {
		for(kind k : kind.values()){
			System.out.println(k.name() + " = " + k.getValue());
		}
/*	Number num = Number.ONE;
	num = Number.FIVE;*/
	}

}

enum kind{
	SPACE(1), CLOVER(2), HEART(3), DIA(4);
	private final int value;
	kind(int value){
		this.value = value;
	}
	public int getValue(){
		return value;
	}
enum Number{ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN, J,Q,K}
}

