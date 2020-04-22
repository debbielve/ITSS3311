import java.util.Scanner;
public class StrictlyIdentical {
	public static boolean equals (int [] array1, int [] array2) { //implementing the equals method 
		for (int i= 0;i<array1.length;i++) { //iterate with the size of an array
			if(array1[i]!=array2[i]) { //check if arrays are equal or not
				return false; 
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in); //to read input runtime
		int array1[] = new int [5]; //initializing the first array
		int array2[] = new int [5]; //initializing the second array 
		
		System.out.print("Enter 5 elements of list1: ");//prompt to enter first 5 elements
		for(int i=0;i<5;i++) { //iterate the first array
			array1[i]=scanner.nextInt(); //entering the values of the array
		}
		System.out.print("Enter 5 elements of list2: ");//prompt to enter first 5 of 1st
		for(int i=0;i<5;i++) { //iterate the second array 
			array2[i]=scanner.nextInt(); //entering the values of the array 
		}
		if(equals(array1,array2)) {
			System.out.println("Two list are strictly identical.");
		} 
		else{
			System.out.println("Two lists are not strictly identical.");
		}
		
	}

	}



