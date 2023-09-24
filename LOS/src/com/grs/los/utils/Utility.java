package com.grs.los.utils;
import java.util.Scanner;

public class Utility implements StageConstants{
	
	public static Scanner scanner = new Scanner(System.in);
	public static int serialCounter = 1;
	
	public static String getStageName(int stageId) {
		
		switch(stageId) {
		case SOURCING:
			return "sourcing stage";
		
		case QDE:
			return "qde stage";
			
		case DEDUPE:
			return "dedupe stage";
			
		case SCORING:
			return "scoring stage";
			
		case APPROVAL:
			return "approval stage";
			
		case REJECT:
			return "reject stage";
			
		default:
			return "default stage";
		}
	}

}
