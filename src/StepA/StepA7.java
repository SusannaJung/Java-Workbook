package StepA;

import java.util.Scanner;

public class StepA7 {
	
	private int gigabytes, megabytes, kilobytes;
	private long bytes;
	
	public StepA7() {
		input();
	}
	
	public void printFile() {
		System.out.printf("입력하신 파일 용량은 \n %d 메가바이트,\n %d 킬로바이트, \n %d 바이트 입니다.\n", getMega(), getKilo(), getByte());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("파일 용량을 기가바이트 단위로 입력하세요. ");
		this.gigabytes = s.nextInt();
		s.close();
	}
	
	int getMega() {
		this.megabytes = this.gigabytes *1024;
		return this.megabytes;
	}
	
	int getKilo() {
		this.kilobytes = this.megabytes *1024;
		return this.kilobytes;
	}
	
    long getByte() {
		this.bytes = (long)this.kilobytes *1024;
		return this.bytes;
	}

}
