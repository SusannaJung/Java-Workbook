package StepC;

import java.util.Scanner;

public class StepCManager {

	public StepCManager() {
		
		int menu;
		Scanner s = new Scanner(System.in);
		
		while(true) {
			printf("---------------------\n");
			printf("1. ���̰�� �� ���ɴ� ����\n");
			printf("2. ���� �µ� ���� ����\n");
			printf("3. ���簢�� ���� ����\n");
			printf("4. ����Ʈ ���� ��� �� ���� ����\n");
			printf("5. ���� ��¥ ���\n");
			printf("6. ���� ���\n");
			printf("7. ���� ���� �ð� ���\n");
			printf("8, 3���� �� �� �ִ񰪰� �ּڰ� ���ϱ�\n");
			printf("9, �ҵ漼 ���\n");
			printf("10, ������ ��Ģ���� ����\n");
			printf("11, ���� ����\n");
			printf("=>���ϴ� �޴���?(0:exit) :");
			menu = s.nextInt();
			s.close();
			
			if(menu == 0) break;
			switch(menu) {
			case 1:
				
				StepC1 c1 = new StepC1();
				c1.printAge();
				break;
			case 2:
				
				StepC2 c2 = new StepC2();
				c2.printTemp();
				break;
			case 3:
				
				StepC3 c3 = new StepC3();
				c3.printRect();
				break;
			case 4:
				StepC4 c4 = new StepC4();
				c4.printPyung();
				break;
			case 5 :
				
				StepC5 c5= new StepC5();
				c5.printDay();
				break;
			
			case 6 : 
				StepC6 c6 = new StepC6();
				c6.printScore();
				break;
				
			case 7 : 
				StepC7 c7 = new StepC7();
				c7.printSec();
				break;
			case 8 : 
				StepC8 c8 = new StepC8();
				c8.printMaxMin();
				break;
			case 9 :
				StepC9 c9 = new StepC9();
				c9.printTax();
				break;
			case 10:
				StepC10 c10 = new StepC10();
				c10.printCalc();
				break;
			case 11:
				StepC11 c11 = new StepC11();
				c11.printYear();
				break;
			}
		}
		
	}
	void printf(String s){System.out.print(s);
	}

}