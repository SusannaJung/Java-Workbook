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
		System.out.printf("파일 전송 시간은 %.1f 초입니다.\n", getSec());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("파일 용량을 메가바이트 단위로 입력하세요. ");
		this.megabytes = s.nextInt();
		System.out.print("전송방식을 1:Wi-Fi, 2: Bluetooth, 3: LTE, 4: USB 에서 선택하여 입려갛세요 ");
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
			System.out.print("잘못 입력되었습니다.\n");
		
		return this.time;
	}


}
