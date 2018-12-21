package StepB;

import java.util.Scanner;


public class StepBManager {
	
	public StepBManager() {
		
		int menu;
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			printf("---------------------\n");
			printf("1. ���̰�� �� �̼����� ����\n");
			printf("2. �µ� ��ȣ ��ȯ\n");
			printf("3. ���簢�� ���� ��� �� ���簢�� ����\n");
			printf("4. ����Ʈ ���� ��� �� ���� ����\n");
			printf("5. ��¥ ���\n");
			printf("6. ���� ���\n");
			printf("7. ���� ���� �ð� ���\n");
			printf("8. �پ��� ���� ����\n");
			printf("9. �� ����\n");
			printf("=>���ϴ� �޴���?(0:exit) :");
			
			menu = s.nextInt();
			if(menu == 0) break;
			
			switch(menu) {
			case 1: 				
				StepB1 b1= new StepB1();
				b1.printAge();
				break;
			case 2:
				StepB2 b2= new StepB2();
				b2.printTemp();
				break;
			case 3: 
				StepB3 b3= new StepB3();
				b3.printArea();
				break;
			case 4:
				StepB4 b4= new StepB4();
				b4.printPyung();
				break;
			case 5:
				StepB5 b5= new StepB5();
				b5.printSec();
				break;
			case 6:
				StepB6 b6= new StepB6();
				b6.printScore();
				break;
			case 7:
				StepB7 b7= new StepB7();
				b7.printFile();
				break;
			case 8:
				StepB8 b8= new StepB8();
				b8.printNum();
				break;
			case 9:
				StepB9 b9= new StepB9();
				b9.printBmi();
				break;
			case 0:
				System.exit(0);
			}
		}
		
	}
	void printf(String s){System.out.print(s);} 
	
	
}