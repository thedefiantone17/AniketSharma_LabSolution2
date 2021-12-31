package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.service.MergeSortImpl;
import com.greatlearning.service.NotesCount;

public class NotesDriver {
	
	public static void main(String[] args){
		//TODO Auto-generated method stub
		MergeSortImpl mergeSortImpl = new MergeSortImpl();
		NotesCount notesCount = new NotesCount();
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Currency Denominations: ");
		size = sc.nextInt();
		System.out.println("Enter the currency denomination values: ");
		int noteDenomination[] = new int[size];
		for(int i=0; i < size; i++){
			noteDenomination[i] = sc.nextInt();
		}
		System.out.println("Please enter the amount you want to pay: ");
		int amt = sc.nextInt();
		
		mergeSortImpl.mergeSort(noteDenomination,0,noteDenomination.length-1);
		notesCount.implementNotesCount(noteDenomination, amt);
	sc.close();
	}
	
	
}
