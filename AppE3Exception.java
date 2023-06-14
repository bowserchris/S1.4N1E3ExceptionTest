package n1e1to3;

import java.util.ArrayList;

public class AppE3Exception {
	
	ArrayList<String> testList = new ArrayList<String>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ArrayList<String> printThruList() throws ArrayIndexOutOfBoundsException {
		for (int i = 0; i < testList.size(); i++) {
			testList.get(i);
			System.out.println();
		}
		return testList;
	} 

}

/*
 * - Exercise 3

    Create a class with a method that throws an 
    ArrayIndexOutOfBoundsException.
    Verify its correct operation with a jUnit test.
 * 
 * */
