package firstAlgoInClass;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		System.out.println("guess the 4 digits");
		System.out.println("if the digit exist and is in it's corect index = #");
		System.out.println("if the digit exist = O");


		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> solution = new ArrayList<String>();		

		ArrayList<Integer> numbers = new ArrayList<>();
				
				numbers.add((1 + (int)(Math.random() * 6)));
				numbers.add((1 + (int)(Math.random() * 6)));
				numbers.add((1 + (int)(Math.random() * 6)));
				numbers.add((1 + (int)(Math.random() * 6)));
				for(int i = 0 ; i < 4 ; i++) {
					 System.out.println(numbers.get(i));
				}
				
		ArrayList<Integer> mynumbers = new ArrayList<>();
		
		
			for(int k = 0 ; k < 1 ; k++) {
				count++;
				for(int i = 0 ; i < 4 ; i++) {
					int newnumber = scanner.nextInt();
					 mynumbers.add(newnumber);
				}
				if(numbers.equals(mynumbers) == true) {
					System.out.println("bravo YOU GOT IT!!");
					break;
				}
				for(int i = 0 ; i < 4 ; i++) {
					 if(numbers.get(i) == mynumbers.get(i)) {
						 solution.add("#");
						 numbers.set(i, 2000000000);
					 } 
				}
				for(int j = 0 ; j < 4 ; j++) {
					 if(numbers.contains(mynumbers.get(j)) && mynumbers.get(j) != numbers.get(j)) {
						 solution.add("O");
					 } 
				}
				System.out.println(solution);
				
				solution.clear();
			}
		
		scanner.close();

		
		
		
	}
	

	
	

}
