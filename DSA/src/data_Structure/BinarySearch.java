package data_Structure;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
	
		BinarySearchList operation = new BinarySearchList();
		System.out.println("Welcome to the Binary search Program!");
		
		operation.getInputList();		
		operation.removeDuplicates();
		operation.sortWordList();
		String searchWord = operation.getSearchWord();
		operation.displyResult(searchWord);
		operation.printList();
		operation.printWordList();

	}
}
		