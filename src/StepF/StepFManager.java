package StepF;

import java.util.Scanner;


public class StepFManager {
	public StepFManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. �� ��°�� ū ���� ���� ã��\n");
			printf("2. �ɻ����� ���\n");
			printf("3. 5���� ��, ��, �� 3���� ������ ���� ����, ��հ� ���ϱ�\n");
			printf("4. �� ����\n");
			printf("5. 5�� ����Ʈ�� ������ ���� ���ϱ�\n");
			printf("6. 5�� ����Ʈ�� ����, ȣ���� ������ ���� ���ϱ�\n");
			printf("7. ��ġ�� �ʴ� ���� 10�� �Է� �ޱ�\n");
			printf("8. �迭�� �̿��� ���� ��¥ ���\n");
			printf("=>���ϴ� �޴���?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1:
				
				StepF1 f1 = new StepF1();
				f1.printSecMax();
				break;
			case 2:
				
				StepF2 f2 = new StepF2();
				f2.printScore();
				break;
			case 3:
				
				StepF3 f3 = new StepF3();
				f3.printJumsu();
				break;
			case 4:
				StepF4 f4 = new StepF4();
				f4.printJumsu2();
				break;
			case 5 :
				
				StepF5 f5= new StepF5();
				f5.printBmi();
			
				break;
			
			case 6 : 
				StepF6 f6 = new StepF6();
				f6.printApt();
				
				break;
			case 7 : 
				StepF7 f7 = new StepF7();
				f7.printApt2();

				break;
			case 8 : 
				StepF8 f8 = new StepF8();
				f8.printNumber();
				break;
				
			case 9 : 
				StepF9 f9 = new StepF9();
				f9.printDay();
				break;
				
			}
		}
		
	}
	void printf(String s){System.out.print(s);
	}
}