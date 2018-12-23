package StepD;

import java.util.Scanner;



public class StepDManager {
	
	public StepDManager() {
		
		int menu;
		Scanner s = new Scanner(System.in);
		
		while(true) {
			printf("---------------------\n");
			printf("1. 1���� ���� ���ϱ�\n");
			printf("2. �Է� ���� ���ڵ� �߿��� ���� ū ���� ���� ���� �� ���ϱ�\n");
			printf("3. �Է� ���� ���ڵ��� ���հ�� ��� �� ���ϱ�\n");
			printf("4. �̼����� ���� ����\n");
			printf("5. ���簢�� ���� ���� ����\n");
			printf("6. ����Ʈ ���� ��� �� ���� ����\n");
			printf("7. 1�� �������� ��ǥ ���ϱ�\n");
			printf("8, 2�� �������� ��ǥ ���ϱ�\n");
			printf("9, ���ϴ� �������� �� ����ϱ�\n");
			printf("10, �� ���� ��Ÿ�� ��� ����ϱ�\n");
			printf("=>���ϴ� �޴���?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			
			switch(menu) {
			case 1:
				
				StepD1 d1 = new StepD1();
				d1.printSum();
				break;
			case 2:
				
				StepD2 d2 = new StepD2();
				d2.printMaxMin();
				
				break;
			case 3:
				
				StepD3 d3 = new StepD3();
				d3.printSumNAvg();
				break;
			case 4:
				StepD4 d4 = new StepD4();
				d4.printCount();
				break;
			case 5 :
				
				StepD5 d5= new StepD5();
				d5.printRect();
				break;
			
			case 6 : 
				StepD6 d6 = new StepD6();
				d6.printArea();
				break;
				
			case 7 : 
				StepD7 d7 = new StepD7();
				d7.printXY();
				break;
			case 8 : 
				StepD8 d8 = new StepD8();
				d8.printSecMethod();
				break;
			case 9 :
				StepD9 d9 = new StepD9();
				d9.printTable();
				break;
			case 10 :
				StepD10 d10 = new StepD10();
				d10.printMultiple();
				break;
			
			}
		}
		
	}
	void printf(String s){System.out.print(s);
	}

}