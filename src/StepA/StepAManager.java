package StepA;

import java.util.Scanner;

public class StepAManager {
	
		public StepAManager() {
			
			int menu;
			Scanner s = new Scanner(System.in);
			
			while(true) {
				printf("---------------------\n");
				printf("1. 나이계산\n");
				printf("2. 온도변환\n");
				printf("3. 직사각형 넓이계산\n");
				printf("4. 아파트 평형 계산\n");
				printf("5. 날짜계산\n");
				printf("6. 점수계산\n");
				printf("7. 파일 용량 계산\n");
				printf("=>원하는 메뉴는?(0:exit) :");
				menu = s.nextInt();
				s.close();
				
				if(menu == 0) break;
				
				switch(menu) {
				case 1: 				
					StepA1 a1 = new StepA1();
					a1.printAge();
					break;
				case 2: 				
					StepA2 a2 = new StepA2();
					a2.printTemp();
					break;
				case 3: 				
					StepA3 a3 = new StepA3();
					a3.printArea();
					break;
				case 4: 				
					StepA4 a4 = new StepA4();
					a4.printPyung();
					break;
				case 5: 				
					StepA5 a5 = new StepA5();
					a5.printSec();
					break;
				case 6: 				
					StepA6 a6 = new StepA6();
					a6.printScore();
					break;
				case 7: 				
					StepA7 a7 = new StepA7();
					a7.printFile();
					break;
				
				default:
					printf("잘못 입력하였습니다.\n");
				}
			}
		}

		void printf(String s){System.out.print(s);} 
	}


