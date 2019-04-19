package day18;

import java.util.*;

public class unitest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		unimanager um = new unimanager();
		um.insert(new university(Gender.MALE, Grade.FRESHMAN, Major.NONE, "SK", 123546));
		um.print();
	}

}
