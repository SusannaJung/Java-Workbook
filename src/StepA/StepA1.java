
package StepA;

import java.util.Scanner;

public class StepA1 {
		
		private int birth_year;
		private int age;
		
		public StepA1(){input();}
		
		public void printAge() {
			System.out.printf("����� ���̴� %d�Դϴ�.\n", getAge());
		}	
		
		void input() {
			Scanner s = new Scanner(System.in);
			System.out.print("�¾ �⵵?");
			this.birth_year = s.nextInt();
			s.close();
			
		}	
		
		int getAge() {
			this.age = 2018 - this.birth_year + 1;
			return this.age;
		}
}