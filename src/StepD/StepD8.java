package StepD;

import java.util.Scanner;

public class StepD8 {
	
	private int a, b, c; // 2�� �޼ҵ��� ��� a, b, c
	private int x_begin, x_end; // x��ǥ�� ���� ���� �� ��
	private int x, y; // x��ǥ, y��ǥ
	
	public StepD8() {
		input();
	}
	
	public void printSecMethod() {
		for(int i= x_begin; i<=x_end; i++) {
			this.x=i;
			this.y= this.a*(this.x*this.x)+(this.b*this.x)+this.c;
			
			System.out.printf("��ǥ (%d, %d)\n", x,y);
		}
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("2�� �Լ� y=ax^2+bx+c �� ��� a�� b, c�� �Է��Ͻÿ�.");
		this.a = s.nextInt();
		this.b = s.nextInt();
		this.c = s.nextInt();
		System.out.print("x��ǥ�� ���� ���� �� ���� �Է��Ͻÿ�.");			this.x_begin = s.nextInt();
		this.x_end = s.nextInt();
		
	}

}
