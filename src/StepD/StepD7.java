package StepD;

import java.util.Scanner;

public class StepD7 {
	
	private int a,b;
	private int x_begin, x_end;
	private int x,y;

	public StepD7() {
		input();
	}
	
	
	void input() {
		Scanner s= new Scanner(System.in);
		System.out.print("1�� �Լ�  y=ax+b�� ��� a�� b�� �Է��Ͻÿ�.");
		this.a= s.nextInt();
		this.b = s.nextInt();
		
		System.out.print("x��ǥ�� ���� ���� �� ���� �Է��Ͻÿ�.");
		this.x_begin= s.nextInt();
		this.x_end = s.nextInt();
				
	}
	
	public void printXY() {
		for(int i=x_begin; i<=x_end; i++) {
			this.x=i;
			this.y= this.a*this.x + this.b;
			
			System.out.printf("��ǥ (%d, %d)\n", x,y);
		}
	}
	
}
