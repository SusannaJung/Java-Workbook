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
			System.out.printf("직사각형의 넓이는 %d 이고\n정사각형입니다.", getArea());
		}
		else {
			System.out.printf("직사각형의 넓이는 %d 이고\n정사각형이 아닙니다.", getArea());
		}
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("직사각형의 가로 크기를 입력하시오.");
		this.width = s.nextInt();
		System.out.print("직사각형의 세로 크기를 입력하시오.");
		this.height = s.nextInt();
		s.close();
	}
	
	int getArea() {
		this.area = this.width* this.height;
		return this.area;
	}
}
