package data_Structure;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class BinarySearchList {

	String[] wordList;

	public void displyResult(String find) {
		if((search(find)))
			System.out.println("\nFound '" + find + "' in the given list of words!");
		else
			System.out.println("\nFound no matches for '" + find + "' in the given list of words!");
	}

	public String binarySearch(int low, int high, String find) {
		int mid = (low + high)/2;
		if (wordList[mid].equals(find))
			return find;

		while (low <= high) {
			if (wordList[mid].compareTo(find) > 0)
				return binarySearch(low, mid-1, find);
			else if (wordList[mid].compareTo(find) < 0)
				return binarySearch((mid + 1), high, find);
		}
		return null;
	}

	public boolean search(String lookFor) {
		return (lookFor.equals(binarySearch(0, wordList.length-1, lookFor)) ? true : false);
	}

	public String getSearchWord() {
		System.out.print("\nEnter a word to check if it exists in the given list of words : ");
		Scanner sc = new Scanner(System.in);
		String searchFor = sc.next();
		System.out.println();
		sc.close();

		return searchFor.toLowerCase().trim();
	}

	public void sortWordList() {
		Arrays.sort(wordList);
	}

	public void removeDuplicates() {
		HashSet<String> mySet = new HashSet<String>(Arrays.asList(wordList));
		wordList = new String[mySet.size()];
		mySet.toArray(wordList);
	}

	public void printWordList() {
		System.out.println("\n\nPrinting the list of words : \n");
		for (String word : wordList)
			System.out.println(word);
	}

	public void printList() {
		System.out.println("\n\nlist is  :");
		String list = "hello! my name is Abhishek Mishra. i am from Lucknow(UP) the city of Nawabs\n"
				+"i had completed my engineering from Amity University Lucknow, year of passsing was 2015";
		System.out.println(list);
	}

	public void getInputList() {
		String list = "hello! my name is Abhishek Mishra. i am from Lucknow(UP) the city of Nawabs\n"
				+"i had completed my engineering from Amity University Lucknow, year of passsing was 2015";

		wordList =list.toLowerCase().split(" ");
	}
}

