package StepH;

import java.util.Random;
import java.util.Scanner;

public class StepH3 {
	
	private int lotto_com[] = new int[6]; 
	private int lotto_user[] = new int[6]; 
	private boolean same = true;
	private int count = 0;
	private int match_count = 0;
	
	public StepH3() {
		generateNum();
		input();
	}
	
	public void printLotto() {
		System.out.printf("이번 주의 로또 당첨 번호는 ");
		for(int j = 0; j < lotto_com.length; j++)
			System.out.printf("%d  ", lotto_com[j]);
		System.out.println("입니다.");
		System.out.printf("일치하는 로또 번호는 %d개 입니다.\n", printSame());
	}
	
	void generateNum() {
		count = 0;
		Random r = new Random();
	
		while(count < lotto_com.length) {
			lotto_com[count] = r.nextInt(45) + 1;
			same = true;
			for(int i = 0; i < count-1; i++) {
				//같으면
				if(lotto_com[count] == lotto_com[i]) {
					//same = false break
					same = false;
					break;
				}
			}
			if(same == true)
				count++;
		}
	}
	
	void input() {
	
		Scanner s = new Scanner(System.in);
		count = 0;
		
		while(count < lotto_user.length) {
			System.out.printf("원하는 %d번째 로또 숫자를 입력하세요", count+1);
			lotto_user[count] = s.nextInt();
			if((lotto_user[count] > 45)||(lotto_user[count] < 1))
				same = false;
		
			for(int i = 0; i < count; i++) {
				if(lotto_user[count] == lotto_user[i]) {
					same = false;
					break;
				}
			}

			if(same == false) {
				System.out.println("=> 잘못 입력하셨습니다.");
				same = true;
			}
			else
				count++;
		}	
	}
	
	int printSame() {
		for(int i = 0; i < 6; i++)
			for(int j = 0; j < 6; j++)
				if(lotto_com[i] == lotto_user[j])
					match_count++;
		
		return this.match_count;
	}

}
