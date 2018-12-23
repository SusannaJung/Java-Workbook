package StepD;

import java.util.Scanner;

public class StepD8 {
	
	private int a, b, c; // 2차 메소드의 계수 a, b, c
	private int x_begin, x_end; // x좌표의 시작 값과 끝 값
	private int x, y; // x좌표, y좌표
	
	public StepD8() {
		input();
	}
	
	public void printSecMethod() {
		for(int i= x_begin; i<=x_end; i++) {
			this.x=i;
			this.y= this.a*(this.x*this.x)+(this.b*this.x)+this.c;
			
			System.out.printf("좌표 (%d, %d)\n", x,y);
		}
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("2차 함수 y=ax^2+bx+c 의 계수 a와 b, c를 입력하시오.");
		this.a = s.nextInt();
		this.b = s.nextInt();
		this.c = s.nextInt();
		System.out.print("x좌표의 시작 값과 끝 값을 입력하시오.");			this.x_begin = s.nextInt();
		this.x_end = s.nextInt();
		
	}

}
