package StepA;

import java.util.Scanner;

public class StepA3 {
	
	private int width;
	private int height;
	private int area;
	
	public StepA3() {
		input();
	}
	
	public void printArea() {
		System.out.printf("���簢���� ���̴� %d �Դϴ�.\n", getArea());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("���簢���� ���� ũ�⸦ �Է��Ͻÿ�. ");
		this.width = s.nextInt();
		System.out.print("���簢���� ���� ũ�⸦ �Է��Ͻÿ�. ");
		this.height = s.nextInt();
		s.close();
		
	}
	
	int getArea() {
		this.area= this.width * this.height;
		return this.area;
	}

}
