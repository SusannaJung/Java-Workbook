package StepE;

import java.util.Scanner;


public class StepEManager {
	public StepEManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. �Է��� ���� ũ���� ���簢�� ����ϱ�\n");
			printf("2. �Է��� ���� ũ���� ���̴� ���� ������ �ﰢ�� ����ϱ�\n");
			printf("3. �Է��� ���� ũ���� ���̸� ���� �̵ �ﰢ�� ����ϱ�\n");
			printf("4. Ȧ���� �Ǵ� ¦������ ������ ����ϱ�\n");
			printf("5. Ȧ���� �Ǵ� ¦������ �������� ���� ������ ���߾� ����ϱ�\n");
			printf("6. 2���� ���� ����ϱ�\n");
			printf("=>���ϴ� �޴���?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			
			switch(menu) {
			case 1:
				
				StepE1 e1 = new StepE1();
				e1.printSquare();
				break;
			case 2:
				
				StepE2 e2 = new StepE2();
				e2.printTri();
				break;
			case 3:
				
				StepE3 e3 = new StepE3();
				e3.printTri();
				break;
			case 4:
				StepE4 e4 = new StepE4();
				e4.printTable();
				break;
			case 5 :
				
				StepE5 e5= new StepE5();
				e5.printTableColumn();
				break;
			
			case 6 : 
				StepE6 e6 = new StepE6();
				e6.printRowColumn();
				break;
				
			}
		}
		
	}
	void printf(String s){System.out.print(s);
	}
}