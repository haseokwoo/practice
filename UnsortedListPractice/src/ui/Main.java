package ui;

import model.Listable;
import model.UnsortedList;

public class Main {

	public static void main(String[] args) {
		Listable ul = new UnsortedList();

		ul.setDuplicatesAllowed(true);
		ul.insert(3);
		ul.insert(33);
		ul.insert(34);
		ul.insert(3);
		ul.insert(3);
		ul.insert(6);
		ul.insert(12);
		ul.insert(24);
		ul.insert(74);

		System.out.println("Current array size: " + ul.getSizeOfList());
		System.out.println(ul);
//		
//		ul.delete(3);
//		System.out.println("Current array size: " + ul.getSizeOfList());
//		System.out.println(ul);
//		
//		ul.delete(3);
//		System.out.println("Current array size: " + ul.getSizeOfList());
//		System.out.println(ul);
//		
//		System.out.println("Test Find Fuction");
//		System.out.println(ul.find(31));
//		
//		ul.clear();
//		System.out.println(ul);

//		ul.deleteAll(3);
//		System.out.println(ul);

		System.out.println(ul.findAll(3));

//		ul.initializeWithRandomData(5);
//		System.out.println(ul);
//		ul.delete(3);
//		System.out.println(ul.getSizeOfList());
//		System.out.println(ul);

	}

}
