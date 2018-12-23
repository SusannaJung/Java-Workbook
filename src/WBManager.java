import java.util.Scanner;

import StepA.StepAManager;
import StepB.StepBManager;
import StepC.StepCManager;
import StepD.StepDManager;
import StepE.StepEManager;

public class WBManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.print("원하는 Step은?");
		String step = s.next();
		if(step.equalsIgnoreCase("A")) 
			new StepAManager();
		else if(step.equalsIgnoreCase("B"))
			new StepBManager();
		else if(step.equalsIgnoreCase("C"))
			new StepCManager();
		else if(step.equalsIgnoreCase("D"))
			new StepDManager();
		else if(step.equalsIgnoreCase("E"))
			new StepEManager();
		
		
		
		System.out.printf("종료되었습니다.\n");
	}	
}

