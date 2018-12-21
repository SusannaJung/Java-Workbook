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
		System.out.printf("직사각형의 넓이는 %d 입니다.\n", getArea());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("직사각형의 가로 크기를 입력하시오. ");
		this.width = s.nextInt();
		System.out.print("직사각형의 세로 크기를 입력하시오. ");
		this.height = s.nextInt();
		s.close();
		
	}
	
	int getArea() {
		this.area= this.width * this.height;
		return this.area;
	}

}
