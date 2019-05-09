package co.grandcircus;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class challenge {

	private static String[] addValues(String string1, String string2, String string3) {

		String[] stringCombination = new String[3];

		stringCombination[0] = string1;
		stringCombination[1] = string2;
		stringCombination[2] = string3;
		return stringCombination;
	}

	private static int sumArray(int[] integerArray1) {

		int sumOfElements = 0;
		for (int element : integerArray1) {
			sumOfElements += element;
		}
		return sumOfElements;
	}

	private static ArrayList<Integer> removeNum(ArrayList<Integer> list1, int num) {

		for (int i = 0; i < list1.size(); i++) {

			if (list1.get(i) == num) {
				list1.remove(i);
			}
		}
		return list1;
	}

	private static LinkedList<String> addToList(String string1) {

		LinkedList<String> list1 = new LinkedList<>();
		list1.add("grapes");
		list1.add("oranges");
		list1.add(string1);

		return list1;
	}

	private static String modifyMap(Map<Integer, String> hashMap) {

		hashMap.put(50, "test");
		String addedValue = hashMap.get(50);
		return addedValue;
	}

	private static int tryMe(int integer1, int integer2) {

		int quotient = 0;

		try {
			quotient = integer1 / integer2;
			return quotient;

		} catch (ArithmeticException ex) {
			return 0;
		}
	}

}
