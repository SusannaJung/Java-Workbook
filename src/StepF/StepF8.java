package StepF;

import java.util.Scanner;

public class StepF8 {
	
	private int number[] = new int[10];// ����ڰ� �Է��� ���� 10��
	
	

	public StepF8() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		int count=0; // ������� �Էµ� ������ ����(0~10)
		boolean dup = true;
	
		System.out.print("1���� 100������ ���ڸ� �Է��Ͻÿ�.\n");
		
		while(count<10) {	
			System.out.print("%d��° ���ڸ� �Է��Ͻÿ�. ");
			this.number[count]= s.nextInt();
			
			if((number[count] < 1)||(number[count] > 100))
				dup = false;
			else{
				for(int i = 0; i < count; i++)
					if(number[i] == number[count])
						dup = false;
			}
			
			if(dup == true)
				count++;
			else {
				System.out.print("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է��ϼ���.");
				dup = true;
			}
			
		}
	}
	
	public void printNumber() {
		for(int i = 0; i < 10; i++)
			System.out.printf("%d��° ���ڴ� %d�Դϴ�.\n", i+1, number[i]);
	}
}
