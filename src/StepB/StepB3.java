package StepB;

import java.util.Scanner;

public class StepB3 {
	
	private int width, height;
	private int area;
	
	public StepB3() {
		input();
	}
	
	public void printArea() {
		if(this.width == this.height) {
			System.out.printf("���簢���� ���̴� %d �̰�\n���簢���Դϴ�.", getArea());
		}
		else {
			System.out.printf("���簢���� ���̴� %d �̰�\n���簢���� �ƴմϴ�.", getArea());
		}
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("���簢���� ���� ũ�⸦ �Է��Ͻÿ�.");
		this.width = s.nextInt();
		System.out.print("���簢���� ���� ũ�⸦ �Է��Ͻÿ�.");
		this.height = s.nextInt();
		s.close();
	}
	
	int getArea() {
		this.area = this.width* this.height;
		return this.area;
	}
}
