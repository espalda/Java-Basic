package day19;

public class middleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//name, grade, classNum, stdNum
		middlemng test = new middlemng();
		test.insert(new middleStd("AAA", 3, 4, 21));
		test.insert(new middleStd("BBB", 1, 6, 34));
		test.insert(new middleStd("CCC", 2, 3, 19));
		test.insert(new middleStd("CAC", 2, 3, 19));
		test.delete(new middleStd("ABA", 1, 4, 21));
		test.print();
	}

}
