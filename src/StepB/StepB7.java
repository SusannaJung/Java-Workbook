package StepB;

import java.util.Scanner;

public class StepB7 {
	
	private int megabytes;
	private long bytes;
	private String usb2;
	private int time;
	
	public StepB7() {
		input();
	}
	
	public void printFile() {
		System.out.printf("파일 전송 시간은 %d 초입니다.\n", getTime());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("파일 용량을 메가바이트 단위로 입력하세요. ");
		this.megabytes = s.nextInt();
		System.out.print("USB 포트가 2.0이면 Y, 아니면 N을 입력하세요 ");
		this.usb2= s.next();
		s.close();
	}
	
   
    int getTime() {
    	String usb = "Y";
    	
    	this.bytes = this.megabytes *1024 * 1024;
    	
    	if(usb2.equals(usb)) {
    		this.time = (int)this.bytes/60000000;
    	}
    	else {
    		this.time = (int)this.bytes/1500000;
    	}
    	
    	return this.time;
    }

}
