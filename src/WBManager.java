import java.util.Scanner;

import StepA.StepAManager;
import StepB.StepBManager;
import StepC.StepCManager;
import StepD.StepDManager;
import StepE.StepEManager;
import StepF.StepFManager;

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
		else if(step.equalsIgnoreCase("F"))
			new StepFManager();
		else if(step.equalsIgnoreCase("G"))
			new StepFManager();
		else if(step.equalsIgnoreCase("H"))
			new StepFManager();
		else if(step.equalsIgnoreCase("I"))
			new StepFManager();
		
		
		
		System.out.printf("잘못입력되었습니다.\n");
	}	
}

