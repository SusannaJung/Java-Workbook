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
		System.out.printf("���� ���� �ð��� %d ���Դϴ�.\n", getTime());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("���� �뷮�� �ް�����Ʈ ������ �Է��ϼ���. ");
		this.megabytes = s.nextInt();
		System.out.print("USB ��Ʈ�� 2.0�̸� Y, �ƴϸ� N�� �Է��ϼ��� ");
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
