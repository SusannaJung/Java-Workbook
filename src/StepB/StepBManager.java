package StepB;

import java.util.Scanner;


public class StepBManager {
	
	public StepBManager() {
		
		int menu;
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			printf("---------------------\n");
			printf("1. 나이 계산 및 미성년자 판정\n");
			printf("2. 온도 상호 변환\n");
			printf("3. 직사각형 넓이 계산 및 정사각형 판정\n");
			printf("4. 아파트 평형 계산 및 종류 판정\n");
			printf("5. 날짜 계산\n");
			printf("6. 점수 계산\n");
			printf("7. 파일 전송 시간 계산\n");
			printf("8. 다양한 조건 판정\n");
			printf("9. 비만 판정\n");
			printf("=>원하는 메뉴는?(0:exit) :");
			
			menu = s.nextInt();
			s.close();
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