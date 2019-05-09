package day08;

public class TelevisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television t = new Television();
		t.volumeUp();
		t.printVolume();
		t.printchannel(50);
		Television tt = new Television(50,20);
		tt.printVolume();
		tt.printchannel(4);
	}

}
