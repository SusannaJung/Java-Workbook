package StepE;

import java.util.Scanner;

public class StepE1 {
	
	private int length;
	
	public StepE1() {
		input();
	}
	
	void input() {
		Scanner s= new Scanner(System.in);
		System.out.print("���簢���� ũ�⸦ �Է��Ͻÿ�.");
		this.length= s.nextInt();
	}
	
	public void printSquare() {
		for(int i=0; i<length; i++) {
			for(int j=0; j<length; j++) {
				System.out.println("#");
			}
			System.out.println("\n");
		}
	}
	
	

}
