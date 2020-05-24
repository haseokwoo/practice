package ui;

import java.util.Arrays;

import model.SortedList;

public class Main {

	public static void main(String[] args) {
		SortedList sl = new SortedList();

		sl.setDuplicatesAllowed(true);
		sl.insert(3);
		sl.insert(4);
		sl.insert(1);
		sl.insert(10);
		sl.insert(10);
		sl.insert(10);
		sl.insert(5);
		sl.insert(6);
		sl.insert(4);
		sl.insert(4);
		System.out.println(sl);
		System.out.println(Arrays.toString(sl.getValues()));
		System.out.println(sl.find(10));
		System.out.println(Arrays.toString(sl.findAll(10)));
		
		//Now, work on NOT ALLOWING DUPS!!!!!!!!!!!!!!!!!!!!!!!!!
		//Now, work on NOT ALLOWING DUPS!!!!!!!!!!!!!!!!!!!!!!!!!
		//Now, work on NOT ALLOWING DUPS!!!!!!!!!!!!!!!!!!!!!!!!!
		//Now, work on NOT ALLOWING DUPS!!!!!!!!!!!!!!!!!!!!!!!!!
		//Now, work on NOT ALLOWING DUPS!!!!!!!!!!!!!!!!!!!!!!!!!
		//Now, work on NOT ALLOWING DUPS!!!!!!!!!!!!!!!!!!!!!!!!!
		//Now, work on NOT ALLOWING DUPS!!!!!!!!!!!!!!!!!!!!!!!!!
		//Now, work on NOT ALLOWING DUPS!!!!!!!!!!!!!!!!!!!!!!!!!
		//Now, work on NOT ALLOWING DUPS!!!!!!!!!!!!!!!!!!!!!!!!!
	}

}