package StepC;

import java.util.Scanner;

public class StepC3 {
	
	private int width, height;
	
	public StepC3() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("���簢���� ���� ũ�⸦ �Է��Ͻÿ�. ");
		this.width = s.nextInt();
		System.out.print("���簢���� ���� ũ�⸦ �Է��Ͻÿ�. ");
		this.height = s.nextInt();
		s.close();
	}
	
	public void printRect() {
		
		if(width==height)
			System.out.print("���簢���Դϴ�.\n");
		else if(width>= height*2)
			System.out.print("�¿�� ������ ���簢���Դϴ�.\n");
		else if(height>= width*2)
			System.out.print("���Ʒ��� ������ ���簢���Դϴ�.\n");
		else if(width>height)
			System.out.print("�Ϲ����� ������ ���簢���Դϴ�.\n");
		else
			System.out.print("�Ϲ����� ������ ���簢���Դϴ�.\n");
			
	}
	
}
