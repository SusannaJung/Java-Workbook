package StepD;

import java.util.Scanner;

public class StepD5 {
	
	private int width, height;
	private int count1=0, count2=0, count3=0, count4=0, count5=0;

	public StepD5() {
		input();
	}
	
	public void printRect() {
		System.out.printf("\"정사각형\"의 개수는 %d 입니다.\n",count1);
		System.out.printf("\"좌우로 길쭉한 직사각형\"의 개수는 %d 입니다.\n",count2);
		System.out.printf("\"위아래로 길쭉한 직사각형\"의 개수는 %d 입니다.\n",count3);
		System.out.printf("\"일반적인 가로형 직사각형\"의 개수는 %d 입니다.\n",count4);
		System.out.printf("\"일반적인 세로형 직사각형\"의 개수는 %d 입니다.\n",count5);
	}
	
	void input() {
		Scanner s= new Scanner(System.in);
		
		while(true) {
			System.out.print("직사각형의 가로 크기와 세로 크기를 입력하시오. :");
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
