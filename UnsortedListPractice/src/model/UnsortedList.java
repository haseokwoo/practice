package model;

import java.util.Arrays;

public class UnsortedList implements Listable {
	public static final int MAX_SIZE = 5;
	private int[] values = new int[MAX_SIZE];
	private int pointer = 0;
	private boolean duplicatesAllowed;

	@Override
	public int getSizeOfList() {
		return pointer;
	}

	@Override
	public boolean areDuplicatesAllowed() {
		return duplicatesAllowed;
	}

	@Override
	public void setDuplicatesAllowed(boolean pDuplicatesAllowed) {
		duplicatesAllowed = pDuplicatesAllowed;
	}

	@Override
	public void clear() {
		pointer = 0;

	}

	@Override
	public void insert(int pValueToInsert) {
		pointer++;
		values[pointer - 1] = pValueToInsert;
	}

	@Override
	public void delete(int pValueToDelete) {
//		for (int i = 0; i < values.length-1; i++) {
//			values[i] = values[i+1];
//		}
//		pointer--;
		for (int i = 0; i < pointer; i++) {
			if (values[i] == pValueToDelete) {
				if (i + 1 < pointer) {
					for (int y = i; y < pointer; y++) {
						if (y + 1 < pointer) {
							values[y] = values[y + 1];
						}
					}
				}
				values[pointer - 1] = 0;
				pointer--;
				break;
			}
		}

	}

	@Override
	public void deleteAll(int pValueToDelete) {
		for (int i = 0; i <= pointer; i++) {
			if (values[i] == pValueToDelete) {
				if (i + 1 < pointer) {
					for (int y = i; y < pointer; y++) {
						if (y + 1 < pointer) {
							values[y] = values[y + 1];
						}
					}
				}
				values[pointer - 1] = 0;
				pointer--;
				i = -1;
			}
		}
	}

	@Override
	public void initializeWithRandomData(int pSizeOfList) {
		clear();
		for (int i = 0; i < pSizeOfList; i++) {
			values[i] = (int) (Math.random() * (10 - 0 + 1) + 0);
			pointer++;
		}

	}

	@Override
	public int find(int pValueToFind) {
		int position = 0;
		for (int i = 0; i < pointer; i++) {
			if (values[i] == pValueToFind) {
				position = i;
				return position;
			}
		}
		return -1;
	}

	@Override
	public int[] findAll(int pValueToFind) {
		int pointer2 = MAX_SIZE;
		int[] findAll = new int[pointer2];
		int z = -1;

		for (int i = 0; i < pointer; i++) {
			if (values[i] == pValueToFind) {
				z++;
				findAll[z] = i;
				if (z + 1 < pointer2) {
					pointer2--;
				}
			}
		}

		if (z != -1) {
			return Arrays.copyOfRange(findAll, 0, pointer2);
		} else {
			return new int[0];
		}
	}

	@Override
	public String toString() {
		int[] array = new int[pointer];
		for (int i = 0; i < pointer; i++) {
			array[i] = values[i];
		}
		return Arrays.toString(array);
	}

}
