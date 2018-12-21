package StepC;

import java.util.Scanner;

public class StepC3 {
	
	private int width, height;
	
	public StepC3() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("직사각형의 가로 크기를 입력하시오. ");
		this.width = s.nextInt();
		System.out.print("직사각형의 세로 크기를 입력하시오. ");
		this.height = s.nextInt();
		s.close();
	}
	
	public void printRect() {
		
		if(width==height)
			System.out.print("정사각형입니다.\n");
		else if(width>= height*2)
			System.out.print("좌우로 길쭉한 직사각형입니다.\n");
		else if(height>= width*2)
			System.out.print("위아래로 길쭉한 직사각형입니다.\n");
		else if(width>height)
			System.out.print("일반적인 가로형 직사각형입니다.\n");
		else
			System.out.print("일반적인 세로형 직사각형입니다.\n");
			
	}
	
}
