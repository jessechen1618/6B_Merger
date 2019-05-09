/*
	Transform pseudo-code to Java code for merging two sorted lists
	*/

import java.util.ArrayList;

public class Merger  {

	public static ArrayList<String> sortedA;
	public static ArrayList<String> sortedB;

	public static void main(String[] args) {
		sortedA = new ArrayList<String>();
		sortedB = new ArrayList<String>();

		sortedA.add("A");
		sortedA.add("C");
		sortedA.add("D");
		sortedA.add("D");
		sortedA.add("Z");

		sortedB.add("B");
		sortedB.add("D");

		System.out.println(sortedA);
		System.out.println(sortedB);

		System.out.println("Merging...");
		System.out.println(merge(sortedA, sortedB));
	}

	public static ArrayList merge (ArrayList<String> listA, ArrayList<String> listB) {
		ArrayList<String> merged = new ArrayList<String>();
		while (listA.size() != 0 || listB.size() != 0 ) {
			if (listA.size() != 0 && listB.size() != 0) {
				if ((listA.get(0)).compareTo(listB.get(0)) < 0){
					merged.add(listA.get(0));
					listA.remove(0);
				} else {
					merged.add(listB.get(0));
					listB.remove(0);
				}
			} else if (listA.size() != 0 && listB.size() == 0) {
				while (listA.size() != 0) {
					merged.add(listA.get(0));
					listA.remove(0);
				}
			} else if (listA.size() == 0 && listB.size() != 0) {
				while (listB.size() != 0) {
					merged.add(listB.get(0));
					listB.remove(0);
				}
			}
		}
		return merged;
	}
}