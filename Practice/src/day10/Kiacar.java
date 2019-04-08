package day10;

import day09.Car;

public class Kiacar extends Car{
	public final static String brand = "KIA";
	public Kiacar(){
		// speed =1;
		// 접근불가 : 부모에서 접근제한자가 private이기 때문에
		setSpeed(0);
	}
}
