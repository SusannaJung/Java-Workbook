package StepA;

import java.util.Scanner;

public class StepA7 {
	
	private int gigabytes, megabytes, kilobytes;
	private long bytes;
	
	public StepA7() {
		input();
	}
	
	public void printFile() {
		System.out.printf("�Է��Ͻ� ���� �뷮��\n %d �ް�����Ʈ,\n %d ų�ι���Ʈ, \n %d ����Ʈ �Դϴ�.\n", getMega(), getKilo(), getByte());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("���� �뷮�� �Ⱑ����Ʈ ������ �Է��ϼ���. ");
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
