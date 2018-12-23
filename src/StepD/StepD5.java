package StepD;

import java.util.Scanner;

public class StepD5 {
	
	private int width, height;
	private int count1=0, count2=0, count3=0, count4=0, count5=0;

	public StepD5() {
		input();
	}
	
	public void printRect() {
		System.out.printf("\"���簢��\"�� ������ %d �Դϴ�.\n",count1);
		System.out.printf("\"�¿�� ������ ���簢��\"�� ������ %d �Դϴ�.\n",count2);
		System.out.printf("\"���Ʒ��� ������ ���簢��\"�� ������ %d �Դϴ�.\n",count3);
		System.out.printf("\"�Ϲ����� ������ ���簢��\"�� ������ %d �Դϴ�.\n",count4);
		System.out.printf("\"�Ϲ����� ������ ���簢��\"�� ������ %d �Դϴ�.\n",count5);
	}
	
	void input() {
		Scanner s= new Scanner(System.in);
		
		while(true) {
			System.out.print("���簢���� ���� ũ��� ���� ũ�⸦ �Է��Ͻÿ�. :");
			this.width = s.nextInt();
			this.height = s.nextInt();
			
			if(width==0 || height == 0)
				break;
			
			if(width==height) {
				count1++;
			}
			else if(width>=2*height) {
				count2++;
			}
			else if(height>=2*width) {
				count3++;
			}
			else if(width>height) {
				count4++;
			}
			else {
				count5++;
			}
			
		}
	}
	
	
}
