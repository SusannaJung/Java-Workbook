package StepC;

import java.util.Scanner;

public class StepC7 {
	
	private int megabytes;
	private long bytes;
	private byte kind;
	private double time;
	
	public StepC7() {
		input();
	}
	
	public void printSec() {
		System.out.printf("���� ���� �ð��� %.1f ���Դϴ�.\n", getSec());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("���� �뷮�� �ް�����Ʈ ������ �Է��ϼ���. ");
		this.megabytes = s.nextInt();
		System.out.print("���۹���� 1:Wi-Fi, 2: Bluetooth, 3: LTE, 4: USB ���� �����Ͽ� �Է������� ");
		this.kind = s.nextByte();
		s.close();
		
	}
	
	double getSec() {
		
		this.bytes= this.megabytes * 1024 * 1024;
		
		if(this.kind == 1)
			this.time= this.bytes/1500000;
		else if(this.kind==2)
			this.time= this.bytes/300000;
		else if(this.kind ==3)
			this.time= this.bytes/1000000;
		else if(this.kind == 4)
			this.time= this.bytes/60000000;
		else
			System.out.print("�߸� �ԷµǾ����ϴ�.\n");
		
		return this.time;
	}


}
