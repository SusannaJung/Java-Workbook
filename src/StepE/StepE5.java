package StepE;

import java.util.Scanner;

public class StepE5 {
	
	private int mode;
	private int column;
	
	public StepE5() {
		input();
	}
	
	void input() {
		Scanner s= new Scanner(System.in);
		System.out.print("�������� ��¸��(1: Ȧ����, 2: ¦����)�� �Է��Ͻÿ�.");
		this.mode= s.nextInt();
		System.out.print("�� �ٿ� ����� ������ �Է��Ͻÿ�. ");
		this.column= s.nextInt();
	}
	
	public void printTableColumn() {
		if(this.mode==1) {
			for(int i=3; i<10; i+=2) {
				for(int j=1; j<10; j++) {
					System.out.printf("%d x %d = %-2d  ", i,j, i*j);
					if(j%this.column==0)
						System.out.print("\n");
				}
				System.out.print("\n");
			}
		}
		else if(mode==2) {
			for(int i=this.mode;i<10;i+=2) {
				for(int j=1;j<10;j++) {
					System.out.printf("%d x %d = %-2d",i,j,i*j);
						System.out.printf("  ");
						if(j%this.column==0) {
							System.out.print("/n");
						}
				}
				System.out.print("\n");
			}
		}
	}

}
